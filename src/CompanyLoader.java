//Author: Alexa Nelson
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.ArrayList;
import java.util.List;

public class CompanyLoader {
    
    public static List<Company> loadCompanies(String filePath) throws IOException, ParseException {
        //Parse companies file
        JSONParser parser = new JSONParser();
        FileReader reader = new FileReader(filePath);
        JSONArray companiesArray = (JSONArray) parser.parse(reader);

        //Create list of company names
        List<Company> companies = new ArrayList<>();
        for (Object obj : companiesArray) {
            JSONObject companyJO = (JSONObject) obj;
            String name = (String) companyJO.get("company");
            companies.add(new Company(name));
        }
        return companies;
    }
}
