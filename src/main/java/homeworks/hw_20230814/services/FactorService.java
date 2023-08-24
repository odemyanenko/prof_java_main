package homeworks.hw_20230814.services;

import homeworks.hw_20230814.models.Factory;

import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class FactorService {

  //*  ай ди всех компаний
  public Set<UUID> getIdAllFactors(Set<Factory> factories) {
    return factories.stream()
            .map(Factory::getId)
            .collect(Collectors.toSet());
  }
}
