package com.swapnil.designpatterns.creational;

/**
 * The builder abstraction.
 */
interface CarBuilder {
  Car build();

  CarBuilder setColor(final String color);

  CarBuilder setWheels(final int wheels);
}
