package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class FeedLayout implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public FeedLayout() {}

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
     * element : autocollapsePublisher of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean autocollapsePublisher__is_set = false;

    private boolean autocollapsePublisher;

    public boolean getAutocollapsePublisher() {
      return autocollapsePublisher;
    }

    public boolean isAutocollapsePublisher() {
      return autocollapsePublisher;
    }

    public void setAutocollapsePublisher(boolean autocollapsePublisher) {
      this.autocollapsePublisher = autocollapsePublisher;
      autocollapsePublisher__is_set = true;
    }

    protected void setAutocollapsePublisher(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("autocollapsePublisher", "urn:metadata.tooling.soap.sforce.com","autocollapsePublisher","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setAutocollapsePublisher(__typeMapper.readBoolean(__in, _lookupTypeInfo("autocollapsePublisher", "urn:metadata.tooling.soap.sforce.com","autocollapsePublisher","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldAutocollapsePublisher(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("autocollapsePublisher", "urn:metadata.tooling.soap.sforce.com","autocollapsePublisher","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), autocollapsePublisher, autocollapsePublisher__is_set);
    }

    /**
     * element : compactFeed of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean compactFeed__is_set = false;

    private boolean compactFeed;

    public boolean getCompactFeed() {
      return compactFeed;
    }

    public boolean isCompactFeed() {
      return compactFeed;
    }

    public void setCompactFeed(boolean compactFeed) {
      this.compactFeed = compactFeed;
      compactFeed__is_set = true;
    }

    protected void setCompactFeed(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("compactFeed", "urn:metadata.tooling.soap.sforce.com","compactFeed","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setCompactFeed(__typeMapper.readBoolean(__in, _lookupTypeInfo("compactFeed", "urn:metadata.tooling.soap.sforce.com","compactFeed","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldCompactFeed(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("compactFeed", "urn:metadata.tooling.soap.sforce.com","compactFeed","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), compactFeed, compactFeed__is_set);
    }

    /**
     * element : feedFilterPosition of type {urn:tooling.soap.sforce.com}FeedLayoutFilterPosition
     * java type: com.sforce.soap.tooling.FeedLayoutFilterPosition
     */
    private boolean feedFilterPosition__is_set = false;

    private com.sforce.soap.tooling.FeedLayoutFilterPosition feedFilterPosition;

    public com.sforce.soap.tooling.FeedLayoutFilterPosition getFeedFilterPosition() {
      return feedFilterPosition;
    }

    public void setFeedFilterPosition(com.sforce.soap.tooling.FeedLayoutFilterPosition feedFilterPosition) {
      this.feedFilterPosition = feedFilterPosition;
      feedFilterPosition__is_set = true;
    }

    protected void setFeedFilterPosition(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("feedFilterPosition", "urn:metadata.tooling.soap.sforce.com","feedFilterPosition","urn:tooling.soap.sforce.com","FeedLayoutFilterPosition",0,1,true))) {
        setFeedFilterPosition((com.sforce.soap.tooling.FeedLayoutFilterPosition)__typeMapper.readObject(__in, _lookupTypeInfo("feedFilterPosition", "urn:metadata.tooling.soap.sforce.com","feedFilterPosition","urn:tooling.soap.sforce.com","FeedLayoutFilterPosition",0,1,true), com.sforce.soap.tooling.FeedLayoutFilterPosition.class));
      }
    }

    private void writeFieldFeedFilterPosition(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("feedFilterPosition", "urn:metadata.tooling.soap.sforce.com","feedFilterPosition","urn:tooling.soap.sforce.com","FeedLayoutFilterPosition",0,1,true), feedFilterPosition, feedFilterPosition__is_set);
    }

    /**
     * element : feedFilters of type {urn:metadata.tooling.soap.sforce.com}FeedLayoutFilter
     * java type: com.sforce.soap.tooling.metadata.FeedLayoutFilter[]
     */
    private boolean feedFilters__is_set = false;

    private com.sforce.soap.tooling.metadata.FeedLayoutFilter[] feedFilters = new com.sforce.soap.tooling.metadata.FeedLayoutFilter[0];

    public com.sforce.soap.tooling.metadata.FeedLayoutFilter[] getFeedFilters() {
      return feedFilters;
    }

    public void setFeedFilters(com.sforce.soap.tooling.metadata.FeedLayoutFilter[] feedFilters) {
      this.feedFilters = feedFilters;
      feedFilters__is_set = true;
    }

    protected void setFeedFilters(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("feedFilters", "urn:metadata.tooling.soap.sforce.com","feedFilters","urn:metadata.tooling.soap.sforce.com","FeedLayoutFilter",0,-1,true))) {
        setFeedFilters((com.sforce.soap.tooling.metadata.FeedLayoutFilter[])__typeMapper.readObject(__in, _lookupTypeInfo("feedFilters", "urn:metadata.tooling.soap.sforce.com","feedFilters","urn:metadata.tooling.soap.sforce.com","FeedLayoutFilter",0,-1,true), com.sforce.soap.tooling.metadata.FeedLayoutFilter[].class));
      }
    }

    private void writeFieldFeedFilters(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("feedFilters", "urn:metadata.tooling.soap.sforce.com","feedFilters","urn:metadata.tooling.soap.sforce.com","FeedLayoutFilter",0,-1,true), feedFilters, feedFilters__is_set);
    }

    /**
     * element : fullWidthFeed of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean fullWidthFeed__is_set = false;

    private boolean fullWidthFeed;

    public boolean getFullWidthFeed() {
      return fullWidthFeed;
    }

    public boolean isFullWidthFeed() {
      return fullWidthFeed;
    }

    public void setFullWidthFeed(boolean fullWidthFeed) {
      this.fullWidthFeed = fullWidthFeed;
      fullWidthFeed__is_set = true;
    }

    protected void setFullWidthFeed(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("fullWidthFeed", "urn:metadata.tooling.soap.sforce.com","fullWidthFeed","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setFullWidthFeed(__typeMapper.readBoolean(__in, _lookupTypeInfo("fullWidthFeed", "urn:metadata.tooling.soap.sforce.com","fullWidthFeed","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldFullWidthFeed(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("fullWidthFeed", "urn:metadata.tooling.soap.sforce.com","fullWidthFeed","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), fullWidthFeed, fullWidthFeed__is_set);
    }

    /**
     * element : hideSidebar of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean hideSidebar__is_set = false;

    private boolean hideSidebar;

    public boolean getHideSidebar() {
      return hideSidebar;
    }

    public boolean isHideSidebar() {
      return hideSidebar;
    }

    public void setHideSidebar(boolean hideSidebar) {
      this.hideSidebar = hideSidebar;
      hideSidebar__is_set = true;
    }

    protected void setHideSidebar(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("hideSidebar", "urn:metadata.tooling.soap.sforce.com","hideSidebar","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setHideSidebar(__typeMapper.readBoolean(__in, _lookupTypeInfo("hideSidebar", "urn:metadata.tooling.soap.sforce.com","hideSidebar","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldHideSidebar(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("hideSidebar", "urn:metadata.tooling.soap.sforce.com","hideSidebar","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), hideSidebar, hideSidebar__is_set);
    }

    /**
     * element : highlightExternalFeedItems of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean highlightExternalFeedItems__is_set = false;

    private boolean highlightExternalFeedItems;

    public boolean getHighlightExternalFeedItems() {
      return highlightExternalFeedItems;
    }

    public boolean isHighlightExternalFeedItems() {
      return highlightExternalFeedItems;
    }

    public void setHighlightExternalFeedItems(boolean highlightExternalFeedItems) {
      this.highlightExternalFeedItems = highlightExternalFeedItems;
      highlightExternalFeedItems__is_set = true;
    }

    protected void setHighlightExternalFeedItems(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("highlightExternalFeedItems", "urn:metadata.tooling.soap.sforce.com","highlightExternalFeedItems","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setHighlightExternalFeedItems(__typeMapper.readBoolean(__in, _lookupTypeInfo("highlightExternalFeedItems", "urn:metadata.tooling.soap.sforce.com","highlightExternalFeedItems","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldHighlightExternalFeedItems(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("highlightExternalFeedItems", "urn:metadata.tooling.soap.sforce.com","highlightExternalFeedItems","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), highlightExternalFeedItems, highlightExternalFeedItems__is_set);
    }

    /**
     * element : leftComponents of type {urn:metadata.tooling.soap.sforce.com}FeedLayoutComponent
     * java type: com.sforce.soap.tooling.metadata.FeedLayoutComponent[]
     */
    private boolean leftComponents__is_set = false;

    private com.sforce.soap.tooling.metadata.FeedLayoutComponent[] leftComponents = new com.sforce.soap.tooling.metadata.FeedLayoutComponent[0];

    public com.sforce.soap.tooling.metadata.FeedLayoutComponent[] getLeftComponents() {
      return leftComponents;
    }

    public void setLeftComponents(com.sforce.soap.tooling.metadata.FeedLayoutComponent[] leftComponents) {
      this.leftComponents = leftComponents;
      leftComponents__is_set = true;
    }

    protected void setLeftComponents(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("leftComponents", "urn:metadata.tooling.soap.sforce.com","leftComponents","urn:metadata.tooling.soap.sforce.com","FeedLayoutComponent",0,-1,true))) {
        setLeftComponents((com.sforce.soap.tooling.metadata.FeedLayoutComponent[])__typeMapper.readObject(__in, _lookupTypeInfo("leftComponents", "urn:metadata.tooling.soap.sforce.com","leftComponents","urn:metadata.tooling.soap.sforce.com","FeedLayoutComponent",0,-1,true), com.sforce.soap.tooling.metadata.FeedLayoutComponent[].class));
      }
    }

    private void writeFieldLeftComponents(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("leftComponents", "urn:metadata.tooling.soap.sforce.com","leftComponents","urn:metadata.tooling.soap.sforce.com","FeedLayoutComponent",0,-1,true), leftComponents, leftComponents__is_set);
    }

    /**
     * element : rightComponents of type {urn:metadata.tooling.soap.sforce.com}FeedLayoutComponent
     * java type: com.sforce.soap.tooling.metadata.FeedLayoutComponent[]
     */
    private boolean rightComponents__is_set = false;

    private com.sforce.soap.tooling.metadata.FeedLayoutComponent[] rightComponents = new com.sforce.soap.tooling.metadata.FeedLayoutComponent[0];

    public com.sforce.soap.tooling.metadata.FeedLayoutComponent[] getRightComponents() {
      return rightComponents;
    }

    public void setRightComponents(com.sforce.soap.tooling.metadata.FeedLayoutComponent[] rightComponents) {
      this.rightComponents = rightComponents;
      rightComponents__is_set = true;
    }

    protected void setRightComponents(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("rightComponents", "urn:metadata.tooling.soap.sforce.com","rightComponents","urn:metadata.tooling.soap.sforce.com","FeedLayoutComponent",0,-1,true))) {
        setRightComponents((com.sforce.soap.tooling.metadata.FeedLayoutComponent[])__typeMapper.readObject(__in, _lookupTypeInfo("rightComponents", "urn:metadata.tooling.soap.sforce.com","rightComponents","urn:metadata.tooling.soap.sforce.com","FeedLayoutComponent",0,-1,true), com.sforce.soap.tooling.metadata.FeedLayoutComponent[].class));
      }
    }

    private void writeFieldRightComponents(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("rightComponents", "urn:metadata.tooling.soap.sforce.com","rightComponents","urn:metadata.tooling.soap.sforce.com","FeedLayoutComponent",0,-1,true), rightComponents, rightComponents__is_set);
    }

    /**
     * element : useInlineFiltersInConsole of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean useInlineFiltersInConsole__is_set = false;

    private boolean useInlineFiltersInConsole;

    public boolean getUseInlineFiltersInConsole() {
      return useInlineFiltersInConsole;
    }

    public boolean isUseInlineFiltersInConsole() {
      return useInlineFiltersInConsole;
    }

    public void setUseInlineFiltersInConsole(boolean useInlineFiltersInConsole) {
      this.useInlineFiltersInConsole = useInlineFiltersInConsole;
      useInlineFiltersInConsole__is_set = true;
    }

    protected void setUseInlineFiltersInConsole(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("useInlineFiltersInConsole", "urn:metadata.tooling.soap.sforce.com","useInlineFiltersInConsole","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setUseInlineFiltersInConsole(__typeMapper.readBoolean(__in, _lookupTypeInfo("useInlineFiltersInConsole", "urn:metadata.tooling.soap.sforce.com","useInlineFiltersInConsole","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldUseInlineFiltersInConsole(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("useInlineFiltersInConsole", "urn:metadata.tooling.soap.sforce.com","useInlineFiltersInConsole","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), useInlineFiltersInConsole, useInlineFiltersInConsole__is_set);
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
      sb.append("[FeedLayout ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldAutocollapsePublisher(__out, __typeMapper);
      writeFieldCompactFeed(__out, __typeMapper);
      writeFieldFeedFilterPosition(__out, __typeMapper);
      writeFieldFeedFilters(__out, __typeMapper);
      writeFieldFullWidthFeed(__out, __typeMapper);
      writeFieldHideSidebar(__out, __typeMapper);
      writeFieldHighlightExternalFeedItems(__out, __typeMapper);
      writeFieldLeftComponents(__out, __typeMapper);
      writeFieldRightComponents(__out, __typeMapper);
      writeFieldUseInlineFiltersInConsole(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setAutocollapsePublisher(__in, __typeMapper);
      setCompactFeed(__in, __typeMapper);
      setFeedFilterPosition(__in, __typeMapper);
      setFeedFilters(__in, __typeMapper);
      setFullWidthFeed(__in, __typeMapper);
      setHideSidebar(__in, __typeMapper);
      setHighlightExternalFeedItems(__in, __typeMapper);
      setLeftComponents(__in, __typeMapper);
      setRightComponents(__in, __typeMapper);
      setUseInlineFiltersInConsole(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "autocollapsePublisher", autocollapsePublisher);
      toStringHelper(sb, "compactFeed", compactFeed);
      toStringHelper(sb, "feedFilterPosition", feedFilterPosition);
      toStringHelper(sb, "feedFilters", feedFilters);
      toStringHelper(sb, "fullWidthFeed", fullWidthFeed);
      toStringHelper(sb, "hideSidebar", hideSidebar);
      toStringHelper(sb, "highlightExternalFeedItems", highlightExternalFeedItems);
      toStringHelper(sb, "leftComponents", leftComponents);
      toStringHelper(sb, "rightComponents", rightComponents);
      toStringHelper(sb, "useInlineFiltersInConsole", useInlineFiltersInConsole);
    }


}
