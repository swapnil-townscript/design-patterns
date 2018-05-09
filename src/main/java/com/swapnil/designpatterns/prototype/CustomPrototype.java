package com.swapnil.designpatterns.prototype;

// Prototype pattern
public abstract class CustomPrototype implements Cloneable {
  public CustomPrototype clone() throws CloneNotSupportedException {
    return (CustomPrototype) super.clone();
  }
}
