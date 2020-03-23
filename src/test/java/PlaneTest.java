import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;
    Plane plane2;
    Plane plane3;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.Boeing747);
        plane2 = new Plane(PlaneType.Boeing767);
        plane3 = new Plane(PlaneType.Boeing777);
    }

    @Test
    public void canGetPlane(){
        assertEquals(PlaneType.Boeing747, plane1.getPlane());
    }

    @Test
    public void canGetPlaneWeight(){
        assertEquals(PlaneType.Boeing747.getTotalWeight(), plane1.getTotalWeightFromEnum());
    }

    @Test
    public void canGetPlaneCapacity(){
        assertEquals(PlaneType.Boeing747.getCapacity(), plane1.getCapacityFromEnum());
    }

}
