package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class ProfileLoginIpRange implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public ProfileLoginIpRange() {}

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
     * element : endAddress of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean endAddress__is_set = false;

    private java.lang.String endAddress;

    public java.lang.String getEndAddress() {
      return endAddress;
    }

    public void setEndAddress(java.lang.String endAddress) {
      this.endAddress = endAddress;
      endAddress__is_set = true;
    }

    protected void setEndAddress(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("endAddress", "urn:metadata.tooling.soap.sforce.com","endAddress","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setEndAddress(__typeMapper.readString(__in, _lookupTypeInfo("endAddress", "urn:metadata.tooling.soap.sforce.com","endAddress","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldEndAddress(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("endAddress", "urn:metadata.tooling.soap.sforce.com","endAddress","http://www.w3.org/2001/XMLSchema","string",1,1,true), endAddress, endAddress__is_set);
    }

    /**
     * element : startAddress of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean startAddress__is_set = false;

    private java.lang.String startAddress;

    public java.lang.String getStartAddress() {
      return startAddress;
    }

    public void setStartAddress(java.lang.String startAddress) {
      this.startAddress = startAddress;
      startAddress__is_set = true;
    }

    protected void setStartAddress(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("startAddress", "urn:metadata.tooling.soap.sforce.com","startAddress","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setStartAddress(__typeMapper.readString(__in, _lookupTypeInfo("startAddress", "urn:metadata.tooling.soap.sforce.com","startAddress","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldStartAddress(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("startAddress", "urn:metadata.tooling.soap.sforce.com","startAddress","http://www.w3.org/2001/XMLSchema","string",1,1,true), startAddress, startAddress__is_set);
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
      sb.append("[ProfileLoginIpRange ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldDescription(__out, __typeMapper);
      writeFieldEndAddress(__out, __typeMapper);
      writeFieldStartAddress(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setDescription(__in, __typeMapper);
      setEndAddress(__in, __typeMapper);
      setStartAddress(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "description", description);
      toStringHelper(sb, "endAddress", endAddress);
      toStringHelper(sb, "startAddress", startAddress);
    }


}
