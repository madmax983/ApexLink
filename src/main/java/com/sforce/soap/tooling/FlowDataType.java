package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum FlowDataType {


  
	/**
	 * Enumeration  : Currency
	 */
	Currency("Currency"),

  
	/**
	 * Enumeration  : Date
	 */
	Date("Date"),

  
	/**
	 * Enumeration  : Number
	 */
	Number("Number"),

  
	/**
	 * Enumeration  : String
	 */
	String("String"),

  
	/**
	 * Enumeration  : Boolean
	 */
	Boolean("Boolean"),

  
	/**
	 * Enumeration  : SObject
	 */
	SObject("SObject"),

  
	/**
	 * Enumeration  : DateTime
	 */
	DateTime("DateTime"),

  
	/**
	 * Enumeration  : Picklist
	 */
	Picklist("Picklist"),

  
	/**
	 * Enumeration  : Multipicklist
	 */
	Multipicklist("Multipicklist"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (FlowDataType e : EnumSet.allOf(FlowDataType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private FlowDataType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
