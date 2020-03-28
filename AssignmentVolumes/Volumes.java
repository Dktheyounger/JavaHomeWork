import java.lang.*;

public class Volumes{

   public double cuboid(double sideA, double sideB, double sideC){
      return sideA * sideB * sideC;
   }
   
   public double cuboid(double side){
      return cuboid(side,side,side);
   }
   
   public double ellipsoid(double sideA, double sideB, double sideC){
      return (4.0/3.0) * Math.PI * sideA * sideB * sideC;
   }
   
   public double ellipsoid(double side){
      return ellipsoid(side,side,side);
   }
   
   public double cylinder(double radius, double height){
      return Math.PI * Math.pow(radius, 2) * Math.hypot(radius, height);
   }
   
   public double cone(double diameter, double side){
      return (1.0/3.0) * Math.PI * Math.pow((diameter/2), 2) * side;
   }

}