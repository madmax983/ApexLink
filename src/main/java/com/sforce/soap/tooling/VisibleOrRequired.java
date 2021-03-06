package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum VisibleOrRequired {


  
	/**
	 * Enumeration  : VisibleOptional
	 */
	VisibleOptional("VisibleOptional"),

  
	/**
	 * Enumeration  : VisibleRequired
	 */
	VisibleRequired("VisibleRequired"),

  
	/**
	 * Enumeration  : NotVisible
	 */
	NotVisible("NotVisible"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (VisibleOrRequired e : EnumSet.allOf(VisibleOrRequired.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private VisibleOrRequired(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
