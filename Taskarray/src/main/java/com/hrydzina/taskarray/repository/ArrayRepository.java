package com.hrydzina.taskarray.repository;

import com.hrydzina.taskarray.entity.NumberArray;
import com.hrydzina.taskarray.specification.SpecificationInterface;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayRepository {

  private static final Logger LOGGER =
          LogManager.getLogger(ArrayRepository.class);

  private static ArrayRepository instance;

  private final List<NumberArray> arrays = new ArrayList<>();

  private ArrayRepository() {
    LOGGER.info("Repository created");
  }
  public static ArrayRepository getInstance() {
    if (instance == null) {
      instance = new ArrayRepository();
      LOGGER.info("Repository instance initialized");
    }
    return instance;
  }
  public boolean add(NumberArray array) {
    boolean result = arrays.add(array);
    LOGGER.info("Array added: {}", array);
    return result;
  }
  public boolean remove(NumberArray array) {
    boolean result = arrays.remove(array);
    LOGGER.info("Array removed: {}", array);
    return result;
  }
  public void sort(Comparator<? super NumberArray> comparator) {
    arrays.sort(comparator);
    LOGGER.info("Repository sorted by {}",
            comparator.getClass().getSimpleName());
  }
  public List<NumberArray> query(
          SpecificationInterface specification) {
    List<NumberArray> result = new ArrayList<>();
    for (NumberArray array : arrays) {
      if (specification.specify(array)) {
        result.add(array);
      }
    }
    LOGGER.info("Query completed using {}, found {} arrays",
            specification.getClass().getSimpleName(),
            result.size()
    );
    return result;
  }
}
