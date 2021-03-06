package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum PlatformActionDeviceFormat {


  
	/**
	 * Enumeration  : Phone
	 */
	Phone("Phone"),

  
	/**
	 * Enumeration  : Tablet
	 */
	Tablet("Tablet"),

  
	/**
	 * Enumeration  : Desktop
	 */
	Desktop("Desktop"),

  
	/**
	 * Enumeration  : Aloha
	 */
	Aloha("Aloha"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (PlatformActionDeviceFormat e : EnumSet.allOf(PlatformActionDeviceFormat.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private PlatformActionDeviceFormat(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
