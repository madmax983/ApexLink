package com.sforce.soap.tooling;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class DescribeLayoutFeedView implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DescribeLayoutFeedView() {}

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
     * element : feedFilters of type {urn:tooling.soap.sforce.com}DescribeLayoutFeedFilter
     * java type: com.sforce.soap.tooling.DescribeLayoutFeedFilter[]
     */
    private boolean feedFilters__is_set = false;

    private com.sforce.soap.tooling.DescribeLayoutFeedFilter[] feedFilters = new com.sforce.soap.tooling.DescribeLayoutFeedFilter[0];

    public com.sforce.soap.tooling.DescribeLayoutFeedFilter[] getFeedFilters() {
      return feedFilters;
    }

    public void setFeedFilters(com.sforce.soap.tooling.DescribeLayoutFeedFilter[] feedFilters) {
      this.feedFilters = feedFilters;
      feedFilters__is_set = true;
    }

    protected void setFeedFilters(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("feedFilters", "urn:tooling.soap.sforce.com","feedFilters","urn:tooling.soap.sforce.com","DescribeLayoutFeedFilter",0,-1,true))) {
        setFeedFilters((com.sforce.soap.tooling.DescribeLayoutFeedFilter[])__typeMapper.readObject(__in, _lookupTypeInfo("feedFilters", "urn:tooling.soap.sforce.com","feedFilters","urn:tooling.soap.sforce.com","DescribeLayoutFeedFilter",0,-1,true), com.sforce.soap.tooling.DescribeLayoutFeedFilter[].class));
      }
    }

    private void writeFieldFeedFilters(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("feedFilters", "urn:tooling.soap.sforce.com","feedFilters","urn:tooling.soap.sforce.com","DescribeLayoutFeedFilter",0,-1,true), feedFilters, feedFilters__is_set);
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
      sb.append("[DescribeLayoutFeedView ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldFeedFilters(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setFeedFilters(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "feedFilters", feedFilters);
    }


}
