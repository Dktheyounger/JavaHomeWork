public class BallApp{
   public static void main(String[] args){
      Ball myBall = new Ball();
      myBall.setSize(5);
      System.out.println("Ball with size " + myBall.getSize());
      myBall.roll();
      myBall.bounce(14);
      myBall.setSize(7);  
      System.out.println("size: " + myBall.getSize());     
   }
}