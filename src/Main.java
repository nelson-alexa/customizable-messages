//Author: Alexa Nelson
import java.io.IOException;
import org.json.simple.parser.ParseException;


public class Main{
    public static void main(String[] args) {
        try {
            // Load the template
            Template template = TemplateLoader.loadTemplate("src/Template.json");

            // Generate greeting based on time of day
            String timeOfDay = GreetingGenerator.getGreeting();

            // Hardcoded guest and company data for simplicity
            String guestName = "Ethan";
            String company = "Hotel California";
            String roomNumber = "304";

            // Generate the final message
            String finalMessage = template.createMessage(guestName, company, roomNumber, timeOfDay);
            System.out.println(finalMessage);

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}