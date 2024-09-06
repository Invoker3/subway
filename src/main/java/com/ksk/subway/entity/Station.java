package com.ksk.subway.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "station_name")
    String stationName;

    @ManyToMany
    @JoinTable(
            name = "station_zone",
            joinColumns = @JoinColumn(name = "station_id"),
            inverseJoinColumns = @JoinColumn(name = "zone_id")
    )
    Set<Zone> zones;


//    public Station(String name, List<Integer> zones) {
//        this.name = name;
//        this.zones = zones;
//    }

    public Station() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public Set<Zone> getZones() {
        return zones;
    }

    public void setZones(Set<Zone> zones) {
        this.zones = zones;
    }
}

