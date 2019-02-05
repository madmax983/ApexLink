package com.sforce.soap.tooling.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class Package2Member extends com.sforce.soap.tooling.sobject.SObject {

    /**
     * Constructor
     */
    public Package2Member() {}

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
     * element : CreatedBy of type {urn:sobject.tooling.soap.sforce.com}User
     * java type: com.sforce.soap.tooling.sobject.User
     */
    private boolean CreatedBy__is_set = false;

    private com.sforce.soap.tooling.sobject.User CreatedBy;

    public com.sforce.soap.tooling.sobject.User getCreatedBy() {
      return CreatedBy;
    }

    public void setCreatedBy(com.sforce.soap.tooling.sobject.User CreatedBy) {
      this.CreatedBy = CreatedBy;
      CreatedBy__is_set = true;
    }

    protected void setCreatedBy(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CreatedBy", "urn:sobject.tooling.soap.sforce.com","CreatedBy","urn:sobject.tooling.soap.sforce.com","User",0,1,true))) {
        setCreatedBy((com.sforce.soap.tooling.sobject.User)__typeMapper.readObject(__in, _lookupTypeInfo("CreatedBy", "urn:sobject.tooling.soap.sforce.com","CreatedBy","urn:sobject.tooling.soap.sforce.com","User",0,1,true), com.sforce.soap.tooling.sobject.User.class));
      }
    }

    private void writeFieldCreatedBy(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CreatedBy", "urn:sobject.tooling.soap.sforce.com","CreatedBy","urn:sobject.tooling.soap.sforce.com","User",0,1,true), CreatedBy, CreatedBy__is_set);
    }

    /**
     * element : CreatedById of type {urn:tooling.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean CreatedById__is_set = false;

    private java.lang.String CreatedById;

    public java.lang.String getCreatedById() {
      return CreatedById;
    }

    public void setCreatedById(java.lang.String CreatedById) {
      this.CreatedById = CreatedById;
      CreatedById__is_set = true;
    }

    protected void setCreatedById(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CreatedById", "urn:sobject.tooling.soap.sforce.com","CreatedById","urn:tooling.soap.sforce.com","ID",0,1,true))) {
        setCreatedById(__typeMapper.readString(__in, _lookupTypeInfo("CreatedById", "urn:sobject.tooling.soap.sforce.com","CreatedById","urn:tooling.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCreatedById(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CreatedById", "urn:sobject.tooling.soap.sforce.com","CreatedById","urn:tooling.soap.sforce.com","ID",0,1,true), CreatedById, CreatedById__is_set);
    }

    /**
     * element : CreatedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean CreatedDate__is_set = false;

    private java.util.Calendar CreatedDate;

    public java.util.Calendar getCreatedDate() {
      return CreatedDate;
    }

    public void setCreatedDate(java.util.Calendar CreatedDate) {
      this.CreatedDate = CreatedDate;
      CreatedDate__is_set = true;
    }

    protected void setCreatedDate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CreatedDate", "urn:sobject.tooling.soap.sforce.com","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setCreatedDate((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("CreatedDate", "urn:sobject.tooling.soap.sforce.com","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldCreatedDate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CreatedDate", "urn:sobject.tooling.soap.sforce.com","CreatedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), CreatedDate, CreatedDate__is_set);
    }

    /**
     * element : CurrentPackageVersion of type {urn:sobject.tooling.soap.sforce.com}SubscriberPackageVersion
     * java type: com.sforce.soap.tooling.sobject.SubscriberPackageVersion
     */
    private boolean CurrentPackageVersion__is_set = false;

    private com.sforce.soap.tooling.sobject.SubscriberPackageVersion CurrentPackageVersion;

    public com.sforce.soap.tooling.sobject.SubscriberPackageVersion getCurrentPackageVersion() {
      return CurrentPackageVersion;
    }

    public void setCurrentPackageVersion(com.sforce.soap.tooling.sobject.SubscriberPackageVersion CurrentPackageVersion) {
      this.CurrentPackageVersion = CurrentPackageVersion;
      CurrentPackageVersion__is_set = true;
    }

    protected void setCurrentPackageVersion(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CurrentPackageVersion", "urn:sobject.tooling.soap.sforce.com","CurrentPackageVersion","urn:sobject.tooling.soap.sforce.com","SubscriberPackageVersion",0,1,true))) {
        setCurrentPackageVersion((com.sforce.soap.tooling.sobject.SubscriberPackageVersion)__typeMapper.readObject(__in, _lookupTypeInfo("CurrentPackageVersion", "urn:sobject.tooling.soap.sforce.com","CurrentPackageVersion","urn:sobject.tooling.soap.sforce.com","SubscriberPackageVersion",0,1,true), com.sforce.soap.tooling.sobject.SubscriberPackageVersion.class));
      }
    }

    private void writeFieldCurrentPackageVersion(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CurrentPackageVersion", "urn:sobject.tooling.soap.sforce.com","CurrentPackageVersion","urn:sobject.tooling.soap.sforce.com","SubscriberPackageVersion",0,1,true), CurrentPackageVersion, CurrentPackageVersion__is_set);
    }

    /**
     * element : CurrentPackageVersionId of type {urn:tooling.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean CurrentPackageVersionId__is_set = false;

    private java.lang.String CurrentPackageVersionId;

    public java.lang.String getCurrentPackageVersionId() {
      return CurrentPackageVersionId;
    }

    public void setCurrentPackageVersionId(java.lang.String CurrentPackageVersionId) {
      this.CurrentPackageVersionId = CurrentPackageVersionId;
      CurrentPackageVersionId__is_set = true;
    }

    protected void setCurrentPackageVersionId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CurrentPackageVersionId", "urn:sobject.tooling.soap.sforce.com","CurrentPackageVersionId","urn:tooling.soap.sforce.com","ID",0,1,true))) {
        setCurrentPackageVersionId(__typeMapper.readString(__in, _lookupTypeInfo("CurrentPackageVersionId", "urn:sobject.tooling.soap.sforce.com","CurrentPackageVersionId","urn:tooling.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCurrentPackageVersionId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CurrentPackageVersionId", "urn:sobject.tooling.soap.sforce.com","CurrentPackageVersionId","urn:tooling.soap.sforce.com","ID",0,1,true), CurrentPackageVersionId, CurrentPackageVersionId__is_set);
    }

    /**
     * element : IsDeleted of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean IsDeleted__is_set = false;

    private java.lang.Boolean IsDeleted;

    public java.lang.Boolean getIsDeleted() {
      return IsDeleted;
    }

    public void setIsDeleted(java.lang.Boolean IsDeleted) {
      this.IsDeleted = IsDeleted;
      IsDeleted__is_set = true;
    }

    protected void setIsDeleted(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("IsDeleted", "urn:sobject.tooling.soap.sforce.com","IsDeleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setIsDeleted((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("IsDeleted", "urn:sobject.tooling.soap.sforce.com","IsDeleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldIsDeleted(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("IsDeleted", "urn:sobject.tooling.soap.sforce.com","IsDeleted","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), IsDeleted, IsDeleted__is_set);
    }

    /**
     * element : LastModifiedBy of type {urn:sobject.tooling.soap.sforce.com}User
     * java type: com.sforce.soap.tooling.sobject.User
     */
    private boolean LastModifiedBy__is_set = false;

    private com.sforce.soap.tooling.sobject.User LastModifiedBy;

    public com.sforce.soap.tooling.sobject.User getLastModifiedBy() {
      return LastModifiedBy;
    }

    public void setLastModifiedBy(com.sforce.soap.tooling.sobject.User LastModifiedBy) {
      this.LastModifiedBy = LastModifiedBy;
      LastModifiedBy__is_set = true;
    }

    protected void setLastModifiedBy(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastModifiedBy", "urn:sobject.tooling.soap.sforce.com","LastModifiedBy","urn:sobject.tooling.soap.sforce.com","User",0,1,true))) {
        setLastModifiedBy((com.sforce.soap.tooling.sobject.User)__typeMapper.readObject(__in, _lookupTypeInfo("LastModifiedBy", "urn:sobject.tooling.soap.sforce.com","LastModifiedBy","urn:sobject.tooling.soap.sforce.com","User",0,1,true), com.sforce.soap.tooling.sobject.User.class));
      }
    }

    private void writeFieldLastModifiedBy(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastModifiedBy", "urn:sobject.tooling.soap.sforce.com","LastModifiedBy","urn:sobject.tooling.soap.sforce.com","User",0,1,true), LastModifiedBy, LastModifiedBy__is_set);
    }

    /**
     * element : LastModifiedById of type {urn:tooling.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean LastModifiedById__is_set = false;

    private java.lang.String LastModifiedById;

    public java.lang.String getLastModifiedById() {
      return LastModifiedById;
    }

    public void setLastModifiedById(java.lang.String LastModifiedById) {
      this.LastModifiedById = LastModifiedById;
      LastModifiedById__is_set = true;
    }

    protected void setLastModifiedById(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastModifiedById", "urn:sobject.tooling.soap.sforce.com","LastModifiedById","urn:tooling.soap.sforce.com","ID",0,1,true))) {
        setLastModifiedById(__typeMapper.readString(__in, _lookupTypeInfo("LastModifiedById", "urn:sobject.tooling.soap.sforce.com","LastModifiedById","urn:tooling.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLastModifiedById(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastModifiedById", "urn:sobject.tooling.soap.sforce.com","LastModifiedById","urn:tooling.soap.sforce.com","ID",0,1,true), LastModifiedById, LastModifiedById__is_set);
    }

    /**
     * element : LastModifiedDate of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean LastModifiedDate__is_set = false;

    private java.util.Calendar LastModifiedDate;

    public java.util.Calendar getLastModifiedDate() {
      return LastModifiedDate;
    }

    public void setLastModifiedDate(java.util.Calendar LastModifiedDate) {
      this.LastModifiedDate = LastModifiedDate;
      LastModifiedDate__is_set = true;
    }

    protected void setLastModifiedDate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("LastModifiedDate", "urn:sobject.tooling.soap.sforce.com","LastModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setLastModifiedDate((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("LastModifiedDate", "urn:sobject.tooling.soap.sforce.com","LastModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldLastModifiedDate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("LastModifiedDate", "urn:sobject.tooling.soap.sforce.com","LastModifiedDate","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), LastModifiedDate, LastModifiedDate__is_set);
    }

    /**
     * element : MaxPackageVersion of type {urn:sobject.tooling.soap.sforce.com}SubscriberPackageVersion
     * java type: com.sforce.soap.tooling.sobject.SubscriberPackageVersion
     */
    private boolean MaxPackageVersion__is_set = false;

    private com.sforce.soap.tooling.sobject.SubscriberPackageVersion MaxPackageVersion;

    public com.sforce.soap.tooling.sobject.SubscriberPackageVersion getMaxPackageVersion() {
      return MaxPackageVersion;
    }

    public void setMaxPackageVersion(com.sforce.soap.tooling.sobject.SubscriberPackageVersion MaxPackageVersion) {
      this.MaxPackageVersion = MaxPackageVersion;
      MaxPackageVersion__is_set = true;
    }

    protected void setMaxPackageVersion(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("MaxPackageVersion", "urn:sobject.tooling.soap.sforce.com","MaxPackageVersion","urn:sobject.tooling.soap.sforce.com","SubscriberPackageVersion",0,1,true))) {
        setMaxPackageVersion((com.sforce.soap.tooling.sobject.SubscriberPackageVersion)__typeMapper.readObject(__in, _lookupTypeInfo("MaxPackageVersion", "urn:sobject.tooling.soap.sforce.com","MaxPackageVersion","urn:sobject.tooling.soap.sforce.com","SubscriberPackageVersion",0,1,true), com.sforce.soap.tooling.sobject.SubscriberPackageVersion.class));
      }
    }

    private void writeFieldMaxPackageVersion(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("MaxPackageVersion", "urn:sobject.tooling.soap.sforce.com","MaxPackageVersion","urn:sobject.tooling.soap.sforce.com","SubscriberPackageVersion",0,1,true), MaxPackageVersion, MaxPackageVersion__is_set);
    }

    /**
     * element : MaxPackageVersionId of type {urn:tooling.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean MaxPackageVersionId__is_set = false;

    private java.lang.String MaxPackageVersionId;

    public java.lang.String getMaxPackageVersionId() {
      return MaxPackageVersionId;
    }

    public void setMaxPackageVersionId(java.lang.String MaxPackageVersionId) {
      this.MaxPackageVersionId = MaxPackageVersionId;
      MaxPackageVersionId__is_set = true;
    }

    protected void setMaxPackageVersionId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("MaxPackageVersionId", "urn:sobject.tooling.soap.sforce.com","MaxPackageVersionId","urn:tooling.soap.sforce.com","ID",0,1,true))) {
        setMaxPackageVersionId(__typeMapper.readString(__in, _lookupTypeInfo("MaxPackageVersionId", "urn:sobject.tooling.soap.sforce.com","MaxPackageVersionId","urn:tooling.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldMaxPackageVersionId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("MaxPackageVersionId", "urn:sobject.tooling.soap.sforce.com","MaxPackageVersionId","urn:tooling.soap.sforce.com","ID",0,1,true), MaxPackageVersionId, MaxPackageVersionId__is_set);
    }

    /**
     * element : MinPackageVersion of type {urn:sobject.tooling.soap.sforce.com}SubscriberPackageVersion
     * java type: com.sforce.soap.tooling.sobject.SubscriberPackageVersion
     */
    private boolean MinPackageVersion__is_set = false;

    private com.sforce.soap.tooling.sobject.SubscriberPackageVersion MinPackageVersion;

    public com.sforce.soap.tooling.sobject.SubscriberPackageVersion getMinPackageVersion() {
      return MinPackageVersion;
    }

    public void setMinPackageVersion(com.sforce.soap.tooling.sobject.SubscriberPackageVersion MinPackageVersion) {
      this.MinPackageVersion = MinPackageVersion;
      MinPackageVersion__is_set = true;
    }

    protected void setMinPackageVersion(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("MinPackageVersion", "urn:sobject.tooling.soap.sforce.com","MinPackageVersion","urn:sobject.tooling.soap.sforce.com","SubscriberPackageVersion",0,1,true))) {
        setMinPackageVersion((com.sforce.soap.tooling.sobject.SubscriberPackageVersion)__typeMapper.readObject(__in, _lookupTypeInfo("MinPackageVersion", "urn:sobject.tooling.soap.sforce.com","MinPackageVersion","urn:sobject.tooling.soap.sforce.com","SubscriberPackageVersion",0,1,true), com.sforce.soap.tooling.sobject.SubscriberPackageVersion.class));
      }
    }

    private void writeFieldMinPackageVersion(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("MinPackageVersion", "urn:sobject.tooling.soap.sforce.com","MinPackageVersion","urn:sobject.tooling.soap.sforce.com","SubscriberPackageVersion",0,1,true), MinPackageVersion, MinPackageVersion__is_set);
    }

    /**
     * element : MinPackageVersionId of type {urn:tooling.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean MinPackageVersionId__is_set = false;

    private java.lang.String MinPackageVersionId;

    public java.lang.String getMinPackageVersionId() {
      return MinPackageVersionId;
    }

    public void setMinPackageVersionId(java.lang.String MinPackageVersionId) {
      this.MinPackageVersionId = MinPackageVersionId;
      MinPackageVersionId__is_set = true;
    }

    protected void setMinPackageVersionId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("MinPackageVersionId", "urn:sobject.tooling.soap.sforce.com","MinPackageVersionId","urn:tooling.soap.sforce.com","ID",0,1,true))) {
        setMinPackageVersionId(__typeMapper.readString(__in, _lookupTypeInfo("MinPackageVersionId", "urn:sobject.tooling.soap.sforce.com","MinPackageVersionId","urn:tooling.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldMinPackageVersionId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("MinPackageVersionId", "urn:sobject.tooling.soap.sforce.com","MinPackageVersionId","urn:tooling.soap.sforce.com","ID",0,1,true), MinPackageVersionId, MinPackageVersionId__is_set);
    }

    /**
     * element : Subject of type {urn:sobject.tooling.soap.sforce.com}sObject
     * java type: com.sforce.soap.tooling.sobject.SObject
     */
    private boolean Subject__is_set = false;

    private com.sforce.soap.tooling.sobject.SObject Subject;

    public com.sforce.soap.tooling.sobject.SObject getSubject() {
      return Subject;
    }

    public void setSubject(com.sforce.soap.tooling.sobject.SObject Subject) {
      this.Subject = Subject;
      Subject__is_set = true;
    }

    protected void setSubject(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("Subject", "urn:sobject.tooling.soap.sforce.com","Subject","urn:sobject.tooling.soap.sforce.com","sObject",0,1,true))) {
        setSubject((com.sforce.soap.tooling.sobject.SObject)__typeMapper.readObject(__in, _lookupTypeInfo("Subject", "urn:sobject.tooling.soap.sforce.com","Subject","urn:sobject.tooling.soap.sforce.com","sObject",0,1,true), com.sforce.soap.tooling.sobject.SObject.class));
      }
    }

    private void writeFieldSubject(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("Subject", "urn:sobject.tooling.soap.sforce.com","Subject","urn:sobject.tooling.soap.sforce.com","sObject",0,1,true), Subject, Subject__is_set);
    }

    /**
     * element : SubjectId of type {urn:tooling.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean SubjectId__is_set = false;

    private java.lang.String SubjectId;

    public java.lang.String getSubjectId() {
      return SubjectId;
    }

    public void setSubjectId(java.lang.String SubjectId) {
      this.SubjectId = SubjectId;
      SubjectId__is_set = true;
    }

    protected void setSubjectId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SubjectId", "urn:sobject.tooling.soap.sforce.com","SubjectId","urn:tooling.soap.sforce.com","ID",0,1,true))) {
        setSubjectId(__typeMapper.readString(__in, _lookupTypeInfo("SubjectId", "urn:sobject.tooling.soap.sforce.com","SubjectId","urn:tooling.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSubjectId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SubjectId", "urn:sobject.tooling.soap.sforce.com","SubjectId","urn:tooling.soap.sforce.com","ID",0,1,true), SubjectId, SubjectId__is_set);
    }

    /**
     * element : SubjectKeyPrefix of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean SubjectKeyPrefix__is_set = false;

    private java.lang.String SubjectKeyPrefix;

    public java.lang.String getSubjectKeyPrefix() {
      return SubjectKeyPrefix;
    }

    public void setSubjectKeyPrefix(java.lang.String SubjectKeyPrefix) {
      this.SubjectKeyPrefix = SubjectKeyPrefix;
      SubjectKeyPrefix__is_set = true;
    }

    protected void setSubjectKeyPrefix(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SubjectKeyPrefix", "urn:sobject.tooling.soap.sforce.com","SubjectKeyPrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setSubjectKeyPrefix(__typeMapper.readString(__in, _lookupTypeInfo("SubjectKeyPrefix", "urn:sobject.tooling.soap.sforce.com","SubjectKeyPrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSubjectKeyPrefix(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SubjectKeyPrefix", "urn:sobject.tooling.soap.sforce.com","SubjectKeyPrefix","http://www.w3.org/2001/XMLSchema","string",0,1,true), SubjectKeyPrefix, SubjectKeyPrefix__is_set);
    }

    /**
     * element : SubjectManageableState of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean SubjectManageableState__is_set = false;

    private java.lang.String SubjectManageableState;

    public java.lang.String getSubjectManageableState() {
      return SubjectManageableState;
    }

    public void setSubjectManageableState(java.lang.String SubjectManageableState) {
      this.SubjectManageableState = SubjectManageableState;
      SubjectManageableState__is_set = true;
    }

    protected void setSubjectManageableState(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SubjectManageableState", "urn:sobject.tooling.soap.sforce.com","SubjectManageableState","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setSubjectManageableState(__typeMapper.readString(__in, _lookupTypeInfo("SubjectManageableState", "urn:sobject.tooling.soap.sforce.com","SubjectManageableState","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSubjectManageableState(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SubjectManageableState", "urn:sobject.tooling.soap.sforce.com","SubjectManageableState","http://www.w3.org/2001/XMLSchema","string",0,1,true), SubjectManageableState, SubjectManageableState__is_set);
    }

    /**
     * element : SubscriberPackage of type {urn:sobject.tooling.soap.sforce.com}SubscriberPackage
     * java type: com.sforce.soap.tooling.sobject.SubscriberPackage
     */
    private boolean SubscriberPackage__is_set = false;

    private com.sforce.soap.tooling.sobject.SubscriberPackage SubscriberPackage;

    public com.sforce.soap.tooling.sobject.SubscriberPackage getSubscriberPackage() {
      return SubscriberPackage;
    }

    public void setSubscriberPackage(com.sforce.soap.tooling.sobject.SubscriberPackage SubscriberPackage) {
      this.SubscriberPackage = SubscriberPackage;
      SubscriberPackage__is_set = true;
    }

    protected void setSubscriberPackage(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SubscriberPackage", "urn:sobject.tooling.soap.sforce.com","SubscriberPackage","urn:sobject.tooling.soap.sforce.com","SubscriberPackage",0,1,true))) {
        setSubscriberPackage((com.sforce.soap.tooling.sobject.SubscriberPackage)__typeMapper.readObject(__in, _lookupTypeInfo("SubscriberPackage", "urn:sobject.tooling.soap.sforce.com","SubscriberPackage","urn:sobject.tooling.soap.sforce.com","SubscriberPackage",0,1,true), com.sforce.soap.tooling.sobject.SubscriberPackage.class));
      }
    }

    private void writeFieldSubscriberPackage(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SubscriberPackage", "urn:sobject.tooling.soap.sforce.com","SubscriberPackage","urn:sobject.tooling.soap.sforce.com","SubscriberPackage",0,1,true), SubscriberPackage, SubscriberPackage__is_set);
    }

    /**
     * element : SubscriberPackageId of type {urn:tooling.soap.sforce.com}ID
     * java type: java.lang.String
     */
    private boolean SubscriberPackageId__is_set = false;

    private java.lang.String SubscriberPackageId;

    public java.lang.String getSubscriberPackageId() {
      return SubscriberPackageId;
    }

    public void setSubscriberPackageId(java.lang.String SubscriberPackageId) {
      this.SubscriberPackageId = SubscriberPackageId;
      SubscriberPackageId__is_set = true;
    }

    protected void setSubscriberPackageId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SubscriberPackageId", "urn:sobject.tooling.soap.sforce.com","SubscriberPackageId","urn:tooling.soap.sforce.com","ID",0,1,true))) {
        setSubscriberPackageId(__typeMapper.readString(__in, _lookupTypeInfo("SubscriberPackageId", "urn:sobject.tooling.soap.sforce.com","SubscriberPackageId","urn:tooling.soap.sforce.com","ID",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSubscriberPackageId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SubscriberPackageId", "urn:sobject.tooling.soap.sforce.com","SubscriberPackageId","urn:tooling.soap.sforce.com","ID",0,1,true), SubscriberPackageId, SubscriberPackageId__is_set);
    }

    /**
     * element : SystemModstamp of type {http://www.w3.org/2001/XMLSchema}dateTime
     * java type: java.util.Calendar
     */
    private boolean SystemModstamp__is_set = false;

    private java.util.Calendar SystemModstamp;

    public java.util.Calendar getSystemModstamp() {
      return SystemModstamp;
    }

    public void setSystemModstamp(java.util.Calendar SystemModstamp) {
      this.SystemModstamp = SystemModstamp;
      SystemModstamp__is_set = true;
    }

    protected void setSystemModstamp(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SystemModstamp", "urn:sobject.tooling.soap.sforce.com","SystemModstamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true))) {
        setSystemModstamp((java.util.Calendar)__typeMapper.readObject(__in, _lookupTypeInfo("SystemModstamp", "urn:sobject.tooling.soap.sforce.com","SystemModstamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), java.util.Calendar.class));
      }
    }

    private void writeFieldSystemModstamp(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SystemModstamp", "urn:sobject.tooling.soap.sforce.com","SystemModstamp","http://www.w3.org/2001/XMLSchema","dateTime",0,1,true), SystemModstamp, SystemModstamp__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.tooling.soap.sforce.com", "Package2Member");
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
      sb.append("[Package2Member ");
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
      writeFieldCreatedBy(__out, __typeMapper);
      writeFieldCreatedById(__out, __typeMapper);
      writeFieldCreatedDate(__out, __typeMapper);
      writeFieldCurrentPackageVersion(__out, __typeMapper);
      writeFieldCurrentPackageVersionId(__out, __typeMapper);
      writeFieldIsDeleted(__out, __typeMapper);
      writeFieldLastModifiedBy(__out, __typeMapper);
      writeFieldLastModifiedById(__out, __typeMapper);
      writeFieldLastModifiedDate(__out, __typeMapper);
      writeFieldMaxPackageVersion(__out, __typeMapper);
      writeFieldMaxPackageVersionId(__out, __typeMapper);
      writeFieldMinPackageVersion(__out, __typeMapper);
      writeFieldMinPackageVersionId(__out, __typeMapper);
      writeFieldSubject(__out, __typeMapper);
      writeFieldSubjectId(__out, __typeMapper);
      writeFieldSubjectKeyPrefix(__out, __typeMapper);
      writeFieldSubjectManageableState(__out, __typeMapper);
      writeFieldSubscriberPackage(__out, __typeMapper);
      writeFieldSubscriberPackageId(__out, __typeMapper);
      writeFieldSystemModstamp(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCreatedBy(__in, __typeMapper);
      setCreatedById(__in, __typeMapper);
      setCreatedDate(__in, __typeMapper);
      setCurrentPackageVersion(__in, __typeMapper);
      setCurrentPackageVersionId(__in, __typeMapper);
      setIsDeleted(__in, __typeMapper);
      setLastModifiedBy(__in, __typeMapper);
      setLastModifiedById(__in, __typeMapper);
      setLastModifiedDate(__in, __typeMapper);
      setMaxPackageVersion(__in, __typeMapper);
      setMaxPackageVersionId(__in, __typeMapper);
      setMinPackageVersion(__in, __typeMapper);
      setMinPackageVersionId(__in, __typeMapper);
      setSubject(__in, __typeMapper);
      setSubjectId(__in, __typeMapper);
      setSubjectKeyPrefix(__in, __typeMapper);
      setSubjectManageableState(__in, __typeMapper);
      setSubscriberPackage(__in, __typeMapper);
      setSubscriberPackageId(__in, __typeMapper);
      setSystemModstamp(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "CreatedBy", CreatedBy);
      toStringHelper(sb, "CreatedById", CreatedById);
      toStringHelper(sb, "CreatedDate", CreatedDate);
      toStringHelper(sb, "CurrentPackageVersion", CurrentPackageVersion);
      toStringHelper(sb, "CurrentPackageVersionId", CurrentPackageVersionId);
      toStringHelper(sb, "IsDeleted", IsDeleted);
      toStringHelper(sb, "LastModifiedBy", LastModifiedBy);
      toStringHelper(sb, "LastModifiedById", LastModifiedById);
      toStringHelper(sb, "LastModifiedDate", LastModifiedDate);
      toStringHelper(sb, "MaxPackageVersion", MaxPackageVersion);
      toStringHelper(sb, "MaxPackageVersionId", MaxPackageVersionId);
      toStringHelper(sb, "MinPackageVersion", MinPackageVersion);
      toStringHelper(sb, "MinPackageVersionId", MinPackageVersionId);
      toStringHelper(sb, "Subject", Subject);
      toStringHelper(sb, "SubjectId", SubjectId);
      toStringHelper(sb, "SubjectKeyPrefix", SubjectKeyPrefix);
      toStringHelper(sb, "SubjectManageableState", SubjectManageableState);
      toStringHelper(sb, "SubscriberPackage", SubscriberPackage);
      toStringHelper(sb, "SubscriberPackageId", SubscriberPackageId);
      toStringHelper(sb, "SystemModstamp", SystemModstamp);
    }


}
