package com.ksk.subway.dto;

import java.util.List;

public class StationRequest {
    private String stationName;
    private List<Integer> zoneNumbers;

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public List<Integer> getZoneNumbers() {
        return zoneNumbers;
    }

    public void setZoneNumbers(List<Integer> zoneNumbers) {
        this.zoneNumbers = zoneNumbers;
    }
}
