package com.hrydzina.taskarray.specification;

import com.hrydzina.taskarray.entity.NumberArray;

public class IdSpecification implements SpecificationInterface {

  private final String id;

  public IdSpecification(String id) {
    this.id = id;
  }

  @Override
  public boolean specify(NumberArray array) {
    return id.equals(array.getId());
  }
}
