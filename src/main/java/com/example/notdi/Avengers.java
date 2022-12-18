package com.example.notdi;

import com.example.Assemble;
import com.example.CaptainAmerica;
import com.example.GodOfThunder;
import com.example.Ironman;
import com.example.SteveRogers;
import com.example.Thor;
import com.example.TonyStark;
import javax.inject.Inject;

public class Avengers implements Assemble {

  private final TonyStark tonyStark;
  private final SteveRogers steveRogers;
  private final Thor thor;

  public Avengers() {
    this.tonyStark = new TonyStark();
    this.steveRogers = new SteveRogers();
    this.thor = new Thor();
  }

  @Override
  public void assemble() {
    // omitted
    tonyStark.callUp();
    steveRogers.callUp();
    thor.callUp();
    // omitted

  }
}
