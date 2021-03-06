package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class Community extends com.sforce.soap.tooling.metadata.Metadata {

    /**
     * Constructor
     */
    public Community() {}

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
      if (__typeMapper.isElement(__in, _lookupTypeInfo("active", "urn:metadata.tooling.soap.sforce.com","active","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setActive(__typeMapper.readBoolean(__in, _lookupTypeInfo("active", "urn:metadata.tooling.soap.sforce.com","active","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldActive(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("active", "urn:metadata.tooling.soap.sforce.com","active","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), active, active__is_set);
    }

    /**
     * element : chatterAnswersFacebookSsoUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean chatterAnswersFacebookSsoUrl__is_set = false;

    private java.lang.String chatterAnswersFacebookSsoUrl;

    public java.lang.String getChatterAnswersFacebookSsoUrl() {
      return chatterAnswersFacebookSsoUrl;
    }

    public void setChatterAnswersFacebookSsoUrl(java.lang.String chatterAnswersFacebookSsoUrl) {
      this.chatterAnswersFacebookSsoUrl = chatterAnswersFacebookSsoUrl;
      chatterAnswersFacebookSsoUrl__is_set = true;
    }

    protected void setChatterAnswersFacebookSsoUrl(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("chatterAnswersFacebookSsoUrl", "urn:metadata.tooling.soap.sforce.com","chatterAnswersFacebookSsoUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setChatterAnswersFacebookSsoUrl(__typeMapper.readString(__in, _lookupTypeInfo("chatterAnswersFacebookSsoUrl", "urn:metadata.tooling.soap.sforce.com","chatterAnswersFacebookSsoUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldChatterAnswersFacebookSsoUrl(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("chatterAnswersFacebookSsoUrl", "urn:metadata.tooling.soap.sforce.com","chatterAnswersFacebookSsoUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true), chatterAnswersFacebookSsoUrl, chatterAnswersFacebookSsoUrl__is_set);
    }

    /**
     * element : communityFeedPage of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean communityFeedPage__is_set = false;

    private java.lang.String communityFeedPage;

    public java.lang.String getCommunityFeedPage() {
      return communityFeedPage;
    }

    public void setCommunityFeedPage(java.lang.String communityFeedPage) {
      this.communityFeedPage = communityFeedPage;
      communityFeedPage__is_set = true;
    }

    protected void setCommunityFeedPage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("communityFeedPage", "urn:metadata.tooling.soap.sforce.com","communityFeedPage","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setCommunityFeedPage(__typeMapper.readString(__in, _lookupTypeInfo("communityFeedPage", "urn:metadata.tooling.soap.sforce.com","communityFeedPage","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCommunityFeedPage(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("communityFeedPage", "urn:metadata.tooling.soap.sforce.com","communityFeedPage","http://www.w3.org/2001/XMLSchema","string",0,1,true), communityFeedPage, communityFeedPage__is_set);
    }

    /**
     * element : dataCategoryName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean dataCategoryName__is_set = false;

    private java.lang.String dataCategoryName;

    public java.lang.String getDataCategoryName() {
      return dataCategoryName;
    }

    public void setDataCategoryName(java.lang.String dataCategoryName) {
      this.dataCategoryName = dataCategoryName;
      dataCategoryName__is_set = true;
    }

    protected void setDataCategoryName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("dataCategoryName", "urn:metadata.tooling.soap.sforce.com","dataCategoryName","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDataCategoryName(__typeMapper.readString(__in, _lookupTypeInfo("dataCategoryName", "urn:metadata.tooling.soap.sforce.com","dataCategoryName","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDataCategoryName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("dataCategoryName", "urn:metadata.tooling.soap.sforce.com","dataCategoryName","http://www.w3.org/2001/XMLSchema","string",0,1,true), dataCategoryName, dataCategoryName__is_set);
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
     * element : emailFooterDocument of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean emailFooterDocument__is_set = false;

    private java.lang.String emailFooterDocument;

    public java.lang.String getEmailFooterDocument() {
      return emailFooterDocument;
    }

    public void setEmailFooterDocument(java.lang.String emailFooterDocument) {
      this.emailFooterDocument = emailFooterDocument;
      emailFooterDocument__is_set = true;
    }

    protected void setEmailFooterDocument(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("emailFooterDocument", "urn:metadata.tooling.soap.sforce.com","emailFooterDocument","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setEmailFooterDocument(__typeMapper.readString(__in, _lookupTypeInfo("emailFooterDocument", "urn:metadata.tooling.soap.sforce.com","emailFooterDocument","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldEmailFooterDocument(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("emailFooterDocument", "urn:metadata.tooling.soap.sforce.com","emailFooterDocument","http://www.w3.org/2001/XMLSchema","string",0,1,true), emailFooterDocument, emailFooterDocument__is_set);
    }

    /**
     * element : emailHeaderDocument of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean emailHeaderDocument__is_set = false;

    private java.lang.String emailHeaderDocument;

    public java.lang.String getEmailHeaderDocument() {
      return emailHeaderDocument;
    }

    public void setEmailHeaderDocument(java.lang.String emailHeaderDocument) {
      this.emailHeaderDocument = emailHeaderDocument;
      emailHeaderDocument__is_set = true;
    }

    protected void setEmailHeaderDocument(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("emailHeaderDocument", "urn:metadata.tooling.soap.sforce.com","emailHeaderDocument","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setEmailHeaderDocument(__typeMapper.readString(__in, _lookupTypeInfo("emailHeaderDocument", "urn:metadata.tooling.soap.sforce.com","emailHeaderDocument","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldEmailHeaderDocument(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("emailHeaderDocument", "urn:metadata.tooling.soap.sforce.com","emailHeaderDocument","http://www.w3.org/2001/XMLSchema","string",0,1,true), emailHeaderDocument, emailHeaderDocument__is_set);
    }

    /**
     * element : emailNotificationUrl of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean emailNotificationUrl__is_set = false;

    private java.lang.String emailNotificationUrl;

    public java.lang.String getEmailNotificationUrl() {
      return emailNotificationUrl;
    }

    public void setEmailNotificationUrl(java.lang.String emailNotificationUrl) {
      this.emailNotificationUrl = emailNotificationUrl;
      emailNotificationUrl__is_set = true;
    }

    protected void setEmailNotificationUrl(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("emailNotificationUrl", "urn:metadata.tooling.soap.sforce.com","emailNotificationUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setEmailNotificationUrl(__typeMapper.readString(__in, _lookupTypeInfo("emailNotificationUrl", "urn:metadata.tooling.soap.sforce.com","emailNotificationUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldEmailNotificationUrl(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("emailNotificationUrl", "urn:metadata.tooling.soap.sforce.com","emailNotificationUrl","http://www.w3.org/2001/XMLSchema","string",0,1,true), emailNotificationUrl, emailNotificationUrl__is_set);
    }

    /**
     * element : enableChatterAnswers of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean enableChatterAnswers__is_set = false;

    private boolean enableChatterAnswers;

    public boolean getEnableChatterAnswers() {
      return enableChatterAnswers;
    }

    public boolean isEnableChatterAnswers() {
      return enableChatterAnswers;
    }

    public void setEnableChatterAnswers(boolean enableChatterAnswers) {
      this.enableChatterAnswers = enableChatterAnswers;
      enableChatterAnswers__is_set = true;
    }

    protected void setEnableChatterAnswers(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("enableChatterAnswers", "urn:metadata.tooling.soap.sforce.com","enableChatterAnswers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setEnableChatterAnswers(__typeMapper.readBoolean(__in, _lookupTypeInfo("enableChatterAnswers", "urn:metadata.tooling.soap.sforce.com","enableChatterAnswers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldEnableChatterAnswers(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("enableChatterAnswers", "urn:metadata.tooling.soap.sforce.com","enableChatterAnswers","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), enableChatterAnswers, enableChatterAnswers__is_set);
    }

    /**
     * element : enablePrivateQuestions of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean enablePrivateQuestions__is_set = false;

    private boolean enablePrivateQuestions;

    public boolean getEnablePrivateQuestions() {
      return enablePrivateQuestions;
    }

    public boolean isEnablePrivateQuestions() {
      return enablePrivateQuestions;
    }

    public void setEnablePrivateQuestions(boolean enablePrivateQuestions) {
      this.enablePrivateQuestions = enablePrivateQuestions;
      enablePrivateQuestions__is_set = true;
    }

    protected void setEnablePrivateQuestions(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("enablePrivateQuestions", "urn:metadata.tooling.soap.sforce.com","enablePrivateQuestions","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setEnablePrivateQuestions(__typeMapper.readBoolean(__in, _lookupTypeInfo("enablePrivateQuestions", "urn:metadata.tooling.soap.sforce.com","enablePrivateQuestions","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldEnablePrivateQuestions(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("enablePrivateQuestions", "urn:metadata.tooling.soap.sforce.com","enablePrivateQuestions","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), enablePrivateQuestions, enablePrivateQuestions__is_set);
    }

    /**
     * element : expertsGroup of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean expertsGroup__is_set = false;

    private java.lang.String expertsGroup;

    public java.lang.String getExpertsGroup() {
      return expertsGroup;
    }

    public void setExpertsGroup(java.lang.String expertsGroup) {
      this.expertsGroup = expertsGroup;
      expertsGroup__is_set = true;
    }

    protected void setExpertsGroup(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("expertsGroup", "urn:metadata.tooling.soap.sforce.com","expertsGroup","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setExpertsGroup(__typeMapper.readString(__in, _lookupTypeInfo("expertsGroup", "urn:metadata.tooling.soap.sforce.com","expertsGroup","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldExpertsGroup(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("expertsGroup", "urn:metadata.tooling.soap.sforce.com","expertsGroup","http://www.w3.org/2001/XMLSchema","string",0,1,true), expertsGroup, expertsGroup__is_set);
    }

    /**
     * element : portal of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean portal__is_set = false;

    private java.lang.String portal;

    public java.lang.String getPortal() {
      return portal;
    }

    public void setPortal(java.lang.String portal) {
      this.portal = portal;
      portal__is_set = true;
    }

    protected void setPortal(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("portal", "urn:metadata.tooling.soap.sforce.com","portal","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setPortal(__typeMapper.readString(__in, _lookupTypeInfo("portal", "urn:metadata.tooling.soap.sforce.com","portal","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldPortal(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("portal", "urn:metadata.tooling.soap.sforce.com","portal","http://www.w3.org/2001/XMLSchema","string",0,1,true), portal, portal__is_set);
    }

    /**
     * element : reputationLevels of type {urn:metadata.tooling.soap.sforce.com}ReputationLevels
     * java type: com.sforce.soap.tooling.metadata.ReputationLevels
     */
    private boolean reputationLevels__is_set = false;

    private com.sforce.soap.tooling.metadata.ReputationLevels reputationLevels;

    public com.sforce.soap.tooling.metadata.ReputationLevels getReputationLevels() {
      return reputationLevels;
    }

    public void setReputationLevels(com.sforce.soap.tooling.metadata.ReputationLevels reputationLevels) {
      this.reputationLevels = reputationLevels;
      reputationLevels__is_set = true;
    }

    protected void setReputationLevels(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("reputationLevels", "urn:metadata.tooling.soap.sforce.com","reputationLevels","urn:metadata.tooling.soap.sforce.com","ReputationLevels",0,1,true))) {
        setReputationLevels((com.sforce.soap.tooling.metadata.ReputationLevels)__typeMapper.readObject(__in, _lookupTypeInfo("reputationLevels", "urn:metadata.tooling.soap.sforce.com","reputationLevels","urn:metadata.tooling.soap.sforce.com","ReputationLevels",0,1,true), com.sforce.soap.tooling.metadata.ReputationLevels.class));
      }
    }

    private void writeFieldReputationLevels(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("reputationLevels", "urn:metadata.tooling.soap.sforce.com","reputationLevels","urn:metadata.tooling.soap.sforce.com","ReputationLevels",0,1,true), reputationLevels, reputationLevels__is_set);
    }

    /**
     * element : showInPortal of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean showInPortal__is_set = false;

    private boolean showInPortal;

    public boolean getShowInPortal() {
      return showInPortal;
    }

    public boolean isShowInPortal() {
      return showInPortal;
    }

    public void setShowInPortal(boolean showInPortal) {
      this.showInPortal = showInPortal;
      showInPortal__is_set = true;
    }

    protected void setShowInPortal(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("showInPortal", "urn:metadata.tooling.soap.sforce.com","showInPortal","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setShowInPortal(__typeMapper.readBoolean(__in, _lookupTypeInfo("showInPortal", "urn:metadata.tooling.soap.sforce.com","showInPortal","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldShowInPortal(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("showInPortal", "urn:metadata.tooling.soap.sforce.com","showInPortal","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), showInPortal, showInPortal__is_set);
    }

    /**
     * element : site of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean site__is_set = false;

    private java.lang.String site;

    public java.lang.String getSite() {
      return site;
    }

    public void setSite(java.lang.String site) {
      this.site = site;
      site__is_set = true;
    }

    protected void setSite(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("site", "urn:metadata.tooling.soap.sforce.com","site","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setSite(__typeMapper.readString(__in, _lookupTypeInfo("site", "urn:metadata.tooling.soap.sforce.com","site","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSite(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("site", "urn:metadata.tooling.soap.sforce.com","site","http://www.w3.org/2001/XMLSchema","string",0,1,true), site, site__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:metadata.tooling.soap.sforce.com", "Community");
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
      sb.append("[Community ");
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
      writeFieldActive(__out, __typeMapper);
      writeFieldChatterAnswersFacebookSsoUrl(__out, __typeMapper);
      writeFieldCommunityFeedPage(__out, __typeMapper);
      writeFieldDataCategoryName(__out, __typeMapper);
      writeFieldDescription(__out, __typeMapper);
      writeFieldEmailFooterDocument(__out, __typeMapper);
      writeFieldEmailHeaderDocument(__out, __typeMapper);
      writeFieldEmailNotificationUrl(__out, __typeMapper);
      writeFieldEnableChatterAnswers(__out, __typeMapper);
      writeFieldEnablePrivateQuestions(__out, __typeMapper);
      writeFieldExpertsGroup(__out, __typeMapper);
      writeFieldPortal(__out, __typeMapper);
      writeFieldReputationLevels(__out, __typeMapper);
      writeFieldShowInPortal(__out, __typeMapper);
      writeFieldSite(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setActive(__in, __typeMapper);
      setChatterAnswersFacebookSsoUrl(__in, __typeMapper);
      setCommunityFeedPage(__in, __typeMapper);
      setDataCategoryName(__in, __typeMapper);
      setDescription(__in, __typeMapper);
      setEmailFooterDocument(__in, __typeMapper);
      setEmailHeaderDocument(__in, __typeMapper);
      setEmailNotificationUrl(__in, __typeMapper);
      setEnableChatterAnswers(__in, __typeMapper);
      setEnablePrivateQuestions(__in, __typeMapper);
      setExpertsGroup(__in, __typeMapper);
      setPortal(__in, __typeMapper);
      setReputationLevels(__in, __typeMapper);
      setShowInPortal(__in, __typeMapper);
      setSite(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "active", active);
      toStringHelper(sb, "chatterAnswersFacebookSsoUrl", chatterAnswersFacebookSsoUrl);
      toStringHelper(sb, "communityFeedPage", communityFeedPage);
      toStringHelper(sb, "dataCategoryName", dataCategoryName);
      toStringHelper(sb, "description", description);
      toStringHelper(sb, "emailFooterDocument", emailFooterDocument);
      toStringHelper(sb, "emailHeaderDocument", emailHeaderDocument);
      toStringHelper(sb, "emailNotificationUrl", emailNotificationUrl);
      toStringHelper(sb, "enableChatterAnswers", enableChatterAnswers);
      toStringHelper(sb, "enablePrivateQuestions", enablePrivateQuestions);
      toStringHelper(sb, "expertsGroup", expertsGroup);
      toStringHelper(sb, "portal", portal);
      toStringHelper(sb, "reputationLevels", reputationLevels);
      toStringHelper(sb, "showInPortal", showInPortal);
      toStringHelper(sb, "site", site);
    }


}
