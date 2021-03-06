package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class ForecastingSettings extends com.sforce.soap.tooling.metadata.MetadataForSettings {

    /**
     * Constructor
     */
    public ForecastingSettings() {}

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
     * element : displayCurrency of type {urn:tooling.soap.sforce.com}DisplayCurrency
     * java type: com.sforce.soap.tooling.DisplayCurrency
     */
    private boolean displayCurrency__is_set = false;

    private com.sforce.soap.tooling.DisplayCurrency displayCurrency;

    public com.sforce.soap.tooling.DisplayCurrency getDisplayCurrency() {
      return displayCurrency;
    }

    public void setDisplayCurrency(com.sforce.soap.tooling.DisplayCurrency displayCurrency) {
      this.displayCurrency = displayCurrency;
      displayCurrency__is_set = true;
    }

    protected void setDisplayCurrency(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("displayCurrency", "urn:metadata.tooling.soap.sforce.com","displayCurrency","urn:tooling.soap.sforce.com","DisplayCurrency",0,1,true))) {
        setDisplayCurrency((com.sforce.soap.tooling.DisplayCurrency)__typeMapper.readObject(__in, _lookupTypeInfo("displayCurrency", "urn:metadata.tooling.soap.sforce.com","displayCurrency","urn:tooling.soap.sforce.com","DisplayCurrency",0,1,true), com.sforce.soap.tooling.DisplayCurrency.class));
      }
    }

    private void writeFieldDisplayCurrency(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("displayCurrency", "urn:metadata.tooling.soap.sforce.com","displayCurrency","urn:tooling.soap.sforce.com","DisplayCurrency",0,1,true), displayCurrency, displayCurrency__is_set);
    }

    /**
     * element : enableForecasts of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean enableForecasts__is_set = false;

    private boolean enableForecasts;

    public boolean getEnableForecasts() {
      return enableForecasts;
    }

    public boolean isEnableForecasts() {
      return enableForecasts;
    }

    public void setEnableForecasts(boolean enableForecasts) {
      this.enableForecasts = enableForecasts;
      enableForecasts__is_set = true;
    }

    protected void setEnableForecasts(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("enableForecasts", "urn:metadata.tooling.soap.sforce.com","enableForecasts","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setEnableForecasts(__typeMapper.readBoolean(__in, _lookupTypeInfo("enableForecasts", "urn:metadata.tooling.soap.sforce.com","enableForecasts","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldEnableForecasts(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("enableForecasts", "urn:metadata.tooling.soap.sforce.com","enableForecasts","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), enableForecasts, enableForecasts__is_set);
    }

    /**
     * element : forecastingCategoryMappings of type {urn:metadata.tooling.soap.sforce.com}ForecastingCategoryMapping
     * java type: com.sforce.soap.tooling.metadata.ForecastingCategoryMapping[]
     */
    private boolean forecastingCategoryMappings__is_set = false;

    private com.sforce.soap.tooling.metadata.ForecastingCategoryMapping[] forecastingCategoryMappings = new com.sforce.soap.tooling.metadata.ForecastingCategoryMapping[0];

    public com.sforce.soap.tooling.metadata.ForecastingCategoryMapping[] getForecastingCategoryMappings() {
      return forecastingCategoryMappings;
    }

    public void setForecastingCategoryMappings(com.sforce.soap.tooling.metadata.ForecastingCategoryMapping[] forecastingCategoryMappings) {
      this.forecastingCategoryMappings = forecastingCategoryMappings;
      forecastingCategoryMappings__is_set = true;
    }

    protected void setForecastingCategoryMappings(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("forecastingCategoryMappings", "urn:metadata.tooling.soap.sforce.com","forecastingCategoryMappings","urn:metadata.tooling.soap.sforce.com","ForecastingCategoryMapping",0,-1,true))) {
        setForecastingCategoryMappings((com.sforce.soap.tooling.metadata.ForecastingCategoryMapping[])__typeMapper.readObject(__in, _lookupTypeInfo("forecastingCategoryMappings", "urn:metadata.tooling.soap.sforce.com","forecastingCategoryMappings","urn:metadata.tooling.soap.sforce.com","ForecastingCategoryMapping",0,-1,true), com.sforce.soap.tooling.metadata.ForecastingCategoryMapping[].class));
      }
    }

    private void writeFieldForecastingCategoryMappings(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("forecastingCategoryMappings", "urn:metadata.tooling.soap.sforce.com","forecastingCategoryMappings","urn:metadata.tooling.soap.sforce.com","ForecastingCategoryMapping",0,-1,true), forecastingCategoryMappings, forecastingCategoryMappings__is_set);
    }

    /**
     * element : forecastingDisplayedFamilySettings of type {urn:metadata.tooling.soap.sforce.com}ForecastingDisplayedFamilySettings
     * java type: com.sforce.soap.tooling.metadata.ForecastingDisplayedFamilySettings[]
     */
    private boolean forecastingDisplayedFamilySettings__is_set = false;

    private com.sforce.soap.tooling.metadata.ForecastingDisplayedFamilySettings[] forecastingDisplayedFamilySettings = new com.sforce.soap.tooling.metadata.ForecastingDisplayedFamilySettings[0];

    public com.sforce.soap.tooling.metadata.ForecastingDisplayedFamilySettings[] getForecastingDisplayedFamilySettings() {
      return forecastingDisplayedFamilySettings;
    }

    public void setForecastingDisplayedFamilySettings(com.sforce.soap.tooling.metadata.ForecastingDisplayedFamilySettings[] forecastingDisplayedFamilySettings) {
      this.forecastingDisplayedFamilySettings = forecastingDisplayedFamilySettings;
      forecastingDisplayedFamilySettings__is_set = true;
    }

    protected void setForecastingDisplayedFamilySettings(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("forecastingDisplayedFamilySettings", "urn:metadata.tooling.soap.sforce.com","forecastingDisplayedFamilySettings","urn:metadata.tooling.soap.sforce.com","ForecastingDisplayedFamilySettings",0,-1,true))) {
        setForecastingDisplayedFamilySettings((com.sforce.soap.tooling.metadata.ForecastingDisplayedFamilySettings[])__typeMapper.readObject(__in, _lookupTypeInfo("forecastingDisplayedFamilySettings", "urn:metadata.tooling.soap.sforce.com","forecastingDisplayedFamilySettings","urn:metadata.tooling.soap.sforce.com","ForecastingDisplayedFamilySettings",0,-1,true), com.sforce.soap.tooling.metadata.ForecastingDisplayedFamilySettings[].class));
      }
    }

    private void writeFieldForecastingDisplayedFamilySettings(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("forecastingDisplayedFamilySettings", "urn:metadata.tooling.soap.sforce.com","forecastingDisplayedFamilySettings","urn:metadata.tooling.soap.sforce.com","ForecastingDisplayedFamilySettings",0,-1,true), forecastingDisplayedFamilySettings, forecastingDisplayedFamilySettings__is_set);
    }

    /**
     * element : forecastingTypeSettings of type {urn:metadata.tooling.soap.sforce.com}ForecastingTypeSettings
     * java type: com.sforce.soap.tooling.metadata.ForecastingTypeSettings[]
     */
    private boolean forecastingTypeSettings__is_set = false;

    private com.sforce.soap.tooling.metadata.ForecastingTypeSettings[] forecastingTypeSettings = new com.sforce.soap.tooling.metadata.ForecastingTypeSettings[0];

    public com.sforce.soap.tooling.metadata.ForecastingTypeSettings[] getForecastingTypeSettings() {
      return forecastingTypeSettings;
    }

    public void setForecastingTypeSettings(com.sforce.soap.tooling.metadata.ForecastingTypeSettings[] forecastingTypeSettings) {
      this.forecastingTypeSettings = forecastingTypeSettings;
      forecastingTypeSettings__is_set = true;
    }

    protected void setForecastingTypeSettings(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("forecastingTypeSettings", "urn:metadata.tooling.soap.sforce.com","forecastingTypeSettings","urn:metadata.tooling.soap.sforce.com","ForecastingTypeSettings",0,-1,true))) {
        setForecastingTypeSettings((com.sforce.soap.tooling.metadata.ForecastingTypeSettings[])__typeMapper.readObject(__in, _lookupTypeInfo("forecastingTypeSettings", "urn:metadata.tooling.soap.sforce.com","forecastingTypeSettings","urn:metadata.tooling.soap.sforce.com","ForecastingTypeSettings",0,-1,true), com.sforce.soap.tooling.metadata.ForecastingTypeSettings[].class));
      }
    }

    private void writeFieldForecastingTypeSettings(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("forecastingTypeSettings", "urn:metadata.tooling.soap.sforce.com","forecastingTypeSettings","urn:metadata.tooling.soap.sforce.com","ForecastingTypeSettings",0,-1,true), forecastingTypeSettings, forecastingTypeSettings__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:metadata.tooling.soap.sforce.com", "ForecastingSettings");
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
      sb.append("[ForecastingSettings ");
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
      writeFieldDisplayCurrency(__out, __typeMapper);
      writeFieldEnableForecasts(__out, __typeMapper);
      writeFieldForecastingCategoryMappings(__out, __typeMapper);
      writeFieldForecastingDisplayedFamilySettings(__out, __typeMapper);
      writeFieldForecastingTypeSettings(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setDisplayCurrency(__in, __typeMapper);
      setEnableForecasts(__in, __typeMapper);
      setForecastingCategoryMappings(__in, __typeMapper);
      setForecastingDisplayedFamilySettings(__in, __typeMapper);
      setForecastingTypeSettings(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "displayCurrency", displayCurrency);
      toStringHelper(sb, "enableForecasts", enableForecasts);
      toStringHelper(sb, "forecastingCategoryMappings", forecastingCategoryMappings);
      toStringHelper(sb, "forecastingDisplayedFamilySettings", forecastingDisplayedFamilySettings);
      toStringHelper(sb, "forecastingTypeSettings", forecastingTypeSettings);
    }


}
