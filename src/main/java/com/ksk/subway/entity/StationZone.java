package com.ksk.subway.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "station_zone")
public class StationZone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "station_id", nullable = false)
    private Station station;

    @ManyToOne
    @JoinColumn(name = "zone_number", nullable = false)
    private Zone zone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }
}
