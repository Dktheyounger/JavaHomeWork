import java.util.Scanner;
import java.math.BigDecimal; 


class SkiTickets{
   public static void main(String[] args){
   
      //Create Scaner Object
      Scanner input = new Scanner(System.in);
      
    
    
      //Initialize prices as BigDecimals
      final BigDecimal adultPrice = new BigDecimal("93");
      final BigDecimal youthPrice = new BigDecimal("47");
      
      
      BigDecimal adultTotalPrice = new BigDecimal("0");
      BigDecimal youthTotalPrice = new BigDecimal("0");
      
      BigDecimal totalPrice = new BigDecimal("0");
     

      
      System.out.printf("Number of adult tickets: ");
      int numOfAdultTickets = input.nextInt();
      adultTotalPrice = adultTotalPrice.add(adultPrice);
      adultTotalPrice = adultTotalPrice.multiply(new BigDecimal(numOfAdultTickets));
      
      
      System.out.printf("Number of youth tickets: ");
      int numOfYouthTickets = input.nextInt();
      youthTotalPrice = youthTotalPrice.add(youthPrice);
      youthTotalPrice = youthTotalPrice.multiply(new BigDecimal(numOfYouthTickets));
      
      
      totalPrice = totalPrice.add(youthTotalPrice);
      totalPrice = totalPrice.add(adultTotalPrice);
    
    
      input.nextLine();
      System.out.print("Name:");
      String name = input.nextLine();
      
      System.out.println("");
      System.out.println("");
      
      System.out.printf("Invoice for %s %n", name);
      
      System.out.println("");
      
      String formatedAdultPrice = String.format("%6.2f", adultTotalPrice);
      String formatedYouthPrice = String.format("%6.2f", youthTotalPrice);
      
      System.out.printf("Adult Tickets  %d .. $ %s %n", numOfAdultTickets, formatedAdultPrice); 
      System.out.printf("Youth tickets  %d .. $ %s %n", numOfYouthTickets, formatedYouthPrice); 

      System.out.printf("------------------------------ %n");
      
      
      String formatedTotalPrice = String.format("%6.2f", totalPrice);
      
      String holderOne = "$";
      System.out.printf("%22s %s %n",holderOne, formatedTotalPrice); 
      
      String holderTwo = "=========";
      System.out.printf("%30s", holderTwo);
           

    
   }
}