package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class CustomLabel extends com.sforce.soap.tooling.metadata.Metadata {

    /**
     * Constructor
     */
    public CustomLabel() {}

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
     * element : categories of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean categories__is_set = false;

    private java.lang.String categories;

    public java.lang.String getCategories() {
      return categories;
    }

    public void setCategories(java.lang.String categories) {
      this.categories = categories;
      categories__is_set = true;
    }

    protected void setCategories(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("categories", "urn:metadata.tooling.soap.sforce.com","categories","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setCategories(__typeMapper.readString(__in, _lookupTypeInfo("categories", "urn:metadata.tooling.soap.sforce.com","categories","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCategories(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("categories", "urn:metadata.tooling.soap.sforce.com","categories","http://www.w3.org/2001/XMLSchema","string",0,1,true), categories, categories__is_set);
    }

    /**
     * element : language of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean language__is_set = false;

    private java.lang.String language;

    public java.lang.String getLanguage() {
      return language;
    }

    public void setLanguage(java.lang.String language) {
      this.language = language;
      language__is_set = true;
    }

    protected void setLanguage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("language", "urn:metadata.tooling.soap.sforce.com","language","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setLanguage(__typeMapper.readString(__in, _lookupTypeInfo("language", "urn:metadata.tooling.soap.sforce.com","language","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLanguage(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("language", "urn:metadata.tooling.soap.sforce.com","language","http://www.w3.org/2001/XMLSchema","string",1,1,true), language, language__is_set);
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
     * element : shortDescription of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean shortDescription__is_set = false;

    private java.lang.String shortDescription;

    public java.lang.String getShortDescription() {
      return shortDescription;
    }

    public void setShortDescription(java.lang.String shortDescription) {
      this.shortDescription = shortDescription;
      shortDescription__is_set = true;
    }

    protected void setShortDescription(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("shortDescription", "urn:metadata.tooling.soap.sforce.com","shortDescription","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setShortDescription(__typeMapper.readString(__in, _lookupTypeInfo("shortDescription", "urn:metadata.tooling.soap.sforce.com","shortDescription","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldShortDescription(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("shortDescription", "urn:metadata.tooling.soap.sforce.com","shortDescription","http://www.w3.org/2001/XMLSchema","string",1,1,true), shortDescription, shortDescription__is_set);
    }

    /**
     * element : value of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean value__is_set = false;

    private java.lang.String value;

    public java.lang.String getValue() {
      return value;
    }

    public void setValue(java.lang.String value) {
      this.value = value;
      value__is_set = true;
    }

    protected void setValue(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("value", "urn:metadata.tooling.soap.sforce.com","value","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setValue(__typeMapper.readString(__in, _lookupTypeInfo("value", "urn:metadata.tooling.soap.sforce.com","value","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldValue(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("value", "urn:metadata.tooling.soap.sforce.com","value","http://www.w3.org/2001/XMLSchema","string",1,1,true), value, value__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:metadata.tooling.soap.sforce.com", "CustomLabel");
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
      sb.append("[CustomLabel ");
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
      writeFieldCategories(__out, __typeMapper);
      writeFieldLanguage(__out, __typeMapper);
      writeFieldProtected(__out, __typeMapper);
      writeFieldShortDescription(__out, __typeMapper);
      writeFieldValue(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCategories(__in, __typeMapper);
      setLanguage(__in, __typeMapper);
      setProtected(__in, __typeMapper);
      setShortDescription(__in, __typeMapper);
      setValue(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "categories", categories);
      toStringHelper(sb, "language", language);
      toStringHelper(sb, "_protected", _protected);
      toStringHelper(sb, "shortDescription", shortDescription);
      toStringHelper(sb, "value", value);
    }


}
