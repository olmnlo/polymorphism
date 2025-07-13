import person.Person;
import vehicle.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Vehicle> vehicles_rented = new ArrayList<>();
        ArrayList<Person> people = new ArrayList<>();



        int user_chose;
        outerLoop:
        while (true){
            System.out.println("""
                    Chose what service you want:
                    1- Rent a Car
                    2- Rent a Bike
                    3- Rent a Truck
                    4- View Rented Vehicles
                    5- show list of users
                    6- add new user
                    7- Exit
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
                        System.out.print("Enter type of truck");
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
                        for (Person p : people){
                            System.out.println(p);
                        }
                        break;
                    case 6:
                        people = addNewUser(people);
                        break;
                    case 7:
                        break outerLoop;

                }
            }catch (Exception e){
                System.out.println("you must enter integer");
            }


        }
    }

    private static ArrayList<Person> addNewUser(ArrayList<Person> people) {
        Scanner scn = new Scanner(System.in);
        int n = people.size()+1;
        while(people.size() < n){
            System.out.print("Enter your name: ");
            scn.nextLine();
            String name = scn.nextLine();
            System.out.print("Enter your age: ");
            int age = scn.nextInt();
            System.out.println("enter national id: ");
            String national_id = scn.next();
            System.out.print("do you have license yes/no");
            String license = scn.next();
            boolean haveLicense = license.equalsIgnoreCase("yes");
            people.add(new Person(name,age,national_id,haveLicense));
        }
        scn.close();
        return people;
    }
}