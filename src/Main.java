//Author: Alexa Nelson
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import org.json.simple.parser.ParseException;

public class Main{
    public static void main(String[] args) {
        try {
            //Choose Template
            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you want to:");
            System.out.println("1. Use existing template");
            System.out.println("2. Enter a new template");
            int choice = scanner.nextInt();
            scanner.nextLine();

            Template selectedTemplate;
            if (choice == 1) {
                //Load the template
                selectedTemplate = TemplateLoader.loadTemplate("src/Template.json");
            } else {
                //User enters a new template
                System.out.println("----------------------------------------------------------");
                System.out.println("Please write the new template for the message being sent.");
                System.out.println("The greeting can include the variable placeholders {name} and {time_of_day}");
                System.out.println("Example: Good {time_of_day} {name}!");
                System.out.println("The message can include the variable placeholders {company} and {roomNumber}");
                System.out.println("Example: Welcome to {company}! Room {roomNumber} is now ready!");
                System.out.println("----------------------------------------------------------");

                System.out.println("Enter the greeting:");
                String greeting = scanner.nextLine();
                System.out.println("Enter the message:");
                String message = scanner.nextLine();
                selectedTemplate = new Template(greeting, message);
            }

            //Load Guests and Companies
            List<Guest> guests = GuestLoader.loadGuests("src/Guests.json");
            List<Company> companies = CompanyLoader.loadCompanies("src/Companies.json");

            //Select Guest and Company
            System.out.println("Select a Guest: ");
            for (int i = 0; i < guests.size(); i++) {
                System.out.println((i+1) + ". " + guests.get(i).getName());
            }
            int guestIndex = scanner.nextInt() - 1;
            Guest selectedGuest = guests.get(guestIndex);

            System.out.println("Select a Company:");
            for (int i = 0; i < companies.size(); i++) {
                System.out.println((i + 1) + ". " + companies.get(i).getName());
            }
            int companyIndex = scanner.nextInt() - 1;
            Company selectedCompany = companies.get(companyIndex);

            String timeOfDay = GreetingGenerator.getGreeting();

            //Generate the final message
            String finalMessage = selectedTemplate.createMessage(
                    selectedGuest.getName(),
                    selectedCompany.getName(),
                    selectedGuest.getRoomNumber(),
                    timeOfDay
            );
            System.out.println("\n");
            System.out.println(finalMessage);
            System.out.println("\n");

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
