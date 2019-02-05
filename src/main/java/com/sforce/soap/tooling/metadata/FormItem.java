package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class FormItem implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public FormItem() {}

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
     * element : emptySpace of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean emptySpace__is_set = false;

    private boolean emptySpace;

    public boolean getEmptySpace() {
      return emptySpace;
    }

    public boolean isEmptySpace() {
      return emptySpace;
    }

    public void setEmptySpace(boolean emptySpace) {
      this.emptySpace = emptySpace;
      emptySpace__is_set = true;
    }

    protected void setEmptySpace(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("emptySpace", "urn:metadata.tooling.soap.sforce.com","emptySpace","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setEmptySpace(__typeMapper.readBoolean(__in, _lookupTypeInfo("emptySpace", "urn:metadata.tooling.soap.sforce.com","emptySpace","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldEmptySpace(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("emptySpace", "urn:metadata.tooling.soap.sforce.com","emptySpace","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), emptySpace, emptySpace__is_set);
    }

    /**
     * element : expression of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean expression__is_set = false;

    private java.lang.String expression;

    public java.lang.String getExpression() {
      return expression;
    }

    public void setExpression(java.lang.String expression) {
      this.expression = expression;
      expression__is_set = true;
    }

    protected void setExpression(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("expression", "urn:metadata.tooling.soap.sforce.com","expression","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setExpression(__typeMapper.readString(__in, _lookupTypeInfo("expression", "urn:metadata.tooling.soap.sforce.com","expression","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldExpression(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("expression", "urn:metadata.tooling.soap.sforce.com","expression","http://www.w3.org/2001/XMLSchema","string",0,1,true), expression, expression__is_set);
    }

    /**
     * element : fieldLabel of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean fieldLabel__is_set = false;

    private java.lang.String fieldLabel;

    public java.lang.String getFieldLabel() {
      return fieldLabel;
    }

    public void setFieldLabel(java.lang.String fieldLabel) {
      this.fieldLabel = fieldLabel;
      fieldLabel__is_set = true;
    }

    protected void setFieldLabel(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("fieldLabel", "urn:metadata.tooling.soap.sforce.com","fieldLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setFieldLabel(__typeMapper.readString(__in, _lookupTypeInfo("fieldLabel", "urn:metadata.tooling.soap.sforce.com","fieldLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFieldLabel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("fieldLabel", "urn:metadata.tooling.soap.sforce.com","fieldLabel","http://www.w3.org/2001/XMLSchema","string",0,1,true), fieldLabel, fieldLabel__is_set);
    }

    /**
     * element : formItemType of type {urn:tooling.soap.sforce.com}FormItemType
     * java type: com.sforce.soap.tooling.FormItemType
     */
    private boolean formItemType__is_set = false;

    private com.sforce.soap.tooling.FormItemType formItemType;

    public com.sforce.soap.tooling.FormItemType getFormItemType() {
      return formItemType;
    }

    public void setFormItemType(com.sforce.soap.tooling.FormItemType formItemType) {
      this.formItemType = formItemType;
      formItemType__is_set = true;
    }

    protected void setFormItemType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("formItemType", "urn:metadata.tooling.soap.sforce.com","formItemType","urn:tooling.soap.sforce.com","FormItemType",0,1,true))) {
        setFormItemType((com.sforce.soap.tooling.FormItemType)__typeMapper.readObject(__in, _lookupTypeInfo("formItemType", "urn:metadata.tooling.soap.sforce.com","formItemType","urn:tooling.soap.sforce.com","FormItemType",0,1,true), com.sforce.soap.tooling.FormItemType.class));
      }
    }

    private void writeFieldFormItemType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("formItemType", "urn:metadata.tooling.soap.sforce.com","formItemType","urn:tooling.soap.sforce.com","FormItemType",0,1,true), formItemType, formItemType__is_set);
    }

    /**
     * element : formLayoutableItem of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean formLayoutableItem__is_set = false;

    private java.lang.String formLayoutableItem;

    public java.lang.String getFormLayoutableItem() {
      return formLayoutableItem;
    }

    public void setFormLayoutableItem(java.lang.String formLayoutableItem) {
      this.formLayoutableItem = formLayoutableItem;
      formLayoutableItem__is_set = true;
    }

    protected void setFormLayoutableItem(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("formLayoutableItem", "urn:metadata.tooling.soap.sforce.com","formLayoutableItem","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setFormLayoutableItem(__typeMapper.readString(__in, _lookupTypeInfo("formLayoutableItem", "urn:metadata.tooling.soap.sforce.com","formLayoutableItem","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldFormLayoutableItem(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("formLayoutableItem", "urn:metadata.tooling.soap.sforce.com","formLayoutableItem","http://www.w3.org/2001/XMLSchema","string",0,1,true), formLayoutableItem, formLayoutableItem__is_set);
    }

    /**
     * element : helpText of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean helpText__is_set = false;

    private java.lang.String helpText;

    public java.lang.String getHelpText() {
      return helpText;
    }

    public void setHelpText(java.lang.String helpText) {
      this.helpText = helpText;
      helpText__is_set = true;
    }

    protected void setHelpText(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("helpText", "urn:metadata.tooling.soap.sforce.com","helpText","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setHelpText(__typeMapper.readString(__in, _lookupTypeInfo("helpText", "urn:metadata.tooling.soap.sforce.com","helpText","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldHelpText(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("helpText", "urn:metadata.tooling.soap.sforce.com","helpText","http://www.w3.org/2001/XMLSchema","string",0,1,true), helpText, helpText__is_set);
    }

    /**
     * element : posx of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private boolean posx__is_set = false;

    private int posx;

    public int getPosx() {
      return posx;
    }

    public void setPosx(int posx) {
      this.posx = posx;
      posx__is_set = true;
    }

    protected void setPosx(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("posx", "urn:metadata.tooling.soap.sforce.com","posx","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setPosx((int)__typeMapper.readInt(__in, _lookupTypeInfo("posx", "urn:metadata.tooling.soap.sforce.com","posx","http://www.w3.org/2001/XMLSchema","int",0,1,true), int.class));
      }
    }

    private void writeFieldPosx(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("posx", "urn:metadata.tooling.soap.sforce.com","posx","http://www.w3.org/2001/XMLSchema","int",0,1,true), posx, posx__is_set);
    }

    /**
     * element : posy of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private boolean posy__is_set = false;

    private int posy;

    public int getPosy() {
      return posy;
    }

    public void setPosy(int posy) {
      this.posy = posy;
      posy__is_set = true;
    }

    protected void setPosy(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("posy", "urn:metadata.tooling.soap.sforce.com","posy","http://www.w3.org/2001/XMLSchema","int",0,1,true))) {
        setPosy((int)__typeMapper.readInt(__in, _lookupTypeInfo("posy", "urn:metadata.tooling.soap.sforce.com","posy","http://www.w3.org/2001/XMLSchema","int",0,1,true), int.class));
      }
    }

    private void writeFieldPosy(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("posy", "urn:metadata.tooling.soap.sforce.com","posy","http://www.w3.org/2001/XMLSchema","int",0,1,true), posy, posy__is_set);
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
      sb.append("[FormItem ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldEmptySpace(__out, __typeMapper);
      writeFieldExpression(__out, __typeMapper);
      writeFieldFieldLabel(__out, __typeMapper);
      writeFieldFormItemType(__out, __typeMapper);
      writeFieldFormLayoutableItem(__out, __typeMapper);
      writeFieldHelpText(__out, __typeMapper);
      writeFieldPosx(__out, __typeMapper);
      writeFieldPosy(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setEmptySpace(__in, __typeMapper);
      setExpression(__in, __typeMapper);
      setFieldLabel(__in, __typeMapper);
      setFormItemType(__in, __typeMapper);
      setFormLayoutableItem(__in, __typeMapper);
      setHelpText(__in, __typeMapper);
      setPosx(__in, __typeMapper);
      setPosy(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "emptySpace", emptySpace);
      toStringHelper(sb, "expression", expression);
      toStringHelper(sb, "fieldLabel", fieldLabel);
      toStringHelper(sb, "formItemType", formItemType);
      toStringHelper(sb, "formLayoutableItem", formLayoutableItem);
      toStringHelper(sb, "helpText", helpText);
      toStringHelper(sb, "posx", posx);
      toStringHelper(sb, "posy", posy);
    }


}
