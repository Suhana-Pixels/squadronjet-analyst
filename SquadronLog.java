import java.util.Scanner;

public class SquadronLog { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        String[] callsigns = {"Viper 1", "Viper 2", "Viper 3", "Viper 4", "Ghost 1"}; 
        double[] fuelConsumed = new double[5]; 

        System.out.println("FLIGHT LOG SYSTEM - POST-SORTIE DEBRIEF"); 

        // Input data into arrays 
        for (int i = 0; i < callsigns.length; i++) { 
            System.out.print("Enter fuel consumed by " + callsigns[i] + " (in kg): "); 
            fuelConsumed[i] = in.nextDouble(); 
        } 

        // Logic to find the highest fuel usage
        int highestIndex = 0; 
        double totalFuel = 0; 
        for (int i = 0; i < fuelConsumed.length; i++) { 
            totalFuel += fuelConsumed[i]; 
            if (fuelConsumed[i] > fuelConsumed[highestIndex]) { 
                highestIndex = i; 
            } 
        } 

        double averageFuel = totalFuel / fuelConsumed.length; 

        System.out.println("\n--- Squadron Statistics ---"); 
        System.out.printf("Total Mission Fuel: %.2f kg\n", totalFuel); 
        System.out.printf("Average Fuel per Jet: %.2f kg\n", averageFuel); 
        System.out.println("[ALERT] Maintenance Alert: " + callsigns[highestIndex] + " consumed the most fuel (" + fuelConsumed[highestIndex] + " kg). Schedule inspection."); 
        
        in.close(); 
    } 
}


