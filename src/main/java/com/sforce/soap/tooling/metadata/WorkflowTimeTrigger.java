package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class WorkflowTimeTrigger implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public WorkflowTimeTrigger() {}

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
     * element : actions of type {urn:metadata.tooling.soap.sforce.com}WorkflowActionReference
     * java type: com.sforce.soap.tooling.metadata.WorkflowActionReference[]
     */
    private boolean actions__is_set = false;

    private com.sforce.soap.tooling.metadata.WorkflowActionReference[] actions = new com.sforce.soap.tooling.metadata.WorkflowActionReference[0];

    public com.sforce.soap.tooling.metadata.WorkflowActionReference[] getActions() {
      return actions;
    }

    public void setActions(com.sforce.soap.tooling.metadata.WorkflowActionReference[] actions) {
      this.actions = actions;
      actions__is_set = true;
    }

    protected void setActions(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("actions", "urn:metadata.tooling.soap.sforce.com","actions","urn:metadata.tooling.soap.sforce.com","WorkflowActionReference",0,-1,true))) {
        setActions((com.sforce.soap.tooling.metadata.WorkflowActionReference[])__typeMapper.readObject(__in, _lookupTypeInfo("actions", "urn:metadata.tooling.soap.sforce.com","actions","urn:metadata.tooling.soap.sforce.com","WorkflowActionReference",0,-1,true), com.sforce.soap.tooling.metadata.WorkflowActionReference[].class));
      }
    }

    private void writeFieldActions(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("actions", "urn:metadata.tooling.soap.sforce.com","actions","urn:metadata.tooling.soap.sforce.com","WorkflowActionReference",0,-1,true), actions, actions__is_set);
    }

    /**
     * element : offsetFromField of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean offsetFromField__is_set = false;

    private java.lang.String offsetFromField;

    public java.lang.String getOffsetFromField() {
      return offsetFromField;
    }

    public void setOffsetFromField(java.lang.String offsetFromField) {
      this.offsetFromField = offsetFromField;
      offsetFromField__is_set = true;
    }

    protected void setOffsetFromField(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("offsetFromField", "urn:metadata.tooling.soap.sforce.com","offsetFromField","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setOffsetFromField(__typeMapper.readString(__in, _lookupTypeInfo("offsetFromField", "urn:metadata.tooling.soap.sforce.com","offsetFromField","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldOffsetFromField(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("offsetFromField", "urn:metadata.tooling.soap.sforce.com","offsetFromField","http://www.w3.org/2001/XMLSchema","string",0,1,true), offsetFromField, offsetFromField__is_set);
    }

    /**
     * element : timeLength of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean timeLength__is_set = false;

    private java.lang.String timeLength;

    public java.lang.String getTimeLength() {
      return timeLength;
    }

    public void setTimeLength(java.lang.String timeLength) {
      this.timeLength = timeLength;
      timeLength__is_set = true;
    }

    protected void setTimeLength(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("timeLength", "urn:metadata.tooling.soap.sforce.com","timeLength","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setTimeLength(__typeMapper.readString(__in, _lookupTypeInfo("timeLength", "urn:metadata.tooling.soap.sforce.com","timeLength","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldTimeLength(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("timeLength", "urn:metadata.tooling.soap.sforce.com","timeLength","http://www.w3.org/2001/XMLSchema","string",0,1,true), timeLength, timeLength__is_set);
    }

    /**
     * element : workflowTimeTriggerUnit of type {urn:tooling.soap.sforce.com}WorkflowTimeUnits
     * java type: com.sforce.soap.tooling.WorkflowTimeUnits
     */
    private boolean workflowTimeTriggerUnit__is_set = false;

    private com.sforce.soap.tooling.WorkflowTimeUnits workflowTimeTriggerUnit;

    public com.sforce.soap.tooling.WorkflowTimeUnits getWorkflowTimeTriggerUnit() {
      return workflowTimeTriggerUnit;
    }

    public void setWorkflowTimeTriggerUnit(com.sforce.soap.tooling.WorkflowTimeUnits workflowTimeTriggerUnit) {
      this.workflowTimeTriggerUnit = workflowTimeTriggerUnit;
      workflowTimeTriggerUnit__is_set = true;
    }

    protected void setWorkflowTimeTriggerUnit(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("workflowTimeTriggerUnit", "urn:metadata.tooling.soap.sforce.com","workflowTimeTriggerUnit","urn:tooling.soap.sforce.com","WorkflowTimeUnits",1,1,true))) {
        setWorkflowTimeTriggerUnit((com.sforce.soap.tooling.WorkflowTimeUnits)__typeMapper.readObject(__in, _lookupTypeInfo("workflowTimeTriggerUnit", "urn:metadata.tooling.soap.sforce.com","workflowTimeTriggerUnit","urn:tooling.soap.sforce.com","WorkflowTimeUnits",1,1,true), com.sforce.soap.tooling.WorkflowTimeUnits.class));
      }
    }

    private void writeFieldWorkflowTimeTriggerUnit(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("workflowTimeTriggerUnit", "urn:metadata.tooling.soap.sforce.com","workflowTimeTriggerUnit","urn:tooling.soap.sforce.com","WorkflowTimeUnits",1,1,true), workflowTimeTriggerUnit, workflowTimeTriggerUnit__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
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
        loadFields1(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[WorkflowTimeTrigger ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldActions(__out, __typeMapper);
      writeFieldOffsetFromField(__out, __typeMapper);
      writeFieldTimeLength(__out, __typeMapper);
      writeFieldWorkflowTimeTriggerUnit(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setActions(__in, __typeMapper);
      setOffsetFromField(__in, __typeMapper);
      setTimeLength(__in, __typeMapper);
      setWorkflowTimeTriggerUnit(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "actions", actions);
      toStringHelper(sb, "offsetFromField", offsetFromField);
      toStringHelper(sb, "timeLength", timeLength);
      toStringHelper(sb, "workflowTimeTriggerUnit", workflowTimeTriggerUnit);
    }


}
