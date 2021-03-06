package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class FieldServiceSettings extends com.sforce.soap.tooling.metadata.MetadataForSettings {

    /**
     * Constructor
     */
    public FieldServiceSettings() {}

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
     * element : capacityUsageCalcClassId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean capacityUsageCalcClassId__is_set = false;

    private java.lang.String capacityUsageCalcClassId;

    public java.lang.String getCapacityUsageCalcClassId() {
      return capacityUsageCalcClassId;
    }

    public void setCapacityUsageCalcClassId(java.lang.String capacityUsageCalcClassId) {
      this.capacityUsageCalcClassId = capacityUsageCalcClassId;
      capacityUsageCalcClassId__is_set = true;
    }

    protected void setCapacityUsageCalcClassId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("capacityUsageCalcClassId", "urn:metadata.tooling.soap.sforce.com","capacityUsageCalcClassId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setCapacityUsageCalcClassId(__typeMapper.readString(__in, _lookupTypeInfo("capacityUsageCalcClassId", "urn:metadata.tooling.soap.sforce.com","capacityUsageCalcClassId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCapacityUsageCalcClassId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("capacityUsageCalcClassId", "urn:metadata.tooling.soap.sforce.com","capacityUsageCalcClassId","http://www.w3.org/2001/XMLSchema","string",0,1,true), capacityUsageCalcClassId, capacityUsageCalcClassId__is_set);
    }

    /**
     * element : doesAllowEditSaForCrew of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean doesAllowEditSaForCrew__is_set = false;

    private boolean doesAllowEditSaForCrew;

    public boolean getDoesAllowEditSaForCrew() {
      return doesAllowEditSaForCrew;
    }

    public boolean isDoesAllowEditSaForCrew() {
      return doesAllowEditSaForCrew;
    }

    public void setDoesAllowEditSaForCrew(boolean doesAllowEditSaForCrew) {
      this.doesAllowEditSaForCrew = doesAllowEditSaForCrew;
      doesAllowEditSaForCrew__is_set = true;
    }

    protected void setDoesAllowEditSaForCrew(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("doesAllowEditSaForCrew", "urn:metadata.tooling.soap.sforce.com","doesAllowEditSaForCrew","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setDoesAllowEditSaForCrew(__typeMapper.readBoolean(__in, _lookupTypeInfo("doesAllowEditSaForCrew", "urn:metadata.tooling.soap.sforce.com","doesAllowEditSaForCrew","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldDoesAllowEditSaForCrew(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("doesAllowEditSaForCrew", "urn:metadata.tooling.soap.sforce.com","doesAllowEditSaForCrew","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), doesAllowEditSaForCrew, doesAllowEditSaForCrew__is_set);
    }

    /**
     * element : doesShareSaParentWoWithAr of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean doesShareSaParentWoWithAr__is_set = false;

    private boolean doesShareSaParentWoWithAr;

    public boolean getDoesShareSaParentWoWithAr() {
      return doesShareSaParentWoWithAr;
    }

    public boolean isDoesShareSaParentWoWithAr() {
      return doesShareSaParentWoWithAr;
    }

    public void setDoesShareSaParentWoWithAr(boolean doesShareSaParentWoWithAr) {
      this.doesShareSaParentWoWithAr = doesShareSaParentWoWithAr;
      doesShareSaParentWoWithAr__is_set = true;
    }

    protected void setDoesShareSaParentWoWithAr(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("doesShareSaParentWoWithAr", "urn:metadata.tooling.soap.sforce.com","doesShareSaParentWoWithAr","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setDoesShareSaParentWoWithAr(__typeMapper.readBoolean(__in, _lookupTypeInfo("doesShareSaParentWoWithAr", "urn:metadata.tooling.soap.sforce.com","doesShareSaParentWoWithAr","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldDoesShareSaParentWoWithAr(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("doesShareSaParentWoWithAr", "urn:metadata.tooling.soap.sforce.com","doesShareSaParentWoWithAr","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), doesShareSaParentWoWithAr, doesShareSaParentWoWithAr__is_set);
    }

    /**
     * element : doesShareSaWithAr of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean doesShareSaWithAr__is_set = false;

    private boolean doesShareSaWithAr;

    public boolean getDoesShareSaWithAr() {
      return doesShareSaWithAr;
    }

    public boolean isDoesShareSaWithAr() {
      return doesShareSaWithAr;
    }

    public void setDoesShareSaWithAr(boolean doesShareSaWithAr) {
      this.doesShareSaWithAr = doesShareSaWithAr;
      doesShareSaWithAr__is_set = true;
    }

    protected void setDoesShareSaWithAr(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("doesShareSaWithAr", "urn:metadata.tooling.soap.sforce.com","doesShareSaWithAr","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setDoesShareSaWithAr(__typeMapper.readBoolean(__in, _lookupTypeInfo("doesShareSaWithAr", "urn:metadata.tooling.soap.sforce.com","doesShareSaWithAr","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldDoesShareSaWithAr(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("doesShareSaWithAr", "urn:metadata.tooling.soap.sforce.com","doesShareSaWithAr","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), doesShareSaWithAr, doesShareSaWithAr__is_set);
    }

    /**
     * element : fieldServiceNotificationsOrgPref of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean fieldServiceNotificationsOrgPref__is_set = false;

    private boolean fieldServiceNotificationsOrgPref;

    public boolean getFieldServiceNotificationsOrgPref() {
      return fieldServiceNotificationsOrgPref;
    }

    public boolean isFieldServiceNotificationsOrgPref() {
      return fieldServiceNotificationsOrgPref;
    }

    public void setFieldServiceNotificationsOrgPref(boolean fieldServiceNotificationsOrgPref) {
      this.fieldServiceNotificationsOrgPref = fieldServiceNotificationsOrgPref;
      fieldServiceNotificationsOrgPref__is_set = true;
    }

    protected void setFieldServiceNotificationsOrgPref(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("fieldServiceNotificationsOrgPref", "urn:metadata.tooling.soap.sforce.com","fieldServiceNotificationsOrgPref","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setFieldServiceNotificationsOrgPref(__typeMapper.readBoolean(__in, _lookupTypeInfo("fieldServiceNotificationsOrgPref", "urn:metadata.tooling.soap.sforce.com","fieldServiceNotificationsOrgPref","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldFieldServiceNotificationsOrgPref(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("fieldServiceNotificationsOrgPref", "urn:metadata.tooling.soap.sforce.com","fieldServiceNotificationsOrgPref","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), fieldServiceNotificationsOrgPref, fieldServiceNotificationsOrgPref__is_set);
    }

    /**
     * element : fieldServiceOrgPref of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean fieldServiceOrgPref__is_set = false;

    private boolean fieldServiceOrgPref;

    public boolean getFieldServiceOrgPref() {
      return fieldServiceOrgPref;
    }

    public boolean isFieldServiceOrgPref() {
      return fieldServiceOrgPref;
    }

    public void setFieldServiceOrgPref(boolean fieldServiceOrgPref) {
      this.fieldServiceOrgPref = fieldServiceOrgPref;
      fieldServiceOrgPref__is_set = true;
    }

    protected void setFieldServiceOrgPref(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("fieldServiceOrgPref", "urn:metadata.tooling.soap.sforce.com","fieldServiceOrgPref","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setFieldServiceOrgPref(__typeMapper.readBoolean(__in, _lookupTypeInfo("fieldServiceOrgPref", "urn:metadata.tooling.soap.sforce.com","fieldServiceOrgPref","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldFieldServiceOrgPref(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("fieldServiceOrgPref", "urn:metadata.tooling.soap.sforce.com","fieldServiceOrgPref","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), fieldServiceOrgPref, fieldServiceOrgPref__is_set);
    }

    /**
     * element : serviceAppointmentsDueDateOffsetOrgValue of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private boolean serviceAppointmentsDueDateOffsetOrgValue__is_set = false;

    private int serviceAppointmentsDueDateOffsetOrgValue;

    public int getServiceAppointmentsDueDateOffsetOrgValue() {
      return serviceAppointmentsDueDateOffsetOrgValue;
    }

    public void setServiceAppointmentsDueDateOffsetOrgValue(int serviceAppointmentsDueDateOffsetOrgValue) {
      this.serviceAppointmentsDueDateOffsetOrgValue = serviceAppointmentsDueDateOffsetOrgValue;
      serviceAppointmentsDueDateOffsetOrgValue__is_set = true;
    }

    protected void setServiceAppointmentsDueDateOffsetOrgValue(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("serviceAppointmentsDueDateOffsetOrgValue", "urn:metadata.tooling.soap.sforce.com","serviceAppointmentsDueDateOffsetOrgValue","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setServiceAppointmentsDueDateOffsetOrgValue((int)__typeMapper.readInt(__in, _lookupTypeInfo("serviceAppointmentsDueDateOffsetOrgValue", "urn:metadata.tooling.soap.sforce.com","serviceAppointmentsDueDateOffsetOrgValue","http://www.w3.org/2001/XMLSchema","int",0,1,true), int.class));
      }
    }

    private void writeFieldServiceAppointmentsDueDateOffsetOrgValue(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("serviceAppointmentsDueDateOffsetOrgValue", "urn:metadata.tooling.soap.sforce.com","serviceAppointmentsDueDateOffsetOrgValue","http://www.w3.org/2001/XMLSchema","int",0,1,true), serviceAppointmentsDueDateOffsetOrgValue, serviceAppointmentsDueDateOffsetOrgValue__is_set);
    }

    /**
     * element : workOrderLineItemSearchFields of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String[]
     */
    private boolean workOrderLineItemSearchFields__is_set = false;

    private java.lang.String[] workOrderLineItemSearchFields = new java.lang.String[0];

    public java.lang.String[] getWorkOrderLineItemSearchFields() {
      return workOrderLineItemSearchFields;
    }

    public void setWorkOrderLineItemSearchFields(java.lang.String[] workOrderLineItemSearchFields) {
      this.workOrderLineItemSearchFields = workOrderLineItemSearchFields;
      workOrderLineItemSearchFields__is_set = true;
    }

    protected void setWorkOrderLineItemSearchFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("workOrderLineItemSearchFields", "urn:metadata.tooling.soap.sforce.com","workOrderLineItemSearchFields","http://www.w3.org/2001/XMLSchema","string",0,-1,true))) {
        setWorkOrderLineItemSearchFields((java.lang.String[])__typeMapper.readObject(__in, _lookupTypeInfo("workOrderLineItemSearchFields", "urn:metadata.tooling.soap.sforce.com","workOrderLineItemSearchFields","http://www.w3.org/2001/XMLSchema","string",0,-1,true), java.lang.String[].class));
      }
    }

    private void writeFieldWorkOrderLineItemSearchFields(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("workOrderLineItemSearchFields", "urn:metadata.tooling.soap.sforce.com","workOrderLineItemSearchFields","http://www.w3.org/2001/XMLSchema","string",0,-1,true), workOrderLineItemSearchFields, workOrderLineItemSearchFields__is_set);
    }

    /**
     * element : workOrderSearchFields of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String[]
     */
    private boolean workOrderSearchFields__is_set = false;

    private java.lang.String[] workOrderSearchFields = new java.lang.String[0];

    public java.lang.String[] getWorkOrderSearchFields() {
      return workOrderSearchFields;
    }

    public void setWorkOrderSearchFields(java.lang.String[] workOrderSearchFields) {
      this.workOrderSearchFields = workOrderSearchFields;
      workOrderSearchFields__is_set = true;
    }

    protected void setWorkOrderSearchFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("workOrderSearchFields", "urn:metadata.tooling.soap.sforce.com","workOrderSearchFields","http://www.w3.org/2001/XMLSchema","string",0,-1,true))) {
        setWorkOrderSearchFields((java.lang.String[])__typeMapper.readObject(__in, _lookupTypeInfo("workOrderSearchFields", "urn:metadata.tooling.soap.sforce.com","workOrderSearchFields","http://www.w3.org/2001/XMLSchema","string",0,-1,true), java.lang.String[].class));
      }
    }

    private void writeFieldWorkOrderSearchFields(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("workOrderSearchFields", "urn:metadata.tooling.soap.sforce.com","workOrderSearchFields","http://www.w3.org/2001/XMLSchema","string",0,-1,true), workOrderSearchFields, workOrderSearchFields__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:metadata.tooling.soap.sforce.com", "FieldServiceSettings");
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
      sb.append("[FieldServiceSettings ");
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
      writeFieldCapacityUsageCalcClassId(__out, __typeMapper);
      writeFieldDoesAllowEditSaForCrew(__out, __typeMapper);
      writeFieldDoesShareSaParentWoWithAr(__out, __typeMapper);
      writeFieldDoesShareSaWithAr(__out, __typeMapper);
      writeFieldFieldServiceNotificationsOrgPref(__out, __typeMapper);
      writeFieldFieldServiceOrgPref(__out, __typeMapper);
      writeFieldServiceAppointmentsDueDateOffsetOrgValue(__out, __typeMapper);
      writeFieldWorkOrderLineItemSearchFields(__out, __typeMapper);
      writeFieldWorkOrderSearchFields(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCapacityUsageCalcClassId(__in, __typeMapper);
      setDoesAllowEditSaForCrew(__in, __typeMapper);
      setDoesShareSaParentWoWithAr(__in, __typeMapper);
      setDoesShareSaWithAr(__in, __typeMapper);
      setFieldServiceNotificationsOrgPref(__in, __typeMapper);
      setFieldServiceOrgPref(__in, __typeMapper);
      setServiceAppointmentsDueDateOffsetOrgValue(__in, __typeMapper);
      setWorkOrderLineItemSearchFields(__in, __typeMapper);
      setWorkOrderSearchFields(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "capacityUsageCalcClassId", capacityUsageCalcClassId);
      toStringHelper(sb, "doesAllowEditSaForCrew", doesAllowEditSaForCrew);
      toStringHelper(sb, "doesShareSaParentWoWithAr", doesShareSaParentWoWithAr);
      toStringHelper(sb, "doesShareSaWithAr", doesShareSaWithAr);
      toStringHelper(sb, "fieldServiceNotificationsOrgPref", fieldServiceNotificationsOrgPref);
      toStringHelper(sb, "fieldServiceOrgPref", fieldServiceOrgPref);
      toStringHelper(sb, "serviceAppointmentsDueDateOffsetOrgValue", serviceAppointmentsDueDateOffsetOrgValue);
      toStringHelper(sb, "workOrderLineItemSearchFields", workOrderLineItemSearchFields);
      toStringHelper(sb, "workOrderSearchFields", workOrderSearchFields);
    }


}
