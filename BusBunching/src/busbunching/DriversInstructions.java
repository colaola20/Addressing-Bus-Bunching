
package busbunching;
import java.util.Scanner;

public class DriversInstructions {
    double distanceRoute; // In miles
    double timeRoute; //In hours
    boolean trafficAhead;
    boolean trafficBegind;
    int numBuses;
    
    public DriversInstructions(double newDistanceRoute, int newNumBuses) {
        distanceRoute = newDistanceRoute;
        numBuses = newNumBuses;
    }
    
    public void distancesBtwBusses() {
        double minValue;
        double maxValue;
        double distanveBtwBuses;
        double RealTimeDistanceBtwBuses1;
        double RealTimeDistanceBtwBuses2;
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Getting the distances between the bus and its neighbors from tracks... ");
        RealTimeDistanceBtwBuses1 = scnr.nextDouble();
        RealTimeDistanceBtwBuses2 = scnr.nextDouble();
        
        // Calculate the ideal distance between busses
        distanveBtwBuses = distanceRoute / (numBuses + 1);
        
        // Calculate the minimum and the maximum values for buses' distance
        minValue = distanveBtwBuses - (distanveBtwBuses / 3);
        maxValue = distanveBtwBuses + (distanveBtwBuses / 3);
        
        // Create the instructions in real time for drivers baced on gathing data
        if ((RealTimeDistanceBtwBuses1 >= minValue) && (RealTimeDistanceBtwBuses1 <= maxValue)) {
            System.out.println("Pacing is good! Keep going!");
        }
        else if (RealTimeDistanceBtwBuses1 < minValue) {
            System.out.println("Please, speed up!");
        }
        else {
            System.out.println("Please, slow down!");
        }
    }
    
}
