package com.ksk.subway.service;

import com.ksk.subway.entity.Journey;
import com.ksk.subway.entity.Station;
import com.ksk.subway.repository.JourneyRepository;
import com.ksk.subway.repository.StationRepository;
import com.ksk.subway.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Service
public class JourneyService {

    private final JourneyRepository journeyRepository;
    private final UserRepository userRepository;
    private final StationRepository stationRepository;

    @Autowired
    JourneyService(JourneyRepository journeyRepository, UserRepository userRepository,
                   StationRepository stationRepository) {
        this.journeyRepository = journeyRepository;
        this.userRepository = userRepository;
        this.stationRepository = stationRepository;
    }

    public void addJourney(Journey journey) {
        journey.setJourneyDate(Instant.now());
        if(journey.getId() != null && userRepository.findById(journey.getId()).isPresent())
            journey.setId(journey.getId());
        else
            throw new IllegalArgumentException("User ID: " + journey.getId() + " not found.");

        if(stationRepository.findById(journey.getStartingStationID()).isPresent() &&
                stationRepository.findById(journey.getEndingStationID()).isPresent()) {
            journey.setStartingStationID(journey.getStartingStationID());
            journey.setEndingStationID(journey.getEndingStationID());
        } else
            throw new IllegalArgumentException("Station ID not found.");

        journeyRepository.save(journey);
    }

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

