package com.example.itf;

import com.example.SteveRogers;
import com.example.Thor;
import com.example.TonyStark;

public class InterfaceDiMain {

  public static void main(String[] args) {

    TonyStark tonyStark = new TonyStark();
    SteveRogers steveRogers = new SteveRogers();
    Thor thor = new Thor();
    Avengers avengers = new Avengers(tonyStark, steveRogers, thor);
    avengers.assemble();

  }

  }
