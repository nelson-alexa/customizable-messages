import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

class TestTemplate {
    @Test 
    void testGetGreeting(){
        Template template = Template("Hello!", "Welcome to the hotel.");
        String greeting = template.getGreeting();
        Assertions.assertEquals("Hello!", greeting);
    }

    @Test
    void testGetMessage(){
        Template template = Template("Good morning!", "Welcome to the hotel.");
        String message = template.getMessage();
        Assertions.assertEquals("Welcome to the hotel.", message);
    }

}
