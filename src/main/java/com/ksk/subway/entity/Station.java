package com.ksk.subway.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "station_name")
    String name;


    List<Integer> zones;

    public Station(String name, List<Integer> zones) {
        this.name = name;
        this.zones = zones;
    }

    public Station() {
    }


}

