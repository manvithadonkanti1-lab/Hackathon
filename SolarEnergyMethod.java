import java.util.Scanner;

public class SolarEnergyMethod {

    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter morning energy in kWh: ");
        double morningEnergy = sc.nextDouble();

        System.out.print("Enter evening energy in kWh: ");
        double eveningEnergy = sc.nextDouble();

        double totalEnergy = calculateTotalEnergy(morningEnergy, eveningEnergy);

        System.out.println("Total Energy Generated: " + totalEnergy + " kWh");

        sc.close();
    }
} 
    

