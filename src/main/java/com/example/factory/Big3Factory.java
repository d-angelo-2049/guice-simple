package com.example.factory;

import com.example.Avenger;
import com.example.SteveRogers;
import com.example.Thor;
import com.example.TonyStark;
import java.util.Arrays;
import java.util.List;

public class Big3Factory extends AvengerFactory {

  @Override
  public List<Avenger> factorize() {
    return Arrays.asList(new TonyStark(), new SteveRogers(), new Thor());
  }
}
