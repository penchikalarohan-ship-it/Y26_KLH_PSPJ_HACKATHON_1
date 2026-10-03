import java.util.Scanner;

public class RooftopSolar {
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Rooftop Solar System Details ===");

        System.out.println("Enter Panel ID: ");
        int panelID = sc.nextInt();

        System.out.println("Enter Energy Generated in kWh: ");
        double energyGenerated = sc.nextDouble();

        System.out.println("Enter Number of Solar Panels: ");
        int numberOfPanels = sc.nextInt();

        System.out.println("Enter System Status (A/I): ");
        char systemStatus = sc.next().charAt(0);

        System.out.println("\nRooftop Solar System Details");
        System.out.println("Panel ID: " + panelID);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Number of Solar Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);

        System.out.println("\n=== Energy Monitor ===");

        if (energyGenerated >= 10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }

        System.out.println("\n=== Total Energy Calculation ===");

        System.out.println("Enter Morning Energy in kWh: ");
        double morningEnergy = sc.nextDouble();

        System.out.println("Enter Evening Energy in kWh: ");
        double eveningEnergy = sc.nextDouble();

        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);

        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");

        sc.close();
    }
}
