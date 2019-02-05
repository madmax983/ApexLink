package com.sforce.soap.tooling;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public enum FlowProcessType {


  
	/**
	 * Enumeration  : AutoLaunchedFlow
	 */
	AutoLaunchedFlow("AutoLaunchedFlow"),

  
	/**
	 * Enumeration  : Flow
	 */
	Flow("Flow"),

  
	/**
	 * Enumeration  : Workflow
	 */
	Workflow("Workflow"),

  
	/**
	 * Enumeration  : CustomEvent
	 */
	CustomEvent("CustomEvent"),

  
	/**
	 * Enumeration  : InvocableProcess
	 */
	InvocableProcess("InvocableProcess"),

  
	/**
	 * Enumeration  : LoginFlow
	 */
	LoginFlow("LoginFlow"),

  
	/**
	 * Enumeration  : ActionPlan
	 */
	ActionPlan("ActionPlan"),

  
	/**
	 * Enumeration  : JourneyBuilderIntegration
	 */
	JourneyBuilderIntegration("JourneyBuilderIntegration"),

  
	/**
	 * Enumeration  : UserProvisioningFlow
	 */
	UserProvisioningFlow("UserProvisioningFlow"),

  
	/**
	 * Enumeration  : Survey
	 */
	Survey("Survey"),

  
	/**
	 * Enumeration  : Form
	 */
	Form("Form"),

  
	/**
	 * Enumeration  : FieldServiceMobile
	 */
	FieldServiceMobile("FieldServiceMobile"),

  
	/**
	 * Enumeration  : OrchestrationFlow
	 */
	OrchestrationFlow("OrchestrationFlow"),

  
	/**
	 * Enumeration  : FieldServiceWeb
	 */
	FieldServiceWeb("FieldServiceWeb"),

  
	/**
	 * Enumeration  : TransactionSecurityFlow
	 */
	TransactionSecurityFlow("TransactionSecurityFlow"),

  
	/**
	 * Enumeration  : ContactRequestFlow
	 */
	ContactRequestFlow("ContactRequestFlow"),

;

	public static Map<String, String> valuesToEnums;

	static {
   		valuesToEnums = new HashMap<String, String>();
   		for (FlowProcessType e : EnumSet.allOf(FlowProcessType.class)) {
   			valuesToEnums.put(e.toString(), e.name());
   		}
   	}

   	private String value;

   	private FlowProcessType(String value) {
   		this.value = value;
   	}

   	@Override
   	public String toString() {
   		return value;
   	}
}
