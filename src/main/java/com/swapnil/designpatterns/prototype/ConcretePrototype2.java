package com.swapnil.designpatterns.prototype;

public class ConcretePrototype2 extends CustomPrototype {
  @Override
  public CustomPrototype clone() throws CloneNotSupportedException {
    return (ConcretePrototype2) super.clone();
  }
}
