package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class TransactionSecurityAction implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public TransactionSecurityAction() {}

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
     * element : block of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean block__is_set = false;

    private boolean block;

    public boolean getBlock() {
      return block;
    }

    public boolean isBlock() {
      return block;
    }

    public void setBlock(boolean block) {
      this.block = block;
      block__is_set = true;
    }

    protected void setBlock(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("block", "urn:metadata.tooling.soap.sforce.com","block","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setBlock(__typeMapper.readBoolean(__in, _lookupTypeInfo("block", "urn:metadata.tooling.soap.sforce.com","block","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldBlock(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("block", "urn:metadata.tooling.soap.sforce.com","block","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), block, block__is_set);
    }

    /**
     * element : endSession of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean endSession__is_set = false;

    private boolean endSession;

    public boolean getEndSession() {
      return endSession;
    }

    public boolean isEndSession() {
      return endSession;
    }

    public void setEndSession(boolean endSession) {
      this.endSession = endSession;
      endSession__is_set = true;
    }

    protected void setEndSession(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("endSession", "urn:metadata.tooling.soap.sforce.com","endSession","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setEndSession(__typeMapper.readBoolean(__in, _lookupTypeInfo("endSession", "urn:metadata.tooling.soap.sforce.com","endSession","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldEndSession(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("endSession", "urn:metadata.tooling.soap.sforce.com","endSession","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), endSession, endSession__is_set);
    }

    /**
     * element : freezeUser of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean freezeUser__is_set = false;

    private boolean freezeUser;

    public boolean getFreezeUser() {
      return freezeUser;
    }

    public boolean isFreezeUser() {
      return freezeUser;
    }

    public void setFreezeUser(boolean freezeUser) {
      this.freezeUser = freezeUser;
      freezeUser__is_set = true;
    }

    protected void setFreezeUser(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("freezeUser", "urn:metadata.tooling.soap.sforce.com","freezeUser","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setFreezeUser(__typeMapper.readBoolean(__in, _lookupTypeInfo("freezeUser", "urn:metadata.tooling.soap.sforce.com","freezeUser","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldFreezeUser(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("freezeUser", "urn:metadata.tooling.soap.sforce.com","freezeUser","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), freezeUser, freezeUser__is_set);
    }

    /**
     * element : notifications of type {urn:metadata.tooling.soap.sforce.com}TransactionSecurityNotification
     * java type: com.sforce.soap.tooling.metadata.TransactionSecurityNotification[]
     */
    private boolean notifications__is_set = false;

    private com.sforce.soap.tooling.metadata.TransactionSecurityNotification[] notifications = new com.sforce.soap.tooling.metadata.TransactionSecurityNotification[0];

    public com.sforce.soap.tooling.metadata.TransactionSecurityNotification[] getNotifications() {
      return notifications;
    }

    public void setNotifications(com.sforce.soap.tooling.metadata.TransactionSecurityNotification[] notifications) {
      this.notifications = notifications;
      notifications__is_set = true;
    }

    protected void setNotifications(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("notifications", "urn:metadata.tooling.soap.sforce.com","notifications","urn:metadata.tooling.soap.sforce.com","TransactionSecurityNotification",0,-1,true))) {
        setNotifications((com.sforce.soap.tooling.metadata.TransactionSecurityNotification[])__typeMapper.readObject(__in, _lookupTypeInfo("notifications", "urn:metadata.tooling.soap.sforce.com","notifications","urn:metadata.tooling.soap.sforce.com","TransactionSecurityNotification",0,-1,true), com.sforce.soap.tooling.metadata.TransactionSecurityNotification[].class));
      }
    }

    private void writeFieldNotifications(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("notifications", "urn:metadata.tooling.soap.sforce.com","notifications","urn:metadata.tooling.soap.sforce.com","TransactionSecurityNotification",0,-1,true), notifications, notifications__is_set);
    }

    /**
     * element : twoFactorAuthentication of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean twoFactorAuthentication__is_set = false;

    private boolean twoFactorAuthentication;

    public boolean getTwoFactorAuthentication() {
      return twoFactorAuthentication;
    }

    public boolean isTwoFactorAuthentication() {
      return twoFactorAuthentication;
    }

    public void setTwoFactorAuthentication(boolean twoFactorAuthentication) {
      this.twoFactorAuthentication = twoFactorAuthentication;
      twoFactorAuthentication__is_set = true;
    }

    protected void setTwoFactorAuthentication(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("twoFactorAuthentication", "urn:metadata.tooling.soap.sforce.com","twoFactorAuthentication","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setTwoFactorAuthentication(__typeMapper.readBoolean(__in, _lookupTypeInfo("twoFactorAuthentication", "urn:metadata.tooling.soap.sforce.com","twoFactorAuthentication","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldTwoFactorAuthentication(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("twoFactorAuthentication", "urn:metadata.tooling.soap.sforce.com","twoFactorAuthentication","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), twoFactorAuthentication, twoFactorAuthentication__is_set);
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
      sb.append("[TransactionSecurityAction ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldBlock(__out, __typeMapper);
      writeFieldEndSession(__out, __typeMapper);
      writeFieldFreezeUser(__out, __typeMapper);
      writeFieldNotifications(__out, __typeMapper);
      writeFieldTwoFactorAuthentication(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setBlock(__in, __typeMapper);
      setEndSession(__in, __typeMapper);
      setFreezeUser(__in, __typeMapper);
      setNotifications(__in, __typeMapper);
      setTwoFactorAuthentication(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "block", block);
      toStringHelper(sb, "endSession", endSession);
      toStringHelper(sb, "freezeUser", freezeUser);
      toStringHelper(sb, "notifications", notifications);
      toStringHelper(sb, "twoFactorAuthentication", twoFactorAuthentication);
    }


}
