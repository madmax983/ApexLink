package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum FlexiPageType {


  
	/**
	 * Enumeration  : AppPage
	 */
	AppPage("AppPage"),

  
	/**
	 * Enumeration  : ObjectPage
	 */
	ObjectPage("ObjectPage"),

  
	/**
	 * Enumeration  : RecordPage
	 */
	RecordPage("RecordPage"),

  
	/**
	 * Enumeration  : HomePage
	 */
	HomePage("HomePage"),

  
	/**
	 * Enumeration  : MailAppAppPage
	 */
	MailAppAppPage("MailAppAppPage"),

  
	/**
	 * Enumeration  : CommAppPage
	 */
	CommAppPage("CommAppPage"),

  
	/**
	 * Enumeration  : CommForgotPasswordPage
	 */
	CommForgotPasswordPage("CommForgotPasswordPage"),

  
	/**
	 * Enumeration  : CommLoginPage
	 */
	CommLoginPage("CommLoginPage"),

  
	/**
	 * Enumeration  : CommObjectPage
	 */
	CommObjectPage("CommObjectPage"),

  
	/**
	 * Enumeration  : CommQuickActionCreatePage
	 */
	CommQuickActionCreatePage("CommQuickActionCreatePage"),

  
	/**
	 * Enumeration  : CommRecordPage
	 */
	CommRecordPage("CommRecordPage"),

  
	/**
	 * Enumeration  : CommRelatedListPage
	 */
	CommRelatedListPage("CommRelatedListPage"),

  
	/**
	 * Enumeration  : CommSearchResultPage
	 */
	CommSearchResultPage("CommSearchResultPage"),

  
	/**
	 * Enumeration  : CommGlobalSearchResultPage
	 */
	CommGlobalSearchResultPage("CommGlobalSearchResultPage"),

  
	/**
	 * Enumeration  : CommSelfRegisterPage
	 */
	CommSelfRegisterPage("CommSelfRegisterPage"),

  
	/**
	 * Enumeration  : CommThemeLayoutPage
	 */
	CommThemeLayoutPage("CommThemeLayoutPage"),

  
	/**
	 * Enumeration  : UtilityBar
	 */
	UtilityBar("UtilityBar"),

  
	/**
	 * Enumeration  : RecordPreview
	 */
	RecordPreview("RecordPreview"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (FlexiPageType e : EnumSet.allOf(FlexiPageType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private FlexiPageType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
