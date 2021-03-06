package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class IdeasSettings extends com.sforce.soap.tooling.metadata.MetadataForSettings {

    /**
     * Constructor
     */
    public IdeasSettings() {}

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
     * element : enableChatterProfile of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean enableChatterProfile__is_set = false;

    private boolean enableChatterProfile;

    public boolean getEnableChatterProfile() {
      return enableChatterProfile;
    }

    public boolean isEnableChatterProfile() {
      return enableChatterProfile;
    }

    public void setEnableChatterProfile(boolean enableChatterProfile) {
      this.enableChatterProfile = enableChatterProfile;
      enableChatterProfile__is_set = true;
    }

    protected void setEnableChatterProfile(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("enableChatterProfile", "urn:metadata.tooling.soap.sforce.com","enableChatterProfile","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setEnableChatterProfile(__typeMapper.readBoolean(__in, _lookupTypeInfo("enableChatterProfile", "urn:metadata.tooling.soap.sforce.com","enableChatterProfile","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldEnableChatterProfile(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("enableChatterProfile", "urn:metadata.tooling.soap.sforce.com","enableChatterProfile","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), enableChatterProfile, enableChatterProfile__is_set);
    }

    /**
     * element : enableIdeaThemes of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean enableIdeaThemes__is_set = false;

    private boolean enableIdeaThemes;

    public boolean getEnableIdeaThemes() {
      return enableIdeaThemes;
    }

    public boolean isEnableIdeaThemes() {
      return enableIdeaThemes;
    }

    public void setEnableIdeaThemes(boolean enableIdeaThemes) {
      this.enableIdeaThemes = enableIdeaThemes;
      enableIdeaThemes__is_set = true;
    }

    protected void setEnableIdeaThemes(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("enableIdeaThemes", "urn:metadata.tooling.soap.sforce.com","enableIdeaThemes","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setEnableIdeaThemes(__typeMapper.readBoolean(__in, _lookupTypeInfo("enableIdeaThemes", "urn:metadata.tooling.soap.sforce.com","enableIdeaThemes","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldEnableIdeaThemes(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("enableIdeaThemes", "urn:metadata.tooling.soap.sforce.com","enableIdeaThemes","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), enableIdeaThemes, enableIdeaThemes__is_set);
    }

    /**
     * element : enableIdeas of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean enableIdeas__is_set = false;

    private boolean enableIdeas;

    public boolean getEnableIdeas() {
      return enableIdeas;
    }

    public boolean isEnableIdeas() {
      return enableIdeas;
    }

    public void setEnableIdeas(boolean enableIdeas) {
      this.enableIdeas = enableIdeas;
      enableIdeas__is_set = true;
    }

    protected void setEnableIdeas(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("enableIdeas", "urn:metadata.tooling.soap.sforce.com","enableIdeas","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setEnableIdeas(__typeMapper.readBoolean(__in, _lookupTypeInfo("enableIdeas", "urn:metadata.tooling.soap.sforce.com","enableIdeas","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldEnableIdeas(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("enableIdeas", "urn:metadata.tooling.soap.sforce.com","enableIdeas","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), enableIdeas, enableIdeas__is_set);
    }

    /**
     * element : enableIdeasReputation of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean enableIdeasReputation__is_set = false;

    private boolean enableIdeasReputation;

    public boolean getEnableIdeasReputation() {
      return enableIdeasReputation;
    }

    public boolean isEnableIdeasReputation() {
      return enableIdeasReputation;
    }

    public void setEnableIdeasReputation(boolean enableIdeasReputation) {
      this.enableIdeasReputation = enableIdeasReputation;
      enableIdeasReputation__is_set = true;
    }

    protected void setEnableIdeasReputation(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("enableIdeasReputation", "urn:metadata.tooling.soap.sforce.com","enableIdeasReputation","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setEnableIdeasReputation(__typeMapper.readBoolean(__in, _lookupTypeInfo("enableIdeasReputation", "urn:metadata.tooling.soap.sforce.com","enableIdeasReputation","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldEnableIdeasReputation(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("enableIdeasReputation", "urn:metadata.tooling.soap.sforce.com","enableIdeasReputation","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), enableIdeasReputation, enableIdeasReputation__is_set);
    }

    /**
     * element : halfLife of type {http://www.w3.org/2001/XMLSchema}double
     * java type: double
     */
    private boolean halfLife__is_set = false;

    private double halfLife;

    public double getHalfLife() {
      return halfLife;
    }

    public void setHalfLife(double halfLife) {
      this.halfLife = halfLife;
      halfLife__is_set = true;
    }

    protected void setHalfLife(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("halfLife", "urn:metadata.tooling.soap.sforce.com","halfLife","http://www.w3.org/2001/XMLSchema","double",0,1,true))) {
        setHalfLife((double)__typeMapper.readDouble(__in, _lookupTypeInfo("halfLife", "urn:metadata.tooling.soap.sforce.com","halfLife","http://www.w3.org/2001/XMLSchema","double",0,1,true), double.class));
      }
    }

    private void writeFieldHalfLife(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("halfLife", "urn:metadata.tooling.soap.sforce.com","halfLife","http://www.w3.org/2001/XMLSchema","double",0,1,true), halfLife, halfLife__is_set);
    }

    /**
     * element : ideasProfilePage of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean ideasProfilePage__is_set = false;

    private java.lang.String ideasProfilePage;

    public java.lang.String getIdeasProfilePage() {
      return ideasProfilePage;
    }

    public void setIdeasProfilePage(java.lang.String ideasProfilePage) {
      this.ideasProfilePage = ideasProfilePage;
      ideasProfilePage__is_set = true;
    }

    protected void setIdeasProfilePage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ideasProfilePage", "urn:metadata.tooling.soap.sforce.com","ideasProfilePage","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setIdeasProfilePage(__typeMapper.readString(__in, _lookupTypeInfo("ideasProfilePage", "urn:metadata.tooling.soap.sforce.com","ideasProfilePage","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldIdeasProfilePage(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ideasProfilePage", "urn:metadata.tooling.soap.sforce.com","ideasProfilePage","http://www.w3.org/2001/XMLSchema","string",0,1,true), ideasProfilePage, ideasProfilePage__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:metadata.tooling.soap.sforce.com", "IdeasSettings");
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
      sb.append("[IdeasSettings ");
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
      writeFieldEnableChatterProfile(__out, __typeMapper);
      writeFieldEnableIdeaThemes(__out, __typeMapper);
      writeFieldEnableIdeas(__out, __typeMapper);
      writeFieldEnableIdeasReputation(__out, __typeMapper);
      writeFieldHalfLife(__out, __typeMapper);
      writeFieldIdeasProfilePage(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setEnableChatterProfile(__in, __typeMapper);
      setEnableIdeaThemes(__in, __typeMapper);
      setEnableIdeas(__in, __typeMapper);
      setEnableIdeasReputation(__in, __typeMapper);
      setHalfLife(__in, __typeMapper);
      setIdeasProfilePage(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "enableChatterProfile", enableChatterProfile);
      toStringHelper(sb, "enableIdeaThemes", enableIdeaThemes);
      toStringHelper(sb, "enableIdeas", enableIdeas);
      toStringHelper(sb, "enableIdeasReputation", enableIdeasReputation);
      toStringHelper(sb, "halfLife", halfLife);
      toStringHelper(sb, "ideasProfilePage", ideasProfilePage);
    }


}
