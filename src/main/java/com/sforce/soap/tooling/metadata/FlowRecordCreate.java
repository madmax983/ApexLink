package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class FlowRecordCreate extends com.sforce.soap.tooling.metadata.FlowNode {

    /**
     * Constructor
     */
    public FlowRecordCreate() {}

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
     * element : assignRecordIdToReference of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean assignRecordIdToReference__is_set = false;

    private java.lang.String assignRecordIdToReference;

    public java.lang.String getAssignRecordIdToReference() {
      return assignRecordIdToReference;
    }

    public void setAssignRecordIdToReference(java.lang.String assignRecordIdToReference) {
      this.assignRecordIdToReference = assignRecordIdToReference;
      assignRecordIdToReference__is_set = true;
    }

    protected void setAssignRecordIdToReference(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("assignRecordIdToReference", "urn:metadata.tooling.soap.sforce.com","assignRecordIdToReference","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setAssignRecordIdToReference(__typeMapper.readString(__in, _lookupTypeInfo("assignRecordIdToReference", "urn:metadata.tooling.soap.sforce.com","assignRecordIdToReference","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAssignRecordIdToReference(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("assignRecordIdToReference", "urn:metadata.tooling.soap.sforce.com","assignRecordIdToReference","http://www.w3.org/2001/XMLSchema","string",0,1,true), assignRecordIdToReference, assignRecordIdToReference__is_set);
    }

    /**
     * element : connector of type {urn:metadata.tooling.soap.sforce.com}FlowConnector
     * java type: com.sforce.soap.tooling.metadata.FlowConnector
     */
    private boolean connector__is_set = false;

    private com.sforce.soap.tooling.metadata.FlowConnector connector;

    public com.sforce.soap.tooling.metadata.FlowConnector getConnector() {
      return connector;
    }

    public void setConnector(com.sforce.soap.tooling.metadata.FlowConnector connector) {
      this.connector = connector;
      connector__is_set = true;
    }

    protected void setConnector(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("connector", "urn:metadata.tooling.soap.sforce.com","connector","urn:metadata.tooling.soap.sforce.com","FlowConnector",0,1,true))) {
        setConnector((com.sforce.soap.tooling.metadata.FlowConnector)__typeMapper.readObject(__in, _lookupTypeInfo("connector", "urn:metadata.tooling.soap.sforce.com","connector","urn:metadata.tooling.soap.sforce.com","FlowConnector",0,1,true), com.sforce.soap.tooling.metadata.FlowConnector.class));
      }
    }

    private void writeFieldConnector(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("connector", "urn:metadata.tooling.soap.sforce.com","connector","urn:metadata.tooling.soap.sforce.com","FlowConnector",0,1,true), connector, connector__is_set);
    }

    /**
     * element : faultConnector of type {urn:metadata.tooling.soap.sforce.com}FlowConnector
     * java type: com.sforce.soap.tooling.metadata.FlowConnector
     */
    private boolean faultConnector__is_set = false;

    private com.sforce.soap.tooling.metadata.FlowConnector faultConnector;

    public com.sforce.soap.tooling.metadata.FlowConnector getFaultConnector() {
      return faultConnector;
    }

    public void setFaultConnector(com.sforce.soap.tooling.metadata.FlowConnector faultConnector) {
      this.faultConnector = faultConnector;
      faultConnector__is_set = true;
    }

    protected void setFaultConnector(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("faultConnector", "urn:metadata.tooling.soap.sforce.com","faultConnector","urn:metadata.tooling.soap.sforce.com","FlowConnector",0,1,true))) {
        setFaultConnector((com.sforce.soap.tooling.metadata.FlowConnector)__typeMapper.readObject(__in, _lookupTypeInfo("faultConnector", "urn:metadata.tooling.soap.sforce.com","faultConnector","urn:metadata.tooling.soap.sforce.com","FlowConnector",0,1,true), com.sforce.soap.tooling.metadata.FlowConnector.class));
      }
    }

    private void writeFieldFaultConnector(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("faultConnector", "urn:metadata.tooling.soap.sforce.com","faultConnector","urn:metadata.tooling.soap.sforce.com","FlowConnector",0,1,true), faultConnector, faultConnector__is_set);
    }

    /**
     * element : inputAssignments of type {urn:metadata.tooling.soap.sforce.com}FlowInputFieldAssignment
     * java type: com.sforce.soap.tooling.metadata.FlowInputFieldAssignment[]
     */
    private boolean inputAssignments__is_set = false;

    private com.sforce.soap.tooling.metadata.FlowInputFieldAssignment[] inputAssignments = new com.sforce.soap.tooling.metadata.FlowInputFieldAssignment[0];

    public com.sforce.soap.tooling.metadata.FlowInputFieldAssignment[] getInputAssignments() {
      return inputAssignments;
    }

    public void setInputAssignments(com.sforce.soap.tooling.metadata.FlowInputFieldAssignment[] inputAssignments) {
      this.inputAssignments = inputAssignments;
      inputAssignments__is_set = true;
    }

    protected void setInputAssignments(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("inputAssignments", "urn:metadata.tooling.soap.sforce.com","inputAssignments","urn:metadata.tooling.soap.sforce.com","FlowInputFieldAssignment",0,-1,true))) {
        setInputAssignments((com.sforce.soap.tooling.metadata.FlowInputFieldAssignment[])__typeMapper.readObject(__in, _lookupTypeInfo("inputAssignments", "urn:metadata.tooling.soap.sforce.com","inputAssignments","urn:metadata.tooling.soap.sforce.com","FlowInputFieldAssignment",0,-1,true), com.sforce.soap.tooling.metadata.FlowInputFieldAssignment[].class));
      }
    }

    private void writeFieldInputAssignments(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("inputAssignments", "urn:metadata.tooling.soap.sforce.com","inputAssignments","urn:metadata.tooling.soap.sforce.com","FlowInputFieldAssignment",0,-1,true), inputAssignments, inputAssignments__is_set);
    }

    /**
     * element : inputReference of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean inputReference__is_set = false;

    private java.lang.String inputReference;

    public java.lang.String getInputReference() {
      return inputReference;
    }

    public void setInputReference(java.lang.String inputReference) {
      this.inputReference = inputReference;
      inputReference__is_set = true;
    }

    protected void setInputReference(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("inputReference", "urn:metadata.tooling.soap.sforce.com","inputReference","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setInputReference(__typeMapper.readString(__in, _lookupTypeInfo("inputReference", "urn:metadata.tooling.soap.sforce.com","inputReference","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldInputReference(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("inputReference", "urn:metadata.tooling.soap.sforce.com","inputReference","http://www.w3.org/2001/XMLSchema","string",0,1,true), inputReference, inputReference__is_set);
    }

    /**
     * element : object of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean object__is_set = false;

    private java.lang.String object;

    public java.lang.String getObject() {
      return object;
    }

    public void setObject(java.lang.String object) {
      this.object = object;
      object__is_set = true;
    }

    protected void setObject(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("object", "urn:metadata.tooling.soap.sforce.com","object","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setObject(__typeMapper.readString(__in, _lookupTypeInfo("object", "urn:metadata.tooling.soap.sforce.com","object","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldObject(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("object", "urn:metadata.tooling.soap.sforce.com","object","http://www.w3.org/2001/XMLSchema","string",0,1,true), object, object__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:metadata.tooling.soap.sforce.com", "FlowRecordCreate");
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
      sb.append("[FlowRecordCreate ");
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
      writeFieldAssignRecordIdToReference(__out, __typeMapper);
      writeFieldConnector(__out, __typeMapper);
      writeFieldFaultConnector(__out, __typeMapper);
      writeFieldInputAssignments(__out, __typeMapper);
      writeFieldInputReference(__out, __typeMapper);
      writeFieldObject(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAssignRecordIdToReference(__in, __typeMapper);
      setConnector(__in, __typeMapper);
      setFaultConnector(__in, __typeMapper);
      setInputAssignments(__in, __typeMapper);
      setInputReference(__in, __typeMapper);
      setObject(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "assignRecordIdToReference", assignRecordIdToReference);
      toStringHelper(sb, "connector", connector);
      toStringHelper(sb, "faultConnector", faultConnector);
      toStringHelper(sb, "inputAssignments", inputAssignments);
      toStringHelper(sb, "inputReference", inputReference);
      toStringHelper(sb, "object", object);
    }


}
