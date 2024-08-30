package com.ksk.subway.entity;

import com.ksk.subway.service.JourneyService;

public class OysterCard {
    private double balance;
    private boolean isInJourney;
    private Station entryStation;

//    public OysterCard(double initialBalance) {
//        this.balance = initialBalance;
//        this.isInJourney = false;
//        this.entryStation = null;
//    }
//
//    public void swipeIn(Station station) {
//        if (balance < 3.20) {
//            System.out.println("Insufficient balance to start the journey.");
//            return;
//        }
//        this.isInJourney = true;
//        this.entryStation = station;
//        this.balance -= 3.20;
//        System.out.println("Swiped in at " + station.name + ". Current balance: " + balance);
//    }
//
//    public void swipeOut(Station station) {
//        if (!isInJourney) {
//            System.out.println("Error: Not in a journey, charging maximum fare.");
//            this.balance -= 3.20;
//        } else {
//            double fare = JourneyService.calculateFare(this.entryStation, station);
//            this.balance += (3.20 - fare); // Adjust fare
//            System.out.println("Swiped out at " + station.name + ". Fare: " + fare + ". Current balance: " + balance);
//        }
//        this.isInJourney = false;
//        this.entryStation = null;
//    }
//
//    public void takeBus() {
//        if (balance < 1.80) {
//            System.out.println("Insufficient balance to take the bus.");
//            return;
//        }
//        this.balance -= 1.80;
//        System.out.println("Bus journey taken. Current balance: " + balance);
//    }
//
//    public double getBalance() {
//        return this.balance;
//    }
}
