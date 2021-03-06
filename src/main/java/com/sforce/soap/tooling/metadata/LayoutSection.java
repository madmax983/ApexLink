package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class LayoutSection implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public LayoutSection() {}

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
     * element : customLabel of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean customLabel__is_set = false;

    private boolean customLabel;

    public boolean getCustomLabel() {
      return customLabel;
    }

    public boolean isCustomLabel() {
      return customLabel;
    }

    public void setCustomLabel(boolean customLabel) {
      this.customLabel = customLabel;
      customLabel__is_set = true;
    }

    protected void setCustomLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("customLabel", "urn:metadata.tooling.soap.sforce.com","customLabel","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setCustomLabel(__typeMapper.readBoolean(__in, _lookupTypeInfo("customLabel", "urn:metadata.tooling.soap.sforce.com","customLabel","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldCustomLabel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("customLabel", "urn:metadata.tooling.soap.sforce.com","customLabel","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), customLabel, customLabel__is_set);
    }

    /**
     * element : detailHeading of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean detailHeading__is_set = false;

    private boolean detailHeading;

    public boolean getDetailHeading() {
      return detailHeading;
    }

    public boolean isDetailHeading() {
      return detailHeading;
    }

    public void setDetailHeading(boolean detailHeading) {
      this.detailHeading = detailHeading;
      detailHeading__is_set = true;
    }

    protected void setDetailHeading(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("detailHeading", "urn:metadata.tooling.soap.sforce.com","detailHeading","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setDetailHeading(__typeMapper.readBoolean(__in, _lookupTypeInfo("detailHeading", "urn:metadata.tooling.soap.sforce.com","detailHeading","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldDetailHeading(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("detailHeading", "urn:metadata.tooling.soap.sforce.com","detailHeading","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), detailHeading, detailHeading__is_set);
    }

    /**
     * element : editHeading of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean editHeading__is_set = false;

    private boolean editHeading;

    public boolean getEditHeading() {
      return editHeading;
    }

    public boolean isEditHeading() {
      return editHeading;
    }

    public void setEditHeading(boolean editHeading) {
      this.editHeading = editHeading;
      editHeading__is_set = true;
    }

    protected void setEditHeading(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("editHeading", "urn:metadata.tooling.soap.sforce.com","editHeading","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setEditHeading(__typeMapper.readBoolean(__in, _lookupTypeInfo("editHeading", "urn:metadata.tooling.soap.sforce.com","editHeading","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldEditHeading(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("editHeading", "urn:metadata.tooling.soap.sforce.com","editHeading","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), editHeading, editHeading__is_set);
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
     * element : layoutColumns of type {urn:metadata.tooling.soap.sforce.com}LayoutColumn
     * java type: com.sforce.soap.tooling.metadata.LayoutColumn[]
     */
    private boolean layoutColumns__is_set = false;

    private com.sforce.soap.tooling.metadata.LayoutColumn[] layoutColumns = new com.sforce.soap.tooling.metadata.LayoutColumn[0];

    public com.sforce.soap.tooling.metadata.LayoutColumn[] getLayoutColumns() {
      return layoutColumns;
    }

    public void setLayoutColumns(com.sforce.soap.tooling.metadata.LayoutColumn[] layoutColumns) {
      this.layoutColumns = layoutColumns;
      layoutColumns__is_set = true;
    }

    protected void setLayoutColumns(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("layoutColumns", "urn:metadata.tooling.soap.sforce.com","layoutColumns","urn:metadata.tooling.soap.sforce.com","LayoutColumn",0,-1,true))) {
        setLayoutColumns((com.sforce.soap.tooling.metadata.LayoutColumn[])__typeMapper.readObject(__in, _lookupTypeInfo("layoutColumns", "urn:metadata.tooling.soap.sforce.com","layoutColumns","urn:metadata.tooling.soap.sforce.com","LayoutColumn",0,-1,true), com.sforce.soap.tooling.metadata.LayoutColumn[].class));
      }
    }

    private void writeFieldLayoutColumns(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("layoutColumns", "urn:metadata.tooling.soap.sforce.com","layoutColumns","urn:metadata.tooling.soap.sforce.com","LayoutColumn",0,-1,true), layoutColumns, layoutColumns__is_set);
    }

    /**
     * element : style of type {urn:tooling.soap.sforce.com}LayoutSectionStyle
     * java type: com.sforce.soap.tooling.LayoutSectionStyle
     */
    private boolean style__is_set = false;

    private com.sforce.soap.tooling.LayoutSectionStyle style;

    public com.sforce.soap.tooling.LayoutSectionStyle getStyle() {
      return style;
    }

    public void setStyle(com.sforce.soap.tooling.LayoutSectionStyle style) {
      this.style = style;
      style__is_set = true;
    }

    protected void setStyle(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("style", "urn:metadata.tooling.soap.sforce.com","style","urn:tooling.soap.sforce.com","LayoutSectionStyle",1,1,true))) {
        setStyle((com.sforce.soap.tooling.LayoutSectionStyle)__typeMapper.readObject(__in, _lookupTypeInfo("style", "urn:metadata.tooling.soap.sforce.com","style","urn:tooling.soap.sforce.com","LayoutSectionStyle",1,1,true), com.sforce.soap.tooling.LayoutSectionStyle.class));
      }
    }

    private void writeFieldStyle(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("style", "urn:metadata.tooling.soap.sforce.com","style","urn:tooling.soap.sforce.com","LayoutSectionStyle",1,1,true), style, style__is_set);
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
      sb.append("[LayoutSection ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldCustomLabel(__out, __typeMapper);
      writeFieldDetailHeading(__out, __typeMapper);
      writeFieldEditHeading(__out, __typeMapper);
      writeFieldLabel(__out, __typeMapper);
      writeFieldLayoutColumns(__out, __typeMapper);
      writeFieldStyle(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCustomLabel(__in, __typeMapper);
      setDetailHeading(__in, __typeMapper);
      setEditHeading(__in, __typeMapper);
      setLabel(__in, __typeMapper);
      setLayoutColumns(__in, __typeMapper);
      setStyle(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "customLabel", customLabel);
      toStringHelper(sb, "detailHeading", detailHeading);
      toStringHelper(sb, "editHeading", editHeading);
      toStringHelper(sb, "label", label);
      toStringHelper(sb, "layoutColumns", layoutColumns);
      toStringHelper(sb, "style", style);
    }


}
