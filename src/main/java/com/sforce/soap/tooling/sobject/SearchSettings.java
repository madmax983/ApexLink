package com.sforce.soap.tooling.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class SearchSettings extends com.sforce.soap.tooling.sobject.SObject {

    /**
     * Constructor
     */
    public SearchSettings() {}

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
     * element : DocumentContentSearchEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean DocumentContentSearchEnabled__is_set = false;

    private java.lang.Boolean DocumentContentSearchEnabled;

    public java.lang.Boolean getDocumentContentSearchEnabled() {
      return DocumentContentSearchEnabled;
    }

    public void setDocumentContentSearchEnabled(java.lang.Boolean DocumentContentSearchEnabled) {
      this.DocumentContentSearchEnabled = DocumentContentSearchEnabled;
      DocumentContentSearchEnabled__is_set = true;
    }

    protected void setDocumentContentSearchEnabled(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("DocumentContentSearchEnabled", "urn:sobject.tooling.soap.sforce.com","DocumentContentSearchEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setDocumentContentSearchEnabled((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("DocumentContentSearchEnabled", "urn:sobject.tooling.soap.sforce.com","DocumentContentSearchEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldDocumentContentSearchEnabled(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("DocumentContentSearchEnabled", "urn:sobject.tooling.soap.sforce.com","DocumentContentSearchEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), DocumentContentSearchEnabled, DocumentContentSearchEnabled__is_set);
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
     * element : Metadata of type {urn:metadata.tooling.soap.sforce.com}SearchSettings
     * java type: com.sforce.soap.tooling.metadata.SearchSettings
     */
    private boolean Metadata__is_set = false;

    private com.sforce.soap.tooling.metadata.SearchSettings Metadata;

    public com.sforce.soap.tooling.metadata.SearchSettings getMetadata() {
      return Metadata;
    }

    public void setMetadata(com.sforce.soap.tooling.metadata.SearchSettings Metadata) {
      this.Metadata = Metadata;
      Metadata__is_set = true;
    }

    protected void setMetadata(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Metadata", "urn:sobject.tooling.soap.sforce.com","Metadata","urn:metadata.tooling.soap.sforce.com","SearchSettings",0,1,true))) {
        setMetadata((com.sforce.soap.tooling.metadata.SearchSettings)__typeMapper.readObject(__in, _lookupTypeInfo("Metadata", "urn:sobject.tooling.soap.sforce.com","Metadata","urn:metadata.tooling.soap.sforce.com","SearchSettings",0,1,true), com.sforce.soap.tooling.metadata.SearchSettings.class));
      }
    }

    private void writeFieldMetadata(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Metadata", "urn:sobject.tooling.soap.sforce.com","Metadata","urn:metadata.tooling.soap.sforce.com","SearchSettings",0,1,true), Metadata, Metadata__is_set);
    }

    /**
     * element : OptimizeSearchForCjkEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean OptimizeSearchForCjkEnabled__is_set = false;

    private java.lang.Boolean OptimizeSearchForCjkEnabled;

    public java.lang.Boolean getOptimizeSearchForCjkEnabled() {
      return OptimizeSearchForCjkEnabled;
    }

    public void setOptimizeSearchForCjkEnabled(java.lang.Boolean OptimizeSearchForCjkEnabled) {
      this.OptimizeSearchForCjkEnabled = OptimizeSearchForCjkEnabled;
      OptimizeSearchForCjkEnabled__is_set = true;
    }

    protected void setOptimizeSearchForCjkEnabled(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("OptimizeSearchForCjkEnabled", "urn:sobject.tooling.soap.sforce.com","OptimizeSearchForCjkEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setOptimizeSearchForCjkEnabled((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("OptimizeSearchForCjkEnabled", "urn:sobject.tooling.soap.sforce.com","OptimizeSearchForCjkEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldOptimizeSearchForCjkEnabled(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("OptimizeSearchForCjkEnabled", "urn:sobject.tooling.soap.sforce.com","OptimizeSearchForCjkEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), OptimizeSearchForCjkEnabled, OptimizeSearchForCjkEnabled__is_set);
    }

    /**
     * element : RecentlyViewedUsersForBlankLookupEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean RecentlyViewedUsersForBlankLookupEnabled__is_set = false;

    private java.lang.Boolean RecentlyViewedUsersForBlankLookupEnabled;

    public java.lang.Boolean getRecentlyViewedUsersForBlankLookupEnabled() {
      return RecentlyViewedUsersForBlankLookupEnabled;
    }

    public void setRecentlyViewedUsersForBlankLookupEnabled(java.lang.Boolean RecentlyViewedUsersForBlankLookupEnabled) {
      this.RecentlyViewedUsersForBlankLookupEnabled = RecentlyViewedUsersForBlankLookupEnabled;
      RecentlyViewedUsersForBlankLookupEnabled__is_set = true;
    }

    protected void setRecentlyViewedUsersForBlankLookupEnabled(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("RecentlyViewedUsersForBlankLookupEnabled", "urn:sobject.tooling.soap.sforce.com","RecentlyViewedUsersForBlankLookupEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setRecentlyViewedUsersForBlankLookupEnabled((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("RecentlyViewedUsersForBlankLookupEnabled", "urn:sobject.tooling.soap.sforce.com","RecentlyViewedUsersForBlankLookupEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldRecentlyViewedUsersForBlankLookupEnabled(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("RecentlyViewedUsersForBlankLookupEnabled", "urn:sobject.tooling.soap.sforce.com","RecentlyViewedUsersForBlankLookupEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), RecentlyViewedUsersForBlankLookupEnabled, RecentlyViewedUsersForBlankLookupEnabled__is_set);
    }

    /**
     * element : SearchSettingsByObject of type {urn:sobject.tooling.soap.sforce.com}SearchSettingsByObject
     * java type: com.sforce.soap.tooling.sobject.SearchSettingsByObject
     */
    private boolean SearchSettingsByObject__is_set = false;

    private com.sforce.soap.tooling.sobject.SearchSettingsByObject SearchSettingsByObject;

    public com.sforce.soap.tooling.sobject.SearchSettingsByObject getSearchSettingsByObject() {
      return SearchSettingsByObject;
    }

    public void setSearchSettingsByObject(com.sforce.soap.tooling.sobject.SearchSettingsByObject SearchSettingsByObject) {
      this.SearchSettingsByObject = SearchSettingsByObject;
      SearchSettingsByObject__is_set = true;
    }

    protected void setSearchSettingsByObject(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SearchSettingsByObject", "urn:sobject.tooling.soap.sforce.com","SearchSettingsByObject","urn:sobject.tooling.soap.sforce.com","SearchSettingsByObject",0,1,true))) {
        setSearchSettingsByObject((com.sforce.soap.tooling.sobject.SearchSettingsByObject)__typeMapper.readObject(__in, _lookupTypeInfo("SearchSettingsByObject", "urn:sobject.tooling.soap.sforce.com","SearchSettingsByObject","urn:sobject.tooling.soap.sforce.com","SearchSettingsByObject",0,1,true), com.sforce.soap.tooling.sobject.SearchSettingsByObject.class));
      }
    }

    private void writeFieldSearchSettingsByObject(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SearchSettingsByObject", "urn:sobject.tooling.soap.sforce.com","SearchSettingsByObject","urn:sobject.tooling.soap.sforce.com","SearchSettingsByObject",0,1,true), SearchSettingsByObject, SearchSettingsByObject__is_set);
    }

    /**
     * element : SearchSettingsByObjectId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean SearchSettingsByObjectId__is_set = false;

    private java.lang.String SearchSettingsByObjectId;

    public java.lang.String getSearchSettingsByObjectId() {
      return SearchSettingsByObjectId;
    }

    public void setSearchSettingsByObjectId(java.lang.String SearchSettingsByObjectId) {
      this.SearchSettingsByObjectId = SearchSettingsByObjectId;
      SearchSettingsByObjectId__is_set = true;
    }

    protected void setSearchSettingsByObjectId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SearchSettingsByObjectId", "urn:sobject.tooling.soap.sforce.com","SearchSettingsByObjectId","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setSearchSettingsByObjectId(__typeMapper.readString(__in, _lookupTypeInfo("SearchSettingsByObjectId", "urn:sobject.tooling.soap.sforce.com","SearchSettingsByObjectId","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSearchSettingsByObjectId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SearchSettingsByObjectId", "urn:sobject.tooling.soap.sforce.com","SearchSettingsByObjectId","http://www.w3.org/2001/XMLSchema","string",0,1,true), SearchSettingsByObjectId, SearchSettingsByObjectId__is_set);
    }

    /**
     * element : SidebarAutoCompleteEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean SidebarAutoCompleteEnabled__is_set = false;

    private java.lang.Boolean SidebarAutoCompleteEnabled;

    public java.lang.Boolean getSidebarAutoCompleteEnabled() {
      return SidebarAutoCompleteEnabled;
    }

    public void setSidebarAutoCompleteEnabled(java.lang.Boolean SidebarAutoCompleteEnabled) {
      this.SidebarAutoCompleteEnabled = SidebarAutoCompleteEnabled;
      SidebarAutoCompleteEnabled__is_set = true;
    }

    protected void setSidebarAutoCompleteEnabled(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SidebarAutoCompleteEnabled", "urn:sobject.tooling.soap.sforce.com","SidebarAutoCompleteEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setSidebarAutoCompleteEnabled((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("SidebarAutoCompleteEnabled", "urn:sobject.tooling.soap.sforce.com","SidebarAutoCompleteEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldSidebarAutoCompleteEnabled(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SidebarAutoCompleteEnabled", "urn:sobject.tooling.soap.sforce.com","SidebarAutoCompleteEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), SidebarAutoCompleteEnabled, SidebarAutoCompleteEnabled__is_set);
    }

    /**
     * element : SidebarDropDownListEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean SidebarDropDownListEnabled__is_set = false;

    private java.lang.Boolean SidebarDropDownListEnabled;

    public java.lang.Boolean getSidebarDropDownListEnabled() {
      return SidebarDropDownListEnabled;
    }

    public void setSidebarDropDownListEnabled(java.lang.Boolean SidebarDropDownListEnabled) {
      this.SidebarDropDownListEnabled = SidebarDropDownListEnabled;
      SidebarDropDownListEnabled__is_set = true;
    }

    protected void setSidebarDropDownListEnabled(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SidebarDropDownListEnabled", "urn:sobject.tooling.soap.sforce.com","SidebarDropDownListEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setSidebarDropDownListEnabled((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("SidebarDropDownListEnabled", "urn:sobject.tooling.soap.sforce.com","SidebarDropDownListEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldSidebarDropDownListEnabled(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SidebarDropDownListEnabled", "urn:sobject.tooling.soap.sforce.com","SidebarDropDownListEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), SidebarDropDownListEnabled, SidebarDropDownListEnabled__is_set);
    }

    /**
     * element : SidebarLimitToItemsIownCheckboxEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean SidebarLimitToItemsIownCheckboxEnabled__is_set = false;

    private java.lang.Boolean SidebarLimitToItemsIownCheckboxEnabled;

    public java.lang.Boolean getSidebarLimitToItemsIownCheckboxEnabled() {
      return SidebarLimitToItemsIownCheckboxEnabled;
    }

    public void setSidebarLimitToItemsIownCheckboxEnabled(java.lang.Boolean SidebarLimitToItemsIownCheckboxEnabled) {
      this.SidebarLimitToItemsIownCheckboxEnabled = SidebarLimitToItemsIownCheckboxEnabled;
      SidebarLimitToItemsIownCheckboxEnabled__is_set = true;
    }

    protected void setSidebarLimitToItemsIownCheckboxEnabled(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SidebarLimitToItemsIownCheckboxEnabled", "urn:sobject.tooling.soap.sforce.com","SidebarLimitToItemsIownCheckboxEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setSidebarLimitToItemsIownCheckboxEnabled((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("SidebarLimitToItemsIownCheckboxEnabled", "urn:sobject.tooling.soap.sforce.com","SidebarLimitToItemsIownCheckboxEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldSidebarLimitToItemsIownCheckboxEnabled(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SidebarLimitToItemsIownCheckboxEnabled", "urn:sobject.tooling.soap.sforce.com","SidebarLimitToItemsIownCheckboxEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), SidebarLimitToItemsIownCheckboxEnabled, SidebarLimitToItemsIownCheckboxEnabled__is_set);
    }

    /**
     * element : SingleSearchResultShortcutEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean SingleSearchResultShortcutEnabled__is_set = false;

    private java.lang.Boolean SingleSearchResultShortcutEnabled;

    public java.lang.Boolean getSingleSearchResultShortcutEnabled() {
      return SingleSearchResultShortcutEnabled;
    }

    public void setSingleSearchResultShortcutEnabled(java.lang.Boolean SingleSearchResultShortcutEnabled) {
      this.SingleSearchResultShortcutEnabled = SingleSearchResultShortcutEnabled;
      SingleSearchResultShortcutEnabled__is_set = true;
    }

    protected void setSingleSearchResultShortcutEnabled(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SingleSearchResultShortcutEnabled", "urn:sobject.tooling.soap.sforce.com","SingleSearchResultShortcutEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setSingleSearchResultShortcutEnabled((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("SingleSearchResultShortcutEnabled", "urn:sobject.tooling.soap.sforce.com","SingleSearchResultShortcutEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldSingleSearchResultShortcutEnabled(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SingleSearchResultShortcutEnabled", "urn:sobject.tooling.soap.sforce.com","SingleSearchResultShortcutEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), SingleSearchResultShortcutEnabled, SingleSearchResultShortcutEnabled__is_set);
    }

    /**
     * element : SpellCorrectKnowledgeSearchEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean SpellCorrectKnowledgeSearchEnabled__is_set = false;

    private java.lang.Boolean SpellCorrectKnowledgeSearchEnabled;

    public java.lang.Boolean getSpellCorrectKnowledgeSearchEnabled() {
      return SpellCorrectKnowledgeSearchEnabled;
    }

    public void setSpellCorrectKnowledgeSearchEnabled(java.lang.Boolean SpellCorrectKnowledgeSearchEnabled) {
      this.SpellCorrectKnowledgeSearchEnabled = SpellCorrectKnowledgeSearchEnabled;
      SpellCorrectKnowledgeSearchEnabled__is_set = true;
    }

    protected void setSpellCorrectKnowledgeSearchEnabled(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SpellCorrectKnowledgeSearchEnabled", "urn:sobject.tooling.soap.sforce.com","SpellCorrectKnowledgeSearchEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setSpellCorrectKnowledgeSearchEnabled((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("SpellCorrectKnowledgeSearchEnabled", "urn:sobject.tooling.soap.sforce.com","SpellCorrectKnowledgeSearchEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldSpellCorrectKnowledgeSearchEnabled(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SpellCorrectKnowledgeSearchEnabled", "urn:sobject.tooling.soap.sforce.com","SpellCorrectKnowledgeSearchEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), SpellCorrectKnowledgeSearchEnabled, SpellCorrectKnowledgeSearchEnabled__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.tooling.soap.sforce.com", "SearchSettings");
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
      sb.append("[SearchSettings ");
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
      writeFieldDocumentContentSearchEnabled(__out, __typeMapper);
      writeFieldDurableId(__out, __typeMapper);
      writeFieldFullName(__out, __typeMapper);
      writeFieldMetadata(__out, __typeMapper);
      writeFieldOptimizeSearchForCjkEnabled(__out, __typeMapper);
      writeFieldRecentlyViewedUsersForBlankLookupEnabled(__out, __typeMapper);
      writeFieldSearchSettingsByObject(__out, __typeMapper);
      writeFieldSearchSettingsByObjectId(__out, __typeMapper);
      writeFieldSidebarAutoCompleteEnabled(__out, __typeMapper);
      writeFieldSidebarDropDownListEnabled(__out, __typeMapper);
      writeFieldSidebarLimitToItemsIownCheckboxEnabled(__out, __typeMapper);
      writeFieldSingleSearchResultShortcutEnabled(__out, __typeMapper);
      writeFieldSpellCorrectKnowledgeSearchEnabled(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setDocumentContentSearchEnabled(__in, __typeMapper);
      setDurableId(__in, __typeMapper);
      setFullName(__in, __typeMapper);
      setMetadata(__in, __typeMapper);
      setOptimizeSearchForCjkEnabled(__in, __typeMapper);
      setRecentlyViewedUsersForBlankLookupEnabled(__in, __typeMapper);
      setSearchSettingsByObject(__in, __typeMapper);
      setSearchSettingsByObjectId(__in, __typeMapper);
      setSidebarAutoCompleteEnabled(__in, __typeMapper);
      setSidebarDropDownListEnabled(__in, __typeMapper);
      setSidebarLimitToItemsIownCheckboxEnabled(__in, __typeMapper);
      setSingleSearchResultShortcutEnabled(__in, __typeMapper);
      setSpellCorrectKnowledgeSearchEnabled(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "DocumentContentSearchEnabled", DocumentContentSearchEnabled);
      toStringHelper(sb, "DurableId", DurableId);
      toStringHelper(sb, "FullName", FullName);
      toStringHelper(sb, "Metadata", Metadata);
      toStringHelper(sb, "OptimizeSearchForCjkEnabled", OptimizeSearchForCjkEnabled);
      toStringHelper(sb, "RecentlyViewedUsersForBlankLookupEnabled", RecentlyViewedUsersForBlankLookupEnabled);
      toStringHelper(sb, "SearchSettingsByObject", SearchSettingsByObject);
      toStringHelper(sb, "SearchSettingsByObjectId", SearchSettingsByObjectId);
      toStringHelper(sb, "SidebarAutoCompleteEnabled", SidebarAutoCompleteEnabled);
      toStringHelper(sb, "SidebarDropDownListEnabled", SidebarDropDownListEnabled);
      toStringHelper(sb, "SidebarLimitToItemsIownCheckboxEnabled", SidebarLimitToItemsIownCheckboxEnabled);
      toStringHelper(sb, "SingleSearchResultShortcutEnabled", SingleSearchResultShortcutEnabled);
      toStringHelper(sb, "SpellCorrectKnowledgeSearchEnabled", SpellCorrectKnowledgeSearchEnabled);
    }


}
