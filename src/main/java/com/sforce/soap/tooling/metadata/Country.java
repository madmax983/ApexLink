package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class Country implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public Country() {}

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
     * element : active of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean active__is_set = false;

    private boolean active;

    public boolean getActive() {
      return active;
    }

    public boolean isActive() {
      return active;
    }

    public void setActive(boolean active) {
      this.active = active;
      active__is_set = true;
    }

    protected void setActive(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("active", "urn:metadata.tooling.soap.sforce.com","active","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setActive(__typeMapper.readBoolean(__in, _lookupTypeInfo("active", "urn:metadata.tooling.soap.sforce.com","active","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldActive(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("active", "urn:metadata.tooling.soap.sforce.com","active","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), active, active__is_set);
    }

    /**
     * element : integrationValue of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean integrationValue__is_set = false;

    private java.lang.String integrationValue;

    public java.lang.String getIntegrationValue() {
      return integrationValue;
    }

    public void setIntegrationValue(java.lang.String integrationValue) {
      this.integrationValue = integrationValue;
      integrationValue__is_set = true;
    }

    protected void setIntegrationValue(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("integrationValue", "urn:metadata.tooling.soap.sforce.com","integrationValue","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setIntegrationValue(__typeMapper.readString(__in, _lookupTypeInfo("integrationValue", "urn:metadata.tooling.soap.sforce.com","integrationValue","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldIntegrationValue(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("integrationValue", "urn:metadata.tooling.soap.sforce.com","integrationValue","http://www.w3.org/2001/XMLSchema","string",1,1,true), integrationValue, integrationValue__is_set);
    }

    /**
     * element : isoCode of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean isoCode__is_set = false;

    private java.lang.String isoCode;

    public java.lang.String getIsoCode() {
      return isoCode;
    }

    public void setIsoCode(java.lang.String isoCode) {
      this.isoCode = isoCode;
      isoCode__is_set = true;
    }

    protected void setIsoCode(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("isoCode", "urn:metadata.tooling.soap.sforce.com","isoCode","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setIsoCode(__typeMapper.readString(__in, _lookupTypeInfo("isoCode", "urn:metadata.tooling.soap.sforce.com","isoCode","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldIsoCode(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("isoCode", "urn:metadata.tooling.soap.sforce.com","isoCode","http://www.w3.org/2001/XMLSchema","string",1,1,true), isoCode, isoCode__is_set);
    }

    /**
     * element : label of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean label__is_set = false;

    private java.lang.String label;

    public java.lang.String getLabel() {
      return label;
    }

    public void setLabel(java.lang.String label) {
      this.label = label;
      label__is_set = true;
    }

    protected void setLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("label", "urn:metadata.tooling.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setLabel(__typeMapper.readString(__in, _lookupTypeInfo("label", "urn:metadata.tooling.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLabel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("label", "urn:metadata.tooling.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true), label, label__is_set);
    }

    /**
     * element : orgDefault of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean orgDefault__is_set = false;

    private boolean orgDefault;

    public boolean getOrgDefault() {
      return orgDefault;
    }

    public boolean isOrgDefault() {
      return orgDefault;
    }

    public void setOrgDefault(boolean orgDefault) {
      this.orgDefault = orgDefault;
      orgDefault__is_set = true;
    }

    protected void setOrgDefault(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("orgDefault", "urn:metadata.tooling.soap.sforce.com","orgDefault","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setOrgDefault(__typeMapper.readBoolean(__in, _lookupTypeInfo("orgDefault", "urn:metadata.tooling.soap.sforce.com","orgDefault","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldOrgDefault(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("orgDefault", "urn:metadata.tooling.soap.sforce.com","orgDefault","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), orgDefault, orgDefault__is_set);
    }

    /**
     * element : standard of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean standard__is_set = false;

    private boolean standard;

    public boolean getStandard() {
      return standard;
    }

    public boolean isStandard() {
      return standard;
    }

    public void setStandard(boolean standard) {
      this.standard = standard;
      standard__is_set = true;
    }

    protected void setStandard(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("standard", "urn:metadata.tooling.soap.sforce.com","standard","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setStandard(__typeMapper.readBoolean(__in, _lookupTypeInfo("standard", "urn:metadata.tooling.soap.sforce.com","standard","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldStandard(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("standard", "urn:metadata.tooling.soap.sforce.com","standard","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), standard, standard__is_set);
    }

    /**
     * element : states of type {urn:metadata.tooling.soap.sforce.com}State
     * java type: com.sforce.soap.tooling.metadata.State[]
     */
    private boolean states__is_set = false;

    private com.sforce.soap.tooling.metadata.State[] states = new com.sforce.soap.tooling.metadata.State[0];

    public com.sforce.soap.tooling.metadata.State[] getStates() {
      return states;
    }

    public void setStates(com.sforce.soap.tooling.metadata.State[] states) {
      this.states = states;
      states__is_set = true;
    }

    protected void setStates(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("states", "urn:metadata.tooling.soap.sforce.com","states","urn:metadata.tooling.soap.sforce.com","State",0,-1,true))) {
        setStates((com.sforce.soap.tooling.metadata.State[])__typeMapper.readObject(__in, _lookupTypeInfo("states", "urn:metadata.tooling.soap.sforce.com","states","urn:metadata.tooling.soap.sforce.com","State",0,-1,true), com.sforce.soap.tooling.metadata.State[].class));
      }
    }

    private void writeFieldStates(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("states", "urn:metadata.tooling.soap.sforce.com","states","urn:metadata.tooling.soap.sforce.com","State",0,-1,true), states, states__is_set);
    }

    /**
     * element : visible of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean visible__is_set = false;

    private boolean visible;

    public boolean getVisible() {
      return visible;
    }

    public boolean isVisible() {
      return visible;
    }

    public void setVisible(boolean visible) {
      this.visible = visible;
      visible__is_set = true;
    }

    protected void setVisible(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("visible", "urn:metadata.tooling.soap.sforce.com","visible","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setVisible(__typeMapper.readBoolean(__in, _lookupTypeInfo("visible", "urn:metadata.tooling.soap.sforce.com","visible","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldVisible(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("visible", "urn:metadata.tooling.soap.sforce.com","visible","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), visible, visible__is_set);
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
      sb.append("[Country ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldActive(__out, __typeMapper);
      writeFieldIntegrationValue(__out, __typeMapper);
      writeFieldIsoCode(__out, __typeMapper);
      writeFieldLabel(__out, __typeMapper);
      writeFieldOrgDefault(__out, __typeMapper);
      writeFieldStandard(__out, __typeMapper);
      writeFieldStates(__out, __typeMapper);
      writeFieldVisible(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setActive(__in, __typeMapper);
      setIntegrationValue(__in, __typeMapper);
      setIsoCode(__in, __typeMapper);
      setLabel(__in, __typeMapper);
      setOrgDefault(__in, __typeMapper);
      setStandard(__in, __typeMapper);
      setStates(__in, __typeMapper);
      setVisible(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "active", active);
      toStringHelper(sb, "integrationValue", integrationValue);
      toStringHelper(sb, "isoCode", isoCode);
      toStringHelper(sb, "label", label);
      toStringHelper(sb, "orgDefault", orgDefault);
      toStringHelper(sb, "standard", standard);
      toStringHelper(sb, "states", states);
      toStringHelper(sb, "visible", visible);
    }


}
