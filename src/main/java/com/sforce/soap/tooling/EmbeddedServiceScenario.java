package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum EmbeddedServiceScenario {


  
	/**
	 * Enumeration  : Sales
	 */
	Sales("Sales"),

  
	/**
	 * Enumeration  : Service
	 */
	Service("Service"),

  
	/**
	 * Enumeration  : Basic
	 */
	Basic("Basic"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (EmbeddedServiceScenario e : EnumSet.allOf(EmbeddedServiceScenario.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private EmbeddedServiceScenario(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
