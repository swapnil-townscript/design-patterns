package com.swapnil.designpatterns.prototype;

public class ConcretePrototype1 extends CustomPrototype {
  @Override
  public CustomPrototype clone() throws CloneNotSupportedException {
    return (ConcretePrototype1) super.clone();
  }

  public static void main(String s[]) throws CloneNotSupportedException {

    CustomPrototype pro = new ConcretePrototype1();
    System.out.println("Pro: " + pro);

    CustomPrototype pro2 = pro.clone();
    System.out.println("Pro2: " + pro2);

  }

}
