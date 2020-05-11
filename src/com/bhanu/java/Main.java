package com.bhanu.java;

public class Main {

    public static void main(String[] args) {

        NotificationListener listener = new NotificationListener();

        NotificationManager notificationManager = new NotificationManager();
        notificationManager.addObserver(listener);
        notificationManager.setMessage("You have won new coupons");
    }
}
