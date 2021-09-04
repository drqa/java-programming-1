import java.util.Scanner;

public class Module4 {
    
    public static void main(String[] args) {

        double[] grades = new double[10];
        double sum = 0;
        double max = grades[0];
        double min = 100;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Please enter 10 grade values.");


        for(int i = 0; i < 10; i++){

            grades[i] = scnr.nextDouble();
            
            sum = sum + grades[i];

            if (grades[i] > max)
                max = grades[i];
            
            if (grades[i] < min)
                min = grades[i];

        }

        scnr.close();

        double averageGrade = sum / 10;

        System.out.println("The average grade is: " + averageGrade);
        System.out.println("The maximum grade in this set is: " + max);
        System.out.println("The minimum grade in this set is: " + min);
       
}

}
