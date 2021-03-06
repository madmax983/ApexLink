package com.sforce.soap.tooling;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class ChildRelationship implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public ChildRelationship() {}

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
     * element : cascadeDelete of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean cascadeDelete__is_set = false;

    private boolean cascadeDelete;

    public boolean getCascadeDelete() {
      return cascadeDelete;
    }

    public boolean isCascadeDelete() {
      return cascadeDelete;
    }

    public void setCascadeDelete(boolean cascadeDelete) {
      this.cascadeDelete = cascadeDelete;
      cascadeDelete__is_set = true;
    }

    protected void setCascadeDelete(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("cascadeDelete", "urn:tooling.soap.sforce.com","cascadeDelete","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setCascadeDelete(__typeMapper.readBoolean(__in, _lookupTypeInfo("cascadeDelete", "urn:tooling.soap.sforce.com","cascadeDelete","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldCascadeDelete(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("cascadeDelete", "urn:tooling.soap.sforce.com","cascadeDelete","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), cascadeDelete, cascadeDelete__is_set);
    }

    /**
     * element : childSObject of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean childSObject__is_set = false;

    private java.lang.String childSObject;

    public java.lang.String getChildSObject() {
      return childSObject;
    }

    public void setChildSObject(java.lang.String childSObject) {
      this.childSObject = childSObject;
      childSObject__is_set = true;
    }

    protected void setChildSObject(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("childSObject", "urn:tooling.soap.sforce.com","childSObject","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setChildSObject(__typeMapper.readString(__in, _lookupTypeInfo("childSObject", "urn:tooling.soap.sforce.com","childSObject","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldChildSObject(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("childSObject", "urn:tooling.soap.sforce.com","childSObject","http://www.w3.org/2001/XMLSchema","string",1,1,true), childSObject, childSObject__is_set);
    }

    /**
     * element : deprecatedAndHidden of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean deprecatedAndHidden__is_set = false;

    private boolean deprecatedAndHidden;

    public boolean getDeprecatedAndHidden() {
      return deprecatedAndHidden;
    }

    public boolean isDeprecatedAndHidden() {
      return deprecatedAndHidden;
    }

    public void setDeprecatedAndHidden(boolean deprecatedAndHidden) {
      this.deprecatedAndHidden = deprecatedAndHidden;
      deprecatedAndHidden__is_set = true;
    }

    protected void setDeprecatedAndHidden(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("deprecatedAndHidden", "urn:tooling.soap.sforce.com","deprecatedAndHidden","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setDeprecatedAndHidden(__typeMapper.readBoolean(__in, _lookupTypeInfo("deprecatedAndHidden", "urn:tooling.soap.sforce.com","deprecatedAndHidden","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldDeprecatedAndHidden(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("deprecatedAndHidden", "urn:tooling.soap.sforce.com","deprecatedAndHidden","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), deprecatedAndHidden, deprecatedAndHidden__is_set);
    }

    /**
     * element : field of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean field__is_set = false;

    private java.lang.String field;

    public java.lang.String getField() {
      return field;
    }

    public void setField(java.lang.String field) {
      this.field = field;
      field__is_set = true;
    }

    protected void setField(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("field", "urn:tooling.soap.sforce.com","field","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setField(__typeMapper.readString(__in, _lookupTypeInfo("field", "urn:tooling.soap.sforce.com","field","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldField(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("field", "urn:tooling.soap.sforce.com","field","http://www.w3.org/2001/XMLSchema","string",1,1,true), field, field__is_set);
    }

    /**
     * element : junctionIdListNames of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String[]
     */
    private boolean junctionIdListNames__is_set = false;

    private java.lang.String[] junctionIdListNames = new java.lang.String[0];

    public java.lang.String[] getJunctionIdListNames() {
      return junctionIdListNames;
    }

    public void setJunctionIdListNames(java.lang.String[] junctionIdListNames) {
      this.junctionIdListNames = junctionIdListNames;
      junctionIdListNames__is_set = true;
    }

    protected void setJunctionIdListNames(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("junctionIdListNames", "urn:tooling.soap.sforce.com","junctionIdListNames","http://www.w3.org/2001/XMLSchema","string",0,-1,true))) {
        setJunctionIdListNames((java.lang.String[])__typeMapper.readObject(__in, _lookupTypeInfo("junctionIdListNames", "urn:tooling.soap.sforce.com","junctionIdListNames","http://www.w3.org/2001/XMLSchema","string",0,-1,true), java.lang.String[].class));
      }
    }

    private void writeFieldJunctionIdListNames(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("junctionIdListNames", "urn:tooling.soap.sforce.com","junctionIdListNames","http://www.w3.org/2001/XMLSchema","string",0,-1,true), junctionIdListNames, junctionIdListNames__is_set);
    }

    /**
     * element : junctionReferenceTo of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String[]
     */
    private boolean junctionReferenceTo__is_set = false;

    private java.lang.String[] junctionReferenceTo = new java.lang.String[0];

    public java.lang.String[] getJunctionReferenceTo() {
      return junctionReferenceTo;
    }

    public void setJunctionReferenceTo(java.lang.String[] junctionReferenceTo) {
      this.junctionReferenceTo = junctionReferenceTo;
      junctionReferenceTo__is_set = true;
    }

    protected void setJunctionReferenceTo(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("junctionReferenceTo", "urn:tooling.soap.sforce.com","junctionReferenceTo","http://www.w3.org/2001/XMLSchema","string",0,-1,true))) {
        setJunctionReferenceTo((java.lang.String[])__typeMapper.readObject(__in, _lookupTypeInfo("junctionReferenceTo", "urn:tooling.soap.sforce.com","junctionReferenceTo","http://www.w3.org/2001/XMLSchema","string",0,-1,true), java.lang.String[].class));
      }
    }

    private void writeFieldJunctionReferenceTo(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("junctionReferenceTo", "urn:tooling.soap.sforce.com","junctionReferenceTo","http://www.w3.org/2001/XMLSchema","string",0,-1,true), junctionReferenceTo, junctionReferenceTo__is_set);
    }

    /**
     * element : relationshipName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean relationshipName__is_set = false;

    private java.lang.String relationshipName;

    public java.lang.String getRelationshipName() {
      return relationshipName;
    }

    public void setRelationshipName(java.lang.String relationshipName) {
      this.relationshipName = relationshipName;
      relationshipName__is_set = true;
    }

    protected void setRelationshipName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("relationshipName", "urn:tooling.soap.sforce.com","relationshipName","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setRelationshipName(__typeMapper.readString(__in, _lookupTypeInfo("relationshipName", "urn:tooling.soap.sforce.com","relationshipName","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldRelationshipName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("relationshipName", "urn:tooling.soap.sforce.com","relationshipName","http://www.w3.org/2001/XMLSchema","string",0,1,true), relationshipName, relationshipName__is_set);
    }

    /**
     * element : restrictedDelete of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean restrictedDelete__is_set = false;

    private boolean restrictedDelete;

    public boolean getRestrictedDelete() {
      return restrictedDelete;
    }

    public boolean isRestrictedDelete() {
      return restrictedDelete;
    }

    public void setRestrictedDelete(boolean restrictedDelete) {
      this.restrictedDelete = restrictedDelete;
      restrictedDelete__is_set = true;
    }

    protected void setRestrictedDelete(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("restrictedDelete", "urn:tooling.soap.sforce.com","restrictedDelete","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setRestrictedDelete(__typeMapper.readBoolean(__in, _lookupTypeInfo("restrictedDelete", "urn:tooling.soap.sforce.com","restrictedDelete","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldRestrictedDelete(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("restrictedDelete", "urn:tooling.soap.sforce.com","restrictedDelete","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), restrictedDelete, restrictedDelete__is_set);
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
      sb.append("[ChildRelationship ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldCascadeDelete(__out, __typeMapper);
      writeFieldChildSObject(__out, __typeMapper);
      writeFieldDeprecatedAndHidden(__out, __typeMapper);
      writeFieldField(__out, __typeMapper);
      writeFieldJunctionIdListNames(__out, __typeMapper);
      writeFieldJunctionReferenceTo(__out, __typeMapper);
      writeFieldRelationshipName(__out, __typeMapper);
      writeFieldRestrictedDelete(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCascadeDelete(__in, __typeMapper);
      setChildSObject(__in, __typeMapper);
      setDeprecatedAndHidden(__in, __typeMapper);
      setField(__in, __typeMapper);
      setJunctionIdListNames(__in, __typeMapper);
      setJunctionReferenceTo(__in, __typeMapper);
      setRelationshipName(__in, __typeMapper);
      setRestrictedDelete(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "cascadeDelete", cascadeDelete);
      toStringHelper(sb, "childSObject", childSObject);
      toStringHelper(sb, "deprecatedAndHidden", deprecatedAndHidden);
      toStringHelper(sb, "field", field);
      toStringHelper(sb, "junctionIdListNames", junctionIdListNames);
      toStringHelper(sb, "junctionReferenceTo", junctionReferenceTo);
      toStringHelper(sb, "relationshipName", relationshipName);
      toStringHelper(sb, "restrictedDelete", restrictedDelete);
    }


}
