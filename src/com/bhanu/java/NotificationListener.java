package com.bhanu.java;

public class NotificationListener implements IObserver {
    @Override
    public void onNotificationReceived(String message) {
        System.out.println("New Notification is: "+message);
    }
}
