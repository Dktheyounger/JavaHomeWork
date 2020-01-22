import java.util.Scanner;


public class LabVariables
{
   public static void main(String[] args)
   {
    
      int kingsPeak = 4124;
      int timpanogos = 3581;
      
      Scanner input = new Scanner (System.in);
      
      System.out.print("Enter you favorite destination: ");
      String destination = input.nextLine();
      System.out.printf("Welcome to %s! %n", destination);
      System.out.println();
      System.out.printf("Elevation of Kings Peak: %d  %n", kingsPeak);
      System.out.printf("Elevation of Timpanogos: %d  %n", timpanogos);
      
      
      
      
   }
}