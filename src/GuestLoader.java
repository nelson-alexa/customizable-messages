//Author: Alexa Nelson
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.ArrayList;
import java.util.List;

public class GuestLoader {
    
    public static List<Guest> loadGuests(String filePath) throws IOException, ParseException {
        //Parse guests file
        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader(filePath);
        JSONArray guestArray = (JSONArray) parser.parse(reader);

        //Create a list of guest first names
        List<Guest> guests = new ArrayList<>();
        for (Object obj : guestArray) {
            JSONObject guestJO = (JSONObject) obj;
            String name = (String) guestJO.get("firstName");
            JSONObject reservation = (JSONObject) guestJO.get("reservation");  //get reservation from file
            int roomNumber = ((Long) reservation.get("roomNumber")).intValue();  //get roomNumber from reservation
            guests.add(new Guest(name, roomNumber));
        }
        return guests;
    }
}
