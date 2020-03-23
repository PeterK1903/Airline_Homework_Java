import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;

    @Before
    public void before(){
        passenger1 = new Passenger("Peter", 1);
    }

    @Test
    public void hasName(){
        assertEquals("Peter", passenger1.getName());
    }

    @Test
    public void hasBag(){
        assertEquals(1, passenger1.getNumBags());
    }
}
