package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum RetentionJobStatus {


  
	/**
	 * Enumeration  : CopyScheduled
	 */
	CopyScheduled("CopyScheduled"),

  
	/**
	 * Enumeration  : CopyRunning
	 */
	CopyRunning("CopyRunning"),

  
	/**
	 * Enumeration  : CopySucceeded
	 */
	CopySucceeded("CopySucceeded"),

  
	/**
	 * Enumeration  : CopyFailed
	 */
	CopyFailed("CopyFailed"),

  
	/**
	 * Enumeration  : CopyKilled
	 */
	CopyKilled("CopyKilled"),

  
	/**
	 * Enumeration  : NothingToArchive
	 */
	NothingToArchive("NothingToArchive"),

  
	/**
	 * Enumeration  : NothingToDelete
	 */
	NothingToDelete("NothingToDelete"),

  
	/**
	 * Enumeration  : DeleteScheduled
	 */
	DeleteScheduled("DeleteScheduled"),

  
	/**
	 * Enumeration  : DeleteRunning
	 */
	DeleteRunning("DeleteRunning"),

  
	/**
	 * Enumeration  : DeleteSucceeded
	 */
	DeleteSucceeded("DeleteSucceeded"),

  
	/**
	 * Enumeration  : DeleteFailed
	 */
	DeleteFailed("DeleteFailed"),

  
	/**
	 * Enumeration  : DeleteKilled
	 */
	DeleteKilled("DeleteKilled"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (RetentionJobStatus e : EnumSet.allOf(RetentionJobStatus.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private RetentionJobStatus(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
