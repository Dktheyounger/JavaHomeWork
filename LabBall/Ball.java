public class Ball{
   private double size;
   public double getSize(){
   
      return size;
   
   }
   public void setSize(double s){
   
      if(s >= 0){
         size = s;
      }
      else{
         System.out.println("Invalid input");
      }
   } 
   public void roll(){
      System.out.println("rolling...");
   }
   public void bounce(int numberOfBounces){
   
      int bounces = numberOfBounces;
      System.out.printf("Bouncing %d times %n", bounces);
   }
}