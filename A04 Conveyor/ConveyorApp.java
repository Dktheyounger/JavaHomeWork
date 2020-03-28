import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ConveyorApp{

   private static DecimalFormat df = new DecimalFormat("0.00");

   public static void main(String[] args){
         Conveyor flatBeltConveyor = new Conveyor("flat belt", 0.9);
         Conveyor rollerConveyor = new Conveyor("Roller", -0.5);
         
         System.out.println("Conveyor1: " + flatBeltConveyor.getType() + " with speed of " + df.format(flatBeltConveyor.getSpeed()) + "m/s");
         System.out.println("Time to transport an item 50 m: " + flatBeltConveyor.timeToTransport(50) + " s");
         
         System.out.println();
         
         System.out.println("Conveyor2: " + rollerConveyor.getType() + " with speed of " + df.format(rollerConveyor.getSpeed())  + "m/s");
         System.out.println("Time to transport an item 50 m: " + rollerConveyor.timeToTransport(50) +  " s");
         
         
         rollerConveyor.setSpeed(0.4);
         System.out.println();
         System.out.println(".. updating speed");
         System.out.println();
         
         System.out.println("Conveyor1: " + flatBeltConveyor.getType() + " with speed of " + df.format(flatBeltConveyor.getSpeed()) + "m/s");
         System.out.println("Time to transport an item 50 m: " + flatBeltConveyor.timeToTransport(50) + " s");
         
         System.out.println();
         
         System.out.println("Conveyor2: " + rollerConveyor.getType() + " with speed of " + df.format(rollerConveyor.getSpeed()) + "m/s");
         System.out.println("Time to transport an item 50 m: " + rollerConveyor.timeToTransport(50) + " s");

         
         


         
   }

}