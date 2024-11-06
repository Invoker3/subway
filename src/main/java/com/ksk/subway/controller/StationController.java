package com.ksk.subway.controller;

import com.ksk.subway.dto.StationRequest;
import com.ksk.subway.entity.Station;
import com.ksk.subway.entity.User;
import com.ksk.subway.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subway/station")
public class StationController {

    private final StationService stationService;

    @Autowired
    public StationController(StationService stationService) {this.stationService = stationService;}

    @PostMapping("/addStation")
    public ResponseEntity<String> addUser(@RequestBody StationRequest request) {
        try {
            stationService.addStation(request.getStationName(), request.getZoneNumbers());
            return ResponseEntity.ok("Station added successfully.");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }

    @GetMapping("/getAllStations")
    public ResponseEntity<List<Station>> getAllStation() {
        return ResponseEntity.ok(stationService.getAllStations());
    }
}
