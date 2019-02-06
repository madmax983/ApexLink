package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum Modifier {


  
	/**
	 * Enumeration  : TESTMETHOD
	 */
	TESTMETHOD("TESTMETHOD"),

  
	/**
	 * Enumeration  : GLOBAL
	 */
	GLOBAL("GLOBAL"),

  
	/**
	 * Enumeration  : WEBSERVICE
	 */
	WEBSERVICE("WEBSERVICE"),

  
	/**
	 * Enumeration  : PUBLIC
	 */
	PUBLIC("PUBLIC"),

  
	/**
	 * Enumeration  : PRIVATE
	 */
	PRIVATE("PRIVATE"),

  
	/**
	 * Enumeration  : PROTECTED
	 */
	PROTECTED("PROTECTED"),

  
	/**
	 * Enumeration  : WITHSHARING
	 */
	WITHSHARING("WITHSHARING"),

  
	/**
	 * Enumeration  : WITHOUTSHARING
	 */
	WITHOUTSHARING("WITHOUTSHARING"),

  
	/**
	 * Enumeration  : INHERITEDSHARING
	 */
	INHERITEDSHARING("INHERITEDSHARING"),

  
	/**
	 * Enumeration  : STATIC
	 */
	STATIC("STATIC"),

  
	/**
	 * Enumeration  : TRANSIENT
	 */
	TRANSIENT("TRANSIENT"),

  
	/**
	 * Enumeration  : ABSTRACT
	 */
	ABSTRACT("ABSTRACT"),

  
	/**
	 * Enumeration  : FINAL
	 */
	FINAL("FINAL"),

  
	/**
	 * Enumeration  : OVERRIDE
	 */
	OVERRIDE("OVERRIDE"),

  
	/**
	 * Enumeration  : VIRTUAL
	 */
	VIRTUAL("VIRTUAL"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (Modifier e : EnumSet.allOf(Modifier.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private Modifier(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}