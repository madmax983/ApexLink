package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class AccountSettings extends com.sforce.soap.tooling.metadata.MetadataForSettings {

    /**
     * Constructor
     */
    public AccountSettings() {}

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
     * element : enableAccountOwnerReport of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean enableAccountOwnerReport__is_set = false;

    private boolean enableAccountOwnerReport;

    public boolean getEnableAccountOwnerReport() {
      return enableAccountOwnerReport;
    }

    public boolean isEnableAccountOwnerReport() {
      return enableAccountOwnerReport;
    }

    public void setEnableAccountOwnerReport(boolean enableAccountOwnerReport) {
      this.enableAccountOwnerReport = enableAccountOwnerReport;
      enableAccountOwnerReport__is_set = true;
    }

    protected void setEnableAccountOwnerReport(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("enableAccountOwnerReport", "urn:metadata.tooling.soap.sforce.com","enableAccountOwnerReport","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setEnableAccountOwnerReport(__typeMapper.readBoolean(__in, _lookupTypeInfo("enableAccountOwnerReport", "urn:metadata.tooling.soap.sforce.com","enableAccountOwnerReport","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldEnableAccountOwnerReport(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("enableAccountOwnerReport", "urn:metadata.tooling.soap.sforce.com","enableAccountOwnerReport","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), enableAccountOwnerReport, enableAccountOwnerReport__is_set);
    }

    /**
     * element : enableAccountTeams of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean enableAccountTeams__is_set = false;

    private boolean enableAccountTeams;

    public boolean getEnableAccountTeams() {
      return enableAccountTeams;
    }

    public boolean isEnableAccountTeams() {
      return enableAccountTeams;
    }

    public void setEnableAccountTeams(boolean enableAccountTeams) {
      this.enableAccountTeams = enableAccountTeams;
      enableAccountTeams__is_set = true;
    }

    protected void setEnableAccountTeams(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("enableAccountTeams", "urn:metadata.tooling.soap.sforce.com","enableAccountTeams","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setEnableAccountTeams(__typeMapper.readBoolean(__in, _lookupTypeInfo("enableAccountTeams", "urn:metadata.tooling.soap.sforce.com","enableAccountTeams","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldEnableAccountTeams(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("enableAccountTeams", "urn:metadata.tooling.soap.sforce.com","enableAccountTeams","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), enableAccountTeams, enableAccountTeams__is_set);
    }

    /**
     * element : showViewHierarchyLink of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean showViewHierarchyLink__is_set = false;

    private boolean showViewHierarchyLink;

    public boolean getShowViewHierarchyLink() {
      return showViewHierarchyLink;
    }

    public boolean isShowViewHierarchyLink() {
      return showViewHierarchyLink;
    }

    public void setShowViewHierarchyLink(boolean showViewHierarchyLink) {
      this.showViewHierarchyLink = showViewHierarchyLink;
      showViewHierarchyLink__is_set = true;
    }

    protected void setShowViewHierarchyLink(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("showViewHierarchyLink", "urn:metadata.tooling.soap.sforce.com","showViewHierarchyLink","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setShowViewHierarchyLink(__typeMapper.readBoolean(__in, _lookupTypeInfo("showViewHierarchyLink", "urn:metadata.tooling.soap.sforce.com","showViewHierarchyLink","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldShowViewHierarchyLink(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("showViewHierarchyLink", "urn:metadata.tooling.soap.sforce.com","showViewHierarchyLink","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), showViewHierarchyLink, showViewHierarchyLink__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:metadata.tooling.soap.sforce.com", "AccountSettings");
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
      sb.append("[AccountSettings ");
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
      writeFieldEnableAccountOwnerReport(__out, __typeMapper);
      writeFieldEnableAccountTeams(__out, __typeMapper);
      writeFieldShowViewHierarchyLink(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setEnableAccountOwnerReport(__in, __typeMapper);
      setEnableAccountTeams(__in, __typeMapper);
      setShowViewHierarchyLink(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "enableAccountOwnerReport", enableAccountOwnerReport);
      toStringHelper(sb, "enableAccountTeams", enableAccountTeams);
      toStringHelper(sb, "showViewHierarchyLink", showViewHierarchyLink);
    }


}
