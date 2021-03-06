package com.sforce.soap.tooling;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class SearchRecord implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public SearchRecord() {}

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
     * element : record of type {urn:sobject.tooling.soap.sforce.com}sObject
     * java type: com.sforce.soap.tooling.sobject.SObject
     */
    private boolean record__is_set = false;

    private com.sforce.soap.tooling.sobject.SObject record;

    public com.sforce.soap.tooling.sobject.SObject getRecord() {
      return record;
    }

    public void setRecord(com.sforce.soap.tooling.sobject.SObject record) {
      this.record = record;
      record__is_set = true;
    }

    protected void setRecord(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("record", "urn:tooling.soap.sforce.com","record","urn:sobject.tooling.soap.sforce.com","sObject",1,1,true))) {
        setRecord((com.sforce.soap.tooling.sobject.SObject)__typeMapper.readObject(__in, _lookupTypeInfo("record", "urn:tooling.soap.sforce.com","record","urn:sobject.tooling.soap.sforce.com","sObject",1,1,true), com.sforce.soap.tooling.sobject.SObject.class));
      }
    }

    private void writeFieldRecord(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("record", "urn:tooling.soap.sforce.com","record","urn:sobject.tooling.soap.sforce.com","sObject",1,1,true), record, record__is_set);
    }

    /**
     * element : searchRecordMetadata of type {urn:tooling.soap.sforce.com}SearchRecordMetadata
     * java type: com.sforce.soap.tooling.SearchRecordMetadata
     */
    private boolean searchRecordMetadata__is_set = false;

    private com.sforce.soap.tooling.SearchRecordMetadata searchRecordMetadata;

    public com.sforce.soap.tooling.SearchRecordMetadata getSearchRecordMetadata() {
      return searchRecordMetadata;
    }

    public void setSearchRecordMetadata(com.sforce.soap.tooling.SearchRecordMetadata searchRecordMetadata) {
      this.searchRecordMetadata = searchRecordMetadata;
      searchRecordMetadata__is_set = true;
    }

    protected void setSearchRecordMetadata(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("searchRecordMetadata", "urn:tooling.soap.sforce.com","searchRecordMetadata","urn:tooling.soap.sforce.com","SearchRecordMetadata",0,1,true))) {
        setSearchRecordMetadata((com.sforce.soap.tooling.SearchRecordMetadata)__typeMapper.readObject(__in, _lookupTypeInfo("searchRecordMetadata", "urn:tooling.soap.sforce.com","searchRecordMetadata","urn:tooling.soap.sforce.com","SearchRecordMetadata",0,1,true), com.sforce.soap.tooling.SearchRecordMetadata.class));
      }
    }

    private void writeFieldSearchRecordMetadata(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("searchRecordMetadata", "urn:tooling.soap.sforce.com","searchRecordMetadata","urn:tooling.soap.sforce.com","SearchRecordMetadata",0,1,true), searchRecordMetadata, searchRecordMetadata__is_set);
    }

    /**
     * element : snippet of type {urn:tooling.soap.sforce.com}SearchSnippet
     * java type: com.sforce.soap.tooling.SearchSnippet
     */
    private boolean snippet__is_set = false;

    private com.sforce.soap.tooling.SearchSnippet snippet;

    public com.sforce.soap.tooling.SearchSnippet getSnippet() {
      return snippet;
    }

    public void setSnippet(com.sforce.soap.tooling.SearchSnippet snippet) {
      this.snippet = snippet;
      snippet__is_set = true;
    }

    protected void setSnippet(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("snippet", "urn:tooling.soap.sforce.com","snippet","urn:tooling.soap.sforce.com","SearchSnippet",0,1,true))) {
        setSnippet((com.sforce.soap.tooling.SearchSnippet)__typeMapper.readObject(__in, _lookupTypeInfo("snippet", "urn:tooling.soap.sforce.com","snippet","urn:tooling.soap.sforce.com","SearchSnippet",0,1,true), com.sforce.soap.tooling.SearchSnippet.class));
      }
    }

    private void writeFieldSnippet(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("snippet", "urn:tooling.soap.sforce.com","snippet","urn:tooling.soap.sforce.com","SearchSnippet",0,1,true), snippet, snippet__is_set);
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
      sb.append("[SearchRecord ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldRecord(__out, __typeMapper);
      writeFieldSearchRecordMetadata(__out, __typeMapper);
      writeFieldSnippet(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setRecord(__in, __typeMapper);
      setSearchRecordMetadata(__in, __typeMapper);
      setSnippet(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "record", record);
      toStringHelper(sb, "searchRecordMetadata", searchRecordMetadata);
      toStringHelper(sb, "snippet", snippet);
    }


}
