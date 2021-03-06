package com.sforce.soap.tooling;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class ExternalConstructor extends com.sforce.soap.tooling.ExternalSymbol {

    /**
     * Constructor
     */
    public ExternalConstructor() {}

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
     * element : methodDoc of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean methodDoc__is_set = false;

    private java.lang.String methodDoc;

    public java.lang.String getMethodDoc() {
      return methodDoc;
    }

    public void setMethodDoc(java.lang.String methodDoc) {
      this.methodDoc = methodDoc;
      methodDoc__is_set = true;
    }

    protected void setMethodDoc(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("methodDoc", "urn:tooling.soap.sforce.com","methodDoc","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setMethodDoc(__typeMapper.readString(__in, _lookupTypeInfo("methodDoc", "urn:tooling.soap.sforce.com","methodDoc","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldMethodDoc(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("methodDoc", "urn:tooling.soap.sforce.com","methodDoc","http://www.w3.org/2001/XMLSchema","string",1,1,true), methodDoc, methodDoc__is_set);
    }

    /**
     * element : parameters of type {urn:tooling.soap.sforce.com}Parameter
     * java type: com.sforce.soap.tooling.Parameter[]
     */
    private boolean parameters__is_set = false;

    private com.sforce.soap.tooling.Parameter[] parameters = new com.sforce.soap.tooling.Parameter[0];

    public com.sforce.soap.tooling.Parameter[] getParameters() {
      return parameters;
    }

    public void setParameters(com.sforce.soap.tooling.Parameter[] parameters) {
      this.parameters = parameters;
      parameters__is_set = true;
    }

    protected void setParameters(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("parameters", "urn:tooling.soap.sforce.com","parameters","urn:tooling.soap.sforce.com","Parameter",0,-1,true))) {
        setParameters((com.sforce.soap.tooling.Parameter[])__typeMapper.readObject(__in, _lookupTypeInfo("parameters", "urn:tooling.soap.sforce.com","parameters","urn:tooling.soap.sforce.com","Parameter",0,-1,true), com.sforce.soap.tooling.Parameter[].class));
      }
    }

    private void writeFieldParameters(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("parameters", "urn:tooling.soap.sforce.com","parameters","urn:tooling.soap.sforce.com","Parameter",0,-1,true), parameters, parameters__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      __typeMapper.writeXsiType(__out, "urn:tooling.soap.sforce.com", "ExternalConstructor");
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
      sb.append("[ExternalConstructor ");
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
      writeFieldMethodDoc(__out, __typeMapper);
      writeFieldParameters(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setMethodDoc(__in, __typeMapper);
      setParameters(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "methodDoc", methodDoc);
      toStringHelper(sb, "parameters", parameters);
    }


}
