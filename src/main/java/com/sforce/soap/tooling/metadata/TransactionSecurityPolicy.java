package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class TransactionSecurityPolicy extends com.sforce.soap.tooling.metadata.Metadata {

    /**
     * Constructor
     */
    public TransactionSecurityPolicy() {}

    /* Cache the typeInfo instead of declaring static fields throughout*/
    private transient java.util.Map<String, com.sforce.ws.bind.TypeInfo> typeInfoCache = new java.util.HashMap<String, com.sforce.ws.bind.TypeInfo>();
    private com.sforce.ws.bind.TypeInfo _lookupTypeInfo(String fieldName, String namespace, String name, String typeNS, String type, int minOcc, int maxOcc, boolean elementForm) {
      com.sforce.ws.bind.TypeInfo typeInfo = typeInfoCache.get(fieldName);
      if (typeInfo == null) {
        typeInfo = new com.sforce.ws.bind.TypeInfo(namespace, name, typeNS, type, minOcc, maxOcc, elementForm);
        typeInfoCache.put(fieldName, typeInfo);
      }
      return typeInfo;
    }

    /**
     * element : action of type {urn:metadata.tooling.soap.sforce.com}TransactionSecurityAction
     * java type: com.sforce.soap.tooling.metadata.TransactionSecurityAction
     */
    private boolean action__is_set = false;

    private com.sforce.soap.tooling.metadata.TransactionSecurityAction action;

    public com.sforce.soap.tooling.metadata.TransactionSecurityAction getAction() {
      return action;
    }

    public void setAction(com.sforce.soap.tooling.metadata.TransactionSecurityAction action) {
      this.action = action;
      action__is_set = true;
    }

    protected void setAction(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("action", "urn:metadata.tooling.soap.sforce.com","action","urn:metadata.tooling.soap.sforce.com","TransactionSecurityAction",1,1,true))) {
        setAction((com.sforce.soap.tooling.metadata.TransactionSecurityAction)__typeMapper.readObject(__in, _lookupTypeInfo("action", "urn:metadata.tooling.soap.sforce.com","action","urn:metadata.tooling.soap.sforce.com","TransactionSecurityAction",1,1,true), com.sforce.soap.tooling.metadata.TransactionSecurityAction.class));
      }
    }

    private void writeFieldAction(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("action", "urn:metadata.tooling.soap.sforce.com","action","urn:metadata.tooling.soap.sforce.com","TransactionSecurityAction",1,1,true), action, action__is_set);
    }

    /**
     * element : active of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean active__is_set = false;

    private boolean active;

    public boolean getActive() {
      return active;
    }

    public boolean isActive() {
      return active;
    }

    public void setActive(boolean active) {
      this.active = active;
      active__is_set = true;
    }

    protected void setActive(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("active", "urn:metadata.tooling.soap.sforce.com","active","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setActive(__typeMapper.readBoolean(__in, _lookupTypeInfo("active", "urn:metadata.tooling.soap.sforce.com","active","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldActive(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("active", "urn:metadata.tooling.soap.sforce.com","active","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), active, active__is_set);
    }

    /**
     * element : apexClass of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean apexClass__is_set = false;

    private java.lang.String apexClass;

    public java.lang.String getApexClass() {
      return apexClass;
    }

    public void setApexClass(java.lang.String apexClass) {
      this.apexClass = apexClass;
      apexClass__is_set = true;
    }

    protected void setApexClass(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("apexClass", "urn:metadata.tooling.soap.sforce.com","apexClass","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setApexClass(__typeMapper.readString(__in, _lookupTypeInfo("apexClass", "urn:metadata.tooling.soap.sforce.com","apexClass","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldApexClass(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("apexClass", "urn:metadata.tooling.soap.sforce.com","apexClass","http://www.w3.org/2001/XMLSchema","string",0,1,true), apexClass, apexClass__is_set);
    }

    /**
     * element : description of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean description__is_set = false;

    private java.lang.String description;

    public java.lang.String getDescription() {
      return description;
    }

    public void setDescription(java.lang.String description) {
      this.description = description;
      description__is_set = true;
    }

    protected void setDescription(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("description", "urn:metadata.tooling.soap.sforce.com","description","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDescription(__typeMapper.readString(__in, _lookupTypeInfo("description", "urn:metadata.tooling.soap.sforce.com","description","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDescription(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("description", "urn:metadata.tooling.soap.sforce.com","description","http://www.w3.org/2001/XMLSchema","string",0,1,true), description, description__is_set);
    }

    /**
     * element : developerName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean developerName__is_set = false;

    private java.lang.String developerName;

    public java.lang.String getDeveloperName() {
      return developerName;
    }

    public void setDeveloperName(java.lang.String developerName) {
      this.developerName = developerName;
      developerName__is_set = true;
    }

    protected void setDeveloperName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("developerName", "urn:metadata.tooling.soap.sforce.com","developerName","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDeveloperName(__typeMapper.readString(__in, _lookupTypeInfo("developerName", "urn:metadata.tooling.soap.sforce.com","developerName","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDeveloperName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("developerName", "urn:metadata.tooling.soap.sforce.com","developerName","http://www.w3.org/2001/XMLSchema","string",0,1,true), developerName, developerName__is_set);
    }

    /**
     * element : eventName of type {urn:tooling.soap.sforce.com}TransactionSecurityEventName
     * java type: com.sforce.soap.tooling.TransactionSecurityEventName
     */
    private boolean eventName__is_set = false;

    private com.sforce.soap.tooling.TransactionSecurityEventName eventName;

    public com.sforce.soap.tooling.TransactionSecurityEventName getEventName() {
      return eventName;
    }

    public void setEventName(com.sforce.soap.tooling.TransactionSecurityEventName eventName) {
      this.eventName = eventName;
      eventName__is_set = true;
    }

    protected void setEventName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("eventName", "urn:metadata.tooling.soap.sforce.com","eventName","urn:tooling.soap.sforce.com","TransactionSecurityEventName",0,1,true))) {
        setEventName((com.sforce.soap.tooling.TransactionSecurityEventName)__typeMapper.readObject(__in, _lookupTypeInfo("eventName", "urn:metadata.tooling.soap.sforce.com","eventName","urn:tooling.soap.sforce.com","TransactionSecurityEventName",0,1,true), com.sforce.soap.tooling.TransactionSecurityEventName.class));
      }
    }

    private void writeFieldEventName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("eventName", "urn:metadata.tooling.soap.sforce.com","eventName","urn:tooling.soap.sforce.com","TransactionSecurityEventName",0,1,true), eventName, eventName__is_set);
    }

    /**
     * element : eventType of type {urn:tooling.soap.sforce.com}MonitoredEvents
     * java type: com.sforce.soap.tooling.MonitoredEvents
     */
    private boolean eventType__is_set = false;

    private com.sforce.soap.tooling.MonitoredEvents eventType;

    public com.sforce.soap.tooling.MonitoredEvents getEventType() {
      return eventType;
    }

    public void setEventType(com.sforce.soap.tooling.MonitoredEvents eventType) {
      this.eventType = eventType;
      eventType__is_set = true;
    }

    protected void setEventType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("eventType", "urn:metadata.tooling.soap.sforce.com","eventType","urn:tooling.soap.sforce.com","MonitoredEvents",0,1,true))) {
        setEventType((com.sforce.soap.tooling.MonitoredEvents)__typeMapper.readObject(__in, _lookupTypeInfo("eventType", "urn:metadata.tooling.soap.sforce.com","eventType","urn:tooling.soap.sforce.com","MonitoredEvents",0,1,true), com.sforce.soap.tooling.MonitoredEvents.class));
      }
    }

    private void writeFieldEventType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("eventType", "urn:metadata.tooling.soap.sforce.com","eventType","urn:tooling.soap.sforce.com","MonitoredEvents",0,1,true), eventType, eventType__is_set);
    }

    /**
     * element : executionUser of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean executionUser__is_set = false;

    private java.lang.String executionUser;

    public java.lang.String getExecutionUser() {
      return executionUser;
    }

    public void setExecutionUser(java.lang.String executionUser) {
      this.executionUser = executionUser;
      executionUser__is_set = true;
    }

    protected void setExecutionUser(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("executionUser", "urn:metadata.tooling.soap.sforce.com","executionUser","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setExecutionUser(__typeMapper.readString(__in, _lookupTypeInfo("executionUser", "urn:metadata.tooling.soap.sforce.com","executionUser","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldExecutionUser(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("executionUser", "urn:metadata.tooling.soap.sforce.com","executionUser","http://www.w3.org/2001/XMLSchema","string",1,1,true), executionUser, executionUser__is_set);
    }

    /**
     * element : flow of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean flow__is_set = false;

    private java.lang.String flow;

    public java.lang.String getFlow() {
      return flow;
    }

    public void setFlow(java.lang.String flow) {
      this.flow = flow;
      flow__is_set = true;
    }

    protected void setFlow(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("flow", "urn:metadata.tooling.soap.sforce.com","flow","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setFlow(__typeMapper.readString(__in, _lookupTypeInfo("flow", "urn:metadata.tooling.soap.sforce.com","flow","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFlow(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("flow", "urn:metadata.tooling.soap.sforce.com","flow","http://www.w3.org/2001/XMLSchema","string",0,1,true), flow, flow__is_set);
    }

    /**
     * element : masterLabel of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean masterLabel__is_set = false;

    private java.lang.String masterLabel;

    public java.lang.String getMasterLabel() {
      return masterLabel;
    }

    public void setMasterLabel(java.lang.String masterLabel) {
      this.masterLabel = masterLabel;
      masterLabel__is_set = true;
    }

    protected void setMasterLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("masterLabel", "urn:metadata.tooling.soap.sforce.com","masterLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setMasterLabel(__typeMapper.readString(__in, _lookupTypeInfo("masterLabel", "urn:metadata.tooling.soap.sforce.com","masterLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldMasterLabel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("masterLabel", "urn:metadata.tooling.soap.sforce.com","masterLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true), masterLabel, masterLabel__is_set);
    }

    /**
     * element : resourceName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean resourceName__is_set = false;

    private java.lang.String resourceName;

    public java.lang.String getResourceName() {
      return resourceName;
    }

    public void setResourceName(java.lang.String resourceName) {
      this.resourceName = resourceName;
      resourceName__is_set = true;
    }

    protected void setResourceName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("resourceName", "urn:metadata.tooling.soap.sforce.com","resourceName","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setResourceName(__typeMapper.readString(__in, _lookupTypeInfo("resourceName", "urn:metadata.tooling.soap.sforce.com","resourceName","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldResourceName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("resourceName", "urn:metadata.tooling.soap.sforce.com","resourceName","http://www.w3.org/2001/XMLSchema","string",0,1,true), resourceName, resourceName__is_set);
    }

    /**
     * element : type of type {urn:tooling.soap.sforce.com}TxnSecurityPolicyType
     * java type: com.sforce.soap.tooling.TxnSecurityPolicyType
     */
    private boolean type__is_set = false;

    private com.sforce.soap.tooling.TxnSecurityPolicyType type;

    public com.sforce.soap.tooling.TxnSecurityPolicyType getType() {
      return type;
    }

    public void setType(com.sforce.soap.tooling.TxnSecurityPolicyType type) {
      this.type = type;
      type__is_set = true;
    }

    protected void setType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("type", "urn:metadata.tooling.soap.sforce.com","type","urn:tooling.soap.sforce.com","TxnSecurityPolicyType",0,1,true))) {
        setType((com.sforce.soap.tooling.TxnSecurityPolicyType)__typeMapper.readObject(__in, _lookupTypeInfo("type", "urn:metadata.tooling.soap.sforce.com","type","urn:tooling.soap.sforce.com","TxnSecurityPolicyType",0,1,true), com.sforce.soap.tooling.TxnSecurityPolicyType.class));
      }
    }

    private void writeFieldType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("type", "urn:metadata.tooling.soap.sforce.com","type","urn:tooling.soap.sforce.com","TxnSecurityPolicyType",0,1,true), type, type__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:metadata.tooling.soap.sforce.com", "TransactionSecurityPolicy");
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       super.writeFields(__out, __typeMapper);
       writeFields1(__out, __typeMapper);
    }

    @Override
    public void load(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __typeMapper.consumeStartTag(__in);
      loadFields(__in, __typeMapper);
      __typeMapper.consumeEndTag(__in);
    }

    protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
        super.loadFields(__in, __typeMapper);
        loadFields1(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[TransactionSecurityPolicy ");
      sb.append(super.toString());
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldAction(__out, __typeMapper);
      writeFieldActive(__out, __typeMapper);
      writeFieldApexClass(__out, __typeMapper);
      writeFieldDescription(__out, __typeMapper);
      writeFieldDeveloperName(__out, __typeMapper);
      writeFieldEventName(__out, __typeMapper);
      writeFieldEventType(__out, __typeMapper);
      writeFieldExecutionUser(__out, __typeMapper);
      writeFieldFlow(__out, __typeMapper);
      writeFieldMasterLabel(__out, __typeMapper);
      writeFieldResourceName(__out, __typeMapper);
      writeFieldType(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAction(__in, __typeMapper);
      setActive(__in, __typeMapper);
      setApexClass(__in, __typeMapper);
      setDescription(__in, __typeMapper);
      setDeveloperName(__in, __typeMapper);
      setEventName(__in, __typeMapper);
      setEventType(__in, __typeMapper);
      setExecutionUser(__in, __typeMapper);
      setFlow(__in, __typeMapper);
      setMasterLabel(__in, __typeMapper);
      setResourceName(__in, __typeMapper);
      setType(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "action", action);
      toStringHelper(sb, "active", active);
      toStringHelper(sb, "apexClass", apexClass);
      toStringHelper(sb, "description", description);
      toStringHelper(sb, "developerName", developerName);
      toStringHelper(sb, "eventName", eventName);
      toStringHelper(sb, "eventType", eventType);
      toStringHelper(sb, "executionUser", executionUser);
      toStringHelper(sb, "flow", flow);
      toStringHelper(sb, "masterLabel", masterLabel);
      toStringHelper(sb, "resourceName", resourceName);
      toStringHelper(sb, "type", type);
    }


}
