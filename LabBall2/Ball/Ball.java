public class Ball{

   public Ball(){
      this(6.0, false);
   }
   public Ball(double size){
     this(size, true);
   }
   public Ball(double size, boolean isBlack){
      this.size = size;
      this.isBlack = isBlack;
   }
   private boolean isBlack;
   public boolean getIsBlack(){
      return isBlack;
   }
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
   public void roll(int howManyTimes){
      System.out.println("rolling " + howManyTimes + " times");
   }
   public void bounce(int numberOfBounces){
      System.out.printf("Bouncing %d time(s) %n", numberOfBounces);
   }
}