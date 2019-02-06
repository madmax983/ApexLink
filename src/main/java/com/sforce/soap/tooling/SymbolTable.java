package com.sforce.soap.tooling;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class SymbolTable implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public SymbolTable() {}

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
     * element : constructors of type {urn:tooling.soap.sforce.com}Constructor
     * java type: com.sforce.soap.tooling.Constructor[]
     */
    private boolean constructors__is_set = false;

    private com.sforce.soap.tooling.Constructor[] constructors = new com.sforce.soap.tooling.Constructor[0];

    public com.sforce.soap.tooling.Constructor[] getConstructors() {
      return constructors;
    }

    public void setConstructors(com.sforce.soap.tooling.Constructor[] constructors) {
      this.constructors = constructors;
      constructors__is_set = true;
    }

    protected void setConstructors(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("constructors", "urn:tooling.soap.sforce.com","constructors","urn:tooling.soap.sforce.com","Constructor",0,-1,true))) {
        setConstructors((com.sforce.soap.tooling.Constructor[])__typeMapper.readObject(__in, _lookupTypeInfo("constructors", "urn:tooling.soap.sforce.com","constructors","urn:tooling.soap.sforce.com","Constructor",0,-1,true), com.sforce.soap.tooling.Constructor[].class));
      }
    }

    private void writeFieldConstructors(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("constructors", "urn:tooling.soap.sforce.com","constructors","urn:tooling.soap.sforce.com","Constructor",0,-1,true), constructors, constructors__is_set);
    }

    /**
     * element : externalReferences of type {urn:tooling.soap.sforce.com}ExternalReference
     * java type: com.sforce.soap.tooling.ExternalReference[]
     */
    private boolean externalReferences__is_set = false;

    private com.sforce.soap.tooling.ExternalReference[] externalReferences = new com.sforce.soap.tooling.ExternalReference[0];

    public com.sforce.soap.tooling.ExternalReference[] getExternalReferences() {
      return externalReferences;
    }

    public void setExternalReferences(com.sforce.soap.tooling.ExternalReference[] externalReferences) {
      this.externalReferences = externalReferences;
      externalReferences__is_set = true;
    }

    protected void setExternalReferences(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("externalReferences", "urn:tooling.soap.sforce.com","externalReferences","urn:tooling.soap.sforce.com","ExternalReference",0,-1,true))) {
        setExternalReferences((com.sforce.soap.tooling.ExternalReference[])__typeMapper.readObject(__in, _lookupTypeInfo("externalReferences", "urn:tooling.soap.sforce.com","externalReferences","urn:tooling.soap.sforce.com","ExternalReference",0,-1,true), com.sforce.soap.tooling.ExternalReference[].class));
      }
    }

    private void writeFieldExternalReferences(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("externalReferences", "urn:tooling.soap.sforce.com","externalReferences","urn:tooling.soap.sforce.com","ExternalReference",0,-1,true), externalReferences, externalReferences__is_set);
    }

    /**
     * element : id of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean id__is_set = false;

    private java.lang.String id;

    public java.lang.String getId() {
      return id;
    }

    public void setId(java.lang.String id) {
      this.id = id;
      id__is_set = true;
    }

    protected void setId(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("id", "urn:tooling.soap.sforce.com","id","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setId(__typeMapper.readString(__in, _lookupTypeInfo("id", "urn:tooling.soap.sforce.com","id","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldId(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("id", "urn:tooling.soap.sforce.com","id","http://www.w3.org/2001/XMLSchema","string",1,1,true), id, id__is_set);
    }

    /**
     * element : innerClasses of type {urn:tooling.soap.sforce.com}SymbolTable
     * java type: com.sforce.soap.tooling.SymbolTable[]
     */
    private boolean innerClasses__is_set = false;

    private com.sforce.soap.tooling.SymbolTable[] innerClasses = new com.sforce.soap.tooling.SymbolTable[0];

    public com.sforce.soap.tooling.SymbolTable[] getInnerClasses() {
      return innerClasses;
    }

    public void setInnerClasses(com.sforce.soap.tooling.SymbolTable[] innerClasses) {
      this.innerClasses = innerClasses;
      innerClasses__is_set = true;
    }

    protected void setInnerClasses(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("innerClasses", "urn:tooling.soap.sforce.com","innerClasses","urn:tooling.soap.sforce.com","SymbolTable",0,-1,true))) {
        setInnerClasses((com.sforce.soap.tooling.SymbolTable[])__typeMapper.readObject(__in, _lookupTypeInfo("innerClasses", "urn:tooling.soap.sforce.com","innerClasses","urn:tooling.soap.sforce.com","SymbolTable",0,-1,true), com.sforce.soap.tooling.SymbolTable[].class));
      }
    }

    private void writeFieldInnerClasses(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("innerClasses", "urn:tooling.soap.sforce.com","innerClasses","urn:tooling.soap.sforce.com","SymbolTable",0,-1,true), innerClasses, innerClasses__is_set);
    }

    /**
     * element : interfaces of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String[]
     */
    private boolean interfaces__is_set = false;

    private java.lang.String[] interfaces = new java.lang.String[0];

    public java.lang.String[] getInterfaces() {
      return interfaces;
    }

    public void setInterfaces(java.lang.String[] interfaces) {
      this.interfaces = interfaces;
      interfaces__is_set = true;
    }

    protected void setInterfaces(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("interfaces", "urn:tooling.soap.sforce.com","interfaces","http://www.w3.org/2001/XMLSchema","string",0,-1,true))) {
        setInterfaces((java.lang.String[])__typeMapper.readObject(__in, _lookupTypeInfo("interfaces", "urn:tooling.soap.sforce.com","interfaces","http://www.w3.org/2001/XMLSchema","string",0,-1,true), java.lang.String[].class));
      }
    }

    private void writeFieldInterfaces(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("interfaces", "urn:tooling.soap.sforce.com","interfaces","http://www.w3.org/2001/XMLSchema","string",0,-1,true), interfaces, interfaces__is_set);
    }

    /**
     * element : methods of type {urn:tooling.soap.sforce.com}Method
     * java type: com.sforce.soap.tooling.Method[]
     */
    private boolean methods__is_set = false;

    private com.sforce.soap.tooling.Method[] methods = new com.sforce.soap.tooling.Method[0];

    public com.sforce.soap.tooling.Method[] getMethods() {
      return methods;
    }

    public void setMethods(com.sforce.soap.tooling.Method[] methods) {
      this.methods = methods;
      methods__is_set = true;
    }

    protected void setMethods(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("methods", "urn:tooling.soap.sforce.com","methods","urn:tooling.soap.sforce.com","Method",0,-1,true))) {
        setMethods((com.sforce.soap.tooling.Method[])__typeMapper.readObject(__in, _lookupTypeInfo("methods", "urn:tooling.soap.sforce.com","methods","urn:tooling.soap.sforce.com","Method",0,-1,true), com.sforce.soap.tooling.Method[].class));
      }
    }

    private void writeFieldMethods(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("methods", "urn:tooling.soap.sforce.com","methods","urn:tooling.soap.sforce.com","Method",0,-1,true), methods, methods__is_set);
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
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("name", "urn:tooling.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setName(__typeMapper.readString(__in, _lookupTypeInfo("name", "urn:tooling.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("name", "urn:tooling.soap.sforce.com","name","http://www.w3.org/2001/XMLSchema","string",1,1,true), name, name__is_set);
    }

    /**
     * element : namespace of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean namespace__is_set = false;

    private java.lang.String namespace;

    public java.lang.String getNamespace() {
      return namespace;
    }

    public void setNamespace(java.lang.String namespace) {
      this.namespace = namespace;
      namespace__is_set = true;
    }

    protected void setNamespace(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("namespace", "urn:tooling.soap.sforce.com","namespace","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setNamespace(__typeMapper.readString(__in, _lookupTypeInfo("namespace", "urn:tooling.soap.sforce.com","namespace","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldNamespace(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("namespace", "urn:tooling.soap.sforce.com","namespace","http://www.w3.org/2001/XMLSchema","string",1,1,true), namespace, namespace__is_set);
    }

    /**
     * element : parentClass of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean parentClass__is_set = false;

    private java.lang.String parentClass;

    public java.lang.String getParentClass() {
      return parentClass;
    }

    public void setParentClass(java.lang.String parentClass) {
      this.parentClass = parentClass;
      parentClass__is_set = true;
    }

    protected void setParentClass(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("parentClass", "urn:tooling.soap.sforce.com","parentClass","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setParentClass(__typeMapper.readString(__in, _lookupTypeInfo("parentClass", "urn:tooling.soap.sforce.com","parentClass","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldParentClass(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("parentClass", "urn:tooling.soap.sforce.com","parentClass","http://www.w3.org/2001/XMLSchema","string",1,1,true), parentClass, parentClass__is_set);
    }

    /**
     * element : properties of type {urn:tooling.soap.sforce.com}VisibilitySymbol
     * java type: com.sforce.soap.tooling.VisibilitySymbol[]
     */
    private boolean properties__is_set = false;

    private com.sforce.soap.tooling.VisibilitySymbol[] properties = new com.sforce.soap.tooling.VisibilitySymbol[0];

    public com.sforce.soap.tooling.VisibilitySymbol[] getProperties() {
      return properties;
    }

    public void setProperties(com.sforce.soap.tooling.VisibilitySymbol[] properties) {
      this.properties = properties;
      properties__is_set = true;
    }

    protected void setProperties(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("properties", "urn:tooling.soap.sforce.com","properties","urn:tooling.soap.sforce.com","VisibilitySymbol",0,-1,true))) {
        setProperties((com.sforce.soap.tooling.VisibilitySymbol[])__typeMapper.readObject(__in, _lookupTypeInfo("properties", "urn:tooling.soap.sforce.com","properties","urn:tooling.soap.sforce.com","VisibilitySymbol",0,-1,true), com.sforce.soap.tooling.VisibilitySymbol[].class));
      }
    }

    private void writeFieldProperties(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("properties", "urn:tooling.soap.sforce.com","properties","urn:tooling.soap.sforce.com","VisibilitySymbol",0,-1,true), properties, properties__is_set);
    }

    /**
     * element : tableDeclaration of type {urn:tooling.soap.sforce.com}Symbol
     * java type: com.sforce.soap.tooling.Symbol
     */
    private boolean tableDeclaration__is_set = false;

    private com.sforce.soap.tooling.Symbol tableDeclaration;

    public com.sforce.soap.tooling.Symbol getTableDeclaration() {
      return tableDeclaration;
    }

    public void setTableDeclaration(com.sforce.soap.tooling.Symbol tableDeclaration) {
      this.tableDeclaration = tableDeclaration;
      tableDeclaration__is_set = true;
    }

    protected void setTableDeclaration(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("tableDeclaration", "urn:tooling.soap.sforce.com","tableDeclaration","urn:tooling.soap.sforce.com","Symbol",1,1,true))) {
        setTableDeclaration((com.sforce.soap.tooling.Symbol)__typeMapper.readObject(__in, _lookupTypeInfo("tableDeclaration", "urn:tooling.soap.sforce.com","tableDeclaration","urn:tooling.soap.sforce.com","Symbol",1,1,true), com.sforce.soap.tooling.Symbol.class));
      }
    }

    private void writeFieldTableDeclaration(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("tableDeclaration", "urn:tooling.soap.sforce.com","tableDeclaration","urn:tooling.soap.sforce.com","Symbol",1,1,true), tableDeclaration, tableDeclaration__is_set);
    }

    /**
     * element : variables of type {urn:tooling.soap.sforce.com}Symbol
     * java type: com.sforce.soap.tooling.Symbol[]
     */
    private boolean variables__is_set = false;

    private com.sforce.soap.tooling.Symbol[] variables = new com.sforce.soap.tooling.Symbol[0];

    public com.sforce.soap.tooling.Symbol[] getVariables() {
      return variables;
    }

    public void setVariables(com.sforce.soap.tooling.Symbol[] variables) {
      this.variables = variables;
      variables__is_set = true;
    }

    protected void setVariables(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("variables", "urn:tooling.soap.sforce.com","variables","urn:tooling.soap.sforce.com","Symbol",0,-1,true))) {
        setVariables((com.sforce.soap.tooling.Symbol[])__typeMapper.readObject(__in, _lookupTypeInfo("variables", "urn:tooling.soap.sforce.com","variables","urn:tooling.soap.sforce.com","Symbol",0,-1,true), com.sforce.soap.tooling.Symbol[].class));
      }
    }

    private void writeFieldVariables(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("variables", "urn:tooling.soap.sforce.com","variables","urn:tooling.soap.sforce.com","Symbol",0,-1,true), variables, variables__is_set);
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
      sb.append("[SymbolTable ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldConstructors(__out, __typeMapper);
      writeFieldExternalReferences(__out, __typeMapper);
      writeFieldId(__out, __typeMapper);
      writeFieldInnerClasses(__out, __typeMapper);
      writeFieldInterfaces(__out, __typeMapper);
      writeFieldMethods(__out, __typeMapper);
      writeFieldName(__out, __typeMapper);
      writeFieldNamespace(__out, __typeMapper);
      writeFieldParentClass(__out, __typeMapper);
      writeFieldProperties(__out, __typeMapper);
      writeFieldTableDeclaration(__out, __typeMapper);
      writeFieldVariables(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setConstructors(__in, __typeMapper);
      setExternalReferences(__in, __typeMapper);
      setId(__in, __typeMapper);
      setInnerClasses(__in, __typeMapper);
      setInterfaces(__in, __typeMapper);
      setMethods(__in, __typeMapper);
      setName(__in, __typeMapper);
      setNamespace(__in, __typeMapper);
      setParentClass(__in, __typeMapper);
      setProperties(__in, __typeMapper);
      setTableDeclaration(__in, __typeMapper);
      setVariables(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "constructors", constructors);
      toStringHelper(sb, "externalReferences", externalReferences);
      toStringHelper(sb, "id", id);
      toStringHelper(sb, "innerClasses", innerClasses);
      toStringHelper(sb, "interfaces", interfaces);
      toStringHelper(sb, "methods", methods);
      toStringHelper(sb, "name", name);
      toStringHelper(sb, "namespace", namespace);
      toStringHelper(sb, "parentClass", parentClass);
      toStringHelper(sb, "properties", properties);
      toStringHelper(sb, "tableDeclaration", tableDeclaration);
      toStringHelper(sb, "variables", variables);
    }


}