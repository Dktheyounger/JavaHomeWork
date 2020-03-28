public class Roman{

   
   public void summary(){
      System.out.printf("%s = %d %n", "I", 1);
      System.out.printf("%s = %d %10s = %d %n", "V", 5, "IV", 4);
      System.out.printf("%s = %d %9s = %d %n", "X", 10, "IX", 9);
      System.out.printf("%s = %d %9s = %d %n", "L", 50, "XL", 40);
      System.out.printf("%s = %d %8s = %d %n", "C", 100, "XC", 90);
      System.out.printf("%s = %d %8s = %d %n", "D", 500, "CD", 400);
      System.out.printf("%s = %d %7s = %d %n", "M", 1000, "CM", 900);
      System.out.println();
   }
   
   public void printNumeral(int number){
      
      if(number <= 39 && number>0){
         
         while(number != 0){
            
            if(number >= 10){
               System.out.print("X");
               number = number - 10;
            }
            else if(number == 9){
               System.out.print("IX");
               number = number - 9;
            }
            else if(number >= 5){
               System.out.print("V");
               number = number - 5;
            }
            else if(number == 4){
               System.out.print("IV");
               number = number - 4;
            }
            else if(number >= 1){
               System.out.print("I");
               number = number - 1;
            }
         } 
         System.out.println();
      }
      else{
         System.out.println("Valid number range: 1 - 39");
      }
   }
}