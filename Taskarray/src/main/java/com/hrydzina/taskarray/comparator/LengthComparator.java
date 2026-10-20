package com.hrydzina.taskarray.comparator;

import com.hrydzina.taskarray.entity.NumberArray;
import java.util.Comparator;

public class LengthComparator implements Comparator<NumberArray> {

  @Override
  public int compare(NumberArray first, NumberArray second) {
    return Integer.compare(
            first.getLength(),
            second.getLength()
    );
  }
}
