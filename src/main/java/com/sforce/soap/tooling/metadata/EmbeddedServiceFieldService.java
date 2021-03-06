package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class EmbeddedServiceFieldService extends com.sforce.soap.tooling.metadata.Metadata {

    /**
     * Constructor
     */
    public EmbeddedServiceFieldService() {}

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
     * element : appointmentBookingFlowName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean appointmentBookingFlowName__is_set = false;

    private java.lang.String appointmentBookingFlowName;

    public java.lang.String getAppointmentBookingFlowName() {
      return appointmentBookingFlowName;
    }

    public void setAppointmentBookingFlowName(java.lang.String appointmentBookingFlowName) {
      this.appointmentBookingFlowName = appointmentBookingFlowName;
      appointmentBookingFlowName__is_set = true;
    }

    protected void setAppointmentBookingFlowName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("appointmentBookingFlowName", "urn:metadata.tooling.soap.sforce.com","appointmentBookingFlowName","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setAppointmentBookingFlowName(__typeMapper.readString(__in, _lookupTypeInfo("appointmentBookingFlowName", "urn:metadata.tooling.soap.sforce.com","appointmentBookingFlowName","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAppointmentBookingFlowName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("appointmentBookingFlowName", "urn:metadata.tooling.soap.sforce.com","appointmentBookingFlowName","http://www.w3.org/2001/XMLSchema","string",0,1,true), appointmentBookingFlowName, appointmentBookingFlowName__is_set);
    }

    /**
     * element : cancelApptBookingFlowName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean cancelApptBookingFlowName__is_set = false;

    private java.lang.String cancelApptBookingFlowName;

    public java.lang.String getCancelApptBookingFlowName() {
      return cancelApptBookingFlowName;
    }

    public void setCancelApptBookingFlowName(java.lang.String cancelApptBookingFlowName) {
      this.cancelApptBookingFlowName = cancelApptBookingFlowName;
      cancelApptBookingFlowName__is_set = true;
    }

    protected void setCancelApptBookingFlowName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("cancelApptBookingFlowName", "urn:metadata.tooling.soap.sforce.com","cancelApptBookingFlowName","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setCancelApptBookingFlowName(__typeMapper.readString(__in, _lookupTypeInfo("cancelApptBookingFlowName", "urn:metadata.tooling.soap.sforce.com","cancelApptBookingFlowName","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCancelApptBookingFlowName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("cancelApptBookingFlowName", "urn:metadata.tooling.soap.sforce.com","cancelApptBookingFlowName","http://www.w3.org/2001/XMLSchema","string",0,1,true), cancelApptBookingFlowName, cancelApptBookingFlowName__is_set);
    }

    /**
     * element : embeddedServiceConfig of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean embeddedServiceConfig__is_set = false;

    private java.lang.String embeddedServiceConfig;

    public java.lang.String getEmbeddedServiceConfig() {
      return embeddedServiceConfig;
    }

    public void setEmbeddedServiceConfig(java.lang.String embeddedServiceConfig) {
      this.embeddedServiceConfig = embeddedServiceConfig;
      embeddedServiceConfig__is_set = true;
    }

    protected void setEmbeddedServiceConfig(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("embeddedServiceConfig", "urn:metadata.tooling.soap.sforce.com","embeddedServiceConfig","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setEmbeddedServiceConfig(__typeMapper.readString(__in, _lookupTypeInfo("embeddedServiceConfig", "urn:metadata.tooling.soap.sforce.com","embeddedServiceConfig","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldEmbeddedServiceConfig(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("embeddedServiceConfig", "urn:metadata.tooling.soap.sforce.com","embeddedServiceConfig","http://www.w3.org/2001/XMLSchema","string",1,1,true), embeddedServiceConfig, embeddedServiceConfig__is_set);
    }

    /**
     * element : enabled of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean enabled__is_set = false;

    private boolean enabled;

    public boolean getEnabled() {
      return enabled;
    }

    public boolean isEnabled() {
      return enabled;
    }

    public void setEnabled(boolean enabled) {
      this.enabled = enabled;
      enabled__is_set = true;
    }

    protected void setEnabled(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("enabled", "urn:metadata.tooling.soap.sforce.com","enabled","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setEnabled(__typeMapper.readBoolean(__in, _lookupTypeInfo("enabled", "urn:metadata.tooling.soap.sforce.com","enabled","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldEnabled(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("enabled", "urn:metadata.tooling.soap.sforce.com","enabled","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), enabled, enabled__is_set);
    }

    /**
     * element : fieldServiceConfirmCardImg of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean fieldServiceConfirmCardImg__is_set = false;

    private java.lang.String fieldServiceConfirmCardImg;

    public java.lang.String getFieldServiceConfirmCardImg() {
      return fieldServiceConfirmCardImg;
    }

    public void setFieldServiceConfirmCardImg(java.lang.String fieldServiceConfirmCardImg) {
      this.fieldServiceConfirmCardImg = fieldServiceConfirmCardImg;
      fieldServiceConfirmCardImg__is_set = true;
    }

    protected void setFieldServiceConfirmCardImg(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("fieldServiceConfirmCardImg", "urn:metadata.tooling.soap.sforce.com","fieldServiceConfirmCardImg","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setFieldServiceConfirmCardImg(__typeMapper.readString(__in, _lookupTypeInfo("fieldServiceConfirmCardImg", "urn:metadata.tooling.soap.sforce.com","fieldServiceConfirmCardImg","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFieldServiceConfirmCardImg(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("fieldServiceConfirmCardImg", "urn:metadata.tooling.soap.sforce.com","fieldServiceConfirmCardImg","http://www.w3.org/2001/XMLSchema","string",0,1,true), fieldServiceConfirmCardImg, fieldServiceConfirmCardImg__is_set);
    }

    /**
     * element : fieldServiceHomeImg of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean fieldServiceHomeImg__is_set = false;

    private java.lang.String fieldServiceHomeImg;

    public java.lang.String getFieldServiceHomeImg() {
      return fieldServiceHomeImg;
    }

    public void setFieldServiceHomeImg(java.lang.String fieldServiceHomeImg) {
      this.fieldServiceHomeImg = fieldServiceHomeImg;
      fieldServiceHomeImg__is_set = true;
    }

    protected void setFieldServiceHomeImg(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("fieldServiceHomeImg", "urn:metadata.tooling.soap.sforce.com","fieldServiceHomeImg","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setFieldServiceHomeImg(__typeMapper.readString(__in, _lookupTypeInfo("fieldServiceHomeImg", "urn:metadata.tooling.soap.sforce.com","fieldServiceHomeImg","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFieldServiceHomeImg(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("fieldServiceHomeImg", "urn:metadata.tooling.soap.sforce.com","fieldServiceHomeImg","http://www.w3.org/2001/XMLSchema","string",0,1,true), fieldServiceHomeImg, fieldServiceHomeImg__is_set);
    }

    /**
     * element : fieldServiceLogoImg of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean fieldServiceLogoImg__is_set = false;

    private java.lang.String fieldServiceLogoImg;

    public java.lang.String getFieldServiceLogoImg() {
      return fieldServiceLogoImg;
    }

    public void setFieldServiceLogoImg(java.lang.String fieldServiceLogoImg) {
      this.fieldServiceLogoImg = fieldServiceLogoImg;
      fieldServiceLogoImg__is_set = true;
    }

    protected void setFieldServiceLogoImg(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("fieldServiceLogoImg", "urn:metadata.tooling.soap.sforce.com","fieldServiceLogoImg","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setFieldServiceLogoImg(__typeMapper.readString(__in, _lookupTypeInfo("fieldServiceLogoImg", "urn:metadata.tooling.soap.sforce.com","fieldServiceLogoImg","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFieldServiceLogoImg(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("fieldServiceLogoImg", "urn:metadata.tooling.soap.sforce.com","fieldServiceLogoImg","http://www.w3.org/2001/XMLSchema","string",0,1,true), fieldServiceLogoImg, fieldServiceLogoImg__is_set);
    }

    /**
     * element : masterLabel of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean masterLabel__is_set = false;

    private java.lang.String masterLabel;

    public java.lang.String getMasterLabel() {
      return masterLabel;
    }

    public void setMasterLabel(java.lang.String masterLabel) {
      this.masterLabel = masterLabel;
      masterLabel__is_set = true;
    }

    protected void setMasterLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("masterLabel", "urn:metadata.tooling.soap.sforce.com","masterLabel","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setMasterLabel(__typeMapper.readString(__in, _lookupTypeInfo("masterLabel", "urn:metadata.tooling.soap.sforce.com","masterLabel","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldMasterLabel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("masterLabel", "urn:metadata.tooling.soap.sforce.com","masterLabel","http://www.w3.org/2001/XMLSchema","string",1,1,true), masterLabel, masterLabel__is_set);
    }

    /**
     * element : modifyApptBookingFlowName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean modifyApptBookingFlowName__is_set = false;

    private java.lang.String modifyApptBookingFlowName;

    public java.lang.String getModifyApptBookingFlowName() {
      return modifyApptBookingFlowName;
    }

    public void setModifyApptBookingFlowName(java.lang.String modifyApptBookingFlowName) {
      this.modifyApptBookingFlowName = modifyApptBookingFlowName;
      modifyApptBookingFlowName__is_set = true;
    }

    protected void setModifyApptBookingFlowName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("modifyApptBookingFlowName", "urn:metadata.tooling.soap.sforce.com","modifyApptBookingFlowName","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setModifyApptBookingFlowName(__typeMapper.readString(__in, _lookupTypeInfo("modifyApptBookingFlowName", "urn:metadata.tooling.soap.sforce.com","modifyApptBookingFlowName","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldModifyApptBookingFlowName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("modifyApptBookingFlowName", "urn:metadata.tooling.soap.sforce.com","modifyApptBookingFlowName","http://www.w3.org/2001/XMLSchema","string",0,1,true), modifyApptBookingFlowName, modifyApptBookingFlowName__is_set);
    }

    /**
     * element : shouldShowExistingAppointment of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean shouldShowExistingAppointment__is_set = false;

    private boolean shouldShowExistingAppointment;

    public boolean getShouldShowExistingAppointment() {
      return shouldShowExistingAppointment;
    }

    public boolean isShouldShowExistingAppointment() {
      return shouldShowExistingAppointment;
    }

    public void setShouldShowExistingAppointment(boolean shouldShowExistingAppointment) {
      this.shouldShowExistingAppointment = shouldShowExistingAppointment;
      shouldShowExistingAppointment__is_set = true;
    }

    protected void setShouldShowExistingAppointment(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("shouldShowExistingAppointment", "urn:metadata.tooling.soap.sforce.com","shouldShowExistingAppointment","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setShouldShowExistingAppointment(__typeMapper.readBoolean(__in, _lookupTypeInfo("shouldShowExistingAppointment", "urn:metadata.tooling.soap.sforce.com","shouldShowExistingAppointment","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldShouldShowExistingAppointment(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("shouldShowExistingAppointment", "urn:metadata.tooling.soap.sforce.com","shouldShowExistingAppointment","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), shouldShowExistingAppointment, shouldShowExistingAppointment__is_set);
    }

    /**
     * element : shouldShowNewAppointment of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean shouldShowNewAppointment__is_set = false;

    private boolean shouldShowNewAppointment;

    public boolean getShouldShowNewAppointment() {
      return shouldShowNewAppointment;
    }

    public boolean isShouldShowNewAppointment() {
      return shouldShowNewAppointment;
    }

    public void setShouldShowNewAppointment(boolean shouldShowNewAppointment) {
      this.shouldShowNewAppointment = shouldShowNewAppointment;
      shouldShowNewAppointment__is_set = true;
    }

    protected void setShouldShowNewAppointment(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("shouldShowNewAppointment", "urn:metadata.tooling.soap.sforce.com","shouldShowNewAppointment","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setShouldShowNewAppointment(__typeMapper.readBoolean(__in, _lookupTypeInfo("shouldShowNewAppointment", "urn:metadata.tooling.soap.sforce.com","shouldShowNewAppointment","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldShouldShowNewAppointment(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("shouldShowNewAppointment", "urn:metadata.tooling.soap.sforce.com","shouldShowNewAppointment","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), shouldShowNewAppointment, shouldShowNewAppointment__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:metadata.tooling.soap.sforce.com", "EmbeddedServiceFieldService");
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
      sb.append("[EmbeddedServiceFieldService ");
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
      writeFieldAppointmentBookingFlowName(__out, __typeMapper);
      writeFieldCancelApptBookingFlowName(__out, __typeMapper);
      writeFieldEmbeddedServiceConfig(__out, __typeMapper);
      writeFieldEnabled(__out, __typeMapper);
      writeFieldFieldServiceConfirmCardImg(__out, __typeMapper);
      writeFieldFieldServiceHomeImg(__out, __typeMapper);
      writeFieldFieldServiceLogoImg(__out, __typeMapper);
      writeFieldMasterLabel(__out, __typeMapper);
      writeFieldModifyApptBookingFlowName(__out, __typeMapper);
      writeFieldShouldShowExistingAppointment(__out, __typeMapper);
      writeFieldShouldShowNewAppointment(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAppointmentBookingFlowName(__in, __typeMapper);
      setCancelApptBookingFlowName(__in, __typeMapper);
      setEmbeddedServiceConfig(__in, __typeMapper);
      setEnabled(__in, __typeMapper);
      setFieldServiceConfirmCardImg(__in, __typeMapper);
      setFieldServiceHomeImg(__in, __typeMapper);
      setFieldServiceLogoImg(__in, __typeMapper);
      setMasterLabel(__in, __typeMapper);
      setModifyApptBookingFlowName(__in, __typeMapper);
      setShouldShowExistingAppointment(__in, __typeMapper);
      setShouldShowNewAppointment(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "appointmentBookingFlowName", appointmentBookingFlowName);
      toStringHelper(sb, "cancelApptBookingFlowName", cancelApptBookingFlowName);
      toStringHelper(sb, "embeddedServiceConfig", embeddedServiceConfig);
      toStringHelper(sb, "enabled", enabled);
      toStringHelper(sb, "fieldServiceConfirmCardImg", fieldServiceConfirmCardImg);
      toStringHelper(sb, "fieldServiceHomeImg", fieldServiceHomeImg);
      toStringHelper(sb, "fieldServiceLogoImg", fieldServiceLogoImg);
      toStringHelper(sb, "masterLabel", masterLabel);
      toStringHelper(sb, "modifyApptBookingFlowName", modifyApptBookingFlowName);
      toStringHelper(sb, "shouldShowExistingAppointment", shouldShowExistingAppointment);
      toStringHelper(sb, "shouldShowNewAppointment", shouldShowNewAppointment);
    }


}
