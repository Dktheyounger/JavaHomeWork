public class Conveyor{

   // fields
   private String type;
   //Speed is in m/s (meters per second)
   private double speed;
   
   // constructors
   public Conveyor (String type, double speed)
   {
      this.type = type;
      
      if(speed >= 0){
         this.speed = speed; 
      }
      else{
         this.speed = 0;
      }
      
   }
   
   
   // methods
   public String getType(){
      return type;
   }
   public double getSpeed(){
      return speed;   
   }
   public void setSpeed(double speed){
      this.speed = speed;
   }
   public double timeToTransport(double distance){
      double time;
      
      if(speed > 0){
         time = distance/speed;
         return time;
      }  
      else{
         return Double.POSITIVE_INFINITY;
      }
   }
}