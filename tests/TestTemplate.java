//Author: Alexa Nelson
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestTemplate {

    @Test 
    void testGetGreeting(){
        Template template = new Template("Hello!", "Welcome to the hotel.");
        Assertions.assertEquals("Hello!", template.getGreeting());
    }

    @Test
    void testGetMessage(){
        Template template = new Template("Good morning!", "Welcome to the hotel.");
        String message = template.getMessage();
        Assertions.assertEquals("Welcome to the hotel.", message);
    }

    @Test
    void testCreateMessage() {
        Template template = new Template("Good {time_of_day} {name}!", "Welcome to {company}! Room {roomNumber} is ready!");
        String message = template.createMessage("Cindy", "Candyland", 220, "afternoon");
        Assertions.assertEquals("Good afternoon Cindy! Welcome to Candyland! Room 220 is ready!", message);
    }
}
