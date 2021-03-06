package com.sforce.soap.tooling.sobject;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class FeedItemSettings extends com.sforce.soap.tooling.sobject.SObject {

    /**
     * Constructor
     */
    public FeedItemSettings() {}

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
     * element : CharacterLimit of type {http://www.w3.org/2001/XMLSchema}int
     * java type: java.lang.Integer
     */
    private boolean CharacterLimit__is_set = false;

    private java.lang.Integer CharacterLimit;

    public java.lang.Integer getCharacterLimit() {
      return CharacterLimit;
    }

    public void setCharacterLimit(java.lang.Integer CharacterLimit) {
      this.CharacterLimit = CharacterLimit;
      CharacterLimit__is_set = true;
    }

    protected void setCharacterLimit(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CharacterLimit", "urn:sobject.tooling.soap.sforce.com","CharacterLimit","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setCharacterLimit((java.lang.Integer)__typeMapper.readObject(__in, _lookupTypeInfo("CharacterLimit", "urn:sobject.tooling.soap.sforce.com","CharacterLimit","http://www.w3.org/2001/XMLSchema","int",0,1,true), java.lang.Integer.class));
      }
    }

    private void writeFieldCharacterLimit(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CharacterLimit", "urn:sobject.tooling.soap.sforce.com","CharacterLimit","http://www.w3.org/2001/XMLSchema","int",0,1,true), CharacterLimit, CharacterLimit__is_set);
    }

    /**
     * element : CollapseThread of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: java.lang.Boolean
     */
    private boolean CollapseThread__is_set = false;

    private java.lang.Boolean CollapseThread;

    public java.lang.Boolean getCollapseThread() {
      return CollapseThread;
    }

    public void setCollapseThread(java.lang.Boolean CollapseThread) {
      this.CollapseThread = CollapseThread;
      CollapseThread__is_set = true;
    }

    protected void setCollapseThread(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("CollapseThread", "urn:sobject.tooling.soap.sforce.com","CollapseThread","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setCollapseThread((java.lang.Boolean)__typeMapper.readObject(__in, _lookupTypeInfo("CollapseThread", "urn:sobject.tooling.soap.sforce.com","CollapseThread","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), java.lang.Boolean.class));
      }
    }

    private void writeFieldCollapseThread(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("CollapseThread", "urn:sobject.tooling.soap.sforce.com","CollapseThread","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), CollapseThread, CollapseThread__is_set);
    }

    /**
     * element : DisplayFormat of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean DisplayFormat__is_set = false;

    private java.lang.String DisplayFormat;

    public java.lang.String getDisplayFormat() {
      return DisplayFormat;
    }

    public void setDisplayFormat(java.lang.String DisplayFormat) {
      this.DisplayFormat = DisplayFormat;
      DisplayFormat__is_set = true;
    }

    protected void setDisplayFormat(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("DisplayFormat", "urn:sobject.tooling.soap.sforce.com","DisplayFormat","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDisplayFormat(__typeMapper.readString(__in, _lookupTypeInfo("DisplayFormat", "urn:sobject.tooling.soap.sforce.com","DisplayFormat","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDisplayFormat(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("DisplayFormat", "urn:sobject.tooling.soap.sforce.com","DisplayFormat","http://www.w3.org/2001/XMLSchema","string",0,1,true), DisplayFormat, DisplayFormat__is_set);
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
     * element : FeedItemType of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean FeedItemType__is_set = false;

    private java.lang.String FeedItemType;

    public java.lang.String getFeedItemType() {
      return FeedItemType;
    }

    public void setFeedItemType(java.lang.String FeedItemType) {
      this.FeedItemType = FeedItemType;
      FeedItemType__is_set = true;
    }

    protected void setFeedItemType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("FeedItemType", "urn:sobject.tooling.soap.sforce.com","FeedItemType","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setFeedItemType(__typeMapper.readString(__in, _lookupTypeInfo("FeedItemType", "urn:sobject.tooling.soap.sforce.com","FeedItemType","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFeedItemType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("FeedItemType", "urn:sobject.tooling.soap.sforce.com","FeedItemType","http://www.w3.org/2001/XMLSchema","string",0,1,true), FeedItemType, FeedItemType__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:sobject.tooling.soap.sforce.com", "FeedItemSettings");
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
      sb.append("[FeedItemSettings ");
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
      writeFieldCharacterLimit(__out, __typeMapper);
      writeFieldCollapseThread(__out, __typeMapper);
      writeFieldDisplayFormat(__out, __typeMapper);
      writeFieldDurableId(__out, __typeMapper);
      writeFieldFeedItemType(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCharacterLimit(__in, __typeMapper);
      setCollapseThread(__in, __typeMapper);
      setDisplayFormat(__in, __typeMapper);
      setDurableId(__in, __typeMapper);
      setFeedItemType(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "CharacterLimit", CharacterLimit);
      toStringHelper(sb, "CollapseThread", CollapseThread);
      toStringHelper(sb, "DisplayFormat", DisplayFormat);
      toStringHelper(sb, "DurableId", DurableId);
      toStringHelper(sb, "FeedItemType", FeedItemType);
    }


}
