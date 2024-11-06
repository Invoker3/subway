package com.ksk.subway.service;

import com.ksk.subway.entity.Zone;
import com.ksk.subway.repository.ZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZoneService {

    private final ZoneRepository zoneRepository;

    @Autowired
    ZoneService(ZoneRepository zoneRepository) {
        this.zoneRepository = zoneRepository;
    }

    public void addZone(Zone zone) { zoneRepository.save(zone); }

    public List<Zone> getAllZones() { return zoneRepository.findAll(); }

}
