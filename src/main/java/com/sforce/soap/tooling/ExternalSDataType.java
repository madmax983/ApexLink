package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum ExternalSDataType {


  
	/**
	 * Enumeration  : NumberType
	 */
	NumberType("NumberType"),

  
	/**
	 * Enumeration  : DoubleType
	 */
	DoubleType("DoubleType"),

  
	/**
	 * Enumeration  : StringType
	 */
	StringType("StringType"),

  
	/**
	 * Enumeration  : BooleanType
	 */
	BooleanType("BooleanType"),

  
	/**
	 * Enumeration  : DatetimeType
	 */
	DatetimeType("DatetimeType"),

  
	/**
	 * Enumeration  : ComplexType
	 */
	ComplexType("ComplexType"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (ExternalSDataType e : EnumSet.allOf(ExternalSDataType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private ExternalSDataType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
