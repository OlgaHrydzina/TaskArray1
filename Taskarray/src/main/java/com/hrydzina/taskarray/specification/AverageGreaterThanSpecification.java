package com.hrydzina.taskarray.specification;

import com.hrydzina.taskarray.entity.NumberArray;

public class AverageGreaterThanSpecification implements SpecificationInterface {

  private final double averageValue;

  public AverageGreaterThanSpecification(double averageValue) {
    this.averageValue = averageValue;
  }
  @Override
  public boolean specify(NumberArray array) {
    int sum = 0;
    for (int value : array.getValues()) {
      sum += value;
    }
    double average = (double) sum / array.getLength();
    return average > averageValue;
  }
}
