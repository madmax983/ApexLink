package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum LogType {


  
	/**
	 * Enumeration  : None
	 */
	None("None"),

  
	/**
	 * Enumeration  : Debugonly
	 */
	Debugonly("Debugonly"),

  
	/**
	 * Enumeration  : Db
	 */
	Db("Db"),

  
	/**
	 * Enumeration  : Profiling
	 */
	Profiling("Profiling"),

  
	/**
	 * Enumeration  : Callout
	 */
	Callout("Callout"),

  
	/**
	 * Enumeration  : Detail
	 */
	Detail("Detail"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (LogType e : EnumSet.allOf(LogType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private LogType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
