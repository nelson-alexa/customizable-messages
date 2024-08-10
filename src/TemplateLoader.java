//Author: Alexa Nelson
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TemplateLoader {

    public static Template loadTemplate(String filePath) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader(filePath);
        JSONObject jsonObject = (JSONObject) parser.parse(reader);

        String greeting = (String) jsonObject.get("greeting");
        String message = (String) jsonObject.get("message");
        return new Template(greeting, message);
    }
}
