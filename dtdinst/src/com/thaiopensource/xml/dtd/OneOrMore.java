package com.thaiopensource.xml.dtd;

public class OneOrMore extends ModelGroup {
  
  private final ModelGroup member;

  public OneOrMore(ModelGroup member) {
    this.member = member;
  }

  public int getType() {
    return ONE_OR_MORE;
  }
  
  public ModelGroup getMember() {
    return member;
  }

  public void accept(ModelGroupVisitor visitor) throws VisitException {
    try {
      visitor.oneOrMore(member);
    }
    catch (RuntimeException e) {
      throw e;
    }
    catch (Exception e) {
      throw new VisitException(e);
    }
  }
}