package com.ksk.subway.controller;

import com.ksk.subway.entity.Zone;
import com.ksk.subway.service.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subway/zone")
public class ZoneController {

    private final ZoneService zoneService;

    @Autowired
    ZoneController(ZoneService zoneService) {
        this.zoneService = zoneService;
    }

    @PostMapping("addZone")
    public ResponseEntity<String> addZone(@RequestBody Zone zone) {
        try {
            zoneService.addZone(zone);
            return ResponseEntity.ok("Zone added successfully.");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Error: " + e.getMessage());
        }
    }

    @GetMapping("getAllZones")
    public ResponseEntity<List<Zone>> getAllZones() {
        return ResponseEntity.ok(zoneService.getAllZones());
    }


}
