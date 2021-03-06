package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class CustomTab extends com.sforce.soap.tooling.metadata.Metadata {

    /**
     * Constructor
     */
    public CustomTab() {}

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
     * element : auraComponent of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean auraComponent__is_set = false;

    private java.lang.String auraComponent;

    public java.lang.String getAuraComponent() {
      return auraComponent;
    }

    public void setAuraComponent(java.lang.String auraComponent) {
      this.auraComponent = auraComponent;
      auraComponent__is_set = true;
    }

    protected void setAuraComponent(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("auraComponent", "urn:metadata.tooling.soap.sforce.com","auraComponent","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setAuraComponent(__typeMapper.readString(__in, _lookupTypeInfo("auraComponent", "urn:metadata.tooling.soap.sforce.com","auraComponent","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAuraComponent(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("auraComponent", "urn:metadata.tooling.soap.sforce.com","auraComponent","http://www.w3.org/2001/XMLSchema","string",0,1,true), auraComponent, auraComponent__is_set);
    }

    /**
     * element : customObject of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean customObject__is_set = false;

    private boolean customObject;

    public boolean getCustomObject() {
      return customObject;
    }

    public boolean isCustomObject() {
      return customObject;
    }

    public void setCustomObject(boolean customObject) {
      this.customObject = customObject;
      customObject__is_set = true;
    }

    protected void setCustomObject(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("customObject", "urn:metadata.tooling.soap.sforce.com","customObject","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setCustomObject(__typeMapper.readBoolean(__in, _lookupTypeInfo("customObject", "urn:metadata.tooling.soap.sforce.com","customObject","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldCustomObject(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("customObject", "urn:metadata.tooling.soap.sforce.com","customObject","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), customObject, customObject__is_set);
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
     * element : flexiPage of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean flexiPage__is_set = false;

    private java.lang.String flexiPage;

    public java.lang.String getFlexiPage() {
      return flexiPage;
    }

    public void setFlexiPage(java.lang.String flexiPage) {
      this.flexiPage = flexiPage;
      flexiPage__is_set = true;
    }

    protected void setFlexiPage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("flexiPage", "urn:metadata.tooling.soap.sforce.com","flexiPage","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setFlexiPage(__typeMapper.readString(__in, _lookupTypeInfo("flexiPage", "urn:metadata.tooling.soap.sforce.com","flexiPage","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFlexiPage(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("flexiPage", "urn:metadata.tooling.soap.sforce.com","flexiPage","http://www.w3.org/2001/XMLSchema","string",0,1,true), flexiPage, flexiPage__is_set);
    }

    /**
     * element : frameHeight of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private boolean frameHeight__is_set = false;

    private int frameHeight;

    public int getFrameHeight() {
      return frameHeight;
    }

    public void setFrameHeight(int frameHeight) {
      this.frameHeight = frameHeight;
      frameHeight__is_set = true;
    }

    protected void setFrameHeight(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("frameHeight", "urn:metadata.tooling.soap.sforce.com","frameHeight","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setFrameHeight((int)__typeMapper.readInt(__in, _lookupTypeInfo("frameHeight", "urn:metadata.tooling.soap.sforce.com","frameHeight","http://www.w3.org/2001/XMLSchema","int",0,1,true), int.class));
      }
    }

    private void writeFieldFrameHeight(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("frameHeight", "urn:metadata.tooling.soap.sforce.com","frameHeight","http://www.w3.org/2001/XMLSchema","int",0,1,true), frameHeight, frameHeight__is_set);
    }

    /**
     * element : hasSidebar of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean hasSidebar__is_set = false;

    private boolean hasSidebar;

    public boolean getHasSidebar() {
      return hasSidebar;
    }

    public boolean isHasSidebar() {
      return hasSidebar;
    }

    public void setHasSidebar(boolean hasSidebar) {
      this.hasSidebar = hasSidebar;
      hasSidebar__is_set = true;
    }

    protected void setHasSidebar(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("hasSidebar", "urn:metadata.tooling.soap.sforce.com","hasSidebar","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setHasSidebar(__typeMapper.readBoolean(__in, _lookupTypeInfo("hasSidebar", "urn:metadata.tooling.soap.sforce.com","hasSidebar","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldHasSidebar(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("hasSidebar", "urn:metadata.tooling.soap.sforce.com","hasSidebar","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), hasSidebar, hasSidebar__is_set);
    }

    /**
     * element : icon of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean icon__is_set = false;

    private java.lang.String icon;

    public java.lang.String getIcon() {
      return icon;
    }

    public void setIcon(java.lang.String icon) {
      this.icon = icon;
      icon__is_set = true;
    }

    protected void setIcon(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("icon", "urn:metadata.tooling.soap.sforce.com","icon","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setIcon(__typeMapper.readString(__in, _lookupTypeInfo("icon", "urn:metadata.tooling.soap.sforce.com","icon","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldIcon(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("icon", "urn:metadata.tooling.soap.sforce.com","icon","http://www.w3.org/2001/XMLSchema","string",0,1,true), icon, icon__is_set);
    }

    /**
     * element : label of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean label__is_set = false;

    private java.lang.String label;

    public java.lang.String getLabel() {
      return label;
    }

    public void setLabel(java.lang.String label) {
      this.label = label;
      label__is_set = true;
    }

    protected void setLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("label", "urn:metadata.tooling.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setLabel(__typeMapper.readString(__in, _lookupTypeInfo("label", "urn:metadata.tooling.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLabel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("label", "urn:metadata.tooling.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",0,1,true), label, label__is_set);
    }

    /**
     * element : mobileReady of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean mobileReady__is_set = false;

    private boolean mobileReady;

    public boolean getMobileReady() {
      return mobileReady;
    }

    public boolean isMobileReady() {
      return mobileReady;
    }

    public void setMobileReady(boolean mobileReady) {
      this.mobileReady = mobileReady;
      mobileReady__is_set = true;
    }

    protected void setMobileReady(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("mobileReady", "urn:metadata.tooling.soap.sforce.com","mobileReady","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setMobileReady(__typeMapper.readBoolean(__in, _lookupTypeInfo("mobileReady", "urn:metadata.tooling.soap.sforce.com","mobileReady","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldMobileReady(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("mobileReady", "urn:metadata.tooling.soap.sforce.com","mobileReady","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), mobileReady, mobileReady__is_set);
    }

    /**
     * element : motif of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean motif__is_set = false;

    private java.lang.String motif;

    public java.lang.String getMotif() {
      return motif;
    }

    public void setMotif(java.lang.String motif) {
      this.motif = motif;
      motif__is_set = true;
    }

    protected void setMotif(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("motif", "urn:metadata.tooling.soap.sforce.com","motif","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setMotif(__typeMapper.readString(__in, _lookupTypeInfo("motif", "urn:metadata.tooling.soap.sforce.com","motif","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldMotif(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("motif", "urn:metadata.tooling.soap.sforce.com","motif","http://www.w3.org/2001/XMLSchema","string",0,1,true), motif, motif__is_set);
    }

    /**
     * element : page of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean page__is_set = false;

    private java.lang.String page;

    public java.lang.String getPage() {
      return page;
    }

    public void setPage(java.lang.String page) {
      this.page = page;
      page__is_set = true;
    }

    protected void setPage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("page", "urn:metadata.tooling.soap.sforce.com","page","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setPage(__typeMapper.readString(__in, _lookupTypeInfo("page", "urn:metadata.tooling.soap.sforce.com","page","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldPage(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("page", "urn:metadata.tooling.soap.sforce.com","page","http://www.w3.org/2001/XMLSchema","string",0,1,true), page, page__is_set);
    }

    /**
     * element : scontrol of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean scontrol__is_set = false;

    private java.lang.String scontrol;

    public java.lang.String getScontrol() {
      return scontrol;
    }

    public void setScontrol(java.lang.String scontrol) {
      this.scontrol = scontrol;
      scontrol__is_set = true;
    }

    protected void setScontrol(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("scontrol", "urn:metadata.tooling.soap.sforce.com","scontrol","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setScontrol(__typeMapper.readString(__in, _lookupTypeInfo("scontrol", "urn:metadata.tooling.soap.sforce.com","scontrol","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldScontrol(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("scontrol", "urn:metadata.tooling.soap.sforce.com","scontrol","http://www.w3.org/2001/XMLSchema","string",0,1,true), scontrol, scontrol__is_set);
    }

    /**
     * element : splashPageLink of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean splashPageLink__is_set = false;

    private java.lang.String splashPageLink;

    public java.lang.String getSplashPageLink() {
      return splashPageLink;
    }

    public void setSplashPageLink(java.lang.String splashPageLink) {
      this.splashPageLink = splashPageLink;
      splashPageLink__is_set = true;
    }

    protected void setSplashPageLink(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("splashPageLink", "urn:metadata.tooling.soap.sforce.com","splashPageLink","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setSplashPageLink(__typeMapper.readString(__in, _lookupTypeInfo("splashPageLink", "urn:metadata.tooling.soap.sforce.com","splashPageLink","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSplashPageLink(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("splashPageLink", "urn:metadata.tooling.soap.sforce.com","splashPageLink","http://www.w3.org/2001/XMLSchema","string",0,1,true), splashPageLink, splashPageLink__is_set);
    }

    /**
     * element : url of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean url__is_set = false;

    private java.lang.String url;

    public java.lang.String getUrl() {
      return url;
    }

    public void setUrl(java.lang.String url) {
      this.url = url;
      url__is_set = true;
    }

    protected void setUrl(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("url", "urn:metadata.tooling.soap.sforce.com","url","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setUrl(__typeMapper.readString(__in, _lookupTypeInfo("url", "urn:metadata.tooling.soap.sforce.com","url","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldUrl(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("url", "urn:metadata.tooling.soap.sforce.com","url","http://www.w3.org/2001/XMLSchema","string",0,1,true), url, url__is_set);
    }

    /**
     * element : urlEncodingKey of type {urn:tooling.soap.sforce.com}Encoding
     * java type: com.sforce.soap.tooling.Encoding
     */
    private boolean urlEncodingKey__is_set = false;

    private com.sforce.soap.tooling.Encoding urlEncodingKey;

    public com.sforce.soap.tooling.Encoding getUrlEncodingKey() {
      return urlEncodingKey;
    }

    public void setUrlEncodingKey(com.sforce.soap.tooling.Encoding urlEncodingKey) {
      this.urlEncodingKey = urlEncodingKey;
      urlEncodingKey__is_set = true;
    }

    protected void setUrlEncodingKey(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("urlEncodingKey", "urn:metadata.tooling.soap.sforce.com","urlEncodingKey","urn:tooling.soap.sforce.com","Encoding",0,1,true))) {
        setUrlEncodingKey((com.sforce.soap.tooling.Encoding)__typeMapper.readObject(__in, _lookupTypeInfo("urlEncodingKey", "urn:metadata.tooling.soap.sforce.com","urlEncodingKey","urn:tooling.soap.sforce.com","Encoding",0,1,true), com.sforce.soap.tooling.Encoding.class));
      }
    }

    private void writeFieldUrlEncodingKey(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("urlEncodingKey", "urn:metadata.tooling.soap.sforce.com","urlEncodingKey","urn:tooling.soap.sforce.com","Encoding",0,1,true), urlEncodingKey, urlEncodingKey__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:metadata.tooling.soap.sforce.com", "CustomTab");
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
      sb.append("[CustomTab ");
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
      writeFieldAuraComponent(__out, __typeMapper);
      writeFieldCustomObject(__out, __typeMapper);
      writeFieldDescription(__out, __typeMapper);
      writeFieldFlexiPage(__out, __typeMapper);
      writeFieldFrameHeight(__out, __typeMapper);
      writeFieldHasSidebar(__out, __typeMapper);
      writeFieldIcon(__out, __typeMapper);
      writeFieldLabel(__out, __typeMapper);
      writeFieldMobileReady(__out, __typeMapper);
      writeFieldMotif(__out, __typeMapper);
      writeFieldPage(__out, __typeMapper);
      writeFieldScontrol(__out, __typeMapper);
      writeFieldSplashPageLink(__out, __typeMapper);
      writeFieldUrl(__out, __typeMapper);
      writeFieldUrlEncodingKey(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAuraComponent(__in, __typeMapper);
      setCustomObject(__in, __typeMapper);
      setDescription(__in, __typeMapper);
      setFlexiPage(__in, __typeMapper);
      setFrameHeight(__in, __typeMapper);
      setHasSidebar(__in, __typeMapper);
      setIcon(__in, __typeMapper);
      setLabel(__in, __typeMapper);
      setMobileReady(__in, __typeMapper);
      setMotif(__in, __typeMapper);
      setPage(__in, __typeMapper);
      setScontrol(__in, __typeMapper);
      setSplashPageLink(__in, __typeMapper);
      setUrl(__in, __typeMapper);
      setUrlEncodingKey(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "auraComponent", auraComponent);
      toStringHelper(sb, "customObject", customObject);
      toStringHelper(sb, "description", description);
      toStringHelper(sb, "flexiPage", flexiPage);
      toStringHelper(sb, "frameHeight", frameHeight);
      toStringHelper(sb, "hasSidebar", hasSidebar);
      toStringHelper(sb, "icon", icon);
      toStringHelper(sb, "label", label);
      toStringHelper(sb, "mobileReady", mobileReady);
      toStringHelper(sb, "motif", motif);
      toStringHelper(sb, "page", page);
      toStringHelper(sb, "scontrol", scontrol);
      toStringHelper(sb, "splashPageLink", splashPageLink);
      toStringHelper(sb, "url", url);
      toStringHelper(sb, "urlEncodingKey", urlEncodingKey);
    }


}
