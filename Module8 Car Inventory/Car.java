import java.util.ArrayList;

public class Car{
    
    
    private String color;
    private int year;
    private int mileage;
    Car cars[] = new Car[4];


///parameterized constructor for Car class
    public Car(String make, String model, String color, int year, int mileage){

        super();
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;

        
    }
    
///getters ans setters for Car class parameters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

///method to print the details of a Car object
    public String printCar(){

        String temp = "";
        temp = temp + "Make: " + getMake() + "\n";
        temp = temp + "Model: " + getModel() + "\n";
        temp = temp + "Color: " + getColor() + "\n";
        temp = temp + "Year: " + getYear() + "\n";
        temp = temp + "Mileage: " + getMileage() + "\n";
        temp = temp + "--------------------";
        
        return(temp);
    }

    
///method to update details of a Car object
    void updateCar(String make, String model, String color, int year, int mileage){
        setMake(make);
        setModel(model);
        setColor(color);
        setYear(year);
        setMileage(mileage);
    
        System.out.println("\n-----Updated Specified Vehicle-----");
    }
}