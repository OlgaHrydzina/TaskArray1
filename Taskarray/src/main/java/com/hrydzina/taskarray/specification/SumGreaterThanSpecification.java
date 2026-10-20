package com.hrydzina.taskarray.specification;

import com.hrydzina.taskarray.entity.NumberArray;

public class SumGreaterThanSpecification implements SpecificationInterface {

  private final int sumValue;

  public SumGreaterThanSpecification(int sumValue) {
    this.sumValue = sumValue;
  }
  @Override
  public boolean specify(NumberArray array) {
    int sum = 0;
    for (int value : array.getValues()) {
      sum += value;
    }
    return sum > sumValue;
  }
}
