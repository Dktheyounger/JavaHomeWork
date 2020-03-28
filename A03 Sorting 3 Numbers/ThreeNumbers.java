import java.util.Scanner;


public class ThreeNumbers{


   public static void main(String[] args){
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.printf("Enter 3 numbers seperated by a space:");
      int n1 = scanner.nextInt();
      int n2 = scanner.nextInt();
      int n3 = scanner.nextInt();

      if(n1 > n2 && n1 > n3){
         if(n2 > n3){
            System.out.printf("Sorted Numbers: %d %d %d", n3, n2 ,n1);
         }
         else{
            System.out.printf("Sorted Numbers: %d %d %d", n2, n3 ,n1);
         }
      }
      else if(n2 > n1 && n2 > n3){
         if(n1 > n3){
            System.out.printf("Sorted Numbers: %d %d %d", n3, n1 ,n2);
         }
         else{
            System.out.printf("Sorted Numbers: %d %d %d", n1, n3 ,n2);

         }
      }
      else if(n3 > n1 && n3 > n2){
         if(n1 > n2){
            System.out.printf("Sorted Numbers: %d %d %d", n2, n1 ,n3);
         }
         else{
            System.out.printf("Sorted Numbers: %d %d %d", n1, n2 ,n3);
         }
      }
      else if(n1 == n2 && n1 == n3){
         System.out.printf("Sorted Numbers: %d %d %d", n1, n2 ,n3);
      }
      else if(n1 == n2 && n1 != n3){
         if(n1>n3){
            System.out.printf("Sorted Numbers: %d %d %d", n3, n2 ,n1);
         }
         else{
            System.out.printf("Sorted Numbers: %d %d %d", n2, n1 ,n3);
         }
      }
      else if(n1 == n3 && n1 != n2){
         if(n1>n2){
            System.out.printf("Sorted Numbers: %d %d %d", n2, n1 ,n3);
         }
         else{
            System.out.printf("Sorted Numbers: %d %d %d", n1, n3 ,n2);
         }
      }
            
     
      
     

   
   }




}