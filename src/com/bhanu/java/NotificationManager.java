package com.bhanu.java;

import java.util.ArrayList;
import java.util.List;

public class NotificationManager implements INotification {

    private List<IObserver> observerList = new ArrayList<>();

    private String message;

    public void setMessage(String message){
        this.message = message;
        notifyObservers();
    }
    @Override
    public void addObserver(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observerList.remove(observer);
    }
    private void notifyObservers(){
        for (int i=0;i<observerList.size();i++){
            observerList.get(i).onNotificationReceived(message);
        }
    }
}
