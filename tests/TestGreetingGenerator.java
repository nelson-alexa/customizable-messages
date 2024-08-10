//Author: Alexa Nelson
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestGreetingGenerator {

    @Test
    void testGetGreeting(){
        GreetingGenerator greetingObj = new GreetingGenerator();
        String greeting = greetingObj.getGreeting();
        Assertions.assertEquals("", greeting);
    }
}
