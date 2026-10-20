package com.hrydzina.taskarray.factory;

import com.hrydzina.taskarray.entity.NumberArray;

public class ArrayFactory implements ArrayFactoryInterface {

  @Override
  public NumberArray createArray(String id, int[] values) {
    return new NumberArray(id, values);
  }
}
