package com.ksk.subway.service;

import com.ksk.subway.entity.Station;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JourneyService {

//    public static double calculateFare(Station entry, Station exit) {
//        List<Double> possibleFares = new ArrayList<>();
//
//        // Handle missing swipe-in or swipe-out
//        if (entry == null || exit == null) {
//            return 3.20; // Max fare if either swipe in or out is missing
//        }
//
//        // Check if the journey is within the same zone(s)
//        if (entry.isInSameZone(exit)) {
//            if (entry.minZone() == 1) {
//                possibleFares.add(2.50); // Anywhere in Zone 1
//            } else {
//                possibleFares.add(2.00); // Any one zone outside Zone 1
//            }
//        }
//
//        // Calculate min and max zones crossed
//        int minZoneCrossed = Math.min(entry.minZone(), exit.minZone());
//        int maxZoneCrossed = Math.max(entry.maxZone(), exit.maxZone());
//
//        // Journey that crosses two zones including Zone 1
//        if (minZoneCrossed == 1 && maxZoneCrossed > 1) {
//            possibleFares.add(3.00);
//        }
//
//        // Journey that crosses two zones excluding Zone 1
//        if (maxZoneCrossed - minZoneCrossed == 1 && minZoneCrossed != 1) {
//            possibleFares.add(2.25);
//        }
//
//        // Journey that crosses three or more zones
//        if (maxZoneCrossed - minZoneCrossed >= 2) {
//            possibleFares.add(3.20);
//        }
//
//        // If no specific fare was added, assume maximum fare
//        if (possibleFares.isEmpty()) {
//            possibleFares.add(3.20);
//        }
//
//        // Return the lowest fare
//        return possibleFares.stream().min(Double::compare).orElse(3.20);
//    }
}

