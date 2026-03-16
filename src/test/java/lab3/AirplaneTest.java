package lab3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirplaneTest {
    @Test
    void testEquals(){
        Airplane airplane1 = new Airplane("Test", "Test", 1000, 1000, 10.0);
        Airplane airplane2 = new Airplane("Test", "Test", 1000, 1000, 10.0);
        Airplane airplane3 = new Airplane("Test_not_equal", "Test", 500, 100, 5.0);

        assertEquals(airplane1, airplane2);
        assertNotEquals(airplane1, airplane3);
    }
}
