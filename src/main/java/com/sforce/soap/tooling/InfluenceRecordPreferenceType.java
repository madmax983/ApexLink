package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum InfluenceRecordPreferenceType {


  
	/**
	 * Enumeration  : AllRecords
	 */
	AllRecords("AllRecords"),

  
	/**
	 * Enumeration  : RecordsWithAttribution
	 */
	RecordsWithAttribution("RecordsWithAttribution"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (InfluenceRecordPreferenceType e : EnumSet.allOf(InfluenceRecordPreferenceType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private InfluenceRecordPreferenceType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
