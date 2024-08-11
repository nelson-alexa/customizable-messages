//Author: Alexa Nelson

public class Guest {
    private String firstName;
    private int roomNumber;

    public Guest(String name, int roomNumber) {
        this.firstName = name;
        this.roomNumber = roomNumber;   
    }

    public String getName() {
        return firstName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}
