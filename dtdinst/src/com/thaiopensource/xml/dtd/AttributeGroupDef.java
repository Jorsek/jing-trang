package com.thaiopensource.xml.dtd;

public class AttributeGroupDef extends TopLevel {
  
  private final String name;
  private final AttributeGroup attributeGroup;

  public AttributeGroupDef(String name, AttributeGroup attributeGroup) {
    this.name = name;
    this.attributeGroup = attributeGroup;
  }

  public int getType() {
    return ATTRIBUTE_GROUP_DEF;
  }
  
  public AttributeGroup getAttributeGroup() {
    return attributeGroup;
  }
  
  public String getName() {
    return name;
  }

  public void accept(TopLevelVisitor visitor) throws VisitException {
    try {
      visitor.attributeGroupDef(name, attributeGroup);
    }
    catch (RuntimeException e) {
      throw e;
    }
    catch (Exception e) {
      throw new VisitException(e);
    }
  }
}