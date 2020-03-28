import java.util.Scanner;
public class VolumesMenu{

   public static void main(String[] args){
      
      Scanner scanner = new Scanner(System.in);
      
      userPrompt();
      
      int userInput = scanner.nextInt(); 
      Volumes volumes = new Volumes();
      System.out.println();
      

      
      do{
                          
         switch(userInput){
            case 0:
               System.out.println("Goodbye");
               System.out.println();
               break;
            case 1:
                 System.out.printf("cuboid(2, 4, 6): Volume = %.1f %n ", volumes.cuboid(2,4,6));         
                 System.out.println();  
               break;
            case 2:
               System.out.printf("cuboid(4): Volume = %.1f %n", volumes.cuboid(4));
               System.out.println();
               break;
            case 3:
               System.out.printf("ellipsoid(2, 4, 6): Volume = %.1f %n", volumes.ellipsoid(2,4,6));
               System.out.println();
               break;
            case 4:
               System.out.printf("ellipsoid(4): Volume = %.1f %n", volumes.ellipsoid(4));
               System.out.println();
               break;
            case 5:
               System.out.printf("cylinder(3, 4): Volume = %.1f %n", volumes.cylinder(3,4));
               System.out.println();
               break;
            case 6:
               System.out.printf("cone(6, 5): Volume = %.1f %n", volumes.cone(6,5));
               System.out.println();
               break;
            default:
               System.out.println("Invalid Input");
               System.out.println();  
                    
         }
         userPrompt();
         userInput = scanner.nextInt();
       
         
      }
      while(userInput != 0);
      
   }
   
   public static void userPrompt(){
   
      System.out.printf("%s %18s %n", "1 .. cuboid(2, 4, 6)", "2 .. cuboid(4)");
      System.out.printf("%s %18s %n", "3 .. ellipsoid(2, 4, 6)", "4 .. ellipsoid(4)");
      System.out.printf("%s %20s %n", "5 .. cylinder(3, 4)", "6 .. cone(6, 5)");
      System.out.printf("%s %n", "0 .. exit");
      System.out.print("Your choice: ");
      
      
   }

}