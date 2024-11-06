package com.ksk.subway.service;

import com.ksk.subway.entity.Station;
import com.ksk.subway.entity.StationZone;
import com.ksk.subway.entity.Zone;
import com.ksk.subway.repository.StationRepository;
import com.ksk.subway.repository.StationZoneRepository;
import com.ksk.subway.repository.ZoneRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService {

    private final StationRepository stationRepository;

    private final ZoneRepository zoneRepository;

    private final StationZoneRepository stationZoneRepository;

    @Autowired
    public StationService(StationRepository stationRepository, ZoneRepository zoneRepository, StationZoneRepository stationZoneRepository) {
        this.stationRepository = stationRepository;
        this.zoneRepository = zoneRepository;
        this.stationZoneRepository = stationZoneRepository;
    }

    @Transactional
    public void addStation(String stationName, List<Integer> zoneNumbers) {
        // Create a new station
        Station station = new Station();
        station.setStationName(stationName);
        stationRepository.save(station);

        // Find zones by their zone numbers and associate with the new station
        for (int zoneNumber : zoneNumbers) {
            Zone zone = zoneRepository.findByZoneNumber(zoneNumber);
            if (zone != null) {
                StationZone stationZone = new StationZone();
                stationZone.setStation(station);
                stationZone.setZone(zone);
                stationZoneRepository.save(stationZone);
            } else {
                throw new IllegalArgumentException("Zone number " + zoneNumber + " not found.");
            }
        }
    }

    public List<Station> getAllStations() { return stationRepository.findAll(); }
//
//    public boolean isInSameZone(Station other) {
//        for (int zone : this.zones) {
//            if (other.zones.contains(zone)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public int minZone() {
//        return zones.stream().min(Integer::compare).orElse(Integer.MAX_VALUE);
//    }
//
//    // Method to get the maximum zone for the station
//    public int maxZone() {
//        return zones.stream().max(Integer::compare).orElse(Integer.MIN_VALUE);
//    }
}
