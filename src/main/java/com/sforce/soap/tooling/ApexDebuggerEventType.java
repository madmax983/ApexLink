package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum ApexDebuggerEventType {


  
	/**
	 * Enumeration  : Stopped
	 */
	Stopped("Stopped"),

  
	/**
	 * Enumeration  : Resumed
	 */
	Resumed("Resumed"),

  
	/**
	 * Enumeration  : RequestStarted
	 */
	RequestStarted("RequestStarted"),

  
	/**
	 * Enumeration  : RequestFinished
	 */
	RequestFinished("RequestFinished"),

  
	/**
	 * Enumeration  : SystemInfo
	 */
	SystemInfo("SystemInfo"),

  
	/**
	 * Enumeration  : SystemWarning
	 */
	SystemWarning("SystemWarning"),

  
	/**
	 * Enumeration  : SystemGack
	 */
	SystemGack("SystemGack"),

  
	/**
	 * Enumeration  : OrgChange
	 */
	OrgChange("OrgChange"),

  
	/**
	 * Enumeration  : SessionTerminated
	 */
	SessionTerminated("SessionTerminated"),

  
	/**
	 * Enumeration  : LogLine
	 */
	LogLine("LogLine"),

  
	/**
	 * Enumeration  : Debug
	 */
	Debug("Debug"),

  
	/**
	 * Enumeration  : HeartBeat
	 */
	HeartBeat("HeartBeat"),

  
	/**
	 * Enumeration  : ApexException
	 */
	ApexException("ApexException"),

  
	/**
	 * Enumeration  : Ready
	 */
	Ready("Ready"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (ApexDebuggerEventType e : EnumSet.allOf(ApexDebuggerEventType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private ApexDebuggerEventType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
