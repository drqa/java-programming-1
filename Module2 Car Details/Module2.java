import java.util.Scanner;

//program that asks a user for details about a vehicle, inluding make,model, and gallons of gas used.
//the information is organized and returned to the user, along with an estimated Miles Per Gallon for thier vehicle

public class Module2 {

    public static void main(String[] args){
        
        Scanner scnr = new Scanner(System.in);
        
        String carMake;
        String carModel;
        String carYear;
        int odometerStart;
        int odometerEnd;
        int gallonsUsed;
        int milesDriven;
        int averageGallons;

        
        
        System.out.print("Enter the make of your vehicle: ");
        carMake = scnr.nextLine();

        System.out.print("Enter the model of your vehicle: ");
        carModel = scnr.nextLine();

        System.out.print("Enter the year your vehicle was made: ");
        carYear = scnr.nextLine();

        System.out.print("Enter the starting odometer reading: ");
        odometerStart = scnr.nextInt();

        System.out.print("Enter the ending odometer reading: ");
        odometerEnd = scnr.nextInt();

        System.out.print("Enter the number of gallons used between the starting and ending odometer reading: ");
        gallonsUsed = scnr.nextInt();

        System.out.print("\n");

        scnr.close();

        milesDriven = (odometerEnd - odometerStart);
        averageGallons = (milesDriven / gallonsUsed);

        System.out.println("Make: " + carMake);
        System.out.println("Model: " + carModel);
        System.out.println("Year: " + carYear);
        System.out.println("Starting odometer reading: " + odometerStart);
        System.out.println("Ending odometer reading: " + odometerEnd);
        System.out.println("Gallons used: " + gallonsUsed);
        System.out.println("MPG: " + averageGallons);



        

    }
    
}