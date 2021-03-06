package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class EmbeddedServiceQuickAction implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public EmbeddedServiceQuickAction() {}

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
     * element : embeddedServiceLiveAgent of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean embeddedServiceLiveAgent__is_set = false;

    private java.lang.String embeddedServiceLiveAgent;

    public java.lang.String getEmbeddedServiceLiveAgent() {
      return embeddedServiceLiveAgent;
    }

    public void setEmbeddedServiceLiveAgent(java.lang.String embeddedServiceLiveAgent) {
      this.embeddedServiceLiveAgent = embeddedServiceLiveAgent;
      embeddedServiceLiveAgent__is_set = true;
    }

    protected void setEmbeddedServiceLiveAgent(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("embeddedServiceLiveAgent", "urn:metadata.tooling.soap.sforce.com","embeddedServiceLiveAgent","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setEmbeddedServiceLiveAgent(__typeMapper.readString(__in, _lookupTypeInfo("embeddedServiceLiveAgent", "urn:metadata.tooling.soap.sforce.com","embeddedServiceLiveAgent","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldEmbeddedServiceLiveAgent(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("embeddedServiceLiveAgent", "urn:metadata.tooling.soap.sforce.com","embeddedServiceLiveAgent","http://www.w3.org/2001/XMLSchema","string",1,1,true), embeddedServiceLiveAgent, embeddedServiceLiveAgent__is_set);
    }

    /**
     * element : order of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private boolean order__is_set = false;

    private int order;

    public int getOrder() {
      return order;
    }

    public void setOrder(int order) {
      this.order = order;
      order__is_set = true;
    }

    protected void setOrder(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("order", "urn:metadata.tooling.soap.sforce.com","order","http://www.w3.org/2001/XMLSchema","int",1,1,true))) {
        setOrder((int)__typeMapper.readInt(__in, _lookupTypeInfo("order", "urn:metadata.tooling.soap.sforce.com","order","http://www.w3.org/2001/XMLSchema","int",1,1,true), int.class));
      }
    }

    private void writeFieldOrder(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("order", "urn:metadata.tooling.soap.sforce.com","order","http://www.w3.org/2001/XMLSchema","int",1,1,true), order, order__is_set);
    }

    /**
     * element : quickActionDefinition of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean quickActionDefinition__is_set = false;

    private java.lang.String quickActionDefinition;

    public java.lang.String getQuickActionDefinition() {
      return quickActionDefinition;
    }

    public void setQuickActionDefinition(java.lang.String quickActionDefinition) {
      this.quickActionDefinition = quickActionDefinition;
      quickActionDefinition__is_set = true;
    }

    protected void setQuickActionDefinition(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("quickActionDefinition", "urn:metadata.tooling.soap.sforce.com","quickActionDefinition","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setQuickActionDefinition(__typeMapper.readString(__in, _lookupTypeInfo("quickActionDefinition", "urn:metadata.tooling.soap.sforce.com","quickActionDefinition","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldQuickActionDefinition(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("quickActionDefinition", "urn:metadata.tooling.soap.sforce.com","quickActionDefinition","http://www.w3.org/2001/XMLSchema","string",1,1,true), quickActionDefinition, quickActionDefinition__is_set);
    }

    /**
     * element : quickActionType of type {urn:tooling.soap.sforce.com}EmbeddedServiceQuickActionType
     * java type: com.sforce.soap.tooling.EmbeddedServiceQuickActionType
     */
    private boolean quickActionType__is_set = false;

    private com.sforce.soap.tooling.EmbeddedServiceQuickActionType quickActionType;

    public com.sforce.soap.tooling.EmbeddedServiceQuickActionType getQuickActionType() {
      return quickActionType;
    }

    public void setQuickActionType(com.sforce.soap.tooling.EmbeddedServiceQuickActionType quickActionType) {
      this.quickActionType = quickActionType;
      quickActionType__is_set = true;
    }

    protected void setQuickActionType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("quickActionType", "urn:metadata.tooling.soap.sforce.com","quickActionType","urn:tooling.soap.sforce.com","EmbeddedServiceQuickActionType",0,1,true))) {
        setQuickActionType((com.sforce.soap.tooling.EmbeddedServiceQuickActionType)__typeMapper.readObject(__in, _lookupTypeInfo("quickActionType", "urn:metadata.tooling.soap.sforce.com","quickActionType","urn:tooling.soap.sforce.com","EmbeddedServiceQuickActionType",0,1,true), com.sforce.soap.tooling.EmbeddedServiceQuickActionType.class));
      }
    }

    private void writeFieldQuickActionType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("quickActionType", "urn:metadata.tooling.soap.sforce.com","quickActionType","urn:tooling.soap.sforce.com","EmbeddedServiceQuickActionType",0,1,true), quickActionType, quickActionType__is_set);
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
      sb.append("[EmbeddedServiceQuickAction ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldEmbeddedServiceLiveAgent(__out, __typeMapper);
      writeFieldOrder(__out, __typeMapper);
      writeFieldQuickActionDefinition(__out, __typeMapper);
      writeFieldQuickActionType(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setEmbeddedServiceLiveAgent(__in, __typeMapper);
      setOrder(__in, __typeMapper);
      setQuickActionDefinition(__in, __typeMapper);
      setQuickActionType(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "embeddedServiceLiveAgent", embeddedServiceLiveAgent);
      toStringHelper(sb, "order", order);
      toStringHelper(sb, "quickActionDefinition", quickActionDefinition);
      toStringHelper(sb, "quickActionType", quickActionType);
    }


}
