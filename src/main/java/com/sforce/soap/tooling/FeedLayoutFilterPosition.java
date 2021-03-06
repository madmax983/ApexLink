package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum FeedLayoutFilterPosition {


  
	/**
	 * Enumeration  : CenterDropDown
	 */
	CenterDropDown("CenterDropDown"),

  
	/**
	 * Enumeration  : LeftFixed
	 */
	LeftFixed("LeftFixed"),

  
	/**
	 * Enumeration  : LeftFloat
	 */
	LeftFloat("LeftFloat"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (FeedLayoutFilterPosition e : EnumSet.allOf(FeedLayoutFilterPosition.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private FeedLayoutFilterPosition(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
