import java.util.Scanner;


import java.util.Arrays;

public class Class1 {
    Scanner scnr = new Scanner(System.in);
    String[] colors = new String[3];

    void userColors() {
        
        System.out.println("Enter three colors: ");

        for(int i = 0; i < 3;i++){
            System.out.print(i + 1 + ": ");
            colors[i] = scnr.nextLine();
        }
        
        try{
            if( colors.length == 3){
                System.out.println(Arrays.toString(colors));
                System.out.println("Success");
            }
        } catch(Exception e) {
            System.out.println("Failure");
        }
    }
}
