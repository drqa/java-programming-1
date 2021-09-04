import java.util.ArrayList;
import java.util.Scanner;

public class Module5 {

    public static void main(String args[]){

        ArrayList<String> days = new ArrayList<String>();
        ArrayList<Integer> temps = new ArrayList<Integer>();
        String userDay;
        int total = 0;
        int avg;

        days.add("sunday");
        days.add("monday");
        days.add("tuesday");
        days.add("wednesday");
        days.add("thursday");
        days.add("friday");
        days.add("saturday");

        temps.add(108);
        temps.add(109);
        temps.add(109);
        temps.add(107);
        temps.add(106);
        temps.add(111);
        temps.add(111);

        System.out.println("Enter a day of the week to see that days temperature. Enter 'week' to see the average temperature for the entire week.");
        
        Scanner scnr = new Scanner(System.in);
        userDay = scnr.nextLine();

        for(int i = 0; i < days.size(); i++){

            total += temps.get(i);

           if(userDay.equals(days.get(i))){

               System.out.println("Day: " + days.get(i) + "  " + "Temp: " + temps.get(i));

           }else if(userDay.equals("week")){

               System.out.println("Day: " + days.get(i) + "  " + "Temp: " + temps.get(i));
           }
        }

        avg = total / temps.size();

        if(userDay.equals("week")){

            System.out.println("Average weekly temperature is: " + avg );
        }
    }
}
    
