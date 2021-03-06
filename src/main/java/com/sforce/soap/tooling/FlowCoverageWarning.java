package com.sforce.soap.tooling;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class FlowCoverageWarning implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public FlowCoverageWarning() {}

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
     * element : flowId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean flowId__is_set = false;

    private java.lang.String flowId;

    public java.lang.String getFlowId() {
      return flowId;
    }

    public void setFlowId(java.lang.String flowId) {
      this.flowId = flowId;
      flowId__is_set = true;
    }

    protected void setFlowId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("flowId", "urn:tooling.soap.sforce.com","flowId","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setFlowId(__typeMapper.readString(__in, _lookupTypeInfo("flowId", "urn:tooling.soap.sforce.com","flowId","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFlowId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("flowId", "urn:tooling.soap.sforce.com","flowId","http://www.w3.org/2001/XMLSchema","string",1,1,true), flowId, flowId__is_set);
    }

    /**
     * element : flowName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean flowName__is_set = false;

    private java.lang.String flowName;

    public java.lang.String getFlowName() {
      return flowName;
    }

    public void setFlowName(java.lang.String flowName) {
      this.flowName = flowName;
      flowName__is_set = true;
    }

    protected void setFlowName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("flowName", "urn:tooling.soap.sforce.com","flowName","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setFlowName(__typeMapper.readString(__in, _lookupTypeInfo("flowName", "urn:tooling.soap.sforce.com","flowName","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFlowName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("flowName", "urn:tooling.soap.sforce.com","flowName","http://www.w3.org/2001/XMLSchema","string",1,1,true), flowName, flowName__is_set);
    }

    /**
     * element : flowNamespace of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean flowNamespace__is_set = false;

    private java.lang.String flowNamespace;

    public java.lang.String getFlowNamespace() {
      return flowNamespace;
    }

    public void setFlowNamespace(java.lang.String flowNamespace) {
      this.flowNamespace = flowNamespace;
      flowNamespace__is_set = true;
    }

    protected void setFlowNamespace(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("flowNamespace", "urn:tooling.soap.sforce.com","flowNamespace","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setFlowNamespace(__typeMapper.readString(__in, _lookupTypeInfo("flowNamespace", "urn:tooling.soap.sforce.com","flowNamespace","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFlowNamespace(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("flowNamespace", "urn:tooling.soap.sforce.com","flowNamespace","http://www.w3.org/2001/XMLSchema","string",1,1,true), flowNamespace, flowNamespace__is_set);
    }

    /**
     * element : message of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean message__is_set = false;

    private java.lang.String message;

    public java.lang.String getMessage() {
      return message;
    }

    public void setMessage(java.lang.String message) {
      this.message = message;
      message__is_set = true;
    }

    protected void setMessage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("message", "urn:tooling.soap.sforce.com","message","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setMessage(__typeMapper.readString(__in, _lookupTypeInfo("message", "urn:tooling.soap.sforce.com","message","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldMessage(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("message", "urn:tooling.soap.sforce.com","message","http://www.w3.org/2001/XMLSchema","string",1,1,true), message, message__is_set);
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
      sb.append("[FlowCoverageWarning ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldFlowId(__out, __typeMapper);
      writeFieldFlowName(__out, __typeMapper);
      writeFieldFlowNamespace(__out, __typeMapper);
      writeFieldMessage(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setFlowId(__in, __typeMapper);
      setFlowName(__in, __typeMapper);
      setFlowNamespace(__in, __typeMapper);
      setMessage(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "flowId", flowId);
      toStringHelper(sb, "flowName", flowName);
      toStringHelper(sb, "flowNamespace", flowNamespace);
      toStringHelper(sb, "message", message);
    }


}
