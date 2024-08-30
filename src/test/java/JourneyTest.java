import com.ksk.subway.service.JourneyService;
import com.ksk.subway.entity.Station;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JourneyTest {

    @Test
    public void testSameZone1Journey() {
        Station holborn = new Station("Holborn", List.of(1));
        Station earlsCourt = new Station("Earl's Court", Arrays.asList(1, 2));
        double fare = JourneyService.calculateFare(holborn, earlsCourt);
        assertEquals(2.50, fare, 0.01 );
    }

    @Test
    public void testTwoZonesIncludingZone1Journey() {
        Station earlsCourt = new Station("Earl's Court", List.of(1));
        Station wimbledon = new Station("Wimbledon", List.of(2));
        double fare = JourneyService.calculateFare(earlsCourt, wimbledon);
        assertEquals(3.00, fare, 0.01 );
    }

    @Test
    public void testTwoZonesExcludingZone1Journey() {
        Station wimbledon = new Station("Wimbledon", List.of(3));
        Station hammersmith = new Station("Hammersmith", List.of(2));
        double fare = JourneyService.calculateFare(wimbledon, hammersmith);
        assertEquals(2.25, fare, 0.01);
    }

    @Test
    public void testMissingSwipeIn() {
        Station holborn = new Station("Holborn", List.of(1));
        double fare = JourneyService.calculateFare(null, holborn);
        assertEquals(3.20, fare, 0.01);
    }

    @Test
    public void testMissingSwipeOut() {
        Station holborn = new Station("Holborn", List.of(1));
        double fare = JourneyService.calculateFare(holborn, null);
        assertEquals(3.20, fare, 0.01 );
    }
}
