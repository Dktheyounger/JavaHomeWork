import java.util.Random;

public class LabRandom{

   public static void main(String[] args){
   
      Random rand = new Random();
      int number;
      int i = 1;
      
      while(i <= 100){
      
            number = rand.nextInt(4)+ 4;
            System.out.printf("%-5d",number );
            
            if(i % 10 == 0){
               System.out.println("");
               i++;
            }
            else{
               i++;
            }
      } 
   }
}