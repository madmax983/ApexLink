package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum ApexDebuggerKilledBy {


  
	/**
	 * Enumeration  : NoOne
	 */
	NoOne("NoOne"),

  
	/**
	 * Enumeration  : Debugger
	 */
	Debugger("Debugger"),

  
	/**
	 * Enumeration  : Metadata
	 */
	Metadata("Metadata"),

  
	/**
	 * Enumeration  : BT
	 */
	BT("BT"),

  
	/**
	 * Enumeration  : OrgAdmin
	 */
	OrgAdmin("OrgAdmin"),

  
	/**
	 * Enumeration  : Sweeper
	 */
	Sweeper("Sweeper"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (ApexDebuggerKilledBy e : EnumSet.allOf(ApexDebuggerKilledBy.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private ApexDebuggerKilledBy(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
