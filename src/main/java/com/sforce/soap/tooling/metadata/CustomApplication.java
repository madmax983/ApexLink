package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class CustomApplication extends com.sforce.soap.tooling.metadata.Metadata {

    /**
     * Constructor
     */
    public CustomApplication() {}

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
     * element : actionOverrides of type {urn:metadata.tooling.soap.sforce.com}AppActionOverride
     * java type: com.sforce.soap.tooling.metadata.AppActionOverride[]
     */
    private boolean actionOverrides__is_set = false;

    private com.sforce.soap.tooling.metadata.AppActionOverride[] actionOverrides = new com.sforce.soap.tooling.metadata.AppActionOverride[0];

    public com.sforce.soap.tooling.metadata.AppActionOverride[] getActionOverrides() {
      return actionOverrides;
    }

    public void setActionOverrides(com.sforce.soap.tooling.metadata.AppActionOverride[] actionOverrides) {
      this.actionOverrides = actionOverrides;
      actionOverrides__is_set = true;
    }

    protected void setActionOverrides(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("actionOverrides", "urn:metadata.tooling.soap.sforce.com","actionOverrides","urn:metadata.tooling.soap.sforce.com","AppActionOverride",0,-1,true))) {
        setActionOverrides((com.sforce.soap.tooling.metadata.AppActionOverride[])__typeMapper.readObject(__in, _lookupTypeInfo("actionOverrides", "urn:metadata.tooling.soap.sforce.com","actionOverrides","urn:metadata.tooling.soap.sforce.com","AppActionOverride",0,-1,true), com.sforce.soap.tooling.metadata.AppActionOverride[].class));
      }
    }

    private void writeFieldActionOverrides(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("actionOverrides", "urn:metadata.tooling.soap.sforce.com","actionOverrides","urn:metadata.tooling.soap.sforce.com","AppActionOverride",0,-1,true), actionOverrides, actionOverrides__is_set);
    }

    /**
     * element : brand of type {urn:metadata.tooling.soap.sforce.com}AppBrand
     * java type: com.sforce.soap.tooling.metadata.AppBrand
     */
    private boolean brand__is_set = false;

    private com.sforce.soap.tooling.metadata.AppBrand brand;

    public com.sforce.soap.tooling.metadata.AppBrand getBrand() {
      return brand;
    }

    public void setBrand(com.sforce.soap.tooling.metadata.AppBrand brand) {
      this.brand = brand;
      brand__is_set = true;
    }

    protected void setBrand(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("brand", "urn:metadata.tooling.soap.sforce.com","brand","urn:metadata.tooling.soap.sforce.com","AppBrand",0,1,true))) {
        setBrand((com.sforce.soap.tooling.metadata.AppBrand)__typeMapper.readObject(__in, _lookupTypeInfo("brand", "urn:metadata.tooling.soap.sforce.com","brand","urn:metadata.tooling.soap.sforce.com","AppBrand",0,1,true), com.sforce.soap.tooling.metadata.AppBrand.class));
      }
    }

    private void writeFieldBrand(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("brand", "urn:metadata.tooling.soap.sforce.com","brand","urn:metadata.tooling.soap.sforce.com","AppBrand",0,1,true), brand, brand__is_set);
    }

    /**
     * element : consoleConfig of type {urn:metadata.tooling.soap.sforce.com}ServiceCloudConsoleConfig
     * java type: com.sforce.soap.tooling.metadata.ServiceCloudConsoleConfig
     */
    private boolean consoleConfig__is_set = false;

    private com.sforce.soap.tooling.metadata.ServiceCloudConsoleConfig consoleConfig;

    public com.sforce.soap.tooling.metadata.ServiceCloudConsoleConfig getConsoleConfig() {
      return consoleConfig;
    }

    public void setConsoleConfig(com.sforce.soap.tooling.metadata.ServiceCloudConsoleConfig consoleConfig) {
      this.consoleConfig = consoleConfig;
      consoleConfig__is_set = true;
    }

    protected void setConsoleConfig(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("consoleConfig", "urn:metadata.tooling.soap.sforce.com","consoleConfig","urn:metadata.tooling.soap.sforce.com","ServiceCloudConsoleConfig",0,1,true))) {
        setConsoleConfig((com.sforce.soap.tooling.metadata.ServiceCloudConsoleConfig)__typeMapper.readObject(__in, _lookupTypeInfo("consoleConfig", "urn:metadata.tooling.soap.sforce.com","consoleConfig","urn:metadata.tooling.soap.sforce.com","ServiceCloudConsoleConfig",0,1,true), com.sforce.soap.tooling.metadata.ServiceCloudConsoleConfig.class));
      }
    }

    private void writeFieldConsoleConfig(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("consoleConfig", "urn:metadata.tooling.soap.sforce.com","consoleConfig","urn:metadata.tooling.soap.sforce.com","ServiceCloudConsoleConfig",0,1,true), consoleConfig, consoleConfig__is_set);
    }

    /**
     * element : defaultLandingTab of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean defaultLandingTab__is_set = false;

    private java.lang.String defaultLandingTab;

    public java.lang.String getDefaultLandingTab() {
      return defaultLandingTab;
    }

    public void setDefaultLandingTab(java.lang.String defaultLandingTab) {
      this.defaultLandingTab = defaultLandingTab;
      defaultLandingTab__is_set = true;
    }

    protected void setDefaultLandingTab(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("defaultLandingTab", "urn:metadata.tooling.soap.sforce.com","defaultLandingTab","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDefaultLandingTab(__typeMapper.readString(__in, _lookupTypeInfo("defaultLandingTab", "urn:metadata.tooling.soap.sforce.com","defaultLandingTab","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDefaultLandingTab(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("defaultLandingTab", "urn:metadata.tooling.soap.sforce.com","defaultLandingTab","http://www.w3.org/2001/XMLSchema","string",0,1,true), defaultLandingTab, defaultLandingTab__is_set);
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
     * element : formFactors of type {urn:tooling.soap.sforce.com}FormFactor
     * java type: com.sforce.soap.tooling.FormFactor[]
     */
    private boolean formFactors__is_set = false;

    private com.sforce.soap.tooling.FormFactor[] formFactors = new com.sforce.soap.tooling.FormFactor[0];

    public com.sforce.soap.tooling.FormFactor[] getFormFactors() {
      return formFactors;
    }

    public void setFormFactors(com.sforce.soap.tooling.FormFactor[] formFactors) {
      this.formFactors = formFactors;
      formFactors__is_set = true;
    }

    protected void setFormFactors(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("formFactors", "urn:metadata.tooling.soap.sforce.com","formFactors","urn:tooling.soap.sforce.com","FormFactor",0,-1,true))) {
        setFormFactors((com.sforce.soap.tooling.FormFactor[])__typeMapper.readObject(__in, _lookupTypeInfo("formFactors", "urn:metadata.tooling.soap.sforce.com","formFactors","urn:tooling.soap.sforce.com","FormFactor",0,-1,true), com.sforce.soap.tooling.FormFactor[].class));
      }
    }

    private void writeFieldFormFactors(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("formFactors", "urn:metadata.tooling.soap.sforce.com","formFactors","urn:tooling.soap.sforce.com","FormFactor",0,-1,true), formFactors, formFactors__is_set);
    }

    /**
     * element : isNavAutoTempTabsDisabled of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean isNavAutoTempTabsDisabled__is_set = false;

    private boolean isNavAutoTempTabsDisabled;

    public boolean getIsNavAutoTempTabsDisabled() {
      return isNavAutoTempTabsDisabled;
    }

    public boolean isIsNavAutoTempTabsDisabled() {
      return isNavAutoTempTabsDisabled;
    }

    public void setIsNavAutoTempTabsDisabled(boolean isNavAutoTempTabsDisabled) {
      this.isNavAutoTempTabsDisabled = isNavAutoTempTabsDisabled;
      isNavAutoTempTabsDisabled__is_set = true;
    }

    protected void setIsNavAutoTempTabsDisabled(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("isNavAutoTempTabsDisabled", "urn:metadata.tooling.soap.sforce.com","isNavAutoTempTabsDisabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsNavAutoTempTabsDisabled(__typeMapper.readBoolean(__in, _lookupTypeInfo("isNavAutoTempTabsDisabled", "urn:metadata.tooling.soap.sforce.com","isNavAutoTempTabsDisabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldIsNavAutoTempTabsDisabled(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("isNavAutoTempTabsDisabled", "urn:metadata.tooling.soap.sforce.com","isNavAutoTempTabsDisabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), isNavAutoTempTabsDisabled, isNavAutoTempTabsDisabled__is_set);
    }

    /**
     * element : isNavPersonalizationDisabled of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean isNavPersonalizationDisabled__is_set = false;

    private boolean isNavPersonalizationDisabled;

    public boolean getIsNavPersonalizationDisabled() {
      return isNavPersonalizationDisabled;
    }

    public boolean isIsNavPersonalizationDisabled() {
      return isNavPersonalizationDisabled;
    }

    public void setIsNavPersonalizationDisabled(boolean isNavPersonalizationDisabled) {
      this.isNavPersonalizationDisabled = isNavPersonalizationDisabled;
      isNavPersonalizationDisabled__is_set = true;
    }

    protected void setIsNavPersonalizationDisabled(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("isNavPersonalizationDisabled", "urn:metadata.tooling.soap.sforce.com","isNavPersonalizationDisabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsNavPersonalizationDisabled(__typeMapper.readBoolean(__in, _lookupTypeInfo("isNavPersonalizationDisabled", "urn:metadata.tooling.soap.sforce.com","isNavPersonalizationDisabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldIsNavPersonalizationDisabled(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("isNavPersonalizationDisabled", "urn:metadata.tooling.soap.sforce.com","isNavPersonalizationDisabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), isNavPersonalizationDisabled, isNavPersonalizationDisabled__is_set);
    }

    /**
     * element : isServiceCloudConsole of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean isServiceCloudConsole__is_set = false;

    private boolean isServiceCloudConsole;

    public boolean getIsServiceCloudConsole() {
      return isServiceCloudConsole;
    }

    public boolean isIsServiceCloudConsole() {
      return isServiceCloudConsole;
    }

    public void setIsServiceCloudConsole(boolean isServiceCloudConsole) {
      this.isServiceCloudConsole = isServiceCloudConsole;
      isServiceCloudConsole__is_set = true;
    }

    protected void setIsServiceCloudConsole(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("isServiceCloudConsole", "urn:metadata.tooling.soap.sforce.com","isServiceCloudConsole","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsServiceCloudConsole(__typeMapper.readBoolean(__in, _lookupTypeInfo("isServiceCloudConsole", "urn:metadata.tooling.soap.sforce.com","isServiceCloudConsole","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldIsServiceCloudConsole(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("isServiceCloudConsole", "urn:metadata.tooling.soap.sforce.com","isServiceCloudConsole","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), isServiceCloudConsole, isServiceCloudConsole__is_set);
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
      if (__typeMapper.isElement(__in, _lookupTypeInfo("label", "urn:metadata.tooling.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setLabel(__typeMapper.readString(__in, _lookupTypeInfo("label", "urn:metadata.tooling.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLabel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("label", "urn:metadata.tooling.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",0,1,true), label, label__is_set);
    }

    /**
     * element : logo of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean logo__is_set = false;

    private java.lang.String logo;

    public java.lang.String getLogo() {
      return logo;
    }

    public void setLogo(java.lang.String logo) {
      this.logo = logo;
      logo__is_set = true;
    }

    protected void setLogo(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("logo", "urn:metadata.tooling.soap.sforce.com","logo","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setLogo(__typeMapper.readString(__in, _lookupTypeInfo("logo", "urn:metadata.tooling.soap.sforce.com","logo","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLogo(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("logo", "urn:metadata.tooling.soap.sforce.com","logo","http://www.w3.org/2001/XMLSchema","string",0,1,true), logo, logo__is_set);
    }

    /**
     * element : navType of type {urn:tooling.soap.sforce.com}NavType
     * java type: com.sforce.soap.tooling.NavType
     */
    private boolean navType__is_set = false;

    private com.sforce.soap.tooling.NavType navType;

    public com.sforce.soap.tooling.NavType getNavType() {
      return navType;
    }

    public void setNavType(com.sforce.soap.tooling.NavType navType) {
      this.navType = navType;
      navType__is_set = true;
    }

    protected void setNavType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("navType", "urn:metadata.tooling.soap.sforce.com","navType","urn:tooling.soap.sforce.com","NavType",0,1,true))) {
        setNavType((com.sforce.soap.tooling.NavType)__typeMapper.readObject(__in, _lookupTypeInfo("navType", "urn:metadata.tooling.soap.sforce.com","navType","urn:tooling.soap.sforce.com","NavType",0,1,true), com.sforce.soap.tooling.NavType.class));
      }
    }

    private void writeFieldNavType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("navType", "urn:metadata.tooling.soap.sforce.com","navType","urn:tooling.soap.sforce.com","NavType",0,1,true), navType, navType__is_set);
    }

    /**
     * element : preferences of type {urn:metadata.tooling.soap.sforce.com}AppPreferences
     * java type: com.sforce.soap.tooling.metadata.AppPreferences
     */
    private boolean preferences__is_set = false;

    private com.sforce.soap.tooling.metadata.AppPreferences preferences;

    public com.sforce.soap.tooling.metadata.AppPreferences getPreferences() {
      return preferences;
    }

    public void setPreferences(com.sforce.soap.tooling.metadata.AppPreferences preferences) {
      this.preferences = preferences;
      preferences__is_set = true;
    }

    protected void setPreferences(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("preferences", "urn:metadata.tooling.soap.sforce.com","preferences","urn:metadata.tooling.soap.sforce.com","AppPreferences",0,1,true))) {
        setPreferences((com.sforce.soap.tooling.metadata.AppPreferences)__typeMapper.readObject(__in, _lookupTypeInfo("preferences", "urn:metadata.tooling.soap.sforce.com","preferences","urn:metadata.tooling.soap.sforce.com","AppPreferences",0,1,true), com.sforce.soap.tooling.metadata.AppPreferences.class));
      }
    }

    private void writeFieldPreferences(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("preferences", "urn:metadata.tooling.soap.sforce.com","preferences","urn:metadata.tooling.soap.sforce.com","AppPreferences",0,1,true), preferences, preferences__is_set);
    }

    /**
     * element : profileActionOverrides of type {urn:metadata.tooling.soap.sforce.com}AppProfileActionOverride
     * java type: com.sforce.soap.tooling.metadata.AppProfileActionOverride[]
     */
    private boolean profileActionOverrides__is_set = false;

    private com.sforce.soap.tooling.metadata.AppProfileActionOverride[] profileActionOverrides = new com.sforce.soap.tooling.metadata.AppProfileActionOverride[0];

    public com.sforce.soap.tooling.metadata.AppProfileActionOverride[] getProfileActionOverrides() {
      return profileActionOverrides;
    }

    public void setProfileActionOverrides(com.sforce.soap.tooling.metadata.AppProfileActionOverride[] profileActionOverrides) {
      this.profileActionOverrides = profileActionOverrides;
      profileActionOverrides__is_set = true;
    }

    protected void setProfileActionOverrides(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("profileActionOverrides", "urn:metadata.tooling.soap.sforce.com","profileActionOverrides","urn:metadata.tooling.soap.sforce.com","AppProfileActionOverride",0,-1,true))) {
        setProfileActionOverrides((com.sforce.soap.tooling.metadata.AppProfileActionOverride[])__typeMapper.readObject(__in, _lookupTypeInfo("profileActionOverrides", "urn:metadata.tooling.soap.sforce.com","profileActionOverrides","urn:metadata.tooling.soap.sforce.com","AppProfileActionOverride",0,-1,true), com.sforce.soap.tooling.metadata.AppProfileActionOverride[].class));
      }
    }

    private void writeFieldProfileActionOverrides(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("profileActionOverrides", "urn:metadata.tooling.soap.sforce.com","profileActionOverrides","urn:metadata.tooling.soap.sforce.com","AppProfileActionOverride",0,-1,true), profileActionOverrides, profileActionOverrides__is_set);
    }

    /**
     * element : setupExperience of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean setupExperience__is_set = false;

    private java.lang.String setupExperience;

    public java.lang.String getSetupExperience() {
      return setupExperience;
    }

    public void setSetupExperience(java.lang.String setupExperience) {
      this.setupExperience = setupExperience;
      setupExperience__is_set = true;
    }

    protected void setSetupExperience(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("setupExperience", "urn:metadata.tooling.soap.sforce.com","setupExperience","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setSetupExperience(__typeMapper.readString(__in, _lookupTypeInfo("setupExperience", "urn:metadata.tooling.soap.sforce.com","setupExperience","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSetupExperience(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("setupExperience", "urn:metadata.tooling.soap.sforce.com","setupExperience","http://www.w3.org/2001/XMLSchema","string",0,1,true), setupExperience, setupExperience__is_set);
    }

    /**
     * element : subscriberTabs of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String[]
     */
    private boolean subscriberTabs__is_set = false;

    private java.lang.String[] subscriberTabs = new java.lang.String[0];

    public java.lang.String[] getSubscriberTabs() {
      return subscriberTabs;
    }

    public void setSubscriberTabs(java.lang.String[] subscriberTabs) {
      this.subscriberTabs = subscriberTabs;
      subscriberTabs__is_set = true;
    }

    protected void setSubscriberTabs(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("subscriberTabs", "urn:metadata.tooling.soap.sforce.com","subscriberTabs","http://www.w3.org/2001/XMLSchema","string",0,-1,true))) {
        setSubscriberTabs((java.lang.String[])__typeMapper.readObject(__in, _lookupTypeInfo("subscriberTabs", "urn:metadata.tooling.soap.sforce.com","subscriberTabs","http://www.w3.org/2001/XMLSchema","string",0,-1,true), java.lang.String[].class));
      }
    }

    private void writeFieldSubscriberTabs(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("subscriberTabs", "urn:metadata.tooling.soap.sforce.com","subscriberTabs","http://www.w3.org/2001/XMLSchema","string",0,-1,true), subscriberTabs, subscriberTabs__is_set);
    }

    /**
     * element : tabs of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String[]
     */
    private boolean tabs__is_set = false;

    private java.lang.String[] tabs = new java.lang.String[0];

    public java.lang.String[] getTabs() {
      return tabs;
    }

    public void setTabs(java.lang.String[] tabs) {
      this.tabs = tabs;
      tabs__is_set = true;
    }

    protected void setTabs(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("tabs", "urn:metadata.tooling.soap.sforce.com","tabs","http://www.w3.org/2001/XMLSchema","string",0,-1,true))) {
        setTabs((java.lang.String[])__typeMapper.readObject(__in, _lookupTypeInfo("tabs", "urn:metadata.tooling.soap.sforce.com","tabs","http://www.w3.org/2001/XMLSchema","string",0,-1,true), java.lang.String[].class));
      }
    }

    private void writeFieldTabs(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("tabs", "urn:metadata.tooling.soap.sforce.com","tabs","http://www.w3.org/2001/XMLSchema","string",0,-1,true), tabs, tabs__is_set);
    }

    /**
     * element : uiType of type {urn:tooling.soap.sforce.com}UiType
     * java type: com.sforce.soap.tooling.UiType
     */
    private boolean uiType__is_set = false;

    private com.sforce.soap.tooling.UiType uiType;

    public com.sforce.soap.tooling.UiType getUiType() {
      return uiType;
    }

    public void setUiType(com.sforce.soap.tooling.UiType uiType) {
      this.uiType = uiType;
      uiType__is_set = true;
    }

    protected void setUiType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("uiType", "urn:metadata.tooling.soap.sforce.com","uiType","urn:tooling.soap.sforce.com","UiType",0,1,true))) {
        setUiType((com.sforce.soap.tooling.UiType)__typeMapper.readObject(__in, _lookupTypeInfo("uiType", "urn:metadata.tooling.soap.sforce.com","uiType","urn:tooling.soap.sforce.com","UiType",0,1,true), com.sforce.soap.tooling.UiType.class));
      }
    }

    private void writeFieldUiType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("uiType", "urn:metadata.tooling.soap.sforce.com","uiType","urn:tooling.soap.sforce.com","UiType",0,1,true), uiType, uiType__is_set);
    }

    /**
     * element : utilityBar of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean utilityBar__is_set = false;

    private java.lang.String utilityBar;

    public java.lang.String getUtilityBar() {
      return utilityBar;
    }

    public void setUtilityBar(java.lang.String utilityBar) {
      this.utilityBar = utilityBar;
      utilityBar__is_set = true;
    }

    protected void setUtilityBar(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("utilityBar", "urn:metadata.tooling.soap.sforce.com","utilityBar","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setUtilityBar(__typeMapper.readString(__in, _lookupTypeInfo("utilityBar", "urn:metadata.tooling.soap.sforce.com","utilityBar","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldUtilityBar(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("utilityBar", "urn:metadata.tooling.soap.sforce.com","utilityBar","http://www.w3.org/2001/XMLSchema","string",0,1,true), utilityBar, utilityBar__is_set);
    }

    /**
     * element : workspaceConfig of type {urn:metadata.tooling.soap.sforce.com}AppWorkspaceConfig
     * java type: com.sforce.soap.tooling.metadata.AppWorkspaceConfig
     */
    private boolean workspaceConfig__is_set = false;

    private com.sforce.soap.tooling.metadata.AppWorkspaceConfig workspaceConfig;

    public com.sforce.soap.tooling.metadata.AppWorkspaceConfig getWorkspaceConfig() {
      return workspaceConfig;
    }

    public void setWorkspaceConfig(com.sforce.soap.tooling.metadata.AppWorkspaceConfig workspaceConfig) {
      this.workspaceConfig = workspaceConfig;
      workspaceConfig__is_set = true;
    }

    protected void setWorkspaceConfig(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("workspaceConfig", "urn:metadata.tooling.soap.sforce.com","workspaceConfig","urn:metadata.tooling.soap.sforce.com","AppWorkspaceConfig",0,1,true))) {
        setWorkspaceConfig((com.sforce.soap.tooling.metadata.AppWorkspaceConfig)__typeMapper.readObject(__in, _lookupTypeInfo("workspaceConfig", "urn:metadata.tooling.soap.sforce.com","workspaceConfig","urn:metadata.tooling.soap.sforce.com","AppWorkspaceConfig",0,1,true), com.sforce.soap.tooling.metadata.AppWorkspaceConfig.class));
      }
    }

    private void writeFieldWorkspaceConfig(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("workspaceConfig", "urn:metadata.tooling.soap.sforce.com","workspaceConfig","urn:metadata.tooling.soap.sforce.com","AppWorkspaceConfig",0,1,true), workspaceConfig, workspaceConfig__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:metadata.tooling.soap.sforce.com", "CustomApplication");
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
      sb.append("[CustomApplication ");
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
      writeFieldActionOverrides(__out, __typeMapper);
      writeFieldBrand(__out, __typeMapper);
      writeFieldConsoleConfig(__out, __typeMapper);
      writeFieldDefaultLandingTab(__out, __typeMapper);
      writeFieldDescription(__out, __typeMapper);
      writeFieldFormFactors(__out, __typeMapper);
      writeFieldIsNavAutoTempTabsDisabled(__out, __typeMapper);
      writeFieldIsNavPersonalizationDisabled(__out, __typeMapper);
      writeFieldIsServiceCloudConsole(__out, __typeMapper);
      writeFieldLabel(__out, __typeMapper);
      writeFieldLogo(__out, __typeMapper);
      writeFieldNavType(__out, __typeMapper);
      writeFieldPreferences(__out, __typeMapper);
      writeFieldProfileActionOverrides(__out, __typeMapper);
      writeFieldSetupExperience(__out, __typeMapper);
      writeFieldSubscriberTabs(__out, __typeMapper);
      writeFieldTabs(__out, __typeMapper);
      writeFieldUiType(__out, __typeMapper);
      writeFieldUtilityBar(__out, __typeMapper);
      writeFieldWorkspaceConfig(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setActionOverrides(__in, __typeMapper);
      setBrand(__in, __typeMapper);
      setConsoleConfig(__in, __typeMapper);
      setDefaultLandingTab(__in, __typeMapper);
      setDescription(__in, __typeMapper);
      setFormFactors(__in, __typeMapper);
      setIsNavAutoTempTabsDisabled(__in, __typeMapper);
      setIsNavPersonalizationDisabled(__in, __typeMapper);
      setIsServiceCloudConsole(__in, __typeMapper);
      setLabel(__in, __typeMapper);
      setLogo(__in, __typeMapper);
      setNavType(__in, __typeMapper);
      setPreferences(__in, __typeMapper);
      setProfileActionOverrides(__in, __typeMapper);
      setSetupExperience(__in, __typeMapper);
      setSubscriberTabs(__in, __typeMapper);
      setTabs(__in, __typeMapper);
      setUiType(__in, __typeMapper);
      setUtilityBar(__in, __typeMapper);
      setWorkspaceConfig(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "actionOverrides", actionOverrides);
      toStringHelper(sb, "brand", brand);
      toStringHelper(sb, "consoleConfig", consoleConfig);
      toStringHelper(sb, "defaultLandingTab", defaultLandingTab);
      toStringHelper(sb, "description", description);
      toStringHelper(sb, "formFactors", formFactors);
      toStringHelper(sb, "isNavAutoTempTabsDisabled", isNavAutoTempTabsDisabled);
      toStringHelper(sb, "isNavPersonalizationDisabled", isNavPersonalizationDisabled);
      toStringHelper(sb, "isServiceCloudConsole", isServiceCloudConsole);
      toStringHelper(sb, "label", label);
      toStringHelper(sb, "logo", logo);
      toStringHelper(sb, "navType", navType);
      toStringHelper(sb, "preferences", preferences);
      toStringHelper(sb, "profileActionOverrides", profileActionOverrides);
      toStringHelper(sb, "setupExperience", setupExperience);
      toStringHelper(sb, "subscriberTabs", subscriberTabs);
      toStringHelper(sb, "tabs", tabs);
      toStringHelper(sb, "uiType", uiType);
      toStringHelper(sb, "utilityBar", utilityBar);
      toStringHelper(sb, "workspaceConfig", workspaceConfig);
    }


}
