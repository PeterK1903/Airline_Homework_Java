import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Flight flight2;
    Plane plane1;
    Plane plane2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.Boeing747);
        plane2 = new Plane(PlaneType.Boeing767);
        flight1 = new Flight(plane1, 80001, "Madrid", "Glasgow", "2020/08/24 14:00");
        flight2 = new Flight(plane2, 80002, "Lima", "Cusco", "2020/06/28 14:00");
        passenger1 = new Passenger("Peter", 1);
        passenger1 = new Passenger("Paul", 1);
        passenger1 = new Passenger("Emma", 1);
    }

    @Test
    public void canGetPlane(){
        assertEquals(plane1, flight1.getPlane());
    }

    @Test
    public void canGetFlightNum(){
        assertEquals(80001, flight1.getFlightNum());
    }

    @Test
    public void canGetDestination(){
        assertEquals("Madrid", flight1.getDestination());
    }

    @Test
    public void canGetDeparture(){
        assertEquals("Glasgow", flight1.getDeparture());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals("4pm", flight1.getDepartureTime());
    }

    @Test
    public void planeStartsWithFullCapacity(){
        assertEquals(4, flight1.getPlane().getCapacityFromEnum());
    }

    @Test
    public void planeOnlyTakesCapacity(){
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger2);
        flight2.addPassenger(passenger3);
        assertEquals(2, flight2.numPassengers());
    }

}
