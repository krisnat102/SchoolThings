package FileReader.AutoHouse;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AutoHouse {
    String model;
    String brand;
    String type;

    public AutoHouse(String model, String brand, String type) {
        this.model = model;
        this.brand = brand;
        this.type = type;
    }
}

class Vehicle extends AutoHouse {
    String type1;
    int yearOfProduction;
    float averageFuelCost;
    String typeOfBox;
    float price;

    public Vehicle(String model, String brand, String type, String type1, int yearOfProduction, float averageFuelCost, String typeOfBox, float price) {
        super(model, brand, type);
        this.type1 = type1;
        this.yearOfProduction = yearOfProduction;
        this.averageFuelCost = averageFuelCost;
        this.typeOfBox = typeOfBox;
        this.price = price;
    }
    public int getYearOfProduction() {
        return yearOfProduction;
    }

    protected static Vehicle CreateAuto(String model, String brand, String type, String type1, int yearOfProduction, float averageFuelCost, String typeOfBox, float price) {
        return new Vehicle(model, brand, type, type1, yearOfProduction, averageFuelCost, typeOfBox, price);
    }

    public static void DescribeAuto(Vehicle vehicle) {
        System.out.println(vehicle.model);
        System.out.println(vehicle.brand);
        System.out.println(vehicle.type);
        System.out.println(vehicle.type1);
        System.out.println(vehicle.yearOfProduction);
        System.out.println(vehicle.averageFuelCost);
        System.out.println(vehicle.typeOfBox);
        System.out.println(vehicle.price);
    }

    @Override
    public String toString() {
        return String.format("model: %1$s%n" + "brand: %2$s%n" + "type: %3$s%n" + "type1: %4$s%n" + "year of production: %5$s%n" + "average fuel cost: %6$s%n" + "type of box: %7$s%n" + "price: %8$s%n" + "%n", this.model, this.brand, this.type, this.type1, this.yearOfProduction, this.averageFuelCost, this.typeOfBox, this.price);
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Vehicle vehicle1 = Vehicle.CreateAuto("bmw", "1", "car", "white", 2000, 10, "automatic", 5000);
        Vehicle vehicle2 = Vehicle.CreateAuto("bmw", "2", "car", "brown", 2001, 9, "automatic", 5100);
        Vehicle vehicle3 = Vehicle.CreateAuto("bmw", "3", "car", "yellow", 2002, 10, "automatic", 5200);
        Vehicle vehicle4 = Vehicle.CreateAuto("bmw", "4", "car", "pink", 2003, 8, "automatic", 5300);
        Vehicle vehicle5 = Vehicle.CreateAuto("bmw", "5", "car", "red", 2004, 10, "automatic", 5400);
        Vehicle vehicle6 = Vehicle.CreateAuto("bmw", "6", "car", "black", 2005, 9, "automatic", 5500);
        Vehicle vehicle7 = Vehicle.CreateAuto("bmw", "7", "car", "violet", 2006, 10, "automatic", 5600);
        Vehicle vehicle8 = Vehicle.CreateAuto("bmw", "8", "car", "purple", 2007, 8, "automatic", 5700);
        Vehicle vehicle9 = Vehicle.CreateAuto("bmw", "9", "car", "orange", 2008, 10, "automatic", 5800);
        Vehicle vehicle10 = Vehicle.CreateAuto("bmw", "10", "car", "baby blue", 2009, 9, "automatic", 5900);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);
        vehicles.add(vehicle3);
        vehicles.add(vehicle4);
        vehicles.add(vehicle5);
        vehicles.add(vehicle6);
        vehicles.add(vehicle7);
        vehicles.add(vehicle8);
        vehicles.add(vehicle9);
        vehicles.add(vehicle10);

        try {
            File autoHouse = new File("C:\\Users\\XI_B\\Desktop\\autohaus.txt");
            FileWriter fileWriter = new FileWriter(autoHouse);

            for (Vehicle vehicle : vehicles) {
                fileWriter.write(vehicle.toString());
            }

            Scanner scanner = new Scanner(System.in);
            int year = Integer.parseInt(scanner.nextLine());

            File autoHouseYear = new File("C:\\Users\\XI_B\\Desktop\\autohausYear.txt");
            FileWriter fileWriterYear = new FileWriter(autoHouseYear);

            for (Vehicle vehicle : vehicles) {
                if (vehicle.getYearOfProduction() >= year) {
                    fileWriterYear.write(vehicle.toString());
                }
            }

            fileWriter.close();
            fileWriterYear.close();
        } catch (IOException e) {
            System.out.println("ERROR");
        }
    }
}
