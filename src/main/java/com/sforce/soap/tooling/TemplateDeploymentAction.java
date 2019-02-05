package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum TemplateDeploymentAction {


  
	/**
	 * Enumeration  : Created
	 */
	Created("Created"),

  
	/**
	 * Enumeration  : Updated
	 */
	Updated("Updated"),

  
	/**
	 * Enumeration  : Deleted
	 */
	Deleted("Deleted"),

  
	/**
	 * Enumeration  : Unchanged
	 */
	Unchanged("Unchanged"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (TemplateDeploymentAction e : EnumSet.allOf(TemplateDeploymentAction.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private TemplateDeploymentAction(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
