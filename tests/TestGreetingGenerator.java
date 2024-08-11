//Author: Alexa Nelson
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalTime;

public class TestGreetingGenerator {

    @Test
    void testGetGreetingMidnight() {
        LocalTime time = LocalTime.of(00,00,00);
        GreetingGenerator greetingObj = new GreetingGenerator();
        String greeting = greetingObj.getGreeting(time);
        Assertions.assertEquals("morning", greeting);
    }

    @Test
    void testGetGreetingMorning() {
        LocalTime time = LocalTime.of(8,30,15);
        GreetingGenerator greetingObj = new GreetingGenerator();
        String greeting = greetingObj.getGreeting(time);
        Assertions.assertEquals("morning", greeting);
    }

    @Test
    void testGetGreetingMorningEdge() {
        LocalTime time = LocalTime.of(11,59,59);
        GreetingGenerator greetingObj = new GreetingGenerator();
        String greeting = greetingObj.getGreeting(time);
        Assertions.assertEquals("morning", greeting);
    }

    @Test
    void testGetGreetingNoon() {
        LocalTime time = LocalTime.of(12,00,00);
        GreetingGenerator greetingObj = new GreetingGenerator();
        String greeting = greetingObj.getGreeting(time);
        Assertions.assertEquals("afternoon", greeting);
    }

    @Test
    void testGetGreetingAfternoon() {
        LocalTime time = LocalTime.of(15,30,00);
        GreetingGenerator greetingObj = new GreetingGenerator();
        String greeting = greetingObj.getGreeting(time);
        Assertions.assertEquals("afternoon", greeting);
    }

    @Test
    void testGetGreetingAfternoonEdge() {
        LocalTime time = LocalTime.of(16,59,59);
        GreetingGenerator greetingObj = new GreetingGenerator();
        String greeting = greetingObj.getGreeting(time);
        Assertions.assertEquals("afternoon", greeting);
    }

    @Test
    void testGetGreetingEvening() {
        LocalTime time = LocalTime.of(17,00,00);
        GreetingGenerator greetingObj = new GreetingGenerator();
        String greeting = greetingObj.getGreeting(time);
        Assertions.assertEquals("evening", greeting);
    }

    @Test
    void testGetGreetingEvening2() {
        LocalTime time = LocalTime.of(19,00,00);
        GreetingGenerator greetingObj = new GreetingGenerator();
        String greeting = greetingObj.getGreeting(time);
        Assertions.assertEquals("evening", greeting);
    }

    @Test
    void testGetGreetingEveningEdge() {
        LocalTime time = LocalTime.of(23,59,59);
        GreetingGenerator greetingObj = new GreetingGenerator();
        String greeting = greetingObj.getGreeting(time);
        Assertions.assertEquals("evening", greeting);
    }
}
