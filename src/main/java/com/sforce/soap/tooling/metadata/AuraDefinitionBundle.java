package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class AuraDefinitionBundle extends com.sforce.soap.tooling.metadata.Metadata {

    /**
     * Constructor
     */
    public AuraDefinitionBundle() {}

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
     * element : SVGContent of type {http://www.w3.org/2001/XMLSchema}base64Binary
     * java type: byte[]
     */
    private boolean SVGContent__is_set = false;

    private byte[] SVGContent;

    public byte[] getSVGContent() {
      return SVGContent;
    }

    public void setSVGContent(byte[] SVGContent) {
      this.SVGContent = SVGContent;
      SVGContent__is_set = true;
    }

    protected void setSVGContent(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("SVGContent", "urn:metadata.tooling.soap.sforce.com","SVGContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true))) {
        setSVGContent((byte[])__typeMapper.readObject(__in, _lookupTypeInfo("SVGContent", "urn:metadata.tooling.soap.sforce.com","SVGContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true), byte[].class));
      }
    }

    private void writeFieldSVGContent(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("SVGContent", "urn:metadata.tooling.soap.sforce.com","SVGContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true), SVGContent, SVGContent__is_set);
    }

    /**
     * element : apiVersion of type {http://www.w3.org/2001/XMLSchema}double
     * java type: double
     */
    private boolean apiVersion__is_set = false;

    private double apiVersion;

    public double getApiVersion() {
      return apiVersion;
    }

    public void setApiVersion(double apiVersion) {
      this.apiVersion = apiVersion;
      apiVersion__is_set = true;
    }

    protected void setApiVersion(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("apiVersion", "urn:metadata.tooling.soap.sforce.com","apiVersion","http://www.w3.org/2001/XMLSchema","double",0,1,true))) {
        setApiVersion((double)__typeMapper.readDouble(__in, _lookupTypeInfo("apiVersion", "urn:metadata.tooling.soap.sforce.com","apiVersion","http://www.w3.org/2001/XMLSchema","double",0,1,true), double.class));
      }
    }

    private void writeFieldApiVersion(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("apiVersion", "urn:metadata.tooling.soap.sforce.com","apiVersion","http://www.w3.org/2001/XMLSchema","double",0,1,true), apiVersion, apiVersion__is_set);
    }

    /**
     * element : controllerContent of type {http://www.w3.org/2001/XMLSchema}base64Binary
     * java type: byte[]
     */
    private boolean controllerContent__is_set = false;

    private byte[] controllerContent;

    public byte[] getControllerContent() {
      return controllerContent;
    }

    public void setControllerContent(byte[] controllerContent) {
      this.controllerContent = controllerContent;
      controllerContent__is_set = true;
    }

    protected void setControllerContent(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("controllerContent", "urn:metadata.tooling.soap.sforce.com","controllerContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true))) {
        setControllerContent((byte[])__typeMapper.readObject(__in, _lookupTypeInfo("controllerContent", "urn:metadata.tooling.soap.sforce.com","controllerContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true), byte[].class));
      }
    }

    private void writeFieldControllerContent(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("controllerContent", "urn:metadata.tooling.soap.sforce.com","controllerContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true), controllerContent, controllerContent__is_set);
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
     * element : designContent of type {http://www.w3.org/2001/XMLSchema}base64Binary
     * java type: byte[]
     */
    private boolean designContent__is_set = false;

    private byte[] designContent;

    public byte[] getDesignContent() {
      return designContent;
    }

    public void setDesignContent(byte[] designContent) {
      this.designContent = designContent;
      designContent__is_set = true;
    }

    protected void setDesignContent(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("designContent", "urn:metadata.tooling.soap.sforce.com","designContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true))) {
        setDesignContent((byte[])__typeMapper.readObject(__in, _lookupTypeInfo("designContent", "urn:metadata.tooling.soap.sforce.com","designContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true), byte[].class));
      }
    }

    private void writeFieldDesignContent(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("designContent", "urn:metadata.tooling.soap.sforce.com","designContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true), designContent, designContent__is_set);
    }

    /**
     * element : documentationContent of type {http://www.w3.org/2001/XMLSchema}base64Binary
     * java type: byte[]
     */
    private boolean documentationContent__is_set = false;

    private byte[] documentationContent;

    public byte[] getDocumentationContent() {
      return documentationContent;
    }

    public void setDocumentationContent(byte[] documentationContent) {
      this.documentationContent = documentationContent;
      documentationContent__is_set = true;
    }

    protected void setDocumentationContent(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("documentationContent", "urn:metadata.tooling.soap.sforce.com","documentationContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true))) {
        setDocumentationContent((byte[])__typeMapper.readObject(__in, _lookupTypeInfo("documentationContent", "urn:metadata.tooling.soap.sforce.com","documentationContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true), byte[].class));
      }
    }

    private void writeFieldDocumentationContent(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("documentationContent", "urn:metadata.tooling.soap.sforce.com","documentationContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true), documentationContent, documentationContent__is_set);
    }

    /**
     * element : helperContent of type {http://www.w3.org/2001/XMLSchema}base64Binary
     * java type: byte[]
     */
    private boolean helperContent__is_set = false;

    private byte[] helperContent;

    public byte[] getHelperContent() {
      return helperContent;
    }

    public void setHelperContent(byte[] helperContent) {
      this.helperContent = helperContent;
      helperContent__is_set = true;
    }

    protected void setHelperContent(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("helperContent", "urn:metadata.tooling.soap.sforce.com","helperContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true))) {
        setHelperContent((byte[])__typeMapper.readObject(__in, _lookupTypeInfo("helperContent", "urn:metadata.tooling.soap.sforce.com","helperContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true), byte[].class));
      }
    }

    private void writeFieldHelperContent(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("helperContent", "urn:metadata.tooling.soap.sforce.com","helperContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true), helperContent, helperContent__is_set);
    }

    /**
     * element : markup of type {http://www.w3.org/2001/XMLSchema}base64Binary
     * java type: byte[]
     */
    private boolean markup__is_set = false;

    private byte[] markup;

    public byte[] getMarkup() {
      return markup;
    }

    public void setMarkup(byte[] markup) {
      this.markup = markup;
      markup__is_set = true;
    }

    protected void setMarkup(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("markup", "urn:metadata.tooling.soap.sforce.com","markup","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true))) {
        setMarkup((byte[])__typeMapper.readObject(__in, _lookupTypeInfo("markup", "urn:metadata.tooling.soap.sforce.com","markup","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true), byte[].class));
      }
    }

    private void writeFieldMarkup(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("markup", "urn:metadata.tooling.soap.sforce.com","markup","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true), markup, markup__is_set);
    }

    /**
     * element : modelContent of type {http://www.w3.org/2001/XMLSchema}base64Binary
     * java type: byte[]
     */
    private boolean modelContent__is_set = false;

    private byte[] modelContent;

    public byte[] getModelContent() {
      return modelContent;
    }

    public void setModelContent(byte[] modelContent) {
      this.modelContent = modelContent;
      modelContent__is_set = true;
    }

    protected void setModelContent(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("modelContent", "urn:metadata.tooling.soap.sforce.com","modelContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true))) {
        setModelContent((byte[])__typeMapper.readObject(__in, _lookupTypeInfo("modelContent", "urn:metadata.tooling.soap.sforce.com","modelContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true), byte[].class));
      }
    }

    private void writeFieldModelContent(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("modelContent", "urn:metadata.tooling.soap.sforce.com","modelContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true), modelContent, modelContent__is_set);
    }

    /**
     * element : packageVersions of type {urn:metadata.tooling.soap.sforce.com}PackageVersion
     * java type: com.sforce.soap.tooling.metadata.PackageVersion[]
     */
    private boolean packageVersions__is_set = false;

    private com.sforce.soap.tooling.metadata.PackageVersion[] packageVersions = new com.sforce.soap.tooling.metadata.PackageVersion[0];

    public com.sforce.soap.tooling.metadata.PackageVersion[] getPackageVersions() {
      return packageVersions;
    }

    public void setPackageVersions(com.sforce.soap.tooling.metadata.PackageVersion[] packageVersions) {
      this.packageVersions = packageVersions;
      packageVersions__is_set = true;
    }

    protected void setPackageVersions(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("packageVersions", "urn:metadata.tooling.soap.sforce.com","packageVersions","urn:metadata.tooling.soap.sforce.com","PackageVersion",0,-1,true))) {
        setPackageVersions((com.sforce.soap.tooling.metadata.PackageVersion[])__typeMapper.readObject(__in, _lookupTypeInfo("packageVersions", "urn:metadata.tooling.soap.sforce.com","packageVersions","urn:metadata.tooling.soap.sforce.com","PackageVersion",0,-1,true), com.sforce.soap.tooling.metadata.PackageVersion[].class));
      }
    }

    private void writeFieldPackageVersions(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("packageVersions", "urn:metadata.tooling.soap.sforce.com","packageVersions","urn:metadata.tooling.soap.sforce.com","PackageVersion",0,-1,true), packageVersions, packageVersions__is_set);
    }

    /**
     * element : rendererContent of type {http://www.w3.org/2001/XMLSchema}base64Binary
     * java type: byte[]
     */
    private boolean rendererContent__is_set = false;

    private byte[] rendererContent;

    public byte[] getRendererContent() {
      return rendererContent;
    }

    public void setRendererContent(byte[] rendererContent) {
      this.rendererContent = rendererContent;
      rendererContent__is_set = true;
    }

    protected void setRendererContent(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("rendererContent", "urn:metadata.tooling.soap.sforce.com","rendererContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true))) {
        setRendererContent((byte[])__typeMapper.readObject(__in, _lookupTypeInfo("rendererContent", "urn:metadata.tooling.soap.sforce.com","rendererContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true), byte[].class));
      }
    }

    private void writeFieldRendererContent(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("rendererContent", "urn:metadata.tooling.soap.sforce.com","rendererContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true), rendererContent, rendererContent__is_set);
    }

    /**
     * element : styleContent of type {http://www.w3.org/2001/XMLSchema}base64Binary
     * java type: byte[]
     */
    private boolean styleContent__is_set = false;

    private byte[] styleContent;

    public byte[] getStyleContent() {
      return styleContent;
    }

    public void setStyleContent(byte[] styleContent) {
      this.styleContent = styleContent;
      styleContent__is_set = true;
    }

    protected void setStyleContent(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("styleContent", "urn:metadata.tooling.soap.sforce.com","styleContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true))) {
        setStyleContent((byte[])__typeMapper.readObject(__in, _lookupTypeInfo("styleContent", "urn:metadata.tooling.soap.sforce.com","styleContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true), byte[].class));
      }
    }

    private void writeFieldStyleContent(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("styleContent", "urn:metadata.tooling.soap.sforce.com","styleContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true), styleContent, styleContent__is_set);
    }

    /**
     * element : testsuiteContent of type {http://www.w3.org/2001/XMLSchema}base64Binary
     * java type: byte[]
     */
    private boolean testsuiteContent__is_set = false;

    private byte[] testsuiteContent;

    public byte[] getTestsuiteContent() {
      return testsuiteContent;
    }

    public void setTestsuiteContent(byte[] testsuiteContent) {
      this.testsuiteContent = testsuiteContent;
      testsuiteContent__is_set = true;
    }

    protected void setTestsuiteContent(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("testsuiteContent", "urn:metadata.tooling.soap.sforce.com","testsuiteContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true))) {
        setTestsuiteContent((byte[])__typeMapper.readObject(__in, _lookupTypeInfo("testsuiteContent", "urn:metadata.tooling.soap.sforce.com","testsuiteContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true), byte[].class));
      }
    }

    private void writeFieldTestsuiteContent(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("testsuiteContent", "urn:metadata.tooling.soap.sforce.com","testsuiteContent","http://www.w3.org/2001/XMLSchema","base64Binary",0,1,true), testsuiteContent, testsuiteContent__is_set);
    }

    /**
     * element : type of type {urn:tooling.soap.sforce.com}AuraBundleType
     * java type: com.sforce.soap.tooling.AuraBundleType
     */
    private boolean type__is_set = false;

    private com.sforce.soap.tooling.AuraBundleType type;

    public com.sforce.soap.tooling.AuraBundleType getType() {
      return type;
    }

    public void setType(com.sforce.soap.tooling.AuraBundleType type) {
      this.type = type;
      type__is_set = true;
    }

    protected void setType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("type", "urn:metadata.tooling.soap.sforce.com","type","urn:tooling.soap.sforce.com","AuraBundleType",0,1,true))) {
        setType((com.sforce.soap.tooling.AuraBundleType)__typeMapper.readObject(__in, _lookupTypeInfo("type", "urn:metadata.tooling.soap.sforce.com","type","urn:tooling.soap.sforce.com","AuraBundleType",0,1,true), com.sforce.soap.tooling.AuraBundleType.class));
      }
    }

    private void writeFieldType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("type", "urn:metadata.tooling.soap.sforce.com","type","urn:tooling.soap.sforce.com","AuraBundleType",0,1,true), type, type__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:metadata.tooling.soap.sforce.com", "AuraDefinitionBundle");
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
      sb.append("[AuraDefinitionBundle ");
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
      writeFieldSVGContent(__out, __typeMapper);
      writeFieldApiVersion(__out, __typeMapper);
      writeFieldControllerContent(__out, __typeMapper);
      writeFieldDescription(__out, __typeMapper);
      writeFieldDesignContent(__out, __typeMapper);
      writeFieldDocumentationContent(__out, __typeMapper);
      writeFieldHelperContent(__out, __typeMapper);
      writeFieldMarkup(__out, __typeMapper);
      writeFieldModelContent(__out, __typeMapper);
      writeFieldPackageVersions(__out, __typeMapper);
      writeFieldRendererContent(__out, __typeMapper);
      writeFieldStyleContent(__out, __typeMapper);
      writeFieldTestsuiteContent(__out, __typeMapper);
      writeFieldType(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setSVGContent(__in, __typeMapper);
      setApiVersion(__in, __typeMapper);
      setControllerContent(__in, __typeMapper);
      setDescription(__in, __typeMapper);
      setDesignContent(__in, __typeMapper);
      setDocumentationContent(__in, __typeMapper);
      setHelperContent(__in, __typeMapper);
      setMarkup(__in, __typeMapper);
      setModelContent(__in, __typeMapper);
      setPackageVersions(__in, __typeMapper);
      setRendererContent(__in, __typeMapper);
      setStyleContent(__in, __typeMapper);
      setTestsuiteContent(__in, __typeMapper);
      setType(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "SVGContent", SVGContent);
      toStringHelper(sb, "apiVersion", apiVersion);
      toStringHelper(sb, "controllerContent", controllerContent);
      toStringHelper(sb, "description", description);
      toStringHelper(sb, "designContent", designContent);
      toStringHelper(sb, "documentationContent", documentationContent);
      toStringHelper(sb, "helperContent", helperContent);
      toStringHelper(sb, "markup", markup);
      toStringHelper(sb, "modelContent", modelContent);
      toStringHelper(sb, "packageVersions", packageVersions);
      toStringHelper(sb, "rendererContent", rendererContent);
      toStringHelper(sb, "styleContent", styleContent);
      toStringHelper(sb, "testsuiteContent", testsuiteContent);
      toStringHelper(sb, "type", type);
    }


}
