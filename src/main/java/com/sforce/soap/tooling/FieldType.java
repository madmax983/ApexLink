package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum FieldType {


  
	/**
	 * Enumeration  : AutoNumber
	 */
	AutoNumber("AutoNumber"),

  
	/**
	 * Enumeration  : Lookup
	 */
	Lookup("Lookup"),

  
	/**
	 * Enumeration  : MasterDetail
	 */
	MasterDetail("MasterDetail"),

  
	/**
	 * Enumeration  : Checkbox
	 */
	Checkbox("Checkbox"),

  
	/**
	 * Enumeration  : Currency
	 */
	Currency("Currency"),

  
	/**
	 * Enumeration  : Date
	 */
	Date("Date"),

  
	/**
	 * Enumeration  : DateTime
	 */
	DateTime("DateTime"),

  
	/**
	 * Enumeration  : Email
	 */
	Email("Email"),

  
	/**
	 * Enumeration  : Number
	 */
	Number("Number"),

  
	/**
	 * Enumeration  : Percent
	 */
	Percent("Percent"),

  
	/**
	 * Enumeration  : Phone
	 */
	Phone("Phone"),

  
	/**
	 * Enumeration  : Picklist
	 */
	Picklist("Picklist"),

  
	/**
	 * Enumeration  : MultiselectPicklist
	 */
	MultiselectPicklist("MultiselectPicklist"),

  
	/**
	 * Enumeration  : Text
	 */
	Text("Text"),

  
	/**
	 * Enumeration  : TextArea
	 */
	TextArea("TextArea"),

  
	/**
	 * Enumeration  : LongTextArea
	 */
	LongTextArea("LongTextArea"),

  
	/**
	 * Enumeration  : Html
	 */
	Html("Html"),

  
	/**
	 * Enumeration  : Url
	 */
	Url("Url"),

  
	/**
	 * Enumeration  : EncryptedText
	 */
	EncryptedText("EncryptedText"),

  
	/**
	 * Enumeration  : Summary
	 */
	Summary("Summary"),

  
	/**
	 * Enumeration  : Hierarchy
	 */
	Hierarchy("Hierarchy"),

  
	/**
	 * Enumeration  : File
	 */
	File("File"),

  
	/**
	 * Enumeration  : MetadataRelationship
	 */
	MetadataRelationship("MetadataRelationship"),

  
	/**
	 * Enumeration  : Location
	 */
	Location("Location"),

  
	/**
	 * Enumeration  : ExternalLookup
	 */
	ExternalLookup("ExternalLookup"),

  
	/**
	 * Enumeration  : IndirectLookup
	 */
	IndirectLookup("IndirectLookup"),

  
	/**
	 * Enumeration  : CustomDataType
	 */
	CustomDataType("CustomDataType"),

  
	/**
	 * Enumeration  : Time
	 */
	Time("Time"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (FieldType e : EnumSet.allOf(FieldType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private FieldType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
