package com.sforce.soap.tooling;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class DescribeLayoutItem implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public DescribeLayoutItem() {}

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
     * element : editableForNew of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean editableForNew__is_set = false;

    private boolean editableForNew;

    public boolean getEditableForNew() {
      return editableForNew;
    }

    public boolean isEditableForNew() {
      return editableForNew;
    }

    public void setEditableForNew(boolean editableForNew) {
      this.editableForNew = editableForNew;
      editableForNew__is_set = true;
    }

    protected void setEditableForNew(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("editableForNew", "urn:tooling.soap.sforce.com","editableForNew","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setEditableForNew(__typeMapper.readBoolean(__in, _lookupTypeInfo("editableForNew", "urn:tooling.soap.sforce.com","editableForNew","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldEditableForNew(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("editableForNew", "urn:tooling.soap.sforce.com","editableForNew","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), editableForNew, editableForNew__is_set);
    }

    /**
     * element : editableForUpdate of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean editableForUpdate__is_set = false;

    private boolean editableForUpdate;

    public boolean getEditableForUpdate() {
      return editableForUpdate;
    }

    public boolean isEditableForUpdate() {
      return editableForUpdate;
    }

    public void setEditableForUpdate(boolean editableForUpdate) {
      this.editableForUpdate = editableForUpdate;
      editableForUpdate__is_set = true;
    }

    protected void setEditableForUpdate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("editableForUpdate", "urn:tooling.soap.sforce.com","editableForUpdate","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setEditableForUpdate(__typeMapper.readBoolean(__in, _lookupTypeInfo("editableForUpdate", "urn:tooling.soap.sforce.com","editableForUpdate","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldEditableForUpdate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("editableForUpdate", "urn:tooling.soap.sforce.com","editableForUpdate","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), editableForUpdate, editableForUpdate__is_set);
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
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("label", "urn:tooling.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setLabel(__typeMapper.readString(__in, _lookupTypeInfo("label", "urn:tooling.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldLabel(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("label", "urn:tooling.soap.sforce.com","label","http://www.w3.org/2001/XMLSchema","string",1,1,true), label, label__is_set);
    }

    /**
     * element : layoutComponents of type {urn:tooling.soap.sforce.com}DescribeLayoutComponent
     * java type: com.sforce.soap.tooling.DescribeLayoutComponent[]
     */
    private boolean layoutComponents__is_set = false;

    private com.sforce.soap.tooling.DescribeLayoutComponent[] layoutComponents = new com.sforce.soap.tooling.DescribeLayoutComponent[0];

    public com.sforce.soap.tooling.DescribeLayoutComponent[] getLayoutComponents() {
      return layoutComponents;
    }

    public void setLayoutComponents(com.sforce.soap.tooling.DescribeLayoutComponent[] layoutComponents) {
      this.layoutComponents = layoutComponents;
      layoutComponents__is_set = true;
    }

    protected void setLayoutComponents(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("layoutComponents", "urn:tooling.soap.sforce.com","layoutComponents","urn:tooling.soap.sforce.com","DescribeLayoutComponent",0,-1,true))) {
        setLayoutComponents((com.sforce.soap.tooling.DescribeLayoutComponent[])__typeMapper.readObject(__in, _lookupTypeInfo("layoutComponents", "urn:tooling.soap.sforce.com","layoutComponents","urn:tooling.soap.sforce.com","DescribeLayoutComponent",0,-1,true), com.sforce.soap.tooling.DescribeLayoutComponent[].class));
      }
    }

    private void writeFieldLayoutComponents(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("layoutComponents", "urn:tooling.soap.sforce.com","layoutComponents","urn:tooling.soap.sforce.com","DescribeLayoutComponent",0,-1,true), layoutComponents, layoutComponents__is_set);
    }

    /**
     * element : placeholder of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean placeholder__is_set = false;

    private boolean placeholder;

    public boolean getPlaceholder() {
      return placeholder;
    }

    public boolean isPlaceholder() {
      return placeholder;
    }

    public void setPlaceholder(boolean placeholder) {
      this.placeholder = placeholder;
      placeholder__is_set = true;
    }

    protected void setPlaceholder(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("placeholder", "urn:tooling.soap.sforce.com","placeholder","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setPlaceholder(__typeMapper.readBoolean(__in, _lookupTypeInfo("placeholder", "urn:tooling.soap.sforce.com","placeholder","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldPlaceholder(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("placeholder", "urn:tooling.soap.sforce.com","placeholder","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), placeholder, placeholder__is_set);
    }

    /**
     * element : required of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean required__is_set = false;

    private boolean required;

    public boolean getRequired() {
      return required;
    }

    public boolean isRequired() {
      return required;
    }

    public void setRequired(boolean required) {
      this.required = required;
      required__is_set = true;
    }

    protected void setRequired(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("required", "urn:tooling.soap.sforce.com","required","http://www.w3.org/2001/XMLSchema","boolean",1,1,true))) {
        setRequired(__typeMapper.readBoolean(__in, _lookupTypeInfo("required", "urn:tooling.soap.sforce.com","required","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), boolean.class));
      }
    }

    private void writeFieldRequired(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("required", "urn:tooling.soap.sforce.com","required","http://www.w3.org/2001/XMLSchema","boolean",1,1,true), required, required__is_set);
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
      sb.append("[DescribeLayoutItem ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldEditableForNew(__out, __typeMapper);
      writeFieldEditableForUpdate(__out, __typeMapper);
      writeFieldLabel(__out, __typeMapper);
      writeFieldLayoutComponents(__out, __typeMapper);
      writeFieldPlaceholder(__out, __typeMapper);
      writeFieldRequired(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setEditableForNew(__in, __typeMapper);
      setEditableForUpdate(__in, __typeMapper);
      setLabel(__in, __typeMapper);
      setLayoutComponents(__in, __typeMapper);
      setPlaceholder(__in, __typeMapper);
      setRequired(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "editableForNew", editableForNew);
      toStringHelper(sb, "editableForUpdate", editableForUpdate);
      toStringHelper(sb, "label", label);
      toStringHelper(sb, "layoutComponents", layoutComponents);
      toStringHelper(sb, "placeholder", placeholder);
      toStringHelper(sb, "required", required);
    }


}
