package com.ksk.subway.controller;

import com.ksk.subway.dto.JourneyRequest;
import com.ksk.subway.entity.Journey;
import com.ksk.subway.service.JourneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/subway/journey")
public class JourneyController {

    private final JourneyService journeyService;

    @Autowired
    public JourneyController(JourneyService journeyService) {
        this.journeyService = journeyService;
    }

    @PostMapping("newJourney")
    public ResponseEntity<String> addJourney(@RequestBody Journey journey) {
        try {
            journeyService.addJourney(journey);
            return ResponseEntity.ok("Journey added successfully.");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }

}
