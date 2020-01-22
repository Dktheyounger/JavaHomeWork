import java.util.Scanner;

class Marbles
{
   public static void main(String args[])
   {
      Scanner scanner = new Scanner(System.in);   
      
      System.out.print("Enter color:");
      String color1 = scanner.nextLine();
      System.out.printf("Number of %s marbles:", color1);
      int number1 = scanner.nextInt();
      scanner.nextLine();
      
      System.out.print("Enter color:");
      String color2 = scanner.nextLine();
      System.out.printf("Number of %s marbles:", color2);
      int number2 = scanner.nextInt();
      scanner.nextLine();
      
      System.out.print("Enter color:");
      String color3 = scanner.nextLine();
      System.out.printf("Number of %s marbles:", color3);
      int number3 = scanner.nextInt();
      scanner.nextLine();
      
      String colorHeader = "Color";
      String numberHeader = "Number of Marbles";
      String dashes = "----------------";
      
      System.out.printf("%10s ", colorHeader);
      System.out.printf("%10s %n", numberHeader);
      
      System.out.printf("%10s ", dashes);
      System.out.printf("%10s %n", dashes);
      
      System.out.printf("%10s", color1);
      System.out.printf("%10s %n", number1);
      
      System.out.printf("%10s", color2);
      System.out.printf("%10s %n", number2);
      
      System.out.printf("%10s", color3);
      System.out.printf("%10s %n", number3);
      
 
      

      
   }
}