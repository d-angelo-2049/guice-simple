package com.example.guice;

import com.example.CaptainAmerica;
import com.example.GodOfThunder;
import com.example.Ironman;
import com.example.SteveRogers;
import com.example.Thor;
import com.example.TonyStark;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;

public class GuiceMain {

  public static void main(String[] args) {
    Avengers avengers = Guice.createInjector(new AbstractModule() {
      @Override
      protected void configure() {
        super.configure();
        bind(Ironman.class).to(TonyStark.class);
        bind(CaptainAmerica.class).to(SteveRogers.class);
        bind(GodOfThunder.class).to(Thor.class);
      }

    }).getInstance(Avengers.class);

    avengers.assemble();
  }
}