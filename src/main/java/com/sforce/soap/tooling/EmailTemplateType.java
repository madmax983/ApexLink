package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum EmailTemplateType {


  
	/**
	 * Enumeration  : text
	 */
	text("text"),

  
	/**
	 * Enumeration  : html
	 */
	html("html"),

  
	/**
	 * Enumeration  : custom
	 */
	custom("custom"),

  
	/**
	 * Enumeration  : visualforce
	 */
	visualforce("visualforce"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (EmailTemplateType e : EnumSet.allOf(EmailTemplateType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private EmailTemplateType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
