package classworks.lesson19_20230522.requestResponseModel.database;

import java.util.List;
import java.util.Optional;

public interface Repository<T> {

  void save(T entity);

  List<T> findAll();

  Optional<T> findByID();
}