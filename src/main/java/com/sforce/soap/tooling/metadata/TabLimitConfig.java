package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class TabLimitConfig implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public TabLimitConfig() {}

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
     * element : maxNumberOfPrimaryTabs of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean maxNumberOfPrimaryTabs__is_set = false;

    private java.lang.String maxNumberOfPrimaryTabs;

    public java.lang.String getMaxNumberOfPrimaryTabs() {
      return maxNumberOfPrimaryTabs;
    }

    public void setMaxNumberOfPrimaryTabs(java.lang.String maxNumberOfPrimaryTabs) {
      this.maxNumberOfPrimaryTabs = maxNumberOfPrimaryTabs;
      maxNumberOfPrimaryTabs__is_set = true;
    }

    protected void setMaxNumberOfPrimaryTabs(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("maxNumberOfPrimaryTabs", "urn:metadata.tooling.soap.sforce.com","maxNumberOfPrimaryTabs","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setMaxNumberOfPrimaryTabs(__typeMapper.readString(__in, _lookupTypeInfo("maxNumberOfPrimaryTabs", "urn:metadata.tooling.soap.sforce.com","maxNumberOfPrimaryTabs","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldMaxNumberOfPrimaryTabs(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("maxNumberOfPrimaryTabs", "urn:metadata.tooling.soap.sforce.com","maxNumberOfPrimaryTabs","http://www.w3.org/2001/XMLSchema","string",0,1,true), maxNumberOfPrimaryTabs, maxNumberOfPrimaryTabs__is_set);
    }

    /**
     * element : maxNumberOfSubTabs of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean maxNumberOfSubTabs__is_set = false;

    private java.lang.String maxNumberOfSubTabs;

    public java.lang.String getMaxNumberOfSubTabs() {
      return maxNumberOfSubTabs;
    }

    public void setMaxNumberOfSubTabs(java.lang.String maxNumberOfSubTabs) {
      this.maxNumberOfSubTabs = maxNumberOfSubTabs;
      maxNumberOfSubTabs__is_set = true;
    }

    protected void setMaxNumberOfSubTabs(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("maxNumberOfSubTabs", "urn:metadata.tooling.soap.sforce.com","maxNumberOfSubTabs","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setMaxNumberOfSubTabs(__typeMapper.readString(__in, _lookupTypeInfo("maxNumberOfSubTabs", "urn:metadata.tooling.soap.sforce.com","maxNumberOfSubTabs","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldMaxNumberOfSubTabs(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("maxNumberOfSubTabs", "urn:metadata.tooling.soap.sforce.com","maxNumberOfSubTabs","http://www.w3.org/2001/XMLSchema","string",0,1,true), maxNumberOfSubTabs, maxNumberOfSubTabs__is_set);
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
      sb.append("[TabLimitConfig ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldMaxNumberOfPrimaryTabs(__out, __typeMapper);
      writeFieldMaxNumberOfSubTabs(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setMaxNumberOfPrimaryTabs(__in, __typeMapper);
      setMaxNumberOfSubTabs(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "maxNumberOfPrimaryTabs", maxNumberOfPrimaryTabs);
      toStringHelper(sb, "maxNumberOfSubTabs", maxNumberOfSubTabs);
    }


}
