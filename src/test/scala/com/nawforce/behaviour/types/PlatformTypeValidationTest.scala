/*
 [The "BSD licence"]
 Copyright (c) 2019 Kevin Jones
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package com.nawforce.behaviour.types

import com.nawforce.types._
import com.nawforce.utils.DotName
import org.scalatest.FunSuite

class PlatformTypeValidationTest extends FunSuite {

  test("Right number of types (should exclude inners)") {
    assert(PlatformTypeDeclaration.classNames.size == 1296)
  }

  test("All outer types are valid") {
    PlatformTypeDeclaration.classNames.foreach(className => {
      val typeDeclaration = PlatformTypeDeclaration.get(className)
      assert(typeDeclaration.nonEmpty)
      validateTypeDeclaration(className, typeDeclaration.get)
    })
  }

  def validateTypeDeclaration(className: DotName, typeDeclaration: PlatformTypeDeclaration): Unit = {
    // name & typeName are valid
    assert(typeDeclaration.name.toString == className.lastName.toString)
    className.toString match {
      case "System.List" => assert(typeDeclaration.typeName.toString == "System.List<T>")
      case "System.Iterator" => assert(typeDeclaration.typeName.toString == "System.Iterator<T>")
      case "System.Map" => assert(typeDeclaration.typeName.toString == "System.Map<K, V>")
      case "System.Set" => assert(typeDeclaration.typeName.toString == "System.Set<T>")
      case "System.Iterable" => assert(typeDeclaration.typeName.toString == "System.Iterable<T>")
      case _ => assert(typeDeclaration.typeName.toString == className.toString)
    }

    // superClass & interfaces reference platform types
    if (typeDeclaration.superClass.nonEmpty)
      assert(PlatformTypeDeclaration.get(typeDeclaration.superClass.get.asDotName).nonEmpty)
    typeDeclaration.interfaces.foreach(tn => PlatformTypeDeclaration.get(tn.asDotName))

    // nature valid and superClass & interfaces are valid for it
    typeDeclaration.nature match {
      case INTERFACE_NATURE =>
        assert(typeDeclaration.superClass.isEmpty)
      case ENUM_NATURE =>
        assert(typeDeclaration.superClass.isEmpty)
        assert(typeDeclaration.interfaces.isEmpty)
      case CLASS_NATURE => ()
    }

    // PlatformModifiers, always public for outer platform classes
    if (typeDeclaration.parent.isEmpty)
      assert(typeDeclaration.modifiers == Seq(PUBLIC_MODIFIER))

    // Nested classes
    typeDeclaration.nature match {
      case INTERFACE_NATURE =>
        assert(typeDeclaration.nestedClasses.isEmpty)
      case ENUM_NATURE =>
        assert(typeDeclaration.nestedClasses.isEmpty)
      case CLASS_NATURE =>
        typeDeclaration.nestedClasses.foreach(nested => validateTypeDeclaration(className.append(nested.name), nested))
    }

    // Fields
    typeDeclaration.nature match {
      case INTERFACE_NATURE =>
        assert(typeDeclaration.fields.isEmpty)
      case ENUM_NATURE =>
        assert(typeDeclaration.fields.nonEmpty)
        assert(typeDeclaration.fields.filter(_.typeName.toString == typeDeclaration.typeName.toString)
          == typeDeclaration.fields)
      case CLASS_NATURE =>
        assert(typeDeclaration.fields.map(f =>PlatformTypeDeclaration.get(f.typeName.asDotName)).size
          == typeDeclaration.fields.size)
    }

    // Constructors (make sure we can decompose them via toString)
    typeDeclaration.constructors.map(_.toString)

    // Methods (make sure we can decompose them via toString)
    typeDeclaration.methods.map(_.toString)
  }

  test("Exceptions are valid") {
    PlatformTypeDeclaration.classNames.filter(_.lastName.toString.endsWith("Exception")).foreach(className => {
      val typeDeclaration = PlatformTypeDeclaration.get(className)
      assert(typeDeclaration.nonEmpty)
      val td = typeDeclaration.get

      if (td.name.toString() != "Exception")
        assert(td.superClass.get.toString == "System.Exception")
      assert(td.interfaces.isEmpty)
      assert(td.nature == CLASS_NATURE)
      assert(td.modifiers == Seq(PUBLIC_MODIFIER))
      assert(td.parent.isEmpty)
      assert(td.nestedClasses.isEmpty)

      val methods = td.methods.sortBy(_.name.toString)
      assert(methods.size >= 7)
    })
  }

}
