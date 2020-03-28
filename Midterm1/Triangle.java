public class Triangle{
   //fields
   private double side1;
   private double side2;
   private double side3;
   
   //Contructor
   public Triangle(double side1, double side2, double side3){
      if(isTriangle(side1,side2,side3) == true){
         this.side1 =side1;
         this.side2 = side2;
         this.side3 = side3;
      }
      else{
         this.side1 = 1.0d;
         this.side2 = 1.0d;
         this.side3 = 1.0d;
      }
   } 
   
   //Methods
   public double getSide1(){
      return side1;
   }
   
   public double getSide2(){
      return side2;
   }
   
   public double getSide3(){
      return side3;
   }

   private boolean isTriangle(double side1, double side2, double side3){
      return ((side1 > 0) &&
				(side2 > 0) &&
				(side3 > 0) &&
				(side1 + side2 > side3) &&
				(side1 + side3 > side2) &&
				(side2 + side3 > side1));
   }
   
   public boolean isEquilateral(){
      return ((side1 == side2) &&
            (side2 == side3));
   }
   
   public boolean isRight(){
      double side1Squared = side1 * side1;
      double side2Squared = side2 * side2;
      double side3Squared = side3 * side3;
      if(side1 != side2 || side2 != side3){
       return  ((side1Squared + side2Squared == side3Squared)||
              (side2Squared + side3Squared == side1Squared)||
              (side1Squared + side3Squared == side2Squared));
      }
      else{
        return false;
      }               
   }
}