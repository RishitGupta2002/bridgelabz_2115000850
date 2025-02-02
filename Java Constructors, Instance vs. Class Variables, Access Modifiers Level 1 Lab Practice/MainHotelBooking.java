import java.util.Scanner;

class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this.guestName = "";
        this.roomType = "";
        this.nights = 0;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void displayDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}

public class MainHotelBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Guest Name");
        String guestName = sc.nextLine();
        System.out.println("Enter the Room Type");
        String roomType = sc.nextLine();
        System.out.println("Enter the Number of Nights");
        int nights = sc.nextInt();

        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking parameterizedBooking = new HotelBooking(guestName, roomType, nights);
        HotelBooking copyBooking = new HotelBooking(parameterizedBooking);

        System.out.println("=== Default Booking ===");
        defaultBooking.displayDetails();
        System.out.println("\n=== Parameterized Booking ===");
        parameterizedBooking.displayDetails();
        System.out.println("\n=== Copy Booking ===");
        copyBooking.displayDetails();
    }
}
