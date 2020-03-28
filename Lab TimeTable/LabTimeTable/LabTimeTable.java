import java.util.Scanner; 

public class LabTimeTable{

   public static void main(String[] args){
   
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Time Table:");
      System.out.print("Number (1 - 10): ");
      int userNumber = scanner.nextInt();
      System.out.println();
    
      for(int i = 1; i <= 10; i++){
         int answer = userNumber * i;
         System.out.printf("%2d * %2d = %2d %n", i, userNumber , answer );
      }
   }
}