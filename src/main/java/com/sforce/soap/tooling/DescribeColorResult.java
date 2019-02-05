package com.sforce.soap.tooling;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class DescribeColorResult implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DescribeColorResult() {}

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
     * element : color of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean color__is_set = false;

    private java.lang.String color;

    public java.lang.String getColor() {
      return color;
    }

    public void setColor(java.lang.String color) {
      this.color = color;
      color__is_set = true;
    }

    protected void setColor(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("color", "urn:tooling.soap.sforce.com","color","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setColor(__typeMapper.readString(__in, _lookupTypeInfo("color", "urn:tooling.soap.sforce.com","color","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldColor(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("color", "urn:tooling.soap.sforce.com","color","http://www.w3.org/2001/XMLSchema","string",1,1,true), color, color__is_set);
    }

    /**
     * element : context of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean context__is_set = false;

    private java.lang.String context;

    public java.lang.String getContext() {
      return context;
    }

    public void setContext(java.lang.String context) {
      this.context = context;
      context__is_set = true;
    }

    protected void setContext(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("context", "urn:tooling.soap.sforce.com","context","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setContext(__typeMapper.readString(__in, _lookupTypeInfo("context", "urn:tooling.soap.sforce.com","context","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldContext(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("context", "urn:tooling.soap.sforce.com","context","http://www.w3.org/2001/XMLSchema","string",1,1,true), context, context__is_set);
    }

    /**
     * element : theme of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean theme__is_set = false;

    private java.lang.String theme;

    public java.lang.String getTheme() {
      return theme;
    }

    public void setTheme(java.lang.String theme) {
      this.theme = theme;
      theme__is_set = true;
    }

    protected void setTheme(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("theme", "urn:tooling.soap.sforce.com","theme","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setTheme(__typeMapper.readString(__in, _lookupTypeInfo("theme", "urn:tooling.soap.sforce.com","theme","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldTheme(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("theme", "urn:tooling.soap.sforce.com","theme","http://www.w3.org/2001/XMLSchema","string",1,1,true), theme, theme__is_set);
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
      sb.append("[DescribeColorResult ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldColor(__out, __typeMapper);
      writeFieldContext(__out, __typeMapper);
      writeFieldTheme(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setColor(__in, __typeMapper);
      setContext(__in, __typeMapper);
      setTheme(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "color", color);
      toStringHelper(sb, "context", context);
      toStringHelper(sb, "theme", theme);
    }


}
