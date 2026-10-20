package com.hrydzina.taskarray.comparator;

import com.hrydzina.taskarray.entity.NumberArray;

import java.util.Comparator;

public class FirstElementComparator implements Comparator<NumberArray> {

  @Override
  public int compare(NumberArray first, NumberArray second) {
    return Integer.compare(
            first.getValue(0),
            second.getValue(0)
    );
  }
}
