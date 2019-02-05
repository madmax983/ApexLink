package com.sforce.soap.tooling.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class WebToCaseSettings extends com.sforce.soap.tooling.sobject.SObject {

    /**
     * Constructor
     */
    public WebToCaseSettings() {}

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
     * element : CaseOrigin of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean CaseOrigin__is_set = false;

    private java.lang.String CaseOrigin;

    public java.lang.String getCaseOrigin() {
      return CaseOrigin;
    }

    public void setCaseOrigin(java.lang.String CaseOrigin) {
      this.CaseOrigin = CaseOrigin;
      CaseOrigin__is_set = true;
    }

    protected void setCaseOrigin(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CaseOrigin", "urn:sobject.tooling.soap.sforce.com","CaseOrigin","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setCaseOrigin(__typeMapper.readString(__in, _lookupTypeInfo("CaseOrigin", "urn:sobject.tooling.soap.sforce.com","CaseOrigin","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCaseOrigin(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CaseOrigin", "urn:sobject.tooling.soap.sforce.com","CaseOrigin","http://www.w3.org/2001/XMLSchema","string",0,1,true), CaseOrigin, CaseOrigin__is_set);
    }

    /**
     * element : DefaultResponseTemplate of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean DefaultResponseTemplate__is_set = false;

    private java.lang.String DefaultResponseTemplate;

    public java.lang.String getDefaultResponseTemplate() {
      return DefaultResponseTemplate;
    }

    public void setDefaultResponseTemplate(java.lang.String DefaultResponseTemplate) {
      this.DefaultResponseTemplate = DefaultResponseTemplate;
      DefaultResponseTemplate__is_set = true;
    }

    protected void setDefaultResponseTemplate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("DefaultResponseTemplate", "urn:sobject.tooling.soap.sforce.com","DefaultResponseTemplate","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDefaultResponseTemplate(__typeMapper.readString(__in, _lookupTypeInfo("DefaultResponseTemplate", "urn:sobject.tooling.soap.sforce.com","DefaultResponseTemplate","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDefaultResponseTemplate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("DefaultResponseTemplate", "urn:sobject.tooling.soap.sforce.com","DefaultResponseTemplate","http://www.w3.org/2001/XMLSchema","string",0,1,true), DefaultResponseTemplate, DefaultResponseTemplate__is_set);
    }

    /**
     * element : DurableId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean DurableId__is_set = false;

    private java.lang.String DurableId;

    public java.lang.String getDurableId() {
      return DurableId;
    }

    public void setDurableId(java.lang.String DurableId) {
      this.DurableId = DurableId;
      DurableId__is_set = true;
    }

    protected void setDurableId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("DurableId", "urn:sobject.tooling.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDurableId(__typeMapper.readString(__in, _lookupTypeInfo("DurableId", "urn:sobject.tooling.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDurableId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("DurableId", "urn:sobject.tooling.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true), DurableId, DurableId__is_set);
    }

    /**
     * element : IsWebToCaseEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsWebToCaseEnabled__is_set = false;

    private java.lang.Boolean IsWebToCaseEnabled;

    public java.lang.Boolean getIsWebToCaseEnabled() {
      return IsWebToCaseEnabled;
    }

    public void setIsWebToCaseEnabled(java.lang.Boolean IsWebToCaseEnabled) {
      this.IsWebToCaseEnabled = IsWebToCaseEnabled;
      IsWebToCaseEnabled__is_set = true;
    }

    protected void setIsWebToCaseEnabled(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsWebToCaseEnabled", "urn:sobject.tooling.soap.sforce.com","IsWebToCaseEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsWebToCaseEnabled((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsWebToCaseEnabled", "urn:sobject.tooling.soap.sforce.com","IsWebToCaseEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsWebToCaseEnabled(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsWebToCaseEnabled", "urn:sobject.tooling.soap.sforce.com","IsWebToCaseEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsWebToCaseEnabled, IsWebToCaseEnabled__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.tooling.soap.sforce.com", "WebToCaseSettings");
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
      sb.append("[WebToCaseSettings ");
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
      writeFieldCaseOrigin(__out, __typeMapper);
      writeFieldDefaultResponseTemplate(__out, __typeMapper);
      writeFieldDurableId(__out, __typeMapper);
      writeFieldIsWebToCaseEnabled(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCaseOrigin(__in, __typeMapper);
      setDefaultResponseTemplate(__in, __typeMapper);
      setDurableId(__in, __typeMapper);
      setIsWebToCaseEnabled(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "CaseOrigin", CaseOrigin);
      toStringHelper(sb, "DefaultResponseTemplate", DefaultResponseTemplate);
      toStringHelper(sb, "DurableId", DurableId);
      toStringHelper(sb, "IsWebToCaseEnabled", IsWebToCaseEnabled);
    }


}
