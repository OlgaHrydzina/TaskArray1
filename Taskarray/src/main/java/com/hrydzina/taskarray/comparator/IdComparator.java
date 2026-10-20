package com.hrydzina.taskarray.comparator;

import com.hrydzina.taskarray.entity.NumberArray;

import java.util.Comparator;

public class IdComparator implements Comparator<NumberArray> {

  @Override
  public int compare(NumberArray first, NumberArray second) {
    return first.getId().compareTo(second.getId());
  }
}
