package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum SubscriberPackageVersionUninstallRequestStatus {


  
	/**
	 * Enumeration  : Queued
	 */
	Queued("Queued"),

  
	/**
	 * Enumeration  : InProgress
	 */
	InProgress("InProgress"),

  
	/**
	 * Enumeration  : Success
	 */
	Success("Success"),

  
	/**
	 * Enumeration  : Error
	 */
	Error("Error"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (SubscriberPackageVersionUninstallRequestStatus e : EnumSet.allOf(SubscriberPackageVersionUninstallRequestStatus.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private SubscriberPackageVersionUninstallRequestStatus(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
