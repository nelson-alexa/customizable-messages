//Author: Alexa Nelson

public class Template {

    public String greeting;
    public String message;

    public Template(String greeting, String message) {
        this.greeting = greeting;
        this.message = message;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getMessage() {
        return message;
    }

    public String createMessage(String name, String company, int roomNumber, String timeOfDay) {
        String newGreeting = greeting.replace("{time_of_day}", timeOfDay).replace("{name}", name);
        String newMessage = message.replace("{company}", company).replace("{roomNumber}", String.valueOf(roomNumber));
        return newGreeting + " " + newMessage;
    }
}
