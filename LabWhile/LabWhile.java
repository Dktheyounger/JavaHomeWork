import java.util.Scanner;

public class LabWhile{
   
   public static void main(String[] args){
      multiplyNumbers();
   }
   
   public static void multiplyNumbers(){
      int product = 1;
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter a number (0 to exit) : ");
      int userNumber = scanner.nextInt();
      
      
      while(userNumber != 0){
         product = product * userNumber;
         System.out.print("Enter a number (0 to exit) : ");
         userNumber = scanner.nextInt();
      }
      
      System.out.println("The product is: " + product);
   }
}