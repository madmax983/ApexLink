package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class WorkflowOutboundMessage extends com.sforce.soap.tooling.metadata.WorkflowAction {

    /**
     * Constructor
     */
    public WorkflowOutboundMessage() {}

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
     * element : apiVersion of type {http://www.w3.org/2001/XMLSchema}double
     * java type: double
     */
    private boolean apiVersion__is_set = false;

    private double apiVersion;

    public double getApiVersion() {
      return apiVersion;
    }

    public void setApiVersion(double apiVersion) {
      this.apiVersion = apiVersion;
      apiVersion__is_set = true;
    }

    protected void setApiVersion(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("apiVersion", "urn:metadata.tooling.soap.sforce.com","apiVersion","http://www.w3.org/2001/XMLSchema","double",1,1,true))) {
        setApiVersion((double)__typeMapper.readDouble(__in, _lookupTypeInfo("apiVersion", "urn:metadata.tooling.soap.sforce.com","apiVersion","http://www.w3.org/2001/XMLSchema","double",1,1,true), double.class));
      }
    }

    private void writeFieldApiVersion(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("apiVersion", "urn:metadata.tooling.soap.sforce.com","apiVersion","http://www.w3.org/2001/XMLSchema","double",1,1,true), apiVersion, apiVersion__is_set);
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
     * element : endpointUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean endpointUrl__is_set = false;

    private java.lang.String endpointUrl;

    public java.lang.String getEndpointUrl() {
      return endpointUrl;
    }

    public void setEndpointUrl(java.lang.String endpointUrl) {
      this.endpointUrl = endpointUrl;
      endpointUrl__is_set = true;
    }

    protected void setEndpointUrl(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("endpointUrl", "urn:metadata.tooling.soap.sforce.com","endpointUrl","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setEndpointUrl(__typeMapper.readString(__in, _lookupTypeInfo("endpointUrl", "urn:metadata.tooling.soap.sforce.com","endpointUrl","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldEndpointUrl(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("endpointUrl", "urn:metadata.tooling.soap.sforce.com","endpointUrl","http://www.w3.org/2001/XMLSchema","string",1,1,true), endpointUrl, endpointUrl__is_set);
    }

    /**
     * element : fields of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String[]
     */
    private boolean fields__is_set = false;

    private java.lang.String[] fields = new java.lang.String[0];

    public java.lang.String[] getFields() {
      return fields;
    }

    public void setFields(java.lang.String[] fields) {
      this.fields = fields;
      fields__is_set = true;
    }

    protected void setFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("fields", "urn:metadata.tooling.soap.sforce.com","fields","http://www.w3.org/2001/XMLSchema","string",0,-1,true))) {
        setFields((java.lang.String[])__typeMapper.readObject(__in, _lookupTypeInfo("fields", "urn:metadata.tooling.soap.sforce.com","fields","http://www.w3.org/2001/XMLSchema","string",0,-1,true), java.lang.String[].class));
      }
    }

    private void writeFieldFields(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("fields", "urn:metadata.tooling.soap.sforce.com","fields","http://www.w3.org/2001/XMLSchema","string",0,-1,true), fields, fields__is_set);
    }

    /**
     * element : includeSessionId of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean includeSessionId__is_set = false;

    private boolean includeSessionId;

    public boolean getIncludeSessionId() {
      return includeSessionId;
    }

    public boolean isIncludeSessionId() {
      return includeSessionId;
    }

    public void setIncludeSessionId(boolean includeSessionId) {
      this.includeSessionId = includeSessionId;
      includeSessionId__is_set = true;
    }

    protected void setIncludeSessionId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("includeSessionId", "urn:metadata.tooling.soap.sforce.com","includeSessionId","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setIncludeSessionId(__typeMapper.readBoolean(__in, _lookupTypeInfo("includeSessionId", "urn:metadata.tooling.soap.sforce.com","includeSessionId","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldIncludeSessionId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("includeSessionId", "urn:metadata.tooling.soap.sforce.com","includeSessionId","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), includeSessionId, includeSessionId__is_set);
    }

    /**
     * element : integrationUser of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean integrationUser__is_set = false;

    private java.lang.String integrationUser;

    public java.lang.String getIntegrationUser() {
      return integrationUser;
    }

    public void setIntegrationUser(java.lang.String integrationUser) {
      this.integrationUser = integrationUser;
      integrationUser__is_set = true;
    }

    protected void setIntegrationUser(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("integrationUser", "urn:metadata.tooling.soap.sforce.com","integrationUser","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setIntegrationUser(__typeMapper.readString(__in, _lookupTypeInfo("integrationUser", "urn:metadata.tooling.soap.sforce.com","integrationUser","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldIntegrationUser(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("integrationUser", "urn:metadata.tooling.soap.sforce.com","integrationUser","http://www.w3.org/2001/XMLSchema","string",1,1,true), integrationUser, integrationUser__is_set);
    }

    /**
     * element : name of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean name__is_set = false;

    private java.lang.String name;

    public java.lang.String getName() {
      return name;
    }

    public void setName(java.lang.String name) {
      this.name = name;
      name__is_set = true;
    }

    protected void setName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("name", "urn:metadata.tooling.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setName(__typeMapper.readString(__in, _lookupTypeInfo("name", "urn:metadata.tooling.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("name", "urn:metadata.tooling.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true), name, name__is_set);
    }

    /**
     * element : protected of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean _protected__is_set = false;

    private boolean _protected;

    public boolean getProtected() {
      return _protected;
    }

    public boolean isProtected() {
      return _protected;
    }

    public void setProtected(boolean _protected) {
      this._protected = _protected;
      _protected__is_set = true;
    }

    protected void setProtected(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("_protected", "urn:metadata.tooling.soap.sforce.com","protected","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setProtected(__typeMapper.readBoolean(__in, _lookupTypeInfo("_protected", "urn:metadata.tooling.soap.sforce.com","protected","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldProtected(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("_protected", "urn:metadata.tooling.soap.sforce.com","protected","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), _protected, _protected__is_set);
    }

    /**
     * element : useDeadLetterQueue of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean useDeadLetterQueue__is_set = false;

    private boolean useDeadLetterQueue;

    public boolean getUseDeadLetterQueue() {
      return useDeadLetterQueue;
    }

    public boolean isUseDeadLetterQueue() {
      return useDeadLetterQueue;
    }

    public void setUseDeadLetterQueue(boolean useDeadLetterQueue) {
      this.useDeadLetterQueue = useDeadLetterQueue;
      useDeadLetterQueue__is_set = true;
    }

    protected void setUseDeadLetterQueue(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("useDeadLetterQueue", "urn:metadata.tooling.soap.sforce.com","useDeadLetterQueue","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setUseDeadLetterQueue(__typeMapper.readBoolean(__in, _lookupTypeInfo("useDeadLetterQueue", "urn:metadata.tooling.soap.sforce.com","useDeadLetterQueue","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldUseDeadLetterQueue(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("useDeadLetterQueue", "urn:metadata.tooling.soap.sforce.com","useDeadLetterQueue","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), useDeadLetterQueue, useDeadLetterQueue__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:metadata.tooling.soap.sforce.com", "WorkflowOutboundMessage");
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
      sb.append("[WorkflowOutboundMessage ");
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
      writeFieldApiVersion(__out, __typeMapper);
      writeFieldDescription(__out, __typeMapper);
      writeFieldEndpointUrl(__out, __typeMapper);
      writeFieldFields(__out, __typeMapper);
      writeFieldIncludeSessionId(__out, __typeMapper);
      writeFieldIntegrationUser(__out, __typeMapper);
      writeFieldName(__out, __typeMapper);
      writeFieldProtected(__out, __typeMapper);
      writeFieldUseDeadLetterQueue(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setApiVersion(__in, __typeMapper);
      setDescription(__in, __typeMapper);
      setEndpointUrl(__in, __typeMapper);
      setFields(__in, __typeMapper);
      setIncludeSessionId(__in, __typeMapper);
      setIntegrationUser(__in, __typeMapper);
      setName(__in, __typeMapper);
      setProtected(__in, __typeMapper);
      setUseDeadLetterQueue(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "apiVersion", apiVersion);
      toStringHelper(sb, "description", description);
      toStringHelper(sb, "endpointUrl", endpointUrl);
      toStringHelper(sb, "fields", fields);
      toStringHelper(sb, "includeSessionId", includeSessionId);
      toStringHelper(sb, "integrationUser", integrationUser);
      toStringHelper(sb, "name", name);
      toStringHelper(sb, "_protected", _protected);
      toStringHelper(sb, "useDeadLetterQueue", useDeadLetterQueue);
    }


}
