package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class WeightedSourceCategory implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public WeightedSourceCategory() {}

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
     * element : sourceCategoryApiName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean sourceCategoryApiName__is_set = false;

    private java.lang.String sourceCategoryApiName;

    public java.lang.String getSourceCategoryApiName() {
      return sourceCategoryApiName;
    }

    public void setSourceCategoryApiName(java.lang.String sourceCategoryApiName) {
      this.sourceCategoryApiName = sourceCategoryApiName;
      sourceCategoryApiName__is_set = true;
    }

    protected void setSourceCategoryApiName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("sourceCategoryApiName", "urn:metadata.tooling.soap.sforce.com","sourceCategoryApiName","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setSourceCategoryApiName(__typeMapper.readString(__in, _lookupTypeInfo("sourceCategoryApiName", "urn:metadata.tooling.soap.sforce.com","sourceCategoryApiName","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSourceCategoryApiName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("sourceCategoryApiName", "urn:metadata.tooling.soap.sforce.com","sourceCategoryApiName","http://www.w3.org/2001/XMLSchema","string",1,1,true), sourceCategoryApiName, sourceCategoryApiName__is_set);
    }

    /**
     * element : weight of type {http://www.w3.org/2001/XMLSchema}double
     * java type: double
     */
    private boolean weight__is_set = false;

    private double weight;

    public double getWeight() {
      return weight;
    }

    public void setWeight(double weight) {
      this.weight = weight;
      weight__is_set = true;
    }

    protected void setWeight(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("weight", "urn:metadata.tooling.soap.sforce.com","weight","http://www.w3.org/2001/XMLSchema","double",1,1,true))) {
        setWeight((double)__typeMapper.readDouble(__in, _lookupTypeInfo("weight", "urn:metadata.tooling.soap.sforce.com","weight","http://www.w3.org/2001/XMLSchema","double",1,1,true), double.class));
      }
    }

    private void writeFieldWeight(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("weight", "urn:metadata.tooling.soap.sforce.com","weight","http://www.w3.org/2001/XMLSchema","double",1,1,true), weight, weight__is_set);
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
      sb.append("[WeightedSourceCategory ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldSourceCategoryApiName(__out, __typeMapper);
      writeFieldWeight(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setSourceCategoryApiName(__in, __typeMapper);
      setWeight(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "sourceCategoryApiName", sourceCategoryApiName);
      toStringHelper(sb, "weight", weight);
    }


}
