package com.sforce.soap.tooling;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class MapEntry implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public MapEntry() {}

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
     * element : keyDisplayValue of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean keyDisplayValue__is_set = false;

    private java.lang.String keyDisplayValue;

    public java.lang.String getKeyDisplayValue() {
      return keyDisplayValue;
    }

    public void setKeyDisplayValue(java.lang.String keyDisplayValue) {
      this.keyDisplayValue = keyDisplayValue;
      keyDisplayValue__is_set = true;
    }

    protected void setKeyDisplayValue(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("keyDisplayValue", "urn:tooling.soap.sforce.com","keyDisplayValue","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setKeyDisplayValue(__typeMapper.readString(__in, _lookupTypeInfo("keyDisplayValue", "urn:tooling.soap.sforce.com","keyDisplayValue","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldKeyDisplayValue(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("keyDisplayValue", "urn:tooling.soap.sforce.com","keyDisplayValue","http://www.w3.org/2001/XMLSchema","string",1,1,true), keyDisplayValue, keyDisplayValue__is_set);
    }

    /**
     * element : value of type {urn:tooling.soap.sforce.com}StateValue
     * java type: com.sforce.soap.tooling.StateValue
     */
    private boolean value__is_set = false;

    private com.sforce.soap.tooling.StateValue value;

    public com.sforce.soap.tooling.StateValue getValue() {
      return value;
    }

    public void setValue(com.sforce.soap.tooling.StateValue value) {
      this.value = value;
      value__is_set = true;
    }

    protected void setValue(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("value", "urn:tooling.soap.sforce.com","value","urn:tooling.soap.sforce.com","StateValue",1,1,true))) {
        setValue((com.sforce.soap.tooling.StateValue)__typeMapper.readObject(__in, _lookupTypeInfo("value", "urn:tooling.soap.sforce.com","value","urn:tooling.soap.sforce.com","StateValue",1,1,true), com.sforce.soap.tooling.StateValue.class));
      }
    }

    private void writeFieldValue(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("value", "urn:tooling.soap.sforce.com","value","urn:tooling.soap.sforce.com","StateValue",1,1,true), value, value__is_set);
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
      sb.append("[MapEntry ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldKeyDisplayValue(__out, __typeMapper);
      writeFieldValue(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setKeyDisplayValue(__in, __typeMapper);
      setValue(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "keyDisplayValue", keyDisplayValue);
      toStringHelper(sb, "value", value);
    }


}
