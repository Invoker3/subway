package com.ksk.subway.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.Instant;

@Entity
public class Journey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Instant journeyDate;

    private Long userId;

    private int startingStationID;

    private int endingStationID;

    public Long getId() {
        return id;
    }

    public Instant getJourneyDate() {
        return journeyDate;
    }

    public Long getUserId() {
        return userId;
    }

    public int getStartingStationID() {
        return startingStationID;
    }

    public int getEndingStationID() {
        return endingStationID;
    }

    public void setJourneyDate(Instant journeyDate) {
        this.journeyDate = journeyDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setStartingStationID(int startingStationID) {
        this.startingStationID = startingStationID;
    }

    public void setEndingStationID(int endingStationID) {
        this.endingStationID = endingStationID;
    }
}
