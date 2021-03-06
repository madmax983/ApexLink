package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum QuickActionLabel {


  
	/**
	 * Enumeration  : LogACall
	 */
	LogACall("LogACall"),

  
	/**
	 * Enumeration  : LogANote
	 */
	LogANote("LogANote"),

  
	/**
	 * Enumeration  : New
	 */
	New("New"),

  
	/**
	 * Enumeration  : NewRecordType
	 */
	NewRecordType("NewRecordType"),

  
	/**
	 * Enumeration  : Update
	 */
	Update("Update"),

  
	/**
	 * Enumeration  : NewChild
	 */
	NewChild("NewChild"),

  
	/**
	 * Enumeration  : NewChildRecordType
	 */
	NewChildRecordType("NewChildRecordType"),

  
	/**
	 * Enumeration  : CreateNew
	 */
	CreateNew("CreateNew"),

  
	/**
	 * Enumeration  : CreateNewRecordType
	 */
	CreateNewRecordType("CreateNewRecordType"),

  
	/**
	 * Enumeration  : SendEmail
	 */
	SendEmail("SendEmail"),

  
	/**
	 * Enumeration  : QuickRecordType
	 */
	QuickRecordType("QuickRecordType"),

  
	/**
	 * Enumeration  : Quick
	 */
	Quick("Quick"),

  
	/**
	 * Enumeration  : EditDescription
	 */
	EditDescription("EditDescription"),

  
	/**
	 * Enumeration  : Defer
	 */
	Defer("Defer"),

  
	/**
	 * Enumeration  : ChangeDueDate
	 */
	ChangeDueDate("ChangeDueDate"),

  
	/**
	 * Enumeration  : ChangePriority
	 */
	ChangePriority("ChangePriority"),

  
	/**
	 * Enumeration  : ChangeStatus
	 */
	ChangeStatus("ChangeStatus"),

  
	/**
	 * Enumeration  : SocialPost
	 */
	SocialPost("SocialPost"),

  
	/**
	 * Enumeration  : Escalate
	 */
	Escalate("Escalate"),

  
	/**
	 * Enumeration  : EscalateToRecord
	 */
	EscalateToRecord("EscalateToRecord"),

  
	/**
	 * Enumeration  : OfferFeedback
	 */
	OfferFeedback("OfferFeedback"),

  
	/**
	 * Enumeration  : RequestFeedback
	 */
	RequestFeedback("RequestFeedback"),

  
	/**
	 * Enumeration  : AddRecord
	 */
	AddRecord("AddRecord"),

  
	/**
	 * Enumeration  : AddMember
	 */
	AddMember("AddMember"),

  
	/**
	 * Enumeration  : Reply
	 */
	Reply("Reply"),

  
	/**
	 * Enumeration  : ReplyAll
	 */
	ReplyAll("ReplyAll"),

  
	/**
	 * Enumeration  : Forward
	 */
	Forward("Forward"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (QuickActionLabel e : EnumSet.allOf(QuickActionLabel.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private QuickActionLabel(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
