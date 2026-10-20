package com.hrydzina.taskarray.specification;

import com.hrydzina.taskarray.entity.NumberArray;

public class LengthGreaterThanSpecification implements SpecificationInterface {

  private final int length;

  public LengthGreaterThanSpecification(int length) {
    this.length = length;
  }
  @Override
  public boolean specify(NumberArray array) {
    return array.getLength() > length;
  }
}
