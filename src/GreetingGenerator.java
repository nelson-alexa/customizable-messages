//Author: Alexa Nelson
import java.time.LocalTime;

public class GreetingGenerator{

    public static String getGreeting() {
        LocalTime time = LocalTime.now();

        if (time.isBefore(LocalTime.NOON)) {
            return "morning";
        }
        else if (time.isBefore(LocalTime.of(17, 0))) {
            return "afternoon";
        }
        else {
            return "evening";
        }
    }
}
