package com.sforce.soap.tooling.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class EntitlementSettings extends com.sforce.soap.tooling.sobject.SObject {

    /**
     * Constructor
     */
    public EntitlementSettings() {}

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
     * element : AssetLookupLimitedToActiveEntitlementsOnAccount of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean AssetLookupLimitedToActiveEntitlementsOnAccount__is_set = false;

    private java.lang.Boolean AssetLookupLimitedToActiveEntitlementsOnAccount;

    public java.lang.Boolean getAssetLookupLimitedToActiveEntitlementsOnAccount() {
      return AssetLookupLimitedToActiveEntitlementsOnAccount;
    }

    public void setAssetLookupLimitedToActiveEntitlementsOnAccount(java.lang.Boolean AssetLookupLimitedToActiveEntitlementsOnAccount) {
      this.AssetLookupLimitedToActiveEntitlementsOnAccount = AssetLookupLimitedToActiveEntitlementsOnAccount;
      AssetLookupLimitedToActiveEntitlementsOnAccount__is_set = true;
    }

    protected void setAssetLookupLimitedToActiveEntitlementsOnAccount(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AssetLookupLimitedToActiveEntitlementsOnAccount", "urn:sobject.tooling.soap.sforce.com","AssetLookupLimitedToActiveEntitlementsOnAccount","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setAssetLookupLimitedToActiveEntitlementsOnAccount((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("AssetLookupLimitedToActiveEntitlementsOnAccount", "urn:sobject.tooling.soap.sforce.com","AssetLookupLimitedToActiveEntitlementsOnAccount","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldAssetLookupLimitedToActiveEntitlementsOnAccount(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AssetLookupLimitedToActiveEntitlementsOnAccount", "urn:sobject.tooling.soap.sforce.com","AssetLookupLimitedToActiveEntitlementsOnAccount","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), AssetLookupLimitedToActiveEntitlementsOnAccount, AssetLookupLimitedToActiveEntitlementsOnAccount__is_set);
    }

    /**
     * element : AssetLookupLimitedToActiveEntitlementsOnContact of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean AssetLookupLimitedToActiveEntitlementsOnContact__is_set = false;

    private java.lang.Boolean AssetLookupLimitedToActiveEntitlementsOnContact;

    public java.lang.Boolean getAssetLookupLimitedToActiveEntitlementsOnContact() {
      return AssetLookupLimitedToActiveEntitlementsOnContact;
    }

    public void setAssetLookupLimitedToActiveEntitlementsOnContact(java.lang.Boolean AssetLookupLimitedToActiveEntitlementsOnContact) {
      this.AssetLookupLimitedToActiveEntitlementsOnContact = AssetLookupLimitedToActiveEntitlementsOnContact;
      AssetLookupLimitedToActiveEntitlementsOnContact__is_set = true;
    }

    protected void setAssetLookupLimitedToActiveEntitlementsOnContact(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AssetLookupLimitedToActiveEntitlementsOnContact", "urn:sobject.tooling.soap.sforce.com","AssetLookupLimitedToActiveEntitlementsOnContact","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setAssetLookupLimitedToActiveEntitlementsOnContact((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("AssetLookupLimitedToActiveEntitlementsOnContact", "urn:sobject.tooling.soap.sforce.com","AssetLookupLimitedToActiveEntitlementsOnContact","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldAssetLookupLimitedToActiveEntitlementsOnContact(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AssetLookupLimitedToActiveEntitlementsOnContact", "urn:sobject.tooling.soap.sforce.com","AssetLookupLimitedToActiveEntitlementsOnContact","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), AssetLookupLimitedToActiveEntitlementsOnContact, AssetLookupLimitedToActiveEntitlementsOnContact__is_set);
    }

    /**
     * element : AssetLookupLimitedToSameAccount of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean AssetLookupLimitedToSameAccount__is_set = false;

    private java.lang.Boolean AssetLookupLimitedToSameAccount;

    public java.lang.Boolean getAssetLookupLimitedToSameAccount() {
      return AssetLookupLimitedToSameAccount;
    }

    public void setAssetLookupLimitedToSameAccount(java.lang.Boolean AssetLookupLimitedToSameAccount) {
      this.AssetLookupLimitedToSameAccount = AssetLookupLimitedToSameAccount;
      AssetLookupLimitedToSameAccount__is_set = true;
    }

    protected void setAssetLookupLimitedToSameAccount(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AssetLookupLimitedToSameAccount", "urn:sobject.tooling.soap.sforce.com","AssetLookupLimitedToSameAccount","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setAssetLookupLimitedToSameAccount((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("AssetLookupLimitedToSameAccount", "urn:sobject.tooling.soap.sforce.com","AssetLookupLimitedToSameAccount","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldAssetLookupLimitedToSameAccount(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AssetLookupLimitedToSameAccount", "urn:sobject.tooling.soap.sforce.com","AssetLookupLimitedToSameAccount","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), AssetLookupLimitedToSameAccount, AssetLookupLimitedToSameAccount__is_set);
    }

    /**
     * element : AssetLookupLimitedToSameContact of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean AssetLookupLimitedToSameContact__is_set = false;

    private java.lang.Boolean AssetLookupLimitedToSameContact;

    public java.lang.Boolean getAssetLookupLimitedToSameContact() {
      return AssetLookupLimitedToSameContact;
    }

    public void setAssetLookupLimitedToSameContact(java.lang.Boolean AssetLookupLimitedToSameContact) {
      this.AssetLookupLimitedToSameContact = AssetLookupLimitedToSameContact;
      AssetLookupLimitedToSameContact__is_set = true;
    }

    protected void setAssetLookupLimitedToSameContact(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("AssetLookupLimitedToSameContact", "urn:sobject.tooling.soap.sforce.com","AssetLookupLimitedToSameContact","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setAssetLookupLimitedToSameContact((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("AssetLookupLimitedToSameContact", "urn:sobject.tooling.soap.sforce.com","AssetLookupLimitedToSameContact","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldAssetLookupLimitedToSameContact(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("AssetLookupLimitedToSameContact", "urn:sobject.tooling.soap.sforce.com","AssetLookupLimitedToSameContact","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), AssetLookupLimitedToSameContact, AssetLookupLimitedToSameContact__is_set);
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
     * element : EntitlementLookupLimitedToActiveStatus of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean EntitlementLookupLimitedToActiveStatus__is_set = false;

    private java.lang.Boolean EntitlementLookupLimitedToActiveStatus;

    public java.lang.Boolean getEntitlementLookupLimitedToActiveStatus() {
      return EntitlementLookupLimitedToActiveStatus;
    }

    public void setEntitlementLookupLimitedToActiveStatus(java.lang.Boolean EntitlementLookupLimitedToActiveStatus) {
      this.EntitlementLookupLimitedToActiveStatus = EntitlementLookupLimitedToActiveStatus;
      EntitlementLookupLimitedToActiveStatus__is_set = true;
    }

    protected void setEntitlementLookupLimitedToActiveStatus(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("EntitlementLookupLimitedToActiveStatus", "urn:sobject.tooling.soap.sforce.com","EntitlementLookupLimitedToActiveStatus","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setEntitlementLookupLimitedToActiveStatus((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("EntitlementLookupLimitedToActiveStatus", "urn:sobject.tooling.soap.sforce.com","EntitlementLookupLimitedToActiveStatus","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldEntitlementLookupLimitedToActiveStatus(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("EntitlementLookupLimitedToActiveStatus", "urn:sobject.tooling.soap.sforce.com","EntitlementLookupLimitedToActiveStatus","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), EntitlementLookupLimitedToActiveStatus, EntitlementLookupLimitedToActiveStatus__is_set);
    }

    /**
     * element : EntitlementLookupLimitedToSameAccount of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean EntitlementLookupLimitedToSameAccount__is_set = false;

    private java.lang.Boolean EntitlementLookupLimitedToSameAccount;

    public java.lang.Boolean getEntitlementLookupLimitedToSameAccount() {
      return EntitlementLookupLimitedToSameAccount;
    }

    public void setEntitlementLookupLimitedToSameAccount(java.lang.Boolean EntitlementLookupLimitedToSameAccount) {
      this.EntitlementLookupLimitedToSameAccount = EntitlementLookupLimitedToSameAccount;
      EntitlementLookupLimitedToSameAccount__is_set = true;
    }

    protected void setEntitlementLookupLimitedToSameAccount(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("EntitlementLookupLimitedToSameAccount", "urn:sobject.tooling.soap.sforce.com","EntitlementLookupLimitedToSameAccount","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setEntitlementLookupLimitedToSameAccount((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("EntitlementLookupLimitedToSameAccount", "urn:sobject.tooling.soap.sforce.com","EntitlementLookupLimitedToSameAccount","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldEntitlementLookupLimitedToSameAccount(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("EntitlementLookupLimitedToSameAccount", "urn:sobject.tooling.soap.sforce.com","EntitlementLookupLimitedToSameAccount","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), EntitlementLookupLimitedToSameAccount, EntitlementLookupLimitedToSameAccount__is_set);
    }

    /**
     * element : EntitlementLookupLimitedToSameAsset of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean EntitlementLookupLimitedToSameAsset__is_set = false;

    private java.lang.Boolean EntitlementLookupLimitedToSameAsset;

    public java.lang.Boolean getEntitlementLookupLimitedToSameAsset() {
      return EntitlementLookupLimitedToSameAsset;
    }

    public void setEntitlementLookupLimitedToSameAsset(java.lang.Boolean EntitlementLookupLimitedToSameAsset) {
      this.EntitlementLookupLimitedToSameAsset = EntitlementLookupLimitedToSameAsset;
      EntitlementLookupLimitedToSameAsset__is_set = true;
    }

    protected void setEntitlementLookupLimitedToSameAsset(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("EntitlementLookupLimitedToSameAsset", "urn:sobject.tooling.soap.sforce.com","EntitlementLookupLimitedToSameAsset","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setEntitlementLookupLimitedToSameAsset((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("EntitlementLookupLimitedToSameAsset", "urn:sobject.tooling.soap.sforce.com","EntitlementLookupLimitedToSameAsset","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldEntitlementLookupLimitedToSameAsset(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("EntitlementLookupLimitedToSameAsset", "urn:sobject.tooling.soap.sforce.com","EntitlementLookupLimitedToSameAsset","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), EntitlementLookupLimitedToSameAsset, EntitlementLookupLimitedToSameAsset__is_set);
    }

    /**
     * element : EntitlementLookupLimitedToSameContact of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean EntitlementLookupLimitedToSameContact__is_set = false;

    private java.lang.Boolean EntitlementLookupLimitedToSameContact;

    public java.lang.Boolean getEntitlementLookupLimitedToSameContact() {
      return EntitlementLookupLimitedToSameContact;
    }

    public void setEntitlementLookupLimitedToSameContact(java.lang.Boolean EntitlementLookupLimitedToSameContact) {
      this.EntitlementLookupLimitedToSameContact = EntitlementLookupLimitedToSameContact;
      EntitlementLookupLimitedToSameContact__is_set = true;
    }

    protected void setEntitlementLookupLimitedToSameContact(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("EntitlementLookupLimitedToSameContact", "urn:sobject.tooling.soap.sforce.com","EntitlementLookupLimitedToSameContact","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setEntitlementLookupLimitedToSameContact((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("EntitlementLookupLimitedToSameContact", "urn:sobject.tooling.soap.sforce.com","EntitlementLookupLimitedToSameContact","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldEntitlementLookupLimitedToSameContact(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("EntitlementLookupLimitedToSameContact", "urn:sobject.tooling.soap.sforce.com","EntitlementLookupLimitedToSameContact","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), EntitlementLookupLimitedToSameContact, EntitlementLookupLimitedToSameContact__is_set);
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
     * element : IsEntitlementVersioningEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsEntitlementVersioningEnabled__is_set = false;

    private java.lang.Boolean IsEntitlementVersioningEnabled;

    public java.lang.Boolean getIsEntitlementVersioningEnabled() {
      return IsEntitlementVersioningEnabled;
    }

    public void setIsEntitlementVersioningEnabled(java.lang.Boolean IsEntitlementVersioningEnabled) {
      this.IsEntitlementVersioningEnabled = IsEntitlementVersioningEnabled;
      IsEntitlementVersioningEnabled__is_set = true;
    }

    protected void setIsEntitlementVersioningEnabled(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsEntitlementVersioningEnabled", "urn:sobject.tooling.soap.sforce.com","IsEntitlementVersioningEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsEntitlementVersioningEnabled((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsEntitlementVersioningEnabled", "urn:sobject.tooling.soap.sforce.com","IsEntitlementVersioningEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsEntitlementVersioningEnabled(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsEntitlementVersioningEnabled", "urn:sobject.tooling.soap.sforce.com","IsEntitlementVersioningEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsEntitlementVersioningEnabled, IsEntitlementVersioningEnabled__is_set);
    }

    /**
     * element : IsEntitlementsEnabled of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsEntitlementsEnabled__is_set = false;

    private java.lang.Boolean IsEntitlementsEnabled;

    public java.lang.Boolean getIsEntitlementsEnabled() {
      return IsEntitlementsEnabled;
    }

    public void setIsEntitlementsEnabled(java.lang.Boolean IsEntitlementsEnabled) {
      this.IsEntitlementsEnabled = IsEntitlementsEnabled;
      IsEntitlementsEnabled__is_set = true;
    }

    protected void setIsEntitlementsEnabled(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsEntitlementsEnabled", "urn:sobject.tooling.soap.sforce.com","IsEntitlementsEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsEntitlementsEnabled((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsEntitlementsEnabled", "urn:sobject.tooling.soap.sforce.com","IsEntitlementsEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsEntitlementsEnabled(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsEntitlementsEnabled", "urn:sobject.tooling.soap.sforce.com","IsEntitlementsEnabled","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsEntitlementsEnabled, IsEntitlementsEnabled__is_set);
    }

    /**
     * element : Metadata of type {urn:metadata.tooling.soap.sforce.com}EntitlementSettings
     * java type: com.sforce.soap.tooling.metadata.EntitlementSettings
     */
    private boolean Metadata__is_set = false;

    private com.sforce.soap.tooling.metadata.EntitlementSettings Metadata;

    public com.sforce.soap.tooling.metadata.EntitlementSettings getMetadata() {
      return Metadata;
    }

    public void setMetadata(com.sforce.soap.tooling.metadata.EntitlementSettings Metadata) {
      this.Metadata = Metadata;
      Metadata__is_set = true;
    }

    protected void setMetadata(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Metadata", "urn:sobject.tooling.soap.sforce.com","Metadata","urn:metadata.tooling.soap.sforce.com","EntitlementSettings",0,1,true))) {
        setMetadata((com.sforce.soap.tooling.metadata.EntitlementSettings)__typeMapper.readObject(__in, _lookupTypeInfo("Metadata", "urn:sobject.tooling.soap.sforce.com","Metadata","urn:metadata.tooling.soap.sforce.com","EntitlementSettings",0,1,true), com.sforce.soap.tooling.metadata.EntitlementSettings.class));
      }
    }

    private void writeFieldMetadata(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Metadata", "urn:sobject.tooling.soap.sforce.com","Metadata","urn:metadata.tooling.soap.sforce.com","EntitlementSettings",0,1,true), Metadata, Metadata__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.tooling.soap.sforce.com", "EntitlementSettings");
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
      sb.append("[EntitlementSettings ");
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
      writeFieldAssetLookupLimitedToActiveEntitlementsOnAccount(__out, __typeMapper);
      writeFieldAssetLookupLimitedToActiveEntitlementsOnContact(__out, __typeMapper);
      writeFieldAssetLookupLimitedToSameAccount(__out, __typeMapper);
      writeFieldAssetLookupLimitedToSameContact(__out, __typeMapper);
      writeFieldDurableId(__out, __typeMapper);
      writeFieldEntitlementLookupLimitedToActiveStatus(__out, __typeMapper);
      writeFieldEntitlementLookupLimitedToSameAccount(__out, __typeMapper);
      writeFieldEntitlementLookupLimitedToSameAsset(__out, __typeMapper);
      writeFieldEntitlementLookupLimitedToSameContact(__out, __typeMapper);
      writeFieldFullName(__out, __typeMapper);
      writeFieldIsEntitlementVersioningEnabled(__out, __typeMapper);
      writeFieldIsEntitlementsEnabled(__out, __typeMapper);
      writeFieldMetadata(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAssetLookupLimitedToActiveEntitlementsOnAccount(__in, __typeMapper);
      setAssetLookupLimitedToActiveEntitlementsOnContact(__in, __typeMapper);
      setAssetLookupLimitedToSameAccount(__in, __typeMapper);
      setAssetLookupLimitedToSameContact(__in, __typeMapper);
      setDurableId(__in, __typeMapper);
      setEntitlementLookupLimitedToActiveStatus(__in, __typeMapper);
      setEntitlementLookupLimitedToSameAccount(__in, __typeMapper);
      setEntitlementLookupLimitedToSameAsset(__in, __typeMapper);
      setEntitlementLookupLimitedToSameContact(__in, __typeMapper);
      setFullName(__in, __typeMapper);
      setIsEntitlementVersioningEnabled(__in, __typeMapper);
      setIsEntitlementsEnabled(__in, __typeMapper);
      setMetadata(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "AssetLookupLimitedToActiveEntitlementsOnAccount", AssetLookupLimitedToActiveEntitlementsOnAccount);
      toStringHelper(sb, "AssetLookupLimitedToActiveEntitlementsOnContact", AssetLookupLimitedToActiveEntitlementsOnContact);
      toStringHelper(sb, "AssetLookupLimitedToSameAccount", AssetLookupLimitedToSameAccount);
      toStringHelper(sb, "AssetLookupLimitedToSameContact", AssetLookupLimitedToSameContact);
      toStringHelper(sb, "DurableId", DurableId);
      toStringHelper(sb, "EntitlementLookupLimitedToActiveStatus", EntitlementLookupLimitedToActiveStatus);
      toStringHelper(sb, "EntitlementLookupLimitedToSameAccount", EntitlementLookupLimitedToSameAccount);
      toStringHelper(sb, "EntitlementLookupLimitedToSameAsset", EntitlementLookupLimitedToSameAsset);
      toStringHelper(sb, "EntitlementLookupLimitedToSameContact", EntitlementLookupLimitedToSameContact);
      toStringHelper(sb, "FullName", FullName);
      toStringHelper(sb, "IsEntitlementVersioningEnabled", IsEntitlementVersioningEnabled);
      toStringHelper(sb, "IsEntitlementsEnabled", IsEntitlementsEnabled);
      toStringHelper(sb, "Metadata", Metadata);
    }


}
