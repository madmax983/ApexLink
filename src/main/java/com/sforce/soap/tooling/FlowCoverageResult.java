package com.sforce.soap.tooling;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class FlowCoverageResult implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public FlowCoverageResult() {}

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
     * element : elementsNotCovered of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String[]
     */
    private boolean elementsNotCovered__is_set = false;

    private java.lang.String[] elementsNotCovered = new java.lang.String[0];

    public java.lang.String[] getElementsNotCovered() {
      return elementsNotCovered;
    }

    public void setElementsNotCovered(java.lang.String[] elementsNotCovered) {
      this.elementsNotCovered = elementsNotCovered;
      elementsNotCovered__is_set = true;
    }

    protected void setElementsNotCovered(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("elementsNotCovered", "urn:tooling.soap.sforce.com","elementsNotCovered","http://www.w3.org/2001/XMLSchema","string",0,-1,true))) {
        setElementsNotCovered((java.lang.String[])__typeMapper.readObject(__in, _lookupTypeInfo("elementsNotCovered", "urn:tooling.soap.sforce.com","elementsNotCovered","http://www.w3.org/2001/XMLSchema","string",0,-1,true), java.lang.String[].class));
      }
    }

    private void writeFieldElementsNotCovered(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("elementsNotCovered", "urn:tooling.soap.sforce.com","elementsNotCovered","http://www.w3.org/2001/XMLSchema","string",0,-1,true), elementsNotCovered, elementsNotCovered__is_set);
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
     * element : numElements of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private boolean numElements__is_set = false;

    private int numElements;

    public int getNumElements() {
      return numElements;
    }

    public void setNumElements(int numElements) {
      this.numElements = numElements;
      numElements__is_set = true;
    }

    protected void setNumElements(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("numElements", "urn:tooling.soap.sforce.com","numElements","http://www.w3.org/2001/XMLSchema","int",1,1,true))) {
        setNumElements((int)__typeMapper.readInt(__in, _lookupTypeInfo("numElements", "urn:tooling.soap.sforce.com","numElements","http://www.w3.org/2001/XMLSchema","int",1,1,true), int.class));
      }
    }

    private void writeFieldNumElements(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("numElements", "urn:tooling.soap.sforce.com","numElements","http://www.w3.org/2001/XMLSchema","int",1,1,true), numElements, numElements__is_set);
    }

    /**
     * element : numElementsNotCovered of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private boolean numElementsNotCovered__is_set = false;

    private int numElementsNotCovered;

    public int getNumElementsNotCovered() {
      return numElementsNotCovered;
    }

    public void setNumElementsNotCovered(int numElementsNotCovered) {
      this.numElementsNotCovered = numElementsNotCovered;
      numElementsNotCovered__is_set = true;
    }

    protected void setNumElementsNotCovered(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("numElementsNotCovered", "urn:tooling.soap.sforce.com","numElementsNotCovered","http://www.w3.org/2001/XMLSchema","int",1,1,true))) {
        setNumElementsNotCovered((int)__typeMapper.readInt(__in, _lookupTypeInfo("numElementsNotCovered", "urn:tooling.soap.sforce.com","numElementsNotCovered","http://www.w3.org/2001/XMLSchema","int",1,1,true), int.class));
      }
    }

    private void writeFieldNumElementsNotCovered(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("numElementsNotCovered", "urn:tooling.soap.sforce.com","numElementsNotCovered","http://www.w3.org/2001/XMLSchema","int",1,1,true), numElementsNotCovered, numElementsNotCovered__is_set);
    }

    /**
     * element : processType of type {urn:tooling.soap.sforce.com}FlowProcessType
     * java type: com.sforce.soap.tooling.FlowProcessType
     */
    private boolean processType__is_set = false;

    private com.sforce.soap.tooling.FlowProcessType processType;

    public com.sforce.soap.tooling.FlowProcessType getProcessType() {
      return processType;
    }

    public void setProcessType(com.sforce.soap.tooling.FlowProcessType processType) {
      this.processType = processType;
      processType__is_set = true;
    }

    protected void setProcessType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("processType", "urn:tooling.soap.sforce.com","processType","urn:tooling.soap.sforce.com","FlowProcessType",1,1,true))) {
        setProcessType((com.sforce.soap.tooling.FlowProcessType)__typeMapper.readObject(__in, _lookupTypeInfo("processType", "urn:tooling.soap.sforce.com","processType","urn:tooling.soap.sforce.com","FlowProcessType",1,1,true), com.sforce.soap.tooling.FlowProcessType.class));
      }
    }

    private void writeFieldProcessType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("processType", "urn:tooling.soap.sforce.com","processType","urn:tooling.soap.sforce.com","FlowProcessType",1,1,true), processType, processType__is_set);
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
      sb.append("[FlowCoverageResult ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldElementsNotCovered(__out, __typeMapper);
      writeFieldFlowId(__out, __typeMapper);
      writeFieldFlowName(__out, __typeMapper);
      writeFieldFlowNamespace(__out, __typeMapper);
      writeFieldNumElements(__out, __typeMapper);
      writeFieldNumElementsNotCovered(__out, __typeMapper);
      writeFieldProcessType(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setElementsNotCovered(__in, __typeMapper);
      setFlowId(__in, __typeMapper);
      setFlowName(__in, __typeMapper);
      setFlowNamespace(__in, __typeMapper);
      setNumElements(__in, __typeMapper);
      setNumElementsNotCovered(__in, __typeMapper);
      setProcessType(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "elementsNotCovered", elementsNotCovered);
      toStringHelper(sb, "flowId", flowId);
      toStringHelper(sb, "flowName", flowName);
      toStringHelper(sb, "flowNamespace", flowNamespace);
      toStringHelper(sb, "numElements", numElements);
      toStringHelper(sb, "numElementsNotCovered", numElementsNotCovered);
      toStringHelper(sb, "processType", processType);
    }


}
