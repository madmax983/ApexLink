package com.sforce.soap.tooling.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class FieldServiceSettings extends com.sforce.soap.tooling.sobject.SObject {

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
     * element : CapacityUsageCalcClassIdentifier of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean CapacityUsageCalcClassIdentifier__is_set = false;

    private java.lang.String CapacityUsageCalcClassIdentifier;

    public java.lang.String getCapacityUsageCalcClassIdentifier() {
      return CapacityUsageCalcClassIdentifier;
    }

    public void setCapacityUsageCalcClassIdentifier(java.lang.String CapacityUsageCalcClassIdentifier) {
      this.CapacityUsageCalcClassIdentifier = CapacityUsageCalcClassIdentifier;
      CapacityUsageCalcClassIdentifier__is_set = true;
    }

    protected void setCapacityUsageCalcClassIdentifier(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CapacityUsageCalcClassIdentifier", "urn:sobject.tooling.soap.sforce.com","CapacityUsageCalcClassIdentifier","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setCapacityUsageCalcClassIdentifier(__typeMapper.readString(__in, _lookupTypeInfo("CapacityUsageCalcClassIdentifier", "urn:sobject.tooling.soap.sforce.com","CapacityUsageCalcClassIdentifier","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCapacityUsageCalcClassIdentifier(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CapacityUsageCalcClassIdentifier", "urn:sobject.tooling.soap.sforce.com","CapacityUsageCalcClassIdentifier","http://www.w3.org/2001/XMLSchema","string",0,1,true), CapacityUsageCalcClassIdentifier, CapacityUsageCalcClassIdentifier__is_set);
    }

    /**
     * element : DoesAllowEditSaForCrew of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean DoesAllowEditSaForCrew__is_set = false;

    private java.lang.Boolean DoesAllowEditSaForCrew;

    public java.lang.Boolean getDoesAllowEditSaForCrew() {
      return DoesAllowEditSaForCrew;
    }

    public void setDoesAllowEditSaForCrew(java.lang.Boolean DoesAllowEditSaForCrew) {
      this.DoesAllowEditSaForCrew = DoesAllowEditSaForCrew;
      DoesAllowEditSaForCrew__is_set = true;
    }

    protected void setDoesAllowEditSaForCrew(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("DoesAllowEditSaForCrew", "urn:sobject.tooling.soap.sforce.com","DoesAllowEditSaForCrew","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setDoesAllowEditSaForCrew((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("DoesAllowEditSaForCrew", "urn:sobject.tooling.soap.sforce.com","DoesAllowEditSaForCrew","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldDoesAllowEditSaForCrew(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("DoesAllowEditSaForCrew", "urn:sobject.tooling.soap.sforce.com","DoesAllowEditSaForCrew","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), DoesAllowEditSaForCrew, DoesAllowEditSaForCrew__is_set);
    }

    /**
     * element : DoesShareSaParentWoWithAr of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean DoesShareSaParentWoWithAr__is_set = false;

    private java.lang.Boolean DoesShareSaParentWoWithAr;

    public java.lang.Boolean getDoesShareSaParentWoWithAr() {
      return DoesShareSaParentWoWithAr;
    }

    public void setDoesShareSaParentWoWithAr(java.lang.Boolean DoesShareSaParentWoWithAr) {
      this.DoesShareSaParentWoWithAr = DoesShareSaParentWoWithAr;
      DoesShareSaParentWoWithAr__is_set = true;
    }

    protected void setDoesShareSaParentWoWithAr(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("DoesShareSaParentWoWithAr", "urn:sobject.tooling.soap.sforce.com","DoesShareSaParentWoWithAr","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setDoesShareSaParentWoWithAr((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("DoesShareSaParentWoWithAr", "urn:sobject.tooling.soap.sforce.com","DoesShareSaParentWoWithAr","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldDoesShareSaParentWoWithAr(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("DoesShareSaParentWoWithAr", "urn:sobject.tooling.soap.sforce.com","DoesShareSaParentWoWithAr","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), DoesShareSaParentWoWithAr, DoesShareSaParentWoWithAr__is_set);
    }

    /**
     * element : DoesShareSaWithAr of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean DoesShareSaWithAr__is_set = false;

    private java.lang.Boolean DoesShareSaWithAr;

    public java.lang.Boolean getDoesShareSaWithAr() {
      return DoesShareSaWithAr;
    }

    public void setDoesShareSaWithAr(java.lang.Boolean DoesShareSaWithAr) {
      this.DoesShareSaWithAr = DoesShareSaWithAr;
      DoesShareSaWithAr__is_set = true;
    }

    protected void setDoesShareSaWithAr(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("DoesShareSaWithAr", "urn:sobject.tooling.soap.sforce.com","DoesShareSaWithAr","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setDoesShareSaWithAr((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("DoesShareSaWithAr", "urn:sobject.tooling.soap.sforce.com","DoesShareSaWithAr","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldDoesShareSaWithAr(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("DoesShareSaWithAr", "urn:sobject.tooling.soap.sforce.com","DoesShareSaWithAr","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), DoesShareSaWithAr, DoesShareSaWithAr__is_set);
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
     * element : FieldServiceNotificationsOrgPref of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean FieldServiceNotificationsOrgPref__is_set = false;

    private java.lang.Boolean FieldServiceNotificationsOrgPref;

    public java.lang.Boolean getFieldServiceNotificationsOrgPref() {
      return FieldServiceNotificationsOrgPref;
    }

    public void setFieldServiceNotificationsOrgPref(java.lang.Boolean FieldServiceNotificationsOrgPref) {
      this.FieldServiceNotificationsOrgPref = FieldServiceNotificationsOrgPref;
      FieldServiceNotificationsOrgPref__is_set = true;
    }

    protected void setFieldServiceNotificationsOrgPref(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("FieldServiceNotificationsOrgPref", "urn:sobject.tooling.soap.sforce.com","FieldServiceNotificationsOrgPref","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setFieldServiceNotificationsOrgPref((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("FieldServiceNotificationsOrgPref", "urn:sobject.tooling.soap.sforce.com","FieldServiceNotificationsOrgPref","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldFieldServiceNotificationsOrgPref(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("FieldServiceNotificationsOrgPref", "urn:sobject.tooling.soap.sforce.com","FieldServiceNotificationsOrgPref","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), FieldServiceNotificationsOrgPref, FieldServiceNotificationsOrgPref__is_set);
    }

    /**
     * element : FieldServiceOrgPref of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean FieldServiceOrgPref__is_set = false;

    private java.lang.Boolean FieldServiceOrgPref;

    public java.lang.Boolean getFieldServiceOrgPref() {
      return FieldServiceOrgPref;
    }

    public void setFieldServiceOrgPref(java.lang.Boolean FieldServiceOrgPref) {
      this.FieldServiceOrgPref = FieldServiceOrgPref;
      FieldServiceOrgPref__is_set = true;
    }

    protected void setFieldServiceOrgPref(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("FieldServiceOrgPref", "urn:sobject.tooling.soap.sforce.com","FieldServiceOrgPref","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setFieldServiceOrgPref((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("FieldServiceOrgPref", "urn:sobject.tooling.soap.sforce.com","FieldServiceOrgPref","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldFieldServiceOrgPref(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("FieldServiceOrgPref", "urn:sobject.tooling.soap.sforce.com","FieldServiceOrgPref","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), FieldServiceOrgPref, FieldServiceOrgPref__is_set);
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
     * element : Metadata of type {urn:metadata.tooling.soap.sforce.com}FieldServiceSettings
     * java type: com.sforce.soap.tooling.metadata.FieldServiceSettings
     */
    private boolean Metadata__is_set = false;

    private com.sforce.soap.tooling.metadata.FieldServiceSettings Metadata;

    public com.sforce.soap.tooling.metadata.FieldServiceSettings getMetadata() {
      return Metadata;
    }

    public void setMetadata(com.sforce.soap.tooling.metadata.FieldServiceSettings Metadata) {
      this.Metadata = Metadata;
      Metadata__is_set = true;
    }

    protected void setMetadata(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Metadata", "urn:sobject.tooling.soap.sforce.com","Metadata","urn:metadata.tooling.soap.sforce.com","FieldServiceSettings",0,1,true))) {
        setMetadata((com.sforce.soap.tooling.metadata.FieldServiceSettings)__typeMapper.readObject(__in, _lookupTypeInfo("Metadata", "urn:sobject.tooling.soap.sforce.com","Metadata","urn:metadata.tooling.soap.sforce.com","FieldServiceSettings",0,1,true), com.sforce.soap.tooling.metadata.FieldServiceSettings.class));
      }
    }

    private void writeFieldMetadata(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Metadata", "urn:sobject.tooling.soap.sforce.com","Metadata","urn:metadata.tooling.soap.sforce.com","FieldServiceSettings",0,1,true), Metadata, Metadata__is_set);
    }

    /**
     * element : ServiceAppointmentsDueDateOffsetOrgValue of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean ServiceAppointmentsDueDateOffsetOrgValue__is_set = false;

    private java.lang.Integer ServiceAppointmentsDueDateOffsetOrgValue;

    public java.lang.Integer getServiceAppointmentsDueDateOffsetOrgValue() {
      return ServiceAppointmentsDueDateOffsetOrgValue;
    }

    public void setServiceAppointmentsDueDateOffsetOrgValue(java.lang.Integer ServiceAppointmentsDueDateOffsetOrgValue) {
      this.ServiceAppointmentsDueDateOffsetOrgValue = ServiceAppointmentsDueDateOffsetOrgValue;
      ServiceAppointmentsDueDateOffsetOrgValue__is_set = true;
    }

    protected void setServiceAppointmentsDueDateOffsetOrgValue(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ServiceAppointmentsDueDateOffsetOrgValue", "urn:sobject.tooling.soap.sforce.com","ServiceAppointmentsDueDateOffsetOrgValue","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setServiceAppointmentsDueDateOffsetOrgValue((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("ServiceAppointmentsDueDateOffsetOrgValue", "urn:sobject.tooling.soap.sforce.com","ServiceAppointmentsDueDateOffsetOrgValue","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldServiceAppointmentsDueDateOffsetOrgValue(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ServiceAppointmentsDueDateOffsetOrgValue", "urn:sobject.tooling.soap.sforce.com","ServiceAppointmentsDueDateOffsetOrgValue","http://www.w3.org/2001/XMLSchema","int",0,1,true), ServiceAppointmentsDueDateOffsetOrgValue, ServiceAppointmentsDueDateOffsetOrgValue__is_set);
    }

    /**
     * element : WorkOrderLineItemSearchFields of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean WorkOrderLineItemSearchFields__is_set = false;

    private java.lang.String WorkOrderLineItemSearchFields;

    public java.lang.String getWorkOrderLineItemSearchFields() {
      return WorkOrderLineItemSearchFields;
    }

    public void setWorkOrderLineItemSearchFields(java.lang.String WorkOrderLineItemSearchFields) {
      this.WorkOrderLineItemSearchFields = WorkOrderLineItemSearchFields;
      WorkOrderLineItemSearchFields__is_set = true;
    }

    protected void setWorkOrderLineItemSearchFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("WorkOrderLineItemSearchFields", "urn:sobject.tooling.soap.sforce.com","WorkOrderLineItemSearchFields","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setWorkOrderLineItemSearchFields(__typeMapper.readString(__in, _lookupTypeInfo("WorkOrderLineItemSearchFields", "urn:sobject.tooling.soap.sforce.com","WorkOrderLineItemSearchFields","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldWorkOrderLineItemSearchFields(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("WorkOrderLineItemSearchFields", "urn:sobject.tooling.soap.sforce.com","WorkOrderLineItemSearchFields","http://www.w3.org/2001/XMLSchema","string",0,1,true), WorkOrderLineItemSearchFields, WorkOrderLineItemSearchFields__is_set);
    }

    /**
     * element : WorkOrderSearchFields of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean WorkOrderSearchFields__is_set = false;

    private java.lang.String WorkOrderSearchFields;

    public java.lang.String getWorkOrderSearchFields() {
      return WorkOrderSearchFields;
    }

    public void setWorkOrderSearchFields(java.lang.String WorkOrderSearchFields) {
      this.WorkOrderSearchFields = WorkOrderSearchFields;
      WorkOrderSearchFields__is_set = true;
    }

    protected void setWorkOrderSearchFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("WorkOrderSearchFields", "urn:sobject.tooling.soap.sforce.com","WorkOrderSearchFields","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setWorkOrderSearchFields(__typeMapper.readString(__in, _lookupTypeInfo("WorkOrderSearchFields", "urn:sobject.tooling.soap.sforce.com","WorkOrderSearchFields","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldWorkOrderSearchFields(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("WorkOrderSearchFields", "urn:sobject.tooling.soap.sforce.com","WorkOrderSearchFields","http://www.w3.org/2001/XMLSchema","string",0,1,true), WorkOrderSearchFields, WorkOrderSearchFields__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.tooling.soap.sforce.com", "FieldServiceSettings");
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
      writeFieldCapacityUsageCalcClassIdentifier(__out, __typeMapper);
      writeFieldDoesAllowEditSaForCrew(__out, __typeMapper);
      writeFieldDoesShareSaParentWoWithAr(__out, __typeMapper);
      writeFieldDoesShareSaWithAr(__out, __typeMapper);
      writeFieldDurableId(__out, __typeMapper);
      writeFieldFieldServiceNotificationsOrgPref(__out, __typeMapper);
      writeFieldFieldServiceOrgPref(__out, __typeMapper);
      writeFieldFullName(__out, __typeMapper);
      writeFieldMetadata(__out, __typeMapper);
      writeFieldServiceAppointmentsDueDateOffsetOrgValue(__out, __typeMapper);
      writeFieldWorkOrderLineItemSearchFields(__out, __typeMapper);
      writeFieldWorkOrderSearchFields(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCapacityUsageCalcClassIdentifier(__in, __typeMapper);
      setDoesAllowEditSaForCrew(__in, __typeMapper);
      setDoesShareSaParentWoWithAr(__in, __typeMapper);
      setDoesShareSaWithAr(__in, __typeMapper);
      setDurableId(__in, __typeMapper);
      setFieldServiceNotificationsOrgPref(__in, __typeMapper);
      setFieldServiceOrgPref(__in, __typeMapper);
      setFullName(__in, __typeMapper);
      setMetadata(__in, __typeMapper);
      setServiceAppointmentsDueDateOffsetOrgValue(__in, __typeMapper);
      setWorkOrderLineItemSearchFields(__in, __typeMapper);
      setWorkOrderSearchFields(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "CapacityUsageCalcClassIdentifier", CapacityUsageCalcClassIdentifier);
      toStringHelper(sb, "DoesAllowEditSaForCrew", DoesAllowEditSaForCrew);
      toStringHelper(sb, "DoesShareSaParentWoWithAr", DoesShareSaParentWoWithAr);
      toStringHelper(sb, "DoesShareSaWithAr", DoesShareSaWithAr);
      toStringHelper(sb, "DurableId", DurableId);
      toStringHelper(sb, "FieldServiceNotificationsOrgPref", FieldServiceNotificationsOrgPref);
      toStringHelper(sb, "FieldServiceOrgPref", FieldServiceOrgPref);
      toStringHelper(sb, "FullName", FullName);
      toStringHelper(sb, "Metadata", Metadata);
      toStringHelper(sb, "ServiceAppointmentsDueDateOffsetOrgValue", ServiceAppointmentsDueDateOffsetOrgValue);
      toStringHelper(sb, "WorkOrderLineItemSearchFields", WorkOrderLineItemSearchFields);
      toStringHelper(sb, "WorkOrderSearchFields", WorkOrderSearchFields);
    }


}
