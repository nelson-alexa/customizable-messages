//Author: Alexa Nelson

import java.time.LocalTime;

public class Greeting{

    public String greeting;

    public Greeting(){
        this.greeting = "";     //Set greeting to empty string prior to being determined
    }

    public void determineGreeting(){
        LocalTime time = LocalTime.now();

        if (time.isBefore(LocalTime.NOON)) {
            this.greeting = "morning";
        }
        else if (time.isBefore(LocalTime.of(17, 0))) {
            this.greeting = "afternoon";
        }
        else if (time.isBefore(LocalTime.of(24,0))) {
            this.greeting = "evening";
        }
    }

    public String getGreeting(){
        return this.greeting;
    }
}
