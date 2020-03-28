import java.util.Scanner;
public class RectangleMenu
{
	public static void main(String[] args)
	{
       Scanner scnr = new Scanner(System.in);
	    Rectangle rect = new Rectangle(5,4);
       int selection;
             
       do
       {
       menuPrompt();
       selection = scnr.nextInt();
         switch(selection){
            case 0:
               System.out.println(".. exit");
               break;
            case 1:
               System.out.println(rect.area());
               break;
            case 2:
               System.out.println(rect.perimeter());
               break;
            case 3:
               System.out.println(rect.getLength() + " " + rect.getWidth());
               break;
            default:
               System.out.println("Invalid Input");
               break;       
         }
       } while (selection != 0);
  	}
	
	private static void menuPrompt()
	{
	   System.out.println("1 .. area");
		System.out.println("2 .. perimeter");
		System.out.println("3 .. length and width");
		System.out.println("0 .. exit");
		System.out.print("Your choice: ");
	}
}