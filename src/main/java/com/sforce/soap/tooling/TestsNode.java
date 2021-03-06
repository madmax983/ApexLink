package com.sforce.soap.tooling;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class TestsNode implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public TestsNode() {}

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
     * element : classId of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean classId__is_set = false;

    private java.lang.String classId;

    public java.lang.String getClassId() {
      return classId;
    }

    public void setClassId(java.lang.String classId) {
      this.classId = classId;
      classId__is_set = true;
    }

    protected void setClassId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("classId", "urn:tooling.soap.sforce.com","classId","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setClassId(__typeMapper.readString(__in, _lookupTypeInfo("classId", "urn:tooling.soap.sforce.com","classId","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldClassId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("classId", "urn:tooling.soap.sforce.com","classId","http://www.w3.org/2001/XMLSchema","string",1,1,true), classId, classId__is_set);
    }

    /**
     * element : className of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean className__is_set = false;

    private java.lang.String className;

    public java.lang.String getClassName() {
      return className;
    }

    public void setClassName(java.lang.String className) {
      this.className = className;
      className__is_set = true;
    }

    protected void setClassName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("className", "urn:tooling.soap.sforce.com","className","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setClassName(__typeMapper.readString(__in, _lookupTypeInfo("className", "urn:tooling.soap.sforce.com","className","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldClassName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("className", "urn:tooling.soap.sforce.com","className","http://www.w3.org/2001/XMLSchema","string",1,1,true), className, className__is_set);
    }

    /**
     * element : testMethods of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String[]
     */
    private boolean testMethods__is_set = false;

    private java.lang.String[] testMethods = new java.lang.String[0];

    public java.lang.String[] getTestMethods() {
      return testMethods;
    }

    public void setTestMethods(java.lang.String[] testMethods) {
      this.testMethods = testMethods;
      testMethods__is_set = true;
    }

    protected void setTestMethods(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("testMethods", "urn:tooling.soap.sforce.com","testMethods","http://www.w3.org/2001/XMLSchema","string",0,-1,true))) {
        setTestMethods((java.lang.String[])__typeMapper.readObject(__in, _lookupTypeInfo("testMethods", "urn:tooling.soap.sforce.com","testMethods","http://www.w3.org/2001/XMLSchema","string",0,-1,true), java.lang.String[].class));
      }
    }

    private void writeFieldTestMethods(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("testMethods", "urn:tooling.soap.sforce.com","testMethods","http://www.w3.org/2001/XMLSchema","string",0,-1,true), testMethods, testMethods__is_set);
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
      sb.append("[TestsNode ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldClassId(__out, __typeMapper);
      writeFieldClassName(__out, __typeMapper);
      writeFieldTestMethods(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setClassId(__in, __typeMapper);
      setClassName(__in, __typeMapper);
      setTestMethods(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "classId", classId);
      toStringHelper(sb, "className", className);
      toStringHelper(sb, "testMethods", testMethods);
    }


}
