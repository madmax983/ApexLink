package com.sforce.soap.tooling.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class MobileSettings extends com.sforce.soap.tooling.sobject.SObject {

    /**
     * Constructor
     */
    public MobileSettings() {}

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
     * element : ChatterMobileId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean ChatterMobileId__is_set = false;

    private java.lang.String ChatterMobileId;

    public java.lang.String getChatterMobileId() {
      return ChatterMobileId;
    }

    public void setChatterMobileId(java.lang.String ChatterMobileId) {
      this.ChatterMobileId = ChatterMobileId;
      ChatterMobileId__is_set = true;
    }

    protected void setChatterMobileId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ChatterMobileId", "urn:sobject.tooling.soap.sforce.com","ChatterMobileId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setChatterMobileId(__typeMapper.readString(__in, _lookupTypeInfo("ChatterMobileId", "urn:sobject.tooling.soap.sforce.com","ChatterMobileId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldChatterMobileId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ChatterMobileId", "urn:sobject.tooling.soap.sforce.com","ChatterMobileId","http://www.w3.org/2001/XMLSchema","string",0,1,true), ChatterMobileId, ChatterMobileId__is_set);
    }

    /**
     * element : DashboardMobileId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean DashboardMobileId__is_set = false;

    private java.lang.String DashboardMobileId;

    public java.lang.String getDashboardMobileId() {
      return DashboardMobileId;
    }

    public void setDashboardMobileId(java.lang.String DashboardMobileId) {
      this.DashboardMobileId = DashboardMobileId;
      DashboardMobileId__is_set = true;
    }

    protected void setDashboardMobileId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("DashboardMobileId", "urn:sobject.tooling.soap.sforce.com","DashboardMobileId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDashboardMobileId(__typeMapper.readString(__in, _lookupTypeInfo("DashboardMobileId", "urn:sobject.tooling.soap.sforce.com","DashboardMobileId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDashboardMobileId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("DashboardMobileId", "urn:sobject.tooling.soap.sforce.com","DashboardMobileId","http://www.w3.org/2001/XMLSchema","string",0,1,true), DashboardMobileId, DashboardMobileId__is_set);
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
     * element : FullName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean FullName__is_set = false;

    private java.lang.String FullName;

    public java.lang.String getFullName() {
      return FullName;
    }

    public void setFullName(java.lang.String FullName) {
      this.FullName = FullName;
      FullName__is_set = true;
    }

    protected void setFullName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("FullName", "urn:sobject.tooling.soap.sforce.com","FullName","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setFullName(__typeMapper.readString(__in, _lookupTypeInfo("FullName", "urn:sobject.tooling.soap.sforce.com","FullName","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFullName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("FullName", "urn:sobject.tooling.soap.sforce.com","FullName","http://www.w3.org/2001/XMLSchema","string",0,1,true), FullName, FullName__is_set);
    }

    /**
     * element : Metadata of type {urn:metadata.tooling.soap.sforce.com}MobileSettings
     * java type: com.sforce.soap.tooling.metadata.MobileSettings
     */
    private boolean Metadata__is_set = false;

    private com.sforce.soap.tooling.metadata.MobileSettings Metadata;

    public com.sforce.soap.tooling.metadata.MobileSettings getMetadata() {
      return Metadata;
    }

    public void setMetadata(com.sforce.soap.tooling.metadata.MobileSettings Metadata) {
      this.Metadata = Metadata;
      Metadata__is_set = true;
    }

    protected void setMetadata(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Metadata", "urn:sobject.tooling.soap.sforce.com","Metadata","urn:metadata.tooling.soap.sforce.com","MobileSettings",0,1,true))) {
        setMetadata((com.sforce.soap.tooling.metadata.MobileSettings)__typeMapper.readObject(__in, _lookupTypeInfo("Metadata", "urn:sobject.tooling.soap.sforce.com","Metadata","urn:metadata.tooling.soap.sforce.com","MobileSettings",0,1,true), com.sforce.soap.tooling.metadata.MobileSettings.class));
      }
    }

    private void writeFieldMetadata(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Metadata", "urn:sobject.tooling.soap.sforce.com","Metadata","urn:metadata.tooling.soap.sforce.com","MobileSettings",0,1,true), Metadata, Metadata__is_set);
    }

    /**
     * element : SalesforceMobileId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean SalesforceMobileId__is_set = false;

    private java.lang.String SalesforceMobileId;

    public java.lang.String getSalesforceMobileId() {
      return SalesforceMobileId;
    }

    public void setSalesforceMobileId(java.lang.String SalesforceMobileId) {
      this.SalesforceMobileId = SalesforceMobileId;
      SalesforceMobileId__is_set = true;
    }

    protected void setSalesforceMobileId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SalesforceMobileId", "urn:sobject.tooling.soap.sforce.com","SalesforceMobileId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setSalesforceMobileId(__typeMapper.readString(__in, _lookupTypeInfo("SalesforceMobileId", "urn:sobject.tooling.soap.sforce.com","SalesforceMobileId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSalesforceMobileId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SalesforceMobileId", "urn:sobject.tooling.soap.sforce.com","SalesforceMobileId","http://www.w3.org/2001/XMLSchema","string",0,1,true), SalesforceMobileId, SalesforceMobileId__is_set);
    }

    /**
     * element : TouchMobileId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean TouchMobileId__is_set = false;

    private java.lang.String TouchMobileId;

    public java.lang.String getTouchMobileId() {
      return TouchMobileId;
    }

    public void setTouchMobileId(java.lang.String TouchMobileId) {
      this.TouchMobileId = TouchMobileId;
      TouchMobileId__is_set = true;
    }

    protected void setTouchMobileId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("TouchMobileId", "urn:sobject.tooling.soap.sforce.com","TouchMobileId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setTouchMobileId(__typeMapper.readString(__in, _lookupTypeInfo("TouchMobileId", "urn:sobject.tooling.soap.sforce.com","TouchMobileId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldTouchMobileId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("TouchMobileId", "urn:sobject.tooling.soap.sforce.com","TouchMobileId","http://www.w3.org/2001/XMLSchema","string",0,1,true), TouchMobileId, TouchMobileId__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.tooling.soap.sforce.com", "MobileSettings");
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
      sb.append("[MobileSettings ");
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
      writeFieldChatterMobileId(__out, __typeMapper);
      writeFieldDashboardMobileId(__out, __typeMapper);
      writeFieldDurableId(__out, __typeMapper);
      writeFieldFullName(__out, __typeMapper);
      writeFieldMetadata(__out, __typeMapper);
      writeFieldSalesforceMobileId(__out, __typeMapper);
      writeFieldTouchMobileId(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setChatterMobileId(__in, __typeMapper);
      setDashboardMobileId(__in, __typeMapper);
      setDurableId(__in, __typeMapper);
      setFullName(__in, __typeMapper);
      setMetadata(__in, __typeMapper);
      setSalesforceMobileId(__in, __typeMapper);
      setTouchMobileId(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "ChatterMobileId", ChatterMobileId);
      toStringHelper(sb, "DashboardMobileId", DashboardMobileId);
      toStringHelper(sb, "DurableId", DurableId);
      toStringHelper(sb, "FullName", FullName);
      toStringHelper(sb, "Metadata", Metadata);
      toStringHelper(sb, "SalesforceMobileId", SalesforceMobileId);
      toStringHelper(sb, "TouchMobileId", TouchMobileId);
    }


}
