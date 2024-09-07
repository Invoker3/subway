package com.ksk.subway.repository;

import com.ksk.subway.entity.StationZone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationZoneRepository extends JpaRepository<StationZone, Integer> {
}
