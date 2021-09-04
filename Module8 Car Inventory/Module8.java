import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class Module8{

    public static void main(String args[]) throws IOException {

        ///Declaring variables for writing files
        Scanner scan = new Scanner(System.in);
        String ans;
        File file = new File("inventory.txt");
        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

///Creating an ArrayList that will contain Car Objects
        ArrayList<Car> cars = new ArrayList<Car>();

        cars.add(new Car("Chevy", "Tahoe", "Black", 2001, 100000));
        cars.add(new Car("Tesla", "Model S", "Blue", 2020, 5000));
        cars.add(new Car("Nissan", "Altima", "White", 2016, 20000));

        System.out.println("-----Printing Inventory Details-----");

        ///iterating upon all Car objects in the ArrayList and printing their details
        for(int i = 0; i < cars.size(); i++){

            System.out.println(cars.get(i).printCar());
        }
        ///Clearing the current ArrayList of all Car objects
        System.out.println(removeCars(cars));

        if(cars.size() == 0){
            System.out.println("No Vehicles In Inventory\n");
        }
        ///Adding a new Car object to the ArrayList
        System.out.println(addCar(cars, "Ford", "Focus", "Blue", 2006, 56879));

        System.out.println(addCar(cars, "Honda", "Civic", "Black", 2020, 100));
        

        for(int i = 0; i < cars.size(); i++){

            System.out.println(cars.get(i).printCar());
        }

        ///Updating details of Car object at index 0 of the ArrayList
        cars.get(0).updateCar("Ford", "Fusion", "Green", 2010, 60000);

        System.out.println(cars.get(0).printCar());

        System.out.println("Create a file of current inventory? Y / N: ");
        ans = scan.nextLine();

        ///If the user indicates that they want a text file of the current inventory
        ///The program writes a text file including all Car objects and their details
        if(ans.equals("Y")){
            for(int i = 0; i < cars.size(); i++){
                pw.println(cars.get(i).printCar());
            }
            System.out.println("File created");
        }
        else{
            System.out.println("File not created");
        }

        pw.close();
        scan.close();
    }

    ///Method to empty the ArrayList cars
    static String removeCars(ArrayList<Car> container){
        try{
            container.clear();
        }
        catch(Exception e){
            System.out.println("Failed to empty ArrayList of cars");
        }
        return("\n-----Inventory Cleared-----\n");
    }
    ///Method to add new car objects to the ArrayList
    static String addCar(ArrayList<Car> container, String make, String model, String color, int year, int mileage){
        try {
            container.add(new Car(make, model ,color ,year ,mileage));
        }
        catch(Exception e){
            System.out.println("Failed to add a new car.");
        }
        return("-----Vehicle Added-----");
    }
}