package homeworks.hw_20230814.services;

import homeworks.hw_20230814.models.Factory;
import homeworks.hw_20230814.repositories.WarehouseRepository;

import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class FactoryService {

  WarehouseRepository repository;

  public FactoryService(WarehouseRepository repository) {
    this.repository = repository;
  }

  //*  ай ди всех компаний
  public Set<UUID> getIdAllFactories() {
    return repository.getFactories().stream()
            .map(Factory::getId)
            .collect(Collectors.toSet());
  }
}
