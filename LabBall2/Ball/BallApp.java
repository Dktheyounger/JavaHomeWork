public class BallApp{
   public static void main(String[] args){
      Ball myBall = new Ball();
      System.out.println("myBall size: " + myBall.getSize());
      myBall.setSize(5);  
      System.out.printf("myBall is bouncing ");
      myBall.bounce(14);
            
      
      Ball myBall1 = new Ball(8.0);
      System.out.println("myBall1 size: " + myBall1.getSize());
      Ball myBall2 = new Ball(10.0, true);
      System.out.printf("myBall2 is bouncing ");
      myBall2.roll(10);
      System.out.println("myBall2 is black " + myBall2.getIsBlack());  
   }
}