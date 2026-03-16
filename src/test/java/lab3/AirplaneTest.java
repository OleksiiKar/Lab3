package lab3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirplaneTest {
    @Test
    void testEquals(){
        Airplane airplane1 = new Airplane("Test", "Test", 1000, 1000, 10.0);
        Airplane airplane2 = new Airplane("Test", "Test", 1000, 1000, 10.0);
        Airplane airplane3 = new Airplane("Test_not_equal", "Test", 500, 100, 5.0);
        Airplane airplane4 = new Airplane("Test", "Test", null, 1000, 10.0);

        assertEquals(airplane1, airplane2);
        assertNotEquals(airplane1, airplane3);
        assertNotEquals(null, airplane1);
        assertNotEquals(airplane4, airplane1);
    }
    @Test
    void setValues(){
        Airplane airplane1 = new Airplane("Test", "Test", 1000, 1000, 10.0);
        airplane1.setModel("Falcon");
        airplane1.setManufacturer("RollsRoyce");
        airplane1.setTopSpeed(1100);
        airplane1.setMaxAltitude(900);
        airplane1.setPayload(12.0);
        assertEquals("Falcon", airplane1.getModel());
        assertEquals("RollsRoyce", airplane1.getManufacturer());
        assertEquals(1100, airplane1.getTopSpeed());
        assertEquals(900, airplane1.getMaxAltitude());
        assertEquals(12.0, airplane1.getPayload());
    }
    @Test
    void getValues(){
        Airplane airplane1 = new Airplane("Test", "Test", 1000, 1000, 10.0);
        assertEquals("Test", airplane1.getModel());
        assertEquals("Test", airplane1.getManufacturer());
        assertEquals(1000, airplane1.getTopSpeed());
        assertEquals(1000, airplane1.getMaxAltitude());
        assertEquals(10.0, airplane1.getPayload());
    }
}
