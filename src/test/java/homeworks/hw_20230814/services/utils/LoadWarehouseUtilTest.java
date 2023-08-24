package homeworks.hw_20230814.services.utils;

import homeworks.hw_20230814.models.Product;
import homeworks.hw_20230814.repositories.WarehouseRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class LoadWarehouseUtilTest {
  private static final String REPORT_ORIGINAL_FILE = "/report.json";
  private static final String REPORT_EMPTY_FILE = "/report_empty.json";
  private static final String REPORT_CRASH_FILE = "/report_crash.json";
  private static final String REPORT_NOT_EXISTS_FILE = "/report_unknown.json";

  @Mock
  WarehouseRepository repository;

  @Captor
  private ArgumentCaptor<Product> productCaptor;
  LoadWarehouseUtil util = new LoadWarehouseUtil();


  @Test
  void getDataFromJSONTest() {
    util.getDataFromJSON(repository, REPORT_ORIGINAL_FILE);
    verify(repository, times(2)).addProduct(productCaptor.capture());
  }

  @Test
  void getDataFromJSONEmptyFileTest() {
    util.getDataFromJSON(repository, REPORT_EMPTY_FILE);
    verify(repository, times(0)).addProduct(productCaptor.capture());
  }

  @Test
  void getDataFromJSONCrashFileTest() {
    util.getDataFromJSON(repository, REPORT_CRASH_FILE);
    verify(repository, times(0)).addProduct(productCaptor.capture());
  }

  @Test
  void getDataFromJSONFileNotExistsTest() {
    Assertions.assertThrows(AssertionError.class, () -> util.getDataFromJSON(repository, REPORT_NOT_EXISTS_FILE));
  }
}