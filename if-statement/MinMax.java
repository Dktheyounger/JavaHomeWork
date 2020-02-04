import java.util.Scanner;

public class MinMax {

   public static void main(String[] args){
   
      
      Scanner input = new Scanner(System.in);
      
      
      System.out.printf("number : ");
      int firstNumber = input.nextInt();   
      
      
      System.out.printf("number : ");
      int secondNumber = input.nextInt();
      
      
      if(firstNumber > secondNumber){
         System.out.printf("%d is greater than %d", firstNumber, secondNumber);
      }
      else if (firstNumber < secondNumber){
         System.out.printf("%d is less then %d", firstNumber, secondNumber);
      }   
      else{
         System.out.printf("%d is equal to %d", firstNumber, secondNumber);
      }
      
   }

}