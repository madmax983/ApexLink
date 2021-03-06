package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class FlexiPageRegion implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public FlexiPageRegion() {}

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
     * element : appendable of type {urn:tooling.soap.sforce.com}RegionFlagStatus
     * java type: com.sforce.soap.tooling.RegionFlagStatus
     */
    private boolean appendable__is_set = false;

    private com.sforce.soap.tooling.RegionFlagStatus appendable;

    public com.sforce.soap.tooling.RegionFlagStatus getAppendable() {
      return appendable;
    }

    public void setAppendable(com.sforce.soap.tooling.RegionFlagStatus appendable) {
      this.appendable = appendable;
      appendable__is_set = true;
    }

    protected void setAppendable(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("appendable", "urn:metadata.tooling.soap.sforce.com","appendable","urn:tooling.soap.sforce.com","RegionFlagStatus",0,1,true))) {
        setAppendable((com.sforce.soap.tooling.RegionFlagStatus)__typeMapper.readObject(__in, _lookupTypeInfo("appendable", "urn:metadata.tooling.soap.sforce.com","appendable","urn:tooling.soap.sforce.com","RegionFlagStatus",0,1,true), com.sforce.soap.tooling.RegionFlagStatus.class));
      }
    }

    private void writeFieldAppendable(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("appendable", "urn:metadata.tooling.soap.sforce.com","appendable","urn:tooling.soap.sforce.com","RegionFlagStatus",0,1,true), appendable, appendable__is_set);
    }

    /**
     * element : componentInstances of type {urn:metadata.tooling.soap.sforce.com}ComponentInstance
     * java type: com.sforce.soap.tooling.metadata.ComponentInstance[]
     */
    private boolean componentInstances__is_set = false;

    private com.sforce.soap.tooling.metadata.ComponentInstance[] componentInstances = new com.sforce.soap.tooling.metadata.ComponentInstance[0];

    public com.sforce.soap.tooling.metadata.ComponentInstance[] getComponentInstances() {
      return componentInstances;
    }

    public void setComponentInstances(com.sforce.soap.tooling.metadata.ComponentInstance[] componentInstances) {
      this.componentInstances = componentInstances;
      componentInstances__is_set = true;
    }

    protected void setComponentInstances(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("componentInstances", "urn:metadata.tooling.soap.sforce.com","componentInstances","urn:metadata.tooling.soap.sforce.com","ComponentInstance",0,-1,true))) {
        setComponentInstances((com.sforce.soap.tooling.metadata.ComponentInstance[])__typeMapper.readObject(__in, _lookupTypeInfo("componentInstances", "urn:metadata.tooling.soap.sforce.com","componentInstances","urn:metadata.tooling.soap.sforce.com","ComponentInstance",0,-1,true), com.sforce.soap.tooling.metadata.ComponentInstance[].class));
      }
    }

    private void writeFieldComponentInstances(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("componentInstances", "urn:metadata.tooling.soap.sforce.com","componentInstances","urn:metadata.tooling.soap.sforce.com","ComponentInstance",0,-1,true), componentInstances, componentInstances__is_set);
    }

    /**
     * element : mode of type {urn:tooling.soap.sforce.com}FlexiPageRegionMode
     * java type: com.sforce.soap.tooling.FlexiPageRegionMode
     */
    private boolean mode__is_set = false;

    private com.sforce.soap.tooling.FlexiPageRegionMode mode;

    public com.sforce.soap.tooling.FlexiPageRegionMode getMode() {
      return mode;
    }

    public void setMode(com.sforce.soap.tooling.FlexiPageRegionMode mode) {
      this.mode = mode;
      mode__is_set = true;
    }

    protected void setMode(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("mode", "urn:metadata.tooling.soap.sforce.com","mode","urn:tooling.soap.sforce.com","FlexiPageRegionMode",0,1,true))) {
        setMode((com.sforce.soap.tooling.FlexiPageRegionMode)__typeMapper.readObject(__in, _lookupTypeInfo("mode", "urn:metadata.tooling.soap.sforce.com","mode","urn:tooling.soap.sforce.com","FlexiPageRegionMode",0,1,true), com.sforce.soap.tooling.FlexiPageRegionMode.class));
      }
    }

    private void writeFieldMode(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("mode", "urn:metadata.tooling.soap.sforce.com","mode","urn:tooling.soap.sforce.com","FlexiPageRegionMode",0,1,true), mode, mode__is_set);
    }

    /**
     * element : name of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean name__is_set = false;

    private java.lang.String name;

    public java.lang.String getName() {
      return name;
    }

    public void setName(java.lang.String name) {
      this.name = name;
      name__is_set = true;
    }

    protected void setName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("name", "urn:metadata.tooling.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setName(__typeMapper.readString(__in, _lookupTypeInfo("name", "urn:metadata.tooling.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("name", "urn:metadata.tooling.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true), name, name__is_set);
    }

    /**
     * element : prependable of type {urn:tooling.soap.sforce.com}RegionFlagStatus
     * java type: com.sforce.soap.tooling.RegionFlagStatus
     */
    private boolean prependable__is_set = false;

    private com.sforce.soap.tooling.RegionFlagStatus prependable;

    public com.sforce.soap.tooling.RegionFlagStatus getPrependable() {
      return prependable;
    }

    public void setPrependable(com.sforce.soap.tooling.RegionFlagStatus prependable) {
      this.prependable = prependable;
      prependable__is_set = true;
    }

    protected void setPrependable(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("prependable", "urn:metadata.tooling.soap.sforce.com","prependable","urn:tooling.soap.sforce.com","RegionFlagStatus",0,1,true))) {
        setPrependable((com.sforce.soap.tooling.RegionFlagStatus)__typeMapper.readObject(__in, _lookupTypeInfo("prependable", "urn:metadata.tooling.soap.sforce.com","prependable","urn:tooling.soap.sforce.com","RegionFlagStatus",0,1,true), com.sforce.soap.tooling.RegionFlagStatus.class));
      }
    }

    private void writeFieldPrependable(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("prependable", "urn:metadata.tooling.soap.sforce.com","prependable","urn:tooling.soap.sforce.com","RegionFlagStatus",0,1,true), prependable, prependable__is_set);
    }

    /**
     * element : replaceable of type {urn:tooling.soap.sforce.com}RegionFlagStatus
     * java type: com.sforce.soap.tooling.RegionFlagStatus
     */
    private boolean replaceable__is_set = false;

    private com.sforce.soap.tooling.RegionFlagStatus replaceable;

    public com.sforce.soap.tooling.RegionFlagStatus getReplaceable() {
      return replaceable;
    }

    public void setReplaceable(com.sforce.soap.tooling.RegionFlagStatus replaceable) {
      this.replaceable = replaceable;
      replaceable__is_set = true;
    }

    protected void setReplaceable(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("replaceable", "urn:metadata.tooling.soap.sforce.com","replaceable","urn:tooling.soap.sforce.com","RegionFlagStatus",0,1,true))) {
        setReplaceable((com.sforce.soap.tooling.RegionFlagStatus)__typeMapper.readObject(__in, _lookupTypeInfo("replaceable", "urn:metadata.tooling.soap.sforce.com","replaceable","urn:tooling.soap.sforce.com","RegionFlagStatus",0,1,true), com.sforce.soap.tooling.RegionFlagStatus.class));
      }
    }

    private void writeFieldReplaceable(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("replaceable", "urn:metadata.tooling.soap.sforce.com","replaceable","urn:tooling.soap.sforce.com","RegionFlagStatus",0,1,true), replaceable, replaceable__is_set);
    }

    /**
     * element : type of type {urn:tooling.soap.sforce.com}FlexiPageRegionType
     * java type: com.sforce.soap.tooling.FlexiPageRegionType
     */
    private boolean type__is_set = false;

    private com.sforce.soap.tooling.FlexiPageRegionType type;

    public com.sforce.soap.tooling.FlexiPageRegionType getType() {
      return type;
    }

    public void setType(com.sforce.soap.tooling.FlexiPageRegionType type) {
      this.type = type;
      type__is_set = true;
    }

    protected void setType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("type", "urn:metadata.tooling.soap.sforce.com","type","urn:tooling.soap.sforce.com","FlexiPageRegionType",1,1,true))) {
        setType((com.sforce.soap.tooling.FlexiPageRegionType)__typeMapper.readObject(__in, _lookupTypeInfo("type", "urn:metadata.tooling.soap.sforce.com","type","urn:tooling.soap.sforce.com","FlexiPageRegionType",1,1,true), com.sforce.soap.tooling.FlexiPageRegionType.class));
      }
    }

    private void writeFieldType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("type", "urn:metadata.tooling.soap.sforce.com","type","urn:tooling.soap.sforce.com","FlexiPageRegionType",1,1,true), type, type__is_set);
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
      sb.append("[FlexiPageRegion ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldAppendable(__out, __typeMapper);
      writeFieldComponentInstances(__out, __typeMapper);
      writeFieldMode(__out, __typeMapper);
      writeFieldName(__out, __typeMapper);
      writeFieldPrependable(__out, __typeMapper);
      writeFieldReplaceable(__out, __typeMapper);
      writeFieldType(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAppendable(__in, __typeMapper);
      setComponentInstances(__in, __typeMapper);
      setMode(__in, __typeMapper);
      setName(__in, __typeMapper);
      setPrependable(__in, __typeMapper);
      setReplaceable(__in, __typeMapper);
      setType(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "appendable", appendable);
      toStringHelper(sb, "componentInstances", componentInstances);
      toStringHelper(sb, "mode", mode);
      toStringHelper(sb, "name", name);
      toStringHelper(sb, "prependable", prependable);
      toStringHelper(sb, "replaceable", replaceable);
      toStringHelper(sb, "type", type);
    }


}
