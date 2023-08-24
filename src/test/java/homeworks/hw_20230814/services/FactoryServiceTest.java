package homeworks.hw_20230814.services;

import homeworks.hw_20230814.models.Factory;
import homeworks.hw_20230814.repositories.WarehouseRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class FactoryServiceTest {
  @Mock
  WarehouseRepository repository;

  @InjectMocks
  FactoryService factoryService = new FactoryService(repository);

  @Test
  void getIdAllFactorsTest() {
    Set<Factory> factories = new HashSet<>();
    Factory factory1 =new Factory("factory1", false);
    Factory factory2 =new Factory("factory2", true);
    factories.add(factory1);
    factories.add(factory2);

    when(repository.getFactories()).thenReturn(factories);

    Set<UUID> actual = factoryService.getIdAllFactories();
    Set<UUID> excepted = new HashSet<>();
    excepted.add(factory1.getId());
    excepted.add(factory2.getId());

    assertEquals(excepted, actual);
    verify(repository, times(1)).getFactories();
  }
}