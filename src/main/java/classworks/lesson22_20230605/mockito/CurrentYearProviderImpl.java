package classworks.lesson22_20230605.mockito;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CurrentYearProviderImpl implements CurrentYearProvider{
  @Override
  public int getYear() {
    return LocalDate.now().getYear();
  }
}