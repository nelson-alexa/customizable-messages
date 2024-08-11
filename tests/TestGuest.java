//Author: Alexa Nelson
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGuest {
    
    @Test
    void testGetName() {
        Guest guest1 = new Guest("CindyLou", 345);
        Guest guest2 = new Guest("Luke",777);
        String name1 = guest1.getName();
        String name2 = guest2.getName();
        Assertions.assertEquals("CindyLou", name1);
        Assertions.assertEquals("Luke", name2);
    }

    @Test
    void getRoomNumber() {
        Guest guest1 = new Guest("CindyLou", 345);
        Guest guest2 = new Guest("Luke",777);
        int roomN1 = guest1.getRoomNumber();
        int roomN2 = guest2.getRoomNumber();
        Assertions.assertEquals(345, roomN1);
        Assertions.assertEquals(777, roomN2);
    }
}
