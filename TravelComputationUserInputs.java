import java.util.Scanner;
class TravelComputationUserInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.print("Enter from city: ");
        String fromCity = sc.next();
        System.out.print("Enter via city: ");
        String viaCity = sc.next();
        System.out.print("Enter to city: ");
        String toCity = sc.next();
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double distanceFromToVia = sc.nextDouble();
        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in miles): ");
        double distanceViaToFinalCity = sc.nextDouble();
        System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " (in minutes): ");
        int timeFromToVia = sc.nextInt();
        System.out.print("Enter time taken from " + viaCity + " to " + toCity + " (in minutes): ");
        int timeViaToFinalCity = sc.nextInt();
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +
        		" is " + totalDistance + " miles and " + "the Total Time taken is " + totalTime + " minutes");
    }
}










