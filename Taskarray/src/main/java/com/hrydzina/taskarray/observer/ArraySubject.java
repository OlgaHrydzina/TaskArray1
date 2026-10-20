package com.hrydzina.taskarray.observer;

public interface ArraySubject {

  void attach(ArrayObserver observer);

  void detach(ArrayObserver observer);

  void notifyObservers();
}
