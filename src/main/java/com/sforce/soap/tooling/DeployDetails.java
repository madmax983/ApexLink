package com.sforce.soap.tooling;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class DeployDetails implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DeployDetails() {}

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
     * element : componentFailures of type {urn:tooling.soap.sforce.com}DeployMessage
     * java type: com.sforce.soap.tooling.DeployMessage[]
     */
    private boolean componentFailures__is_set = false;

    private com.sforce.soap.tooling.DeployMessage[] componentFailures = new com.sforce.soap.tooling.DeployMessage[0];

    public com.sforce.soap.tooling.DeployMessage[] getComponentFailures() {
      return componentFailures;
    }

    public void setComponentFailures(com.sforce.soap.tooling.DeployMessage[] componentFailures) {
      this.componentFailures = componentFailures;
      componentFailures__is_set = true;
    }

    protected void setComponentFailures(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("componentFailures", "urn:tooling.soap.sforce.com","componentFailures","urn:tooling.soap.sforce.com","DeployMessage",0,-1,true))) {
        setComponentFailures((com.sforce.soap.tooling.DeployMessage[])__typeMapper.readObject(__in, _lookupTypeInfo("componentFailures", "urn:tooling.soap.sforce.com","componentFailures","urn:tooling.soap.sforce.com","DeployMessage",0,-1,true), com.sforce.soap.tooling.DeployMessage[].class));
      }
    }

    private void writeFieldComponentFailures(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("componentFailures", "urn:tooling.soap.sforce.com","componentFailures","urn:tooling.soap.sforce.com","DeployMessage",0,-1,true), componentFailures, componentFailures__is_set);
    }

    /**
     * element : componentSuccesses of type {urn:tooling.soap.sforce.com}DeployMessage
     * java type: com.sforce.soap.tooling.DeployMessage[]
     */
    private boolean componentSuccesses__is_set = false;

    private com.sforce.soap.tooling.DeployMessage[] componentSuccesses = new com.sforce.soap.tooling.DeployMessage[0];

    public com.sforce.soap.tooling.DeployMessage[] getComponentSuccesses() {
      return componentSuccesses;
    }

    public void setComponentSuccesses(com.sforce.soap.tooling.DeployMessage[] componentSuccesses) {
      this.componentSuccesses = componentSuccesses;
      componentSuccesses__is_set = true;
    }

    protected void setComponentSuccesses(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("componentSuccesses", "urn:tooling.soap.sforce.com","componentSuccesses","urn:tooling.soap.sforce.com","DeployMessage",0,-1,true))) {
        setComponentSuccesses((com.sforce.soap.tooling.DeployMessage[])__typeMapper.readObject(__in, _lookupTypeInfo("componentSuccesses", "urn:tooling.soap.sforce.com","componentSuccesses","urn:tooling.soap.sforce.com","DeployMessage",0,-1,true), com.sforce.soap.tooling.DeployMessage[].class));
      }
    }

    private void writeFieldComponentSuccesses(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("componentSuccesses", "urn:tooling.soap.sforce.com","componentSuccesses","urn:tooling.soap.sforce.com","DeployMessage",0,-1,true), componentSuccesses, componentSuccesses__is_set);
    }

    /**
     * element : runTestResult of type {urn:tooling.soap.sforce.com}RunTestsResult
     * java type: com.sforce.soap.tooling.RunTestsResult
     */
    private boolean runTestResult__is_set = false;

    private com.sforce.soap.tooling.RunTestsResult runTestResult;

    public com.sforce.soap.tooling.RunTestsResult getRunTestResult() {
      return runTestResult;
    }

    public void setRunTestResult(com.sforce.soap.tooling.RunTestsResult runTestResult) {
      this.runTestResult = runTestResult;
      runTestResult__is_set = true;
    }

    protected void setRunTestResult(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("runTestResult", "urn:tooling.soap.sforce.com","runTestResult","urn:tooling.soap.sforce.com","RunTestsResult",0,1,true))) {
        setRunTestResult((com.sforce.soap.tooling.RunTestsResult)__typeMapper.readObject(__in, _lookupTypeInfo("runTestResult", "urn:tooling.soap.sforce.com","runTestResult","urn:tooling.soap.sforce.com","RunTestsResult",0,1,true), com.sforce.soap.tooling.RunTestsResult.class));
      }
    }

    private void writeFieldRunTestResult(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("runTestResult", "urn:tooling.soap.sforce.com","runTestResult","urn:tooling.soap.sforce.com","RunTestsResult",0,1,true), runTestResult, runTestResult__is_set);
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
      sb.append("[DeployDetails ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldComponentFailures(__out, __typeMapper);
      writeFieldComponentSuccesses(__out, __typeMapper);
      writeFieldRunTestResult(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setComponentFailures(__in, __typeMapper);
      setComponentSuccesses(__in, __typeMapper);
      setRunTestResult(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "componentFailures", componentFailures);
      toStringHelper(sb, "componentSuccesses", componentSuccesses);
      toStringHelper(sb, "runTestResult", runTestResult);
    }


}
