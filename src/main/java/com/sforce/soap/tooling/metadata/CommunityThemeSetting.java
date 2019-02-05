package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class CommunityThemeSetting implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public CommunityThemeSetting() {}

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
     * element : customThemeLayoutType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean customThemeLayoutType__is_set = false;

    private java.lang.String customThemeLayoutType;

    public java.lang.String getCustomThemeLayoutType() {
      return customThemeLayoutType;
    }

    public void setCustomThemeLayoutType(java.lang.String customThemeLayoutType) {
      this.customThemeLayoutType = customThemeLayoutType;
      customThemeLayoutType__is_set = true;
    }

    protected void setCustomThemeLayoutType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("customThemeLayoutType", "urn:metadata.tooling.soap.sforce.com","customThemeLayoutType","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setCustomThemeLayoutType(__typeMapper.readString(__in, _lookupTypeInfo("customThemeLayoutType", "urn:metadata.tooling.soap.sforce.com","customThemeLayoutType","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCustomThemeLayoutType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("customThemeLayoutType", "urn:metadata.tooling.soap.sforce.com","customThemeLayoutType","http://www.w3.org/2001/XMLSchema","string",0,1,true), customThemeLayoutType, customThemeLayoutType__is_set);
    }

    /**
     * element : themeLayout of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean themeLayout__is_set = false;

    private java.lang.String themeLayout;

    public java.lang.String getThemeLayout() {
      return themeLayout;
    }

    public void setThemeLayout(java.lang.String themeLayout) {
      this.themeLayout = themeLayout;
      themeLayout__is_set = true;
    }

    protected void setThemeLayout(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("themeLayout", "urn:metadata.tooling.soap.sforce.com","themeLayout","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setThemeLayout(__typeMapper.readString(__in, _lookupTypeInfo("themeLayout", "urn:metadata.tooling.soap.sforce.com","themeLayout","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldThemeLayout(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("themeLayout", "urn:metadata.tooling.soap.sforce.com","themeLayout","http://www.w3.org/2001/XMLSchema","string",1,1,true), themeLayout, themeLayout__is_set);
    }

    /**
     * element : themeLayoutType of type {urn:tooling.soap.sforce.com}CommunityThemeLayoutType
     * java type: com.sforce.soap.tooling.CommunityThemeLayoutType
     */
    private boolean themeLayoutType__is_set = false;

    private com.sforce.soap.tooling.CommunityThemeLayoutType themeLayoutType;

    public com.sforce.soap.tooling.CommunityThemeLayoutType getThemeLayoutType() {
      return themeLayoutType;
    }

    public void setThemeLayoutType(com.sforce.soap.tooling.CommunityThemeLayoutType themeLayoutType) {
      this.themeLayoutType = themeLayoutType;
      themeLayoutType__is_set = true;
    }

    protected void setThemeLayoutType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("themeLayoutType", "urn:metadata.tooling.soap.sforce.com","themeLayoutType","urn:tooling.soap.sforce.com","CommunityThemeLayoutType",0,1,true))) {
        setThemeLayoutType((com.sforce.soap.tooling.CommunityThemeLayoutType)__typeMapper.readObject(__in, _lookupTypeInfo("themeLayoutType", "urn:metadata.tooling.soap.sforce.com","themeLayoutType","urn:tooling.soap.sforce.com","CommunityThemeLayoutType",0,1,true), com.sforce.soap.tooling.CommunityThemeLayoutType.class));
      }
    }

    private void writeFieldThemeLayoutType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("themeLayoutType", "urn:metadata.tooling.soap.sforce.com","themeLayoutType","urn:tooling.soap.sforce.com","CommunityThemeLayoutType",0,1,true), themeLayoutType, themeLayoutType__is_set);
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
      sb.append("[CommunityThemeSetting ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldCustomThemeLayoutType(__out, __typeMapper);
      writeFieldThemeLayout(__out, __typeMapper);
      writeFieldThemeLayoutType(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCustomThemeLayoutType(__in, __typeMapper);
      setThemeLayout(__in, __typeMapper);
      setThemeLayoutType(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "customThemeLayoutType", customThemeLayoutType);
      toStringHelper(sb, "themeLayout", themeLayout);
      toStringHelper(sb, "themeLayoutType", themeLayoutType);
    }


}
