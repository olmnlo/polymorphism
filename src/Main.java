import vehicle.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Vehicle> vehicles_rented = new ArrayList<>();

        int user_chose;
        outerLoop:
        while (true){
            System.out.println("""
                    Chose what service you want:
                    1- Rent a Car
                    2- Rent a Bike
                    3- Rent a Truck
                    4- View Rented Vehicles
                    5- Exit
                    """);
            try {


                user_chose = scn.nextInt();

                switch (user_chose) {
                    case 1:
                        System.out.print("Enter model of car: ");
                        scn.nextLine();
                        String car_model = scn.nextLine();
                        System.out.print("Enter how many days of rent: ");
                        int days = scn.nextInt();
                        vehicles_rented.add(new Car(car_model, days));
                        break;
                    case 2:
                        System.out.print("Enter brand of bike: ");
                        scn.nextLine();
                        String bike_brand = scn.nextLine();
                        System.out.print("Enter how many days of rent: ");
                        int hours = scn.nextInt();
                        vehicles_rented.add(new Bike(bike_brand, hours));
                        break;
                    case 3:
                        System.out.print("Enter type of truck: ");
                        scn.nextLine();
                        String truck_type = scn.nextLine();
                        System.out.print("Enter how many weeks of rent: ");
                        int weeks = scn.nextInt();
                        vehicles_rented.add(new Truck(truck_type, weeks));
                        break;
                    case 4:
                        System.out.println("Rental details");
                        for (Vehicle v : vehicles_rented) {
                            v.displayDetails();
                        }
                        break;
                    case 5:
                        break outerLoop;
                    default:
                        System.out.println("you must chose from menu");

                }
            }catch (Exception e){
                System.out.println("you must enter integer");
                scn.next();
            }


        }
        scn.close();
    }

}