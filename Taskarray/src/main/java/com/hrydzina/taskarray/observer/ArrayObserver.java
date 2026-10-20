package com.hrydzina.taskarray.observer;

import com.hrydzina.taskarray.entity.NumberArray;

public interface ArrayObserver {

  void onArrayChanged(NumberArray array);
}
