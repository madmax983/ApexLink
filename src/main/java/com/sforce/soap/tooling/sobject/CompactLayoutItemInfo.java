package com.sforce.soap.tooling.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class CompactLayoutItemInfo extends com.sforce.soap.tooling.sobject.SObject {

    /**
     * Constructor
     */
    public CompactLayoutItemInfo() {}

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
     * element : CompactLayoutInfo of type {urn:sobject.tooling.soap.sforce.com}CompactLayoutInfo
     * java type: com.sforce.soap.tooling.sobject.CompactLayoutInfo
     */
    private boolean CompactLayoutInfo__is_set = false;

    private com.sforce.soap.tooling.sobject.CompactLayoutInfo CompactLayoutInfo;

    public com.sforce.soap.tooling.sobject.CompactLayoutInfo getCompactLayoutInfo() {
      return CompactLayoutInfo;
    }

    public void setCompactLayoutInfo(com.sforce.soap.tooling.sobject.CompactLayoutInfo CompactLayoutInfo) {
      this.CompactLayoutInfo = CompactLayoutInfo;
      CompactLayoutInfo__is_set = true;
    }

    protected void setCompactLayoutInfo(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CompactLayoutInfo", "urn:sobject.tooling.soap.sforce.com","CompactLayoutInfo","urn:sobject.tooling.soap.sforce.com","CompactLayoutInfo",0,1,true))) {
        setCompactLayoutInfo((com.sforce.soap.tooling.sobject.CompactLayoutInfo)__typeMapper.readObject(__in, _lookupTypeInfo("CompactLayoutInfo", "urn:sobject.tooling.soap.sforce.com","CompactLayoutInfo","urn:sobject.tooling.soap.sforce.com","CompactLayoutInfo",0,1,true), com.sforce.soap.tooling.sobject.CompactLayoutInfo.class));
      }
    }

    private void writeFieldCompactLayoutInfo(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CompactLayoutInfo", "urn:sobject.tooling.soap.sforce.com","CompactLayoutInfo","urn:sobject.tooling.soap.sforce.com","CompactLayoutInfo",0,1,true), CompactLayoutInfo, CompactLayoutInfo__is_set);
    }

    /**
     * element : CompactLayoutInfoId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean CompactLayoutInfoId__is_set = false;

    private java.lang.String CompactLayoutInfoId;

    public java.lang.String getCompactLayoutInfoId() {
      return CompactLayoutInfoId;
    }

    public void setCompactLayoutInfoId(java.lang.String CompactLayoutInfoId) {
      this.CompactLayoutInfoId = CompactLayoutInfoId;
      CompactLayoutInfoId__is_set = true;
    }

    protected void setCompactLayoutInfoId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CompactLayoutInfoId", "urn:sobject.tooling.soap.sforce.com","CompactLayoutInfoId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setCompactLayoutInfoId(__typeMapper.readString(__in, _lookupTypeInfo("CompactLayoutInfoId", "urn:sobject.tooling.soap.sforce.com","CompactLayoutInfoId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCompactLayoutInfoId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CompactLayoutInfoId", "urn:sobject.tooling.soap.sforce.com","CompactLayoutInfoId","http://www.w3.org/2001/XMLSchema","string",0,1,true), CompactLayoutInfoId, CompactLayoutInfoId__is_set);
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
     * element : FieldDefinition of type {urn:sobject.tooling.soap.sforce.com}FieldDefinition
     * java type: com.sforce.soap.tooling.sobject.FieldDefinition
     */
    private boolean FieldDefinition__is_set = false;

    private com.sforce.soap.tooling.sobject.FieldDefinition FieldDefinition;

    public com.sforce.soap.tooling.sobject.FieldDefinition getFieldDefinition() {
      return FieldDefinition;
    }

    public void setFieldDefinition(com.sforce.soap.tooling.sobject.FieldDefinition FieldDefinition) {
      this.FieldDefinition = FieldDefinition;
      FieldDefinition__is_set = true;
    }

    protected void setFieldDefinition(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("FieldDefinition", "urn:sobject.tooling.soap.sforce.com","FieldDefinition","urn:sobject.tooling.soap.sforce.com","FieldDefinition",0,1,true))) {
        setFieldDefinition((com.sforce.soap.tooling.sobject.FieldDefinition)__typeMapper.readObject(__in, _lookupTypeInfo("FieldDefinition", "urn:sobject.tooling.soap.sforce.com","FieldDefinition","urn:sobject.tooling.soap.sforce.com","FieldDefinition",0,1,true), com.sforce.soap.tooling.sobject.FieldDefinition.class));
      }
    }

    private void writeFieldFieldDefinition(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("FieldDefinition", "urn:sobject.tooling.soap.sforce.com","FieldDefinition","urn:sobject.tooling.soap.sforce.com","FieldDefinition",0,1,true), FieldDefinition, FieldDefinition__is_set);
    }

    /**
     * element : FieldDefinitionId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean FieldDefinitionId__is_set = false;

    private java.lang.String FieldDefinitionId;

    public java.lang.String getFieldDefinitionId() {
      return FieldDefinitionId;
    }

    public void setFieldDefinitionId(java.lang.String FieldDefinitionId) {
      this.FieldDefinitionId = FieldDefinitionId;
      FieldDefinitionId__is_set = true;
    }

    protected void setFieldDefinitionId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("FieldDefinitionId", "urn:sobject.tooling.soap.sforce.com","FieldDefinitionId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setFieldDefinitionId(__typeMapper.readString(__in, _lookupTypeInfo("FieldDefinitionId", "urn:sobject.tooling.soap.sforce.com","FieldDefinitionId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFieldDefinitionId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("FieldDefinitionId", "urn:sobject.tooling.soap.sforce.com","FieldDefinitionId","http://www.w3.org/2001/XMLSchema","string",0,1,true), FieldDefinitionId, FieldDefinitionId__is_set);
    }

    /**
     * element : SortOrder of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean SortOrder__is_set = false;

    private java.lang.Integer SortOrder;

    public java.lang.Integer getSortOrder() {
      return SortOrder;
    }

    public void setSortOrder(java.lang.Integer SortOrder) {
      this.SortOrder = SortOrder;
      SortOrder__is_set = true;
    }

    protected void setSortOrder(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SortOrder", "urn:sobject.tooling.soap.sforce.com","SortOrder","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setSortOrder((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("SortOrder", "urn:sobject.tooling.soap.sforce.com","SortOrder","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldSortOrder(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SortOrder", "urn:sobject.tooling.soap.sforce.com","SortOrder","http://www.w3.org/2001/XMLSchema","int",0,1,true), SortOrder, SortOrder__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.tooling.soap.sforce.com", "CompactLayoutItemInfo");
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
      sb.append("[CompactLayoutItemInfo ");
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
      writeFieldCompactLayoutInfo(__out, __typeMapper);
      writeFieldCompactLayoutInfoId(__out, __typeMapper);
      writeFieldDurableId(__out, __typeMapper);
      writeFieldFieldDefinition(__out, __typeMapper);
      writeFieldFieldDefinitionId(__out, __typeMapper);
      writeFieldSortOrder(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCompactLayoutInfo(__in, __typeMapper);
      setCompactLayoutInfoId(__in, __typeMapper);
      setDurableId(__in, __typeMapper);
      setFieldDefinition(__in, __typeMapper);
      setFieldDefinitionId(__in, __typeMapper);
      setSortOrder(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "CompactLayoutInfo", CompactLayoutInfo);
      toStringHelper(sb, "CompactLayoutInfoId", CompactLayoutInfoId);
      toStringHelper(sb, "DurableId", DurableId);
      toStringHelper(sb, "FieldDefinition", FieldDefinition);
      toStringHelper(sb, "FieldDefinitionId", FieldDefinitionId);
      toStringHelper(sb, "SortOrder", SortOrder);
    }


}
