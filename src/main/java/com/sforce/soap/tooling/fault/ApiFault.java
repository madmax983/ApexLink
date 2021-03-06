package com.sforce.soap.tooling.fault;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class ApiFault extends com.sforce.ws.SoapFaultException implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public ApiFault() {}

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
     * element : exceptionCode of type {urn:fault.tooling.soap.sforce.com}ExceptionCode
     * java type: com.sforce.soap.tooling.fault.ExceptionCode
     */
    private boolean exceptionCode__is_set = false;

    private com.sforce.soap.tooling.fault.ExceptionCode exceptionCode;

    public com.sforce.soap.tooling.fault.ExceptionCode getExceptionCode() {
      return exceptionCode;
    }

    public void setExceptionCode(com.sforce.soap.tooling.fault.ExceptionCode exceptionCode) {
      this.exceptionCode = exceptionCode;
      exceptionCode__is_set = true;
    }

    protected void setExceptionCode(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("exceptionCode", "urn:fault.tooling.soap.sforce.com","exceptionCode","urn:fault.tooling.soap.sforce.com","ExceptionCode",1,1,true))) {
        setExceptionCode((com.sforce.soap.tooling.fault.ExceptionCode)__typeMapper.readObject(__in, _lookupTypeInfo("exceptionCode", "urn:fault.tooling.soap.sforce.com","exceptionCode","urn:fault.tooling.soap.sforce.com","ExceptionCode",1,1,true), com.sforce.soap.tooling.fault.ExceptionCode.class));
      }
    }

    private void writeFieldExceptionCode(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("exceptionCode", "urn:fault.tooling.soap.sforce.com","exceptionCode","urn:fault.tooling.soap.sforce.com","ExceptionCode",1,1,true), exceptionCode, exceptionCode__is_set);
    }

    /**
     * element : exceptionMessage of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean exceptionMessage__is_set = false;

    private java.lang.String exceptionMessage;

    public java.lang.String getExceptionMessage() {
      return exceptionMessage;
    }

    public void setExceptionMessage(java.lang.String exceptionMessage) {
      this.exceptionMessage = exceptionMessage;
      exceptionMessage__is_set = true;
    }

    protected void setExceptionMessage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("exceptionMessage", "urn:fault.tooling.soap.sforce.com","exceptionMessage","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setExceptionMessage(__typeMapper.readString(__in, _lookupTypeInfo("exceptionMessage", "urn:fault.tooling.soap.sforce.com","exceptionMessage","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldExceptionMessage(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("exceptionMessage", "urn:fault.tooling.soap.sforce.com","exceptionMessage","http://www.w3.org/2001/XMLSchema","string",0,1,true), exceptionMessage, exceptionMessage__is_set);
    }

    /**
     * element : extendedErrorDetails of type {urn:tooling.soap.sforce.com}ExtendedErrorDetails
     * java type: com.sforce.soap.tooling.ExtendedErrorDetails[]
     */
    private boolean extendedErrorDetails__is_set = false;

    private com.sforce.soap.tooling.ExtendedErrorDetails[] extendedErrorDetails = new com.sforce.soap.tooling.ExtendedErrorDetails[0];

    public com.sforce.soap.tooling.ExtendedErrorDetails[] getExtendedErrorDetails() {
      return extendedErrorDetails;
    }

    public void setExtendedErrorDetails(com.sforce.soap.tooling.ExtendedErrorDetails[] extendedErrorDetails) {
      this.extendedErrorDetails = extendedErrorDetails;
      extendedErrorDetails__is_set = true;
    }

    protected void setExtendedErrorDetails(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("extendedErrorDetails", "urn:fault.tooling.soap.sforce.com","extendedErrorDetails","urn:tooling.soap.sforce.com","ExtendedErrorDetails",0,-1,true))) {
        setExtendedErrorDetails((com.sforce.soap.tooling.ExtendedErrorDetails[])__typeMapper.readObject(__in, _lookupTypeInfo("extendedErrorDetails", "urn:fault.tooling.soap.sforce.com","extendedErrorDetails","urn:tooling.soap.sforce.com","ExtendedErrorDetails",0,-1,true), com.sforce.soap.tooling.ExtendedErrorDetails[].class));
      }
    }

    private void writeFieldExtendedErrorDetails(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("extendedErrorDetails", "urn:fault.tooling.soap.sforce.com","extendedErrorDetails","urn:tooling.soap.sforce.com","ExtendedErrorDetails",0,-1,true), extendedErrorDetails, extendedErrorDetails__is_set);
    }

    /**
     * element : upgradeURL of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean upgradeURL__is_set = false;

    private java.lang.String upgradeURL;

    public java.lang.String getUpgradeURL() {
      return upgradeURL;
    }

    public void setUpgradeURL(java.lang.String upgradeURL) {
      this.upgradeURL = upgradeURL;
      upgradeURL__is_set = true;
    }

    protected void setUpgradeURL(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("upgradeURL", "urn:fault.tooling.soap.sforce.com","upgradeURL","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setUpgradeURL(__typeMapper.readString(__in, _lookupTypeInfo("upgradeURL", "urn:fault.tooling.soap.sforce.com","upgradeURL","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldUpgradeURL(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("upgradeURL", "urn:fault.tooling.soap.sforce.com","upgradeURL","http://www.w3.org/2001/XMLSchema","string",0,1,true), upgradeURL, upgradeURL__is_set);
    }

    /**
     * element : upgradeMessage of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean upgradeMessage__is_set = false;

    private java.lang.String upgradeMessage;

    public java.lang.String getUpgradeMessage() {
      return upgradeMessage;
    }

    public void setUpgradeMessage(java.lang.String upgradeMessage) {
      this.upgradeMessage = upgradeMessage;
      upgradeMessage__is_set = true;
    }

    protected void setUpgradeMessage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("upgradeMessage", "urn:fault.tooling.soap.sforce.com","upgradeMessage","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setUpgradeMessage(__typeMapper.readString(__in, _lookupTypeInfo("upgradeMessage", "urn:fault.tooling.soap.sforce.com","upgradeMessage","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldUpgradeMessage(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("upgradeMessage", "urn:fault.tooling.soap.sforce.com","upgradeMessage","http://www.w3.org/2001/XMLSchema","string",0,1,true), upgradeMessage, upgradeMessage__is_set);
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
      sb.append("[ApiFault ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldExceptionCode(__out, __typeMapper);
      writeFieldExceptionMessage(__out, __typeMapper);
      writeFieldExtendedErrorDetails(__out, __typeMapper);
      writeFieldUpgradeURL(__out, __typeMapper);
      writeFieldUpgradeMessage(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setExceptionCode(__in, __typeMapper);
      setExceptionMessage(__in, __typeMapper);
      setExtendedErrorDetails(__in, __typeMapper);
      setUpgradeURL(__in, __typeMapper);
      setUpgradeMessage(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "exceptionCode", exceptionCode);
      toStringHelper(sb, "exceptionMessage", exceptionMessage);
      toStringHelper(sb, "extendedErrorDetails", extendedErrorDetails);
      toStringHelper(sb, "upgradeURL", upgradeURL);
      toStringHelper(sb, "upgradeMessage", upgradeMessage);
    }


}
