package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class RecordType extends com.sforce.soap.tooling.metadata.Metadata {

    /**
     * Constructor
     */
    public RecordType() {}

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
     * element : active of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean active__is_set = false;

    private boolean active;

    public boolean getActive() {
      return active;
    }

    public boolean isActive() {
      return active;
    }

    public void setActive(boolean active) {
      this.active = active;
      active__is_set = true;
    }

    protected void setActive(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("active", "urn:metadata.tooling.soap.sforce.com","active","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setActive(__typeMapper.readBoolean(__in, _lookupTypeInfo("active", "urn:metadata.tooling.soap.sforce.com","active","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldActive(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("active", "urn:metadata.tooling.soap.sforce.com","active","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), active, active__is_set);
    }

    /**
     * element : businessProcess of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean businessProcess__is_set = false;

    private java.lang.String businessProcess;

    public java.lang.String getBusinessProcess() {
      return businessProcess;
    }

    public void setBusinessProcess(java.lang.String businessProcess) {
      this.businessProcess = businessProcess;
      businessProcess__is_set = true;
    }

    protected void setBusinessProcess(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("businessProcess", "urn:metadata.tooling.soap.sforce.com","businessProcess","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setBusinessProcess(__typeMapper.readString(__in, _lookupTypeInfo("businessProcess", "urn:metadata.tooling.soap.sforce.com","businessProcess","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldBusinessProcess(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("businessProcess", "urn:metadata.tooling.soap.sforce.com","businessProcess","http://www.w3.org/2001/XMLSchema","string",0,1,true), businessProcess, businessProcess__is_set);
    }

    /**
     * element : compactLayoutAssignment of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean compactLayoutAssignment__is_set = false;

    private java.lang.String compactLayoutAssignment;

    public java.lang.String getCompactLayoutAssignment() {
      return compactLayoutAssignment;
    }

    public void setCompactLayoutAssignment(java.lang.String compactLayoutAssignment) {
      this.compactLayoutAssignment = compactLayoutAssignment;
      compactLayoutAssignment__is_set = true;
    }

    protected void setCompactLayoutAssignment(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("compactLayoutAssignment", "urn:metadata.tooling.soap.sforce.com","compactLayoutAssignment","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setCompactLayoutAssignment(__typeMapper.readString(__in, _lookupTypeInfo("compactLayoutAssignment", "urn:metadata.tooling.soap.sforce.com","compactLayoutAssignment","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCompactLayoutAssignment(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("compactLayoutAssignment", "urn:metadata.tooling.soap.sforce.com","compactLayoutAssignment","http://www.w3.org/2001/XMLSchema","string",0,1,true), compactLayoutAssignment, compactLayoutAssignment__is_set);
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
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("label", "urn:metadata.tooling.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setLabel(__typeMapper.readString(__in, _lookupTypeInfo("label", "urn:metadata.tooling.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLabel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("label", "urn:metadata.tooling.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true), label, label__is_set);
    }

    /**
     * element : picklistValues of type {urn:metadata.tooling.soap.sforce.com}RecordTypePicklistValue
     * java type: com.sforce.soap.tooling.metadata.RecordTypePicklistValue[]
     */
    private boolean picklistValues__is_set = false;

    private com.sforce.soap.tooling.metadata.RecordTypePicklistValue[] picklistValues = new com.sforce.soap.tooling.metadata.RecordTypePicklistValue[0];

    public com.sforce.soap.tooling.metadata.RecordTypePicklistValue[] getPicklistValues() {
      return picklistValues;
    }

    public void setPicklistValues(com.sforce.soap.tooling.metadata.RecordTypePicklistValue[] picklistValues) {
      this.picklistValues = picklistValues;
      picklistValues__is_set = true;
    }

    protected void setPicklistValues(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("picklistValues", "urn:metadata.tooling.soap.sforce.com","picklistValues","urn:metadata.tooling.soap.sforce.com","RecordTypePicklistValue",0,-1,true))) {
        setPicklistValues((com.sforce.soap.tooling.metadata.RecordTypePicklistValue[])__typeMapper.readObject(__in, _lookupTypeInfo("picklistValues", "urn:metadata.tooling.soap.sforce.com","picklistValues","urn:metadata.tooling.soap.sforce.com","RecordTypePicklistValue",0,-1,true), com.sforce.soap.tooling.metadata.RecordTypePicklistValue[].class));
      }
    }

    private void writeFieldPicklistValues(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("picklistValues", "urn:metadata.tooling.soap.sforce.com","picklistValues","urn:metadata.tooling.soap.sforce.com","RecordTypePicklistValue",0,-1,true), picklistValues, picklistValues__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:metadata.tooling.soap.sforce.com", "RecordType");
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
      sb.append("[RecordType ");
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
      writeFieldActive(__out, __typeMapper);
      writeFieldBusinessProcess(__out, __typeMapper);
      writeFieldCompactLayoutAssignment(__out, __typeMapper);
      writeFieldDescription(__out, __typeMapper);
      writeFieldLabel(__out, __typeMapper);
      writeFieldPicklistValues(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setActive(__in, __typeMapper);
      setBusinessProcess(__in, __typeMapper);
      setCompactLayoutAssignment(__in, __typeMapper);
      setDescription(__in, __typeMapper);
      setLabel(__in, __typeMapper);
      setPicklistValues(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "active", active);
      toStringHelper(sb, "businessProcess", businessProcess);
      toStringHelper(sb, "compactLayoutAssignment", compactLayoutAssignment);
      toStringHelper(sb, "description", description);
      toStringHelper(sb, "label", label);
      toStringHelper(sb, "picklistValues", picklistValues);
    }


}
