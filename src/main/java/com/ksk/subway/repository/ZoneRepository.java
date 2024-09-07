package com.ksk.subway.repository;

import com.ksk.subway.entity.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneRepository extends JpaRepository<Zone, Integer> {
    Zone findByZoneNumber(int zoneNumber);
}
