package com.hrydzina.taskarray.service;

import com.hrydzina.taskarray.entity.NumberArray;

import java.util.OptionalLong;

public interface ArraySumServiceInterface {
  OptionalLong calculateSum(NumberArray numberArray);
}
