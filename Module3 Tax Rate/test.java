public class test
{
    public static void main(String[] args)
    {
      
      String cities[] = {"Las Vegas", "Minsk", "Sao Paulo"};
      
      int temps[] = {104, 73, 80};
      
      double rain[] = {4.17, 26.7, 55.0};
      
        
      // Print all 3 arrays according to the output in the description
      
      for(int i = 0; i<3; i++){

          System.out.println(cities[i] + " has an average annual percipitation of " + rain[i]);
          System.out.println(cities[i] + " has an average high temp of " + temps[i]);

      }
    }
}
