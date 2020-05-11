package com.bhanu.java;

public interface INotification {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
}
