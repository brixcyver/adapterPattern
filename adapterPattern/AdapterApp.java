package adapterPattern;

import java.util.Scanner;

public class AdapterApp {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger charger = new SmartphoneCharger();

        PowerOutlet laptopPowerOutlet = new LaptopAdapter(laptop);
        PowerOutlet refrigeratorPowerOutlet = new RefrigeratorAdapter(refrigerator);
        PowerOutlet smartphonePowerOutlet = new SmartphoneChargerAdapter(charger);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Welcome to your Adapter App.");
            System.out.println("Choose the number of what you want to plug-in.");
            System.out.println("1. Laptop");
            System.out.println("2. Refrigerator");
            System.out.println("3. Smartphone Charger");
            System.out.println("4. Quit");
            System.out.print("Choose the number of the device: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    laptopPowerOutlet.plugIn();
                    break;
                case 2:
                    refrigeratorPowerOutlet.plugIn();
                    break;
                case 3:
                    smartphonePowerOutlet.plugIn();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("================================================================");
                    System.out.println("Exiting the application.");
                    System.out.println("Thank you for using the Adapter App!");
                    System.out.println("================================================================");
                    System.exit(0);
                default:
                    System.out.println();
                    System.out.println("================================================================");
                    System.out.println("Invalid choice. Please select a valid option.");
                    System.out.println("================================================================");
            }
        }
    }
}
