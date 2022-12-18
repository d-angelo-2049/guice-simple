package com.example.factory;

public class FactoryDIMain {

  public static void main(String[] args) {
    AvengerFactory avengerFactory = new Big3Factory();
    Avengers avengers = new Avengers(avengerFactory);
    avengers.assemble();
  }
}
