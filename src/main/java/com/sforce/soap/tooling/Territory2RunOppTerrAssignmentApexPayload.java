package com.sforce.soap.tooling;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class Territory2RunOppTerrAssignmentApexPayload extends com.sforce.soap.tooling.OperationPayload {

    /**
     * Constructor
     */
    public Territory2RunOppTerrAssignmentApexPayload() {}

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
     * element : excludeClosedOpportunities of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean excludeClosedOpportunities__is_set = false;

    private java.lang.String excludeClosedOpportunities;

    public java.lang.String getExcludeClosedOpportunities() {
      return excludeClosedOpportunities;
    }

    public void setExcludeClosedOpportunities(java.lang.String excludeClosedOpportunities) {
      this.excludeClosedOpportunities = excludeClosedOpportunities;
      excludeClosedOpportunities__is_set = true;
    }

    protected void setExcludeClosedOpportunities(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("excludeClosedOpportunities", "urn:tooling.soap.sforce.com","excludeClosedOpportunities","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setExcludeClosedOpportunities(__typeMapper.readString(__in, _lookupTypeInfo("excludeClosedOpportunities", "urn:tooling.soap.sforce.com","excludeClosedOpportunities","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldExcludeClosedOpportunities(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("excludeClosedOpportunities", "urn:tooling.soap.sforce.com","excludeClosedOpportunities","http://www.w3.org/2001/XMLSchema","string",1,1,true), excludeClosedOpportunities, excludeClosedOpportunities__is_set);
    }

    /**
     * element : opportunityCloseDateFrom of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean opportunityCloseDateFrom__is_set = false;

    private java.lang.String opportunityCloseDateFrom;

    public java.lang.String getOpportunityCloseDateFrom() {
      return opportunityCloseDateFrom;
    }

    public void setOpportunityCloseDateFrom(java.lang.String opportunityCloseDateFrom) {
      this.opportunityCloseDateFrom = opportunityCloseDateFrom;
      opportunityCloseDateFrom__is_set = true;
    }

    protected void setOpportunityCloseDateFrom(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("opportunityCloseDateFrom", "urn:tooling.soap.sforce.com","opportunityCloseDateFrom","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setOpportunityCloseDateFrom(__typeMapper.readString(__in, _lookupTypeInfo("opportunityCloseDateFrom", "urn:tooling.soap.sforce.com","opportunityCloseDateFrom","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldOpportunityCloseDateFrom(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("opportunityCloseDateFrom", "urn:tooling.soap.sforce.com","opportunityCloseDateFrom","http://www.w3.org/2001/XMLSchema","string",1,1,true), opportunityCloseDateFrom, opportunityCloseDateFrom__is_set);
    }

    /**
     * element : opportunityCloseDateTo of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean opportunityCloseDateTo__is_set = false;

    private java.lang.String opportunityCloseDateTo;

    public java.lang.String getOpportunityCloseDateTo() {
      return opportunityCloseDateTo;
    }

    public void setOpportunityCloseDateTo(java.lang.String opportunityCloseDateTo) {
      this.opportunityCloseDateTo = opportunityCloseDateTo;
      opportunityCloseDateTo__is_set = true;
    }

    protected void setOpportunityCloseDateTo(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("opportunityCloseDateTo", "urn:tooling.soap.sforce.com","opportunityCloseDateTo","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setOpportunityCloseDateTo(__typeMapper.readString(__in, _lookupTypeInfo("opportunityCloseDateTo", "urn:tooling.soap.sforce.com","opportunityCloseDateTo","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldOpportunityCloseDateTo(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("opportunityCloseDateTo", "urn:tooling.soap.sforce.com","opportunityCloseDateTo","http://www.w3.org/2001/XMLSchema","string",1,1,true), opportunityCloseDateTo, opportunityCloseDateTo__is_set);
    }

    /**
     * element : opportunityLastModifiedDateFrom of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean opportunityLastModifiedDateFrom__is_set = false;

    private java.lang.String opportunityLastModifiedDateFrom;

    public java.lang.String getOpportunityLastModifiedDateFrom() {
      return opportunityLastModifiedDateFrom;
    }

    public void setOpportunityLastModifiedDateFrom(java.lang.String opportunityLastModifiedDateFrom) {
      this.opportunityLastModifiedDateFrom = opportunityLastModifiedDateFrom;
      opportunityLastModifiedDateFrom__is_set = true;
    }

    protected void setOpportunityLastModifiedDateFrom(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("opportunityLastModifiedDateFrom", "urn:tooling.soap.sforce.com","opportunityLastModifiedDateFrom","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setOpportunityLastModifiedDateFrom(__typeMapper.readString(__in, _lookupTypeInfo("opportunityLastModifiedDateFrom", "urn:tooling.soap.sforce.com","opportunityLastModifiedDateFrom","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldOpportunityLastModifiedDateFrom(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("opportunityLastModifiedDateFrom", "urn:tooling.soap.sforce.com","opportunityLastModifiedDateFrom","http://www.w3.org/2001/XMLSchema","string",1,1,true), opportunityLastModifiedDateFrom, opportunityLastModifiedDateFrom__is_set);
    }

    /**
     * element : opportunityLastModifiedDateTo of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean opportunityLastModifiedDateTo__is_set = false;

    private java.lang.String opportunityLastModifiedDateTo;

    public java.lang.String getOpportunityLastModifiedDateTo() {
      return opportunityLastModifiedDateTo;
    }

    public void setOpportunityLastModifiedDateTo(java.lang.String opportunityLastModifiedDateTo) {
      this.opportunityLastModifiedDateTo = opportunityLastModifiedDateTo;
      opportunityLastModifiedDateTo__is_set = true;
    }

    protected void setOpportunityLastModifiedDateTo(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("opportunityLastModifiedDateTo", "urn:tooling.soap.sforce.com","opportunityLastModifiedDateTo","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setOpportunityLastModifiedDateTo(__typeMapper.readString(__in, _lookupTypeInfo("opportunityLastModifiedDateTo", "urn:tooling.soap.sforce.com","opportunityLastModifiedDateTo","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldOpportunityLastModifiedDateTo(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("opportunityLastModifiedDateTo", "urn:tooling.soap.sforce.com","opportunityLastModifiedDateTo","http://www.w3.org/2001/XMLSchema","string",1,1,true), opportunityLastModifiedDateTo, opportunityLastModifiedDateTo__is_set);
    }

    /**
     * element : territoryModelId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean territoryModelId__is_set = false;

    private java.lang.String territoryModelId;

    public java.lang.String getTerritoryModelId() {
      return territoryModelId;
    }

    public void setTerritoryModelId(java.lang.String territoryModelId) {
      this.territoryModelId = territoryModelId;
      territoryModelId__is_set = true;
    }

    protected void setTerritoryModelId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("territoryModelId", "urn:tooling.soap.sforce.com","territoryModelId","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setTerritoryModelId(__typeMapper.readString(__in, _lookupTypeInfo("territoryModelId", "urn:tooling.soap.sforce.com","territoryModelId","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldTerritoryModelId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("territoryModelId", "urn:tooling.soap.sforce.com","territoryModelId","http://www.w3.org/2001/XMLSchema","string",1,1,true), territoryModelId, territoryModelId__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:tooling.soap.sforce.com", "Territory2RunOppTerrAssignmentApexPayload");
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
      sb.append("[Territory2RunOppTerrAssignmentApexPayload ");
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
      writeFieldExcludeClosedOpportunities(__out, __typeMapper);
      writeFieldOpportunityCloseDateFrom(__out, __typeMapper);
      writeFieldOpportunityCloseDateTo(__out, __typeMapper);
      writeFieldOpportunityLastModifiedDateFrom(__out, __typeMapper);
      writeFieldOpportunityLastModifiedDateTo(__out, __typeMapper);
      writeFieldTerritoryModelId(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setExcludeClosedOpportunities(__in, __typeMapper);
      setOpportunityCloseDateFrom(__in, __typeMapper);
      setOpportunityCloseDateTo(__in, __typeMapper);
      setOpportunityLastModifiedDateFrom(__in, __typeMapper);
      setOpportunityLastModifiedDateTo(__in, __typeMapper);
      setTerritoryModelId(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "excludeClosedOpportunities", excludeClosedOpportunities);
      toStringHelper(sb, "opportunityCloseDateFrom", opportunityCloseDateFrom);
      toStringHelper(sb, "opportunityCloseDateTo", opportunityCloseDateTo);
      toStringHelper(sb, "opportunityLastModifiedDateFrom", opportunityLastModifiedDateFrom);
      toStringHelper(sb, "opportunityLastModifiedDateTo", opportunityLastModifiedDateTo);
      toStringHelper(sb, "territoryModelId", territoryModelId);
    }


}
