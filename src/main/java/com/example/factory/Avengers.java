package com.example.factory;

import com.example.Assemble;
import com.example.Avenger;
import com.example.CaptainAmerica;
import com.example.GodOfThunder;
import com.example.Ironman;
import java.util.List;
import javax.inject.Inject;

public class Avengers implements Assemble {

  private final List<Avenger> avengerList;

  public Avengers(AvengerFactory factory) {
    this.avengerList = factory.factorize();
  }

  @Override
  public void assemble() {
    avengerList.forEach(Avenger::callUp);
  }
}
