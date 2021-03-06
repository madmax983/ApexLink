package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class FormSection extends com.sforce.soap.tooling.metadata.Metadata {

    /**
     * Constructor
     */
    public FormSection() {}

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
     * element : columns of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private boolean columns__is_set = false;

    private int columns;

    public int getColumns() {
      return columns;
    }

    public void setColumns(int columns) {
      this.columns = columns;
      columns__is_set = true;
    }

    protected void setColumns(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("columns", "urn:metadata.tooling.soap.sforce.com","columns","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setColumns((int)__typeMapper.readInt(__in, _lookupTypeInfo("columns", "urn:metadata.tooling.soap.sforce.com","columns","http://www.w3.org/2001/XMLSchema","int",0,1,true), int.class));
      }
    }

    private void writeFieldColumns(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("columns", "urn:metadata.tooling.soap.sforce.com","columns","http://www.w3.org/2001/XMLSchema","int",0,1,true), columns, columns__is_set);
    }

    /**
     * element : formColumns of type {urn:metadata.tooling.soap.sforce.com}FormColumn
     * java type: com.sforce.soap.tooling.metadata.FormColumn[]
     */
    private boolean formColumns__is_set = false;

    private com.sforce.soap.tooling.metadata.FormColumn[] formColumns = new com.sforce.soap.tooling.metadata.FormColumn[0];

    public com.sforce.soap.tooling.metadata.FormColumn[] getFormColumns() {
      return formColumns;
    }

    public void setFormColumns(com.sforce.soap.tooling.metadata.FormColumn[] formColumns) {
      this.formColumns = formColumns;
      formColumns__is_set = true;
    }

    protected void setFormColumns(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("formColumns", "urn:metadata.tooling.soap.sforce.com","formColumns","urn:metadata.tooling.soap.sforce.com","FormColumn",0,-1,true))) {
        setFormColumns((com.sforce.soap.tooling.metadata.FormColumn[])__typeMapper.readObject(__in, _lookupTypeInfo("formColumns", "urn:metadata.tooling.soap.sforce.com","formColumns","urn:metadata.tooling.soap.sforce.com","FormColumn",0,-1,true), com.sforce.soap.tooling.metadata.FormColumn[].class));
      }
    }

    private void writeFieldFormColumns(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("formColumns", "urn:metadata.tooling.soap.sforce.com","formColumns","urn:metadata.tooling.soap.sforce.com","FormColumn",0,-1,true), formColumns, formColumns__is_set);
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
     * element : order of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private boolean order__is_set = false;

    private int order;

    public int getOrder() {
      return order;
    }

    public void setOrder(int order) {
      this.order = order;
      order__is_set = true;
    }

    protected void setOrder(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("order", "urn:metadata.tooling.soap.sforce.com","order","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setOrder((int)__typeMapper.readInt(__in, _lookupTypeInfo("order", "urn:metadata.tooling.soap.sforce.com","order","http://www.w3.org/2001/XMLSchema","int",0,1,true), int.class));
      }
    }

    private void writeFieldOrder(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("order", "urn:metadata.tooling.soap.sforce.com","order","http://www.w3.org/2001/XMLSchema","int",0,1,true), order, order__is_set);
    }

    /**
     * element : tabOrderType of type {urn:tooling.soap.sforce.com}FormSectionTabOrder
     * java type: com.sforce.soap.tooling.FormSectionTabOrder
     */
    private boolean tabOrderType__is_set = false;

    private com.sforce.soap.tooling.FormSectionTabOrder tabOrderType;

    public com.sforce.soap.tooling.FormSectionTabOrder getTabOrderType() {
      return tabOrderType;
    }

    public void setTabOrderType(com.sforce.soap.tooling.FormSectionTabOrder tabOrderType) {
      this.tabOrderType = tabOrderType;
      tabOrderType__is_set = true;
    }

    protected void setTabOrderType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("tabOrderType", "urn:metadata.tooling.soap.sforce.com","tabOrderType","urn:tooling.soap.sforce.com","FormSectionTabOrder",1,1,true))) {
        setTabOrderType((com.sforce.soap.tooling.FormSectionTabOrder)__typeMapper.readObject(__in, _lookupTypeInfo("tabOrderType", "urn:metadata.tooling.soap.sforce.com","tabOrderType","urn:tooling.soap.sforce.com","FormSectionTabOrder",1,1,true), com.sforce.soap.tooling.FormSectionTabOrder.class));
      }
    }

    private void writeFieldTabOrderType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("tabOrderType", "urn:metadata.tooling.soap.sforce.com","tabOrderType","urn:tooling.soap.sforce.com","FormSectionTabOrder",1,1,true), tabOrderType, tabOrderType__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:metadata.tooling.soap.sforce.com", "FormSection");
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
      sb.append("[FormSection ");
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
      writeFieldColumns(__out, __typeMapper);
      writeFieldFormColumns(__out, __typeMapper);
      writeFieldMasterLabel(__out, __typeMapper);
      writeFieldOrder(__out, __typeMapper);
      writeFieldTabOrderType(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setColumns(__in, __typeMapper);
      setFormColumns(__in, __typeMapper);
      setMasterLabel(__in, __typeMapper);
      setOrder(__in, __typeMapper);
      setTabOrderType(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "columns", columns);
      toStringHelper(sb, "formColumns", formColumns);
      toStringHelper(sb, "masterLabel", masterLabel);
      toStringHelper(sb, "order", order);
      toStringHelper(sb, "tabOrderType", tabOrderType);
    }


}
