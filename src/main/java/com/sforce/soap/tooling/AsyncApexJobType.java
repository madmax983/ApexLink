package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum AsyncApexJobType {


  
	/**
	 * Enumeration  : Future
	 */
	Future("Future"),

  
	/**
	 * Enumeration  : SharingRecalculation
	 */
	SharingRecalculation("SharingRecalculation"),

  
	/**
	 * Enumeration  : ScheduledApex
	 */
	ScheduledApex("ScheduledApex"),

  
	/**
	 * Enumeration  : BatchApex
	 */
	BatchApex("BatchApex"),

  
	/**
	 * Enumeration  : BatchApexWorker
	 */
	BatchApexWorker("BatchApexWorker"),

  
	/**
	 * Enumeration  : TestRequest
	 */
	TestRequest("TestRequest"),

  
	/**
	 * Enumeration  : TestWorker
	 */
	TestWorker("TestWorker"),

  
	/**
	 * Enumeration  : ApexToken
	 */
	ApexToken("ApexToken"),

  
	/**
	 * Enumeration  : Queueable
	 */
	Queueable("Queueable"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (AsyncApexJobType e : EnumSet.allOf(AsyncApexJobType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private AsyncApexJobType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
