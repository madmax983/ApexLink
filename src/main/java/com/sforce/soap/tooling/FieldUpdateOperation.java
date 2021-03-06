package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum FieldUpdateOperation {


  
	/**
	 * Enumeration  : Formula
	 */
	Formula("Formula"),

  
	/**
	 * Enumeration  : Literal
	 */
	Literal("Literal"),

  
	/**
	 * Enumeration  : Null
	 */
	Null("Null"),

  
	/**
	 * Enumeration  : NextValue
	 */
	NextValue("NextValue"),

  
	/**
	 * Enumeration  : PreviousValue
	 */
	PreviousValue("PreviousValue"),

  
	/**
	 * Enumeration  : LookupValue
	 */
	LookupValue("LookupValue"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (FieldUpdateOperation e : EnumSet.allOf(FieldUpdateOperation.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private FieldUpdateOperation(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
