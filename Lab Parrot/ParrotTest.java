import java.util.Scanner;

public class ParrotTest{
   
   public static void main(String[] args){
      
      Scanner scanner = new Scanner(System.in);
      Parrot myParrot = new Parrot();
      
      System.out.printf("What would you like your parrot to say? ");
      String word = scanner.nextLine();   

      myParrot.Speak(word);
   
   }
   
}