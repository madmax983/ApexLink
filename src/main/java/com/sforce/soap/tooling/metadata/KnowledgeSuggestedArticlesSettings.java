package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class KnowledgeSuggestedArticlesSettings implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public KnowledgeSuggestedArticlesSettings() {}

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
     * element : caseFields of type {urn:metadata.tooling.soap.sforce.com}KnowledgeCaseFieldsSettings
     * java type: com.sforce.soap.tooling.metadata.KnowledgeCaseFieldsSettings
     */
    private boolean caseFields__is_set = false;

    private com.sforce.soap.tooling.metadata.KnowledgeCaseFieldsSettings caseFields;

    public com.sforce.soap.tooling.metadata.KnowledgeCaseFieldsSettings getCaseFields() {
      return caseFields;
    }

    public void setCaseFields(com.sforce.soap.tooling.metadata.KnowledgeCaseFieldsSettings caseFields) {
      this.caseFields = caseFields;
      caseFields__is_set = true;
    }

    protected void setCaseFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("caseFields", "urn:metadata.tooling.soap.sforce.com","caseFields","urn:metadata.tooling.soap.sforce.com","KnowledgeCaseFieldsSettings",0,1,true))) {
        setCaseFields((com.sforce.soap.tooling.metadata.KnowledgeCaseFieldsSettings)__typeMapper.readObject(__in, _lookupTypeInfo("caseFields", "urn:metadata.tooling.soap.sforce.com","caseFields","urn:metadata.tooling.soap.sforce.com","KnowledgeCaseFieldsSettings",0,1,true), com.sforce.soap.tooling.metadata.KnowledgeCaseFieldsSettings.class));
      }
    }

    private void writeFieldCaseFields(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("caseFields", "urn:metadata.tooling.soap.sforce.com","caseFields","urn:metadata.tooling.soap.sforce.com","KnowledgeCaseFieldsSettings",0,1,true), caseFields, caseFields__is_set);
    }

    /**
     * element : useSuggestedArticlesForCase of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean useSuggestedArticlesForCase__is_set = false;

    private boolean useSuggestedArticlesForCase;

    public boolean getUseSuggestedArticlesForCase() {
      return useSuggestedArticlesForCase;
    }

    public boolean isUseSuggestedArticlesForCase() {
      return useSuggestedArticlesForCase;
    }

    public void setUseSuggestedArticlesForCase(boolean useSuggestedArticlesForCase) {
      this.useSuggestedArticlesForCase = useSuggestedArticlesForCase;
      useSuggestedArticlesForCase__is_set = true;
    }

    protected void setUseSuggestedArticlesForCase(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("useSuggestedArticlesForCase", "urn:metadata.tooling.soap.sforce.com","useSuggestedArticlesForCase","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setUseSuggestedArticlesForCase(__typeMapper.readBoolean(__in, _lookupTypeInfo("useSuggestedArticlesForCase", "urn:metadata.tooling.soap.sforce.com","useSuggestedArticlesForCase","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldUseSuggestedArticlesForCase(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("useSuggestedArticlesForCase", "urn:metadata.tooling.soap.sforce.com","useSuggestedArticlesForCase","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), useSuggestedArticlesForCase, useSuggestedArticlesForCase__is_set);
    }

    /**
     * element : workOrderFields of type {urn:metadata.tooling.soap.sforce.com}KnowledgeWorkOrderFieldsSettings
     * java type: com.sforce.soap.tooling.metadata.KnowledgeWorkOrderFieldsSettings
     */
    private boolean workOrderFields__is_set = false;

    private com.sforce.soap.tooling.metadata.KnowledgeWorkOrderFieldsSettings workOrderFields;

    public com.sforce.soap.tooling.metadata.KnowledgeWorkOrderFieldsSettings getWorkOrderFields() {
      return workOrderFields;
    }

    public void setWorkOrderFields(com.sforce.soap.tooling.metadata.KnowledgeWorkOrderFieldsSettings workOrderFields) {
      this.workOrderFields = workOrderFields;
      workOrderFields__is_set = true;
    }

    protected void setWorkOrderFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("workOrderFields", "urn:metadata.tooling.soap.sforce.com","workOrderFields","urn:metadata.tooling.soap.sforce.com","KnowledgeWorkOrderFieldsSettings",0,1,true))) {
        setWorkOrderFields((com.sforce.soap.tooling.metadata.KnowledgeWorkOrderFieldsSettings)__typeMapper.readObject(__in, _lookupTypeInfo("workOrderFields", "urn:metadata.tooling.soap.sforce.com","workOrderFields","urn:metadata.tooling.soap.sforce.com","KnowledgeWorkOrderFieldsSettings",0,1,true), com.sforce.soap.tooling.metadata.KnowledgeWorkOrderFieldsSettings.class));
      }
    }

    private void writeFieldWorkOrderFields(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("workOrderFields", "urn:metadata.tooling.soap.sforce.com","workOrderFields","urn:metadata.tooling.soap.sforce.com","KnowledgeWorkOrderFieldsSettings",0,1,true), workOrderFields, workOrderFields__is_set);
    }

    /**
     * element : workOrderLineItemFields of type {urn:metadata.tooling.soap.sforce.com}KnowledgeWorkOrderLineItemFieldsSettings
     * java type: com.sforce.soap.tooling.metadata.KnowledgeWorkOrderLineItemFieldsSettings
     */
    private boolean workOrderLineItemFields__is_set = false;

    private com.sforce.soap.tooling.metadata.KnowledgeWorkOrderLineItemFieldsSettings workOrderLineItemFields;

    public com.sforce.soap.tooling.metadata.KnowledgeWorkOrderLineItemFieldsSettings getWorkOrderLineItemFields() {
      return workOrderLineItemFields;
    }

    public void setWorkOrderLineItemFields(com.sforce.soap.tooling.metadata.KnowledgeWorkOrderLineItemFieldsSettings workOrderLineItemFields) {
      this.workOrderLineItemFields = workOrderLineItemFields;
      workOrderLineItemFields__is_set = true;
    }

    protected void setWorkOrderLineItemFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("workOrderLineItemFields", "urn:metadata.tooling.soap.sforce.com","workOrderLineItemFields","urn:metadata.tooling.soap.sforce.com","KnowledgeWorkOrderLineItemFieldsSettings",0,1,true))) {
        setWorkOrderLineItemFields((com.sforce.soap.tooling.metadata.KnowledgeWorkOrderLineItemFieldsSettings)__typeMapper.readObject(__in, _lookupTypeInfo("workOrderLineItemFields", "urn:metadata.tooling.soap.sforce.com","workOrderLineItemFields","urn:metadata.tooling.soap.sforce.com","KnowledgeWorkOrderLineItemFieldsSettings",0,1,true), com.sforce.soap.tooling.metadata.KnowledgeWorkOrderLineItemFieldsSettings.class));
      }
    }

    private void writeFieldWorkOrderLineItemFields(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("workOrderLineItemFields", "urn:metadata.tooling.soap.sforce.com","workOrderLineItemFields","urn:metadata.tooling.soap.sforce.com","KnowledgeWorkOrderLineItemFieldsSettings",0,1,true), workOrderLineItemFields, workOrderLineItemFields__is_set);
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
      sb.append("[KnowledgeSuggestedArticlesSettings ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldCaseFields(__out, __typeMapper);
      writeFieldUseSuggestedArticlesForCase(__out, __typeMapper);
      writeFieldWorkOrderFields(__out, __typeMapper);
      writeFieldWorkOrderLineItemFields(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCaseFields(__in, __typeMapper);
      setUseSuggestedArticlesForCase(__in, __typeMapper);
      setWorkOrderFields(__in, __typeMapper);
      setWorkOrderLineItemFields(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "caseFields", caseFields);
      toStringHelper(sb, "useSuggestedArticlesForCase", useSuggestedArticlesForCase);
      toStringHelper(sb, "workOrderFields", workOrderFields);
      toStringHelper(sb, "workOrderLineItemFields", workOrderLineItemFields);
    }


}
