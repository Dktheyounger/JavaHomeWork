public class RomanApp{

   public static void main(String[] args){
   
      Roman roman = new Roman();
      roman.summary();
      
      for(int i = 0; i<39; i++){
         roman.printNumeral(i);
      }
  }

}