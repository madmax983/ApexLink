package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum ActionEmailSenderType {


  
	/**
	 * Enumeration  : CurrentUser
	 */
	CurrentUser("CurrentUser"),

  
	/**
	 * Enumeration  : OrgWideEmailAddress
	 */
	OrgWideEmailAddress("OrgWideEmailAddress"),

  
	/**
	 * Enumeration  : DefaultWorkflowUser
	 */
	DefaultWorkflowUser("DefaultWorkflowUser"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (ActionEmailSenderType e : EnumSet.allOf(ActionEmailSenderType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private ActionEmailSenderType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
