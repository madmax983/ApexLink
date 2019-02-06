package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class FlexiPage extends com.sforce.soap.tooling.metadata.Metadata {

    /**
     * Constructor
     */
    public FlexiPage() {}

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
     * element : flexiPageRegions of type {urn:metadata.tooling.soap.sforce.com}FlexiPageRegion
     * java type: com.sforce.soap.tooling.metadata.FlexiPageRegion[]
     */
    private boolean flexiPageRegions__is_set = false;

    private com.sforce.soap.tooling.metadata.FlexiPageRegion[] flexiPageRegions = new com.sforce.soap.tooling.metadata.FlexiPageRegion[0];

    public com.sforce.soap.tooling.metadata.FlexiPageRegion[] getFlexiPageRegions() {
      return flexiPageRegions;
    }

    public void setFlexiPageRegions(com.sforce.soap.tooling.metadata.FlexiPageRegion[] flexiPageRegions) {
      this.flexiPageRegions = flexiPageRegions;
      flexiPageRegions__is_set = true;
    }

    protected void setFlexiPageRegions(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("flexiPageRegions", "urn:metadata.tooling.soap.sforce.com","flexiPageRegions","urn:metadata.tooling.soap.sforce.com","FlexiPageRegion",0,-1,true))) {
        setFlexiPageRegions((com.sforce.soap.tooling.metadata.FlexiPageRegion[])__typeMapper.readObject(__in, _lookupTypeInfo("flexiPageRegions", "urn:metadata.tooling.soap.sforce.com","flexiPageRegions","urn:metadata.tooling.soap.sforce.com","FlexiPageRegion",0,-1,true), com.sforce.soap.tooling.metadata.FlexiPageRegion[].class));
      }
    }

    private void writeFieldFlexiPageRegions(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("flexiPageRegions", "urn:metadata.tooling.soap.sforce.com","flexiPageRegions","urn:metadata.tooling.soap.sforce.com","FlexiPageRegion",0,-1,true), flexiPageRegions, flexiPageRegions__is_set);
    }

    /**
     * element : masterLabel of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean masterLabel__is_set = false;

    private java.lang.String masterLabel;

    public java.lang.String getMasterLabel() {
      return masterLabel;
    }

    public void setMasterLabel(java.lang.String masterLabel) {
      this.masterLabel = masterLabel;
      masterLabel__is_set = true;
    }

    protected void setMasterLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("masterLabel", "urn:metadata.tooling.soap.sforce.com","masterLabel","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setMasterLabel(__typeMapper.readString(__in, _lookupTypeInfo("masterLabel", "urn:metadata.tooling.soap.sforce.com","masterLabel","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldMasterLabel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("masterLabel", "urn:metadata.tooling.soap.sforce.com","masterLabel","http://www.w3.org/2001/XMLSchema","string",1,1,true), masterLabel, masterLabel__is_set);
    }

    /**
     * element : parentFlexiPage of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean parentFlexiPage__is_set = false;

    private java.lang.String parentFlexiPage;

    public java.lang.String getParentFlexiPage() {
      return parentFlexiPage;
    }

    public void setParentFlexiPage(java.lang.String parentFlexiPage) {
      this.parentFlexiPage = parentFlexiPage;
      parentFlexiPage__is_set = true;
    }

    protected void setParentFlexiPage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("parentFlexiPage", "urn:metadata.tooling.soap.sforce.com","parentFlexiPage","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setParentFlexiPage(__typeMapper.readString(__in, _lookupTypeInfo("parentFlexiPage", "urn:metadata.tooling.soap.sforce.com","parentFlexiPage","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldParentFlexiPage(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("parentFlexiPage", "urn:metadata.tooling.soap.sforce.com","parentFlexiPage","http://www.w3.org/2001/XMLSchema","string",0,1,true), parentFlexiPage, parentFlexiPage__is_set);
    }

    /**
     * element : quickActionList of type {urn:metadata.tooling.soap.sforce.com}QuickActionList
     * java type: com.sforce.soap.tooling.metadata.QuickActionList
     */
    private boolean quickActionList__is_set = false;

    private com.sforce.soap.tooling.metadata.QuickActionList quickActionList;

    public com.sforce.soap.tooling.metadata.QuickActionList getQuickActionList() {
      return quickActionList;
    }

    public void setQuickActionList(com.sforce.soap.tooling.metadata.QuickActionList quickActionList) {
      this.quickActionList = quickActionList;
      quickActionList__is_set = true;
    }

    protected void setQuickActionList(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("quickActionList", "urn:metadata.tooling.soap.sforce.com","quickActionList","urn:metadata.tooling.soap.sforce.com","QuickActionList",0,1,true))) {
        setQuickActionList((com.sforce.soap.tooling.metadata.QuickActionList)__typeMapper.readObject(__in, _lookupTypeInfo("quickActionList", "urn:metadata.tooling.soap.sforce.com","quickActionList","urn:metadata.tooling.soap.sforce.com","QuickActionList",0,1,true), com.sforce.soap.tooling.metadata.QuickActionList.class));
      }
    }

    private void writeFieldQuickActionList(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("quickActionList", "urn:metadata.tooling.soap.sforce.com","quickActionList","urn:metadata.tooling.soap.sforce.com","QuickActionList",0,1,true), quickActionList, quickActionList__is_set);
    }

    /**
     * element : sobjectType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean sobjectType__is_set = false;

    private java.lang.String sobjectType;

    public java.lang.String getSobjectType() {
      return sobjectType;
    }

    public void setSobjectType(java.lang.String sobjectType) {
      this.sobjectType = sobjectType;
      sobjectType__is_set = true;
    }

    protected void setSobjectType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("sobjectType", "urn:metadata.tooling.soap.sforce.com","sobjectType","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setSobjectType(__typeMapper.readString(__in, _lookupTypeInfo("sobjectType", "urn:metadata.tooling.soap.sforce.com","sobjectType","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSobjectType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("sobjectType", "urn:metadata.tooling.soap.sforce.com","sobjectType","http://www.w3.org/2001/XMLSchema","string",0,1,true), sobjectType, sobjectType__is_set);
    }

    /**
     * element : template of type {urn:metadata.tooling.soap.sforce.com}FlexiPageTemplateInstance
     * java type: com.sforce.soap.tooling.metadata.FlexiPageTemplateInstance
     */
    private boolean template__is_set = false;

    private com.sforce.soap.tooling.metadata.FlexiPageTemplateInstance template;

    public com.sforce.soap.tooling.metadata.FlexiPageTemplateInstance getTemplate() {
      return template;
    }

    public void setTemplate(com.sforce.soap.tooling.metadata.FlexiPageTemplateInstance template) {
      this.template = template;
      template__is_set = true;
    }

    protected void setTemplate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("template", "urn:metadata.tooling.soap.sforce.com","template","urn:metadata.tooling.soap.sforce.com","FlexiPageTemplateInstance",1,1,true))) {
        setTemplate((com.sforce.soap.tooling.metadata.FlexiPageTemplateInstance)__typeMapper.readObject(__in, _lookupTypeInfo("template", "urn:metadata.tooling.soap.sforce.com","template","urn:metadata.tooling.soap.sforce.com","FlexiPageTemplateInstance",1,1,true), com.sforce.soap.tooling.metadata.FlexiPageTemplateInstance.class));
      }
    }

    private void writeFieldTemplate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("template", "urn:metadata.tooling.soap.sforce.com","template","urn:metadata.tooling.soap.sforce.com","FlexiPageTemplateInstance",1,1,true), template, template__is_set);
    }

    /**
     * element : type of type {urn:tooling.soap.sforce.com}FlexiPageType
     * java type: com.sforce.soap.tooling.FlexiPageType
     */
    private boolean type__is_set = false;

    private com.sforce.soap.tooling.FlexiPageType type;

    public com.sforce.soap.tooling.FlexiPageType getType() {
      return type;
    }

    public void setType(com.sforce.soap.tooling.FlexiPageType type) {
      this.type = type;
      type__is_set = true;
    }

    protected void setType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("type", "urn:metadata.tooling.soap.sforce.com","type","urn:tooling.soap.sforce.com","FlexiPageType",1,1,true))) {
        setType((com.sforce.soap.tooling.FlexiPageType)__typeMapper.readObject(__in, _lookupTypeInfo("type", "urn:metadata.tooling.soap.sforce.com","type","urn:tooling.soap.sforce.com","FlexiPageType",1,1,true), com.sforce.soap.tooling.FlexiPageType.class));
      }
    }

    private void writeFieldType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("type", "urn:metadata.tooling.soap.sforce.com","type","urn:tooling.soap.sforce.com","FlexiPageType",1,1,true), type, type__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:metadata.tooling.soap.sforce.com", "FlexiPage");
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
      sb.append("[FlexiPage ");
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
      writeFieldDescription(__out, __typeMapper);
      writeFieldFlexiPageRegions(__out, __typeMapper);
      writeFieldMasterLabel(__out, __typeMapper);
      writeFieldParentFlexiPage(__out, __typeMapper);
      writeFieldQuickActionList(__out, __typeMapper);
      writeFieldSobjectType(__out, __typeMapper);
      writeFieldTemplate(__out, __typeMapper);
      writeFieldType(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setDescription(__in, __typeMapper);
      setFlexiPageRegions(__in, __typeMapper);
      setMasterLabel(__in, __typeMapper);
      setParentFlexiPage(__in, __typeMapper);
      setQuickActionList(__in, __typeMapper);
      setSobjectType(__in, __typeMapper);
      setTemplate(__in, __typeMapper);
      setType(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "description", description);
      toStringHelper(sb, "flexiPageRegions", flexiPageRegions);
      toStringHelper(sb, "masterLabel", masterLabel);
      toStringHelper(sb, "parentFlexiPage", parentFlexiPage);
      toStringHelper(sb, "quickActionList", quickActionList);
      toStringHelper(sb, "sobjectType", sobjectType);
      toStringHelper(sb, "template", template);
      toStringHelper(sb, "type", type);
    }


}