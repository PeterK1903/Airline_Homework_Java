import java.util.ArrayList;
import java.util.Date;

public class Flight {

   private ArrayList<Passenger> passengers;
   private Plane plane;
   private int flightNum;
   private String destination;
   private String departure;
   private String departureTime;

    public Flight(Plane plane, int flightNum, String destination, String departure, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int numPassengers(){
        return this.passengers.size();
    }

    public int seatAvailable(){
        return this.plane.getCapacityFromEnum();
    }

    public void addPassenger(Passenger passenger) {
        if (this.seatAvailable() > this.numPassengers()) {
            this.passengers.add(passenger);
        }
    }
}
