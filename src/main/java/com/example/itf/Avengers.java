package com.example.itf;

import com.example.Assemble;
import com.example.CaptainAmerica;
import com.example.GodOfThunder;
import com.example.Ironman;

public class Avengers implements Assemble {

  private final Ironman ironman;
  private final CaptainAmerica captainAmerica;
  private final GodOfThunder godOfThunder;

  public Avengers(Ironman ironman, CaptainAmerica captainAmerica, GodOfThunder godOfThunder) {
    this.ironman = ironman;
    this.captainAmerica = captainAmerica;
    this.godOfThunder = godOfThunder;
  }

  @Override
  public void assemble() {
    // omitted
    ironman.callUp();
    captainAmerica.callUp();
    godOfThunder.callUp();
    // omitted

  }
}
