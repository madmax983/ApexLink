package com.sforce.soap.tooling;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class FieldLayoutComponent extends com.sforce.soap.tooling.FieldComponent {

    /**
     * Constructor
     */
    public FieldLayoutComponent() {}

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
     * element : components of type {urn:tooling.soap.sforce.com}DescribeLayoutComponent
     * java type: com.sforce.soap.tooling.DescribeLayoutComponent[]
     */
    private boolean components__is_set = false;

    private com.sforce.soap.tooling.DescribeLayoutComponent[] components = new com.sforce.soap.tooling.DescribeLayoutComponent[0];

    public com.sforce.soap.tooling.DescribeLayoutComponent[] getComponents() {
      return components;
    }

    public void setComponents(com.sforce.soap.tooling.DescribeLayoutComponent[] components) {
      this.components = components;
      components__is_set = true;
    }

    protected void setComponents(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("components", "urn:tooling.soap.sforce.com","components","urn:tooling.soap.sforce.com","DescribeLayoutComponent",0,-1,true))) {
        setComponents((com.sforce.soap.tooling.DescribeLayoutComponent[])__typeMapper.readObject(__in, _lookupTypeInfo("components", "urn:tooling.soap.sforce.com","components","urn:tooling.soap.sforce.com","DescribeLayoutComponent",0,-1,true), com.sforce.soap.tooling.DescribeLayoutComponent[].class));
      }
    }

    private void writeFieldComponents(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("components", "urn:tooling.soap.sforce.com","components","urn:tooling.soap.sforce.com","DescribeLayoutComponent",0,-1,true), components, components__is_set);
    }

    /**
     * element : fieldType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean fieldType__is_set = false;

    private java.lang.String fieldType;

    public java.lang.String getFieldType() {
      return fieldType;
    }

    public void setFieldType(java.lang.String fieldType) {
      this.fieldType = fieldType;
      fieldType__is_set = true;
    }

    protected void setFieldType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("fieldType", "urn:tooling.soap.sforce.com","fieldType","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setFieldType(__typeMapper.readString(__in, _lookupTypeInfo("fieldType", "urn:tooling.soap.sforce.com","fieldType","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFieldType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("fieldType", "urn:tooling.soap.sforce.com","fieldType","http://www.w3.org/2001/XMLSchema","string",1,1,true), fieldType, fieldType__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:tooling.soap.sforce.com", "FieldLayoutComponent");
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
      sb.append("[FieldLayoutComponent ");
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
      writeFieldComponents(__out, __typeMapper);
      writeFieldFieldType(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setComponents(__in, __typeMapper);
      setFieldType(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "components", components);
      toStringHelper(sb, "fieldType", fieldType);
    }


}
