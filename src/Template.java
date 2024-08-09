//Author: Alexa Nelson

public class Template {

    public String greeting;
    public String message;

    public Template(String greeting, String message) {
        this.greeting = greeting;
        this.message = message;
    }

    public String getGreeting(){
        return this.greeting;
    }

    public String getMessage(){
        return this.message;
    }
}
