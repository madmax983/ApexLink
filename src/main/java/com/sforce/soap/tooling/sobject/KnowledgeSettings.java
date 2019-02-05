package com.sforce.soap.tooling.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class KnowledgeSettings extends com.sforce.soap.tooling.sobject.SObject {

    /**
     * Constructor
     */
    public KnowledgeSettings() {}

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
     * element : AnswersId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean AnswersId__is_set = false;

    private java.lang.String AnswersId;

    public java.lang.String getAnswersId() {
      return AnswersId;
    }

    public void setAnswersId(java.lang.String AnswersId) {
      this.AnswersId = AnswersId;
      AnswersId__is_set = true;
    }

    protected void setAnswersId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AnswersId", "urn:sobject.tooling.soap.sforce.com","AnswersId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setAnswersId(__typeMapper.readString(__in, _lookupTypeInfo("AnswersId", "urn:sobject.tooling.soap.sforce.com","AnswersId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldAnswersId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AnswersId", "urn:sobject.tooling.soap.sforce.com","AnswersId","http://www.w3.org/2001/XMLSchema","string",0,1,true), AnswersId, AnswersId__is_set);
    }

    /**
     * element : CasesId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean CasesId__is_set = false;

    private java.lang.String CasesId;

    public java.lang.String getCasesId() {
      return CasesId;
    }

    public void setCasesId(java.lang.String CasesId) {
      this.CasesId = CasesId;
      CasesId__is_set = true;
    }

    protected void setCasesId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CasesId", "urn:sobject.tooling.soap.sforce.com","CasesId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setCasesId(__typeMapper.readString(__in, _lookupTypeInfo("CasesId", "urn:sobject.tooling.soap.sforce.com","CasesId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCasesId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CasesId", "urn:sobject.tooling.soap.sforce.com","CasesId","http://www.w3.org/2001/XMLSchema","string",0,1,true), CasesId, CasesId__is_set);
    }

    /**
     * element : DefaultLanguage of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean DefaultLanguage__is_set = false;

    private java.lang.String DefaultLanguage;

    public java.lang.String getDefaultLanguage() {
      return DefaultLanguage;
    }

    public void setDefaultLanguage(java.lang.String DefaultLanguage) {
      this.DefaultLanguage = DefaultLanguage;
      DefaultLanguage__is_set = true;
    }

    protected void setDefaultLanguage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("DefaultLanguage", "urn:sobject.tooling.soap.sforce.com","DefaultLanguage","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDefaultLanguage(__typeMapper.readString(__in, _lookupTypeInfo("DefaultLanguage", "urn:sobject.tooling.soap.sforce.com","DefaultLanguage","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDefaultLanguage(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("DefaultLanguage", "urn:sobject.tooling.soap.sforce.com","DefaultLanguage","http://www.w3.org/2001/XMLSchema","string",0,1,true), DefaultLanguage, DefaultLanguage__is_set);
    }

    /**
     * element : DurableId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean DurableId__is_set = false;

    private java.lang.String DurableId;

    public java.lang.String getDurableId() {
      return DurableId;
    }

    public void setDurableId(java.lang.String DurableId) {
      this.DurableId = DurableId;
      DurableId__is_set = true;
    }

    protected void setDurableId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("DurableId", "urn:sobject.tooling.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDurableId(__typeMapper.readString(__in, _lookupTypeInfo("DurableId", "urn:sobject.tooling.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDurableId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("DurableId", "urn:sobject.tooling.soap.sforce.com","DurableId","http://www.w3.org/2001/XMLSchema","string",0,1,true), DurableId, DurableId__is_set);
    }

    /**
     * element : FullName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean FullName__is_set = false;

    private java.lang.String FullName;

    public java.lang.String getFullName() {
      return FullName;
    }

    public void setFullName(java.lang.String FullName) {
      this.FullName = FullName;
      FullName__is_set = true;
    }

    protected void setFullName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("FullName", "urn:sobject.tooling.soap.sforce.com","FullName","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setFullName(__typeMapper.readString(__in, _lookupTypeInfo("FullName", "urn:sobject.tooling.soap.sforce.com","FullName","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFullName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("FullName", "urn:sobject.tooling.soap.sforce.com","FullName","http://www.w3.org/2001/XMLSchema","string",0,1,true), FullName, FullName__is_set);
    }

    /**
     * element : IsChatterQuestionKbDeflectionEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsChatterQuestionKbDeflectionEnabled__is_set = false;

    private java.lang.Boolean IsChatterQuestionKbDeflectionEnabled;

    public java.lang.Boolean getIsChatterQuestionKbDeflectionEnabled() {
      return IsChatterQuestionKbDeflectionEnabled;
    }

    public void setIsChatterQuestionKbDeflectionEnabled(java.lang.Boolean IsChatterQuestionKbDeflectionEnabled) {
      this.IsChatterQuestionKbDeflectionEnabled = IsChatterQuestionKbDeflectionEnabled;
      IsChatterQuestionKbDeflectionEnabled__is_set = true;
    }

    protected void setIsChatterQuestionKbDeflectionEnabled(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsChatterQuestionKbDeflectionEnabled", "urn:sobject.tooling.soap.sforce.com","IsChatterQuestionKbDeflectionEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsChatterQuestionKbDeflectionEnabled((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsChatterQuestionKbDeflectionEnabled", "urn:sobject.tooling.soap.sforce.com","IsChatterQuestionKbDeflectionEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsChatterQuestionKbDeflectionEnabled(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsChatterQuestionKbDeflectionEnabled", "urn:sobject.tooling.soap.sforce.com","IsChatterQuestionKbDeflectionEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsChatterQuestionKbDeflectionEnabled, IsChatterQuestionKbDeflectionEnabled__is_set);
    }

    /**
     * element : IsCreateEditOnArticlesTabEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsCreateEditOnArticlesTabEnabled__is_set = false;

    private java.lang.Boolean IsCreateEditOnArticlesTabEnabled;

    public java.lang.Boolean getIsCreateEditOnArticlesTabEnabled() {
      return IsCreateEditOnArticlesTabEnabled;
    }

    public void setIsCreateEditOnArticlesTabEnabled(java.lang.Boolean IsCreateEditOnArticlesTabEnabled) {
      this.IsCreateEditOnArticlesTabEnabled = IsCreateEditOnArticlesTabEnabled;
      IsCreateEditOnArticlesTabEnabled__is_set = true;
    }

    protected void setIsCreateEditOnArticlesTabEnabled(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsCreateEditOnArticlesTabEnabled", "urn:sobject.tooling.soap.sforce.com","IsCreateEditOnArticlesTabEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsCreateEditOnArticlesTabEnabled((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsCreateEditOnArticlesTabEnabled", "urn:sobject.tooling.soap.sforce.com","IsCreateEditOnArticlesTabEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsCreateEditOnArticlesTabEnabled(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsCreateEditOnArticlesTabEnabled", "urn:sobject.tooling.soap.sforce.com","IsCreateEditOnArticlesTabEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsCreateEditOnArticlesTabEnabled, IsCreateEditOnArticlesTabEnabled__is_set);
    }

    /**
     * element : IsExternalMediaContentEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsExternalMediaContentEnabled__is_set = false;

    private java.lang.Boolean IsExternalMediaContentEnabled;

    public java.lang.Boolean getIsExternalMediaContentEnabled() {
      return IsExternalMediaContentEnabled;
    }

    public void setIsExternalMediaContentEnabled(java.lang.Boolean IsExternalMediaContentEnabled) {
      this.IsExternalMediaContentEnabled = IsExternalMediaContentEnabled;
      IsExternalMediaContentEnabled__is_set = true;
    }

    protected void setIsExternalMediaContentEnabled(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsExternalMediaContentEnabled", "urn:sobject.tooling.soap.sforce.com","IsExternalMediaContentEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsExternalMediaContentEnabled((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsExternalMediaContentEnabled", "urn:sobject.tooling.soap.sforce.com","IsExternalMediaContentEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsExternalMediaContentEnabled(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsExternalMediaContentEnabled", "urn:sobject.tooling.soap.sforce.com","IsExternalMediaContentEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsExternalMediaContentEnabled, IsExternalMediaContentEnabled__is_set);
    }

    /**
     * element : IsKnowledgeEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsKnowledgeEnabled__is_set = false;

    private java.lang.Boolean IsKnowledgeEnabled;

    public java.lang.Boolean getIsKnowledgeEnabled() {
      return IsKnowledgeEnabled;
    }

    public void setIsKnowledgeEnabled(java.lang.Boolean IsKnowledgeEnabled) {
      this.IsKnowledgeEnabled = IsKnowledgeEnabled;
      IsKnowledgeEnabled__is_set = true;
    }

    protected void setIsKnowledgeEnabled(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsKnowledgeEnabled", "urn:sobject.tooling.soap.sforce.com","IsKnowledgeEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsKnowledgeEnabled((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsKnowledgeEnabled", "urn:sobject.tooling.soap.sforce.com","IsKnowledgeEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsKnowledgeEnabled(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsKnowledgeEnabled", "urn:sobject.tooling.soap.sforce.com","IsKnowledgeEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsKnowledgeEnabled, IsKnowledgeEnabled__is_set);
    }

    /**
     * element : IsLightningKnowledgeEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsLightningKnowledgeEnabled__is_set = false;

    private java.lang.Boolean IsLightningKnowledgeEnabled;

    public java.lang.Boolean getIsLightningKnowledgeEnabled() {
      return IsLightningKnowledgeEnabled;
    }

    public void setIsLightningKnowledgeEnabled(java.lang.Boolean IsLightningKnowledgeEnabled) {
      this.IsLightningKnowledgeEnabled = IsLightningKnowledgeEnabled;
      IsLightningKnowledgeEnabled__is_set = true;
    }

    protected void setIsLightningKnowledgeEnabled(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsLightningKnowledgeEnabled", "urn:sobject.tooling.soap.sforce.com","IsLightningKnowledgeEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsLightningKnowledgeEnabled((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsLightningKnowledgeEnabled", "urn:sobject.tooling.soap.sforce.com","IsLightningKnowledgeEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsLightningKnowledgeEnabled(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsLightningKnowledgeEnabled", "urn:sobject.tooling.soap.sforce.com","IsLightningKnowledgeEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsLightningKnowledgeEnabled, IsLightningKnowledgeEnabled__is_set);
    }

    /**
     * element : LanguagesId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean LanguagesId__is_set = false;

    private java.lang.String LanguagesId;

    public java.lang.String getLanguagesId() {
      return LanguagesId;
    }

    public void setLanguagesId(java.lang.String LanguagesId) {
      this.LanguagesId = LanguagesId;
      LanguagesId__is_set = true;
    }

    protected void setLanguagesId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LanguagesId", "urn:sobject.tooling.soap.sforce.com","LanguagesId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setLanguagesId(__typeMapper.readString(__in, _lookupTypeInfo("LanguagesId", "urn:sobject.tooling.soap.sforce.com","LanguagesId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLanguagesId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LanguagesId", "urn:sobject.tooling.soap.sforce.com","LanguagesId","http://www.w3.org/2001/XMLSchema","string",0,1,true), LanguagesId, LanguagesId__is_set);
    }

    /**
     * element : Metadata of type {urn:metadata.tooling.soap.sforce.com}KnowledgeSettings
     * java type: com.sforce.soap.tooling.metadata.KnowledgeSettings
     */
    private boolean Metadata__is_set = false;

    private com.sforce.soap.tooling.metadata.KnowledgeSettings Metadata;

    public com.sforce.soap.tooling.metadata.KnowledgeSettings getMetadata() {
      return Metadata;
    }

    public void setMetadata(com.sforce.soap.tooling.metadata.KnowledgeSettings Metadata) {
      this.Metadata = Metadata;
      Metadata__is_set = true;
    }

    protected void setMetadata(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Metadata", "urn:sobject.tooling.soap.sforce.com","Metadata","urn:metadata.tooling.soap.sforce.com","KnowledgeSettings",0,1,true))) {
        setMetadata((com.sforce.soap.tooling.metadata.KnowledgeSettings)__typeMapper.readObject(__in, _lookupTypeInfo("Metadata", "urn:sobject.tooling.soap.sforce.com","Metadata","urn:metadata.tooling.soap.sforce.com","KnowledgeSettings",0,1,true), com.sforce.soap.tooling.metadata.KnowledgeSettings.class));
      }
    }

    private void writeFieldMetadata(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Metadata", "urn:sobject.tooling.soap.sforce.com","Metadata","urn:metadata.tooling.soap.sforce.com","KnowledgeSettings",0,1,true), Metadata, Metadata__is_set);
    }

    /**
     * element : ShowArticleSummariesCustomerPortal of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean ShowArticleSummariesCustomerPortal__is_set = false;

    private java.lang.Boolean ShowArticleSummariesCustomerPortal;

    public java.lang.Boolean getShowArticleSummariesCustomerPortal() {
      return ShowArticleSummariesCustomerPortal;
    }

    public void setShowArticleSummariesCustomerPortal(java.lang.Boolean ShowArticleSummariesCustomerPortal) {
      this.ShowArticleSummariesCustomerPortal = ShowArticleSummariesCustomerPortal;
      ShowArticleSummariesCustomerPortal__is_set = true;
    }

    protected void setShowArticleSummariesCustomerPortal(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ShowArticleSummariesCustomerPortal", "urn:sobject.tooling.soap.sforce.com","ShowArticleSummariesCustomerPortal","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setShowArticleSummariesCustomerPortal((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("ShowArticleSummariesCustomerPortal", "urn:sobject.tooling.soap.sforce.com","ShowArticleSummariesCustomerPortal","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldShowArticleSummariesCustomerPortal(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ShowArticleSummariesCustomerPortal", "urn:sobject.tooling.soap.sforce.com","ShowArticleSummariesCustomerPortal","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), ShowArticleSummariesCustomerPortal, ShowArticleSummariesCustomerPortal__is_set);
    }

    /**
     * element : ShowArticleSummariesInternalApp of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean ShowArticleSummariesInternalApp__is_set = false;

    private java.lang.Boolean ShowArticleSummariesInternalApp;

    public java.lang.Boolean getShowArticleSummariesInternalApp() {
      return ShowArticleSummariesInternalApp;
    }

    public void setShowArticleSummariesInternalApp(java.lang.Boolean ShowArticleSummariesInternalApp) {
      this.ShowArticleSummariesInternalApp = ShowArticleSummariesInternalApp;
      ShowArticleSummariesInternalApp__is_set = true;
    }

    protected void setShowArticleSummariesInternalApp(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ShowArticleSummariesInternalApp", "urn:sobject.tooling.soap.sforce.com","ShowArticleSummariesInternalApp","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setShowArticleSummariesInternalApp((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("ShowArticleSummariesInternalApp", "urn:sobject.tooling.soap.sforce.com","ShowArticleSummariesInternalApp","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldShowArticleSummariesInternalApp(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ShowArticleSummariesInternalApp", "urn:sobject.tooling.soap.sforce.com","ShowArticleSummariesInternalApp","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), ShowArticleSummariesInternalApp, ShowArticleSummariesInternalApp__is_set);
    }

    /**
     * element : ShowArticleSummariesPartnerPortal of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean ShowArticleSummariesPartnerPortal__is_set = false;

    private java.lang.Boolean ShowArticleSummariesPartnerPortal;

    public java.lang.Boolean getShowArticleSummariesPartnerPortal() {
      return ShowArticleSummariesPartnerPortal;
    }

    public void setShowArticleSummariesPartnerPortal(java.lang.Boolean ShowArticleSummariesPartnerPortal) {
      this.ShowArticleSummariesPartnerPortal = ShowArticleSummariesPartnerPortal;
      ShowArticleSummariesPartnerPortal__is_set = true;
    }

    protected void setShowArticleSummariesPartnerPortal(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ShowArticleSummariesPartnerPortal", "urn:sobject.tooling.soap.sforce.com","ShowArticleSummariesPartnerPortal","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setShowArticleSummariesPartnerPortal((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("ShowArticleSummariesPartnerPortal", "urn:sobject.tooling.soap.sforce.com","ShowArticleSummariesPartnerPortal","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldShowArticleSummariesPartnerPortal(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ShowArticleSummariesPartnerPortal", "urn:sobject.tooling.soap.sforce.com","ShowArticleSummariesPartnerPortal","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), ShowArticleSummariesPartnerPortal, ShowArticleSummariesPartnerPortal__is_set);
    }

    /**
     * element : ShowValidationStatusField of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean ShowValidationStatusField__is_set = false;

    private java.lang.Boolean ShowValidationStatusField;

    public java.lang.Boolean getShowValidationStatusField() {
      return ShowValidationStatusField;
    }

    public void setShowValidationStatusField(java.lang.Boolean ShowValidationStatusField) {
      this.ShowValidationStatusField = ShowValidationStatusField;
      ShowValidationStatusField__is_set = true;
    }

    protected void setShowValidationStatusField(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("ShowValidationStatusField", "urn:sobject.tooling.soap.sforce.com","ShowValidationStatusField","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setShowValidationStatusField((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("ShowValidationStatusField", "urn:sobject.tooling.soap.sforce.com","ShowValidationStatusField","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldShowValidationStatusField(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("ShowValidationStatusField", "urn:sobject.tooling.soap.sforce.com","ShowValidationStatusField","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), ShowValidationStatusField, ShowValidationStatusField__is_set);
    }

    /**
     * element : SuggestedArticlesId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean SuggestedArticlesId__is_set = false;

    private java.lang.String SuggestedArticlesId;

    public java.lang.String getSuggestedArticlesId() {
      return SuggestedArticlesId;
    }

    public void setSuggestedArticlesId(java.lang.String SuggestedArticlesId) {
      this.SuggestedArticlesId = SuggestedArticlesId;
      SuggestedArticlesId__is_set = true;
    }

    protected void setSuggestedArticlesId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SuggestedArticlesId", "urn:sobject.tooling.soap.sforce.com","SuggestedArticlesId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setSuggestedArticlesId(__typeMapper.readString(__in, _lookupTypeInfo("SuggestedArticlesId", "urn:sobject.tooling.soap.sforce.com","SuggestedArticlesId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSuggestedArticlesId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SuggestedArticlesId", "urn:sobject.tooling.soap.sforce.com","SuggestedArticlesId","http://www.w3.org/2001/XMLSchema","string",0,1,true), SuggestedArticlesId, SuggestedArticlesId__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.tooling.soap.sforce.com", "KnowledgeSettings");
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
      sb.append("[KnowledgeSettings ");
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
      writeFieldAnswersId(__out, __typeMapper);
      writeFieldCasesId(__out, __typeMapper);
      writeFieldDefaultLanguage(__out, __typeMapper);
      writeFieldDurableId(__out, __typeMapper);
      writeFieldFullName(__out, __typeMapper);
      writeFieldIsChatterQuestionKbDeflectionEnabled(__out, __typeMapper);
      writeFieldIsCreateEditOnArticlesTabEnabled(__out, __typeMapper);
      writeFieldIsExternalMediaContentEnabled(__out, __typeMapper);
      writeFieldIsKnowledgeEnabled(__out, __typeMapper);
      writeFieldIsLightningKnowledgeEnabled(__out, __typeMapper);
      writeFieldLanguagesId(__out, __typeMapper);
      writeFieldMetadata(__out, __typeMapper);
      writeFieldShowArticleSummariesCustomerPortal(__out, __typeMapper);
      writeFieldShowArticleSummariesInternalApp(__out, __typeMapper);
      writeFieldShowArticleSummariesPartnerPortal(__out, __typeMapper);
      writeFieldShowValidationStatusField(__out, __typeMapper);
      writeFieldSuggestedArticlesId(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAnswersId(__in, __typeMapper);
      setCasesId(__in, __typeMapper);
      setDefaultLanguage(__in, __typeMapper);
      setDurableId(__in, __typeMapper);
      setFullName(__in, __typeMapper);
      setIsChatterQuestionKbDeflectionEnabled(__in, __typeMapper);
      setIsCreateEditOnArticlesTabEnabled(__in, __typeMapper);
      setIsExternalMediaContentEnabled(__in, __typeMapper);
      setIsKnowledgeEnabled(__in, __typeMapper);
      setIsLightningKnowledgeEnabled(__in, __typeMapper);
      setLanguagesId(__in, __typeMapper);
      setMetadata(__in, __typeMapper);
      setShowArticleSummariesCustomerPortal(__in, __typeMapper);
      setShowArticleSummariesInternalApp(__in, __typeMapper);
      setShowArticleSummariesPartnerPortal(__in, __typeMapper);
      setShowValidationStatusField(__in, __typeMapper);
      setSuggestedArticlesId(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "AnswersId", AnswersId);
      toStringHelper(sb, "CasesId", CasesId);
      toStringHelper(sb, "DefaultLanguage", DefaultLanguage);
      toStringHelper(sb, "DurableId", DurableId);
      toStringHelper(sb, "FullName", FullName);
      toStringHelper(sb, "IsChatterQuestionKbDeflectionEnabled", IsChatterQuestionKbDeflectionEnabled);
      toStringHelper(sb, "IsCreateEditOnArticlesTabEnabled", IsCreateEditOnArticlesTabEnabled);
      toStringHelper(sb, "IsExternalMediaContentEnabled", IsExternalMediaContentEnabled);
      toStringHelper(sb, "IsKnowledgeEnabled", IsKnowledgeEnabled);
      toStringHelper(sb, "IsLightningKnowledgeEnabled", IsLightningKnowledgeEnabled);
      toStringHelper(sb, "LanguagesId", LanguagesId);
      toStringHelper(sb, "Metadata", Metadata);
      toStringHelper(sb, "ShowArticleSummariesCustomerPortal", ShowArticleSummariesCustomerPortal);
      toStringHelper(sb, "ShowArticleSummariesInternalApp", ShowArticleSummariesInternalApp);
      toStringHelper(sb, "ShowArticleSummariesPartnerPortal", ShowArticleSummariesPartnerPortal);
      toStringHelper(sb, "ShowValidationStatusField", ShowValidationStatusField);
      toStringHelper(sb, "SuggestedArticlesId", SuggestedArticlesId);
    }


}
