public class LabChar{
   public static void main(String[] args){

      char dash = '-';
      System.out.printf("Dash:" + dash + "%n");
      
      char a = 'a';
      char letter = 'a';
      char b = ++letter;
      char c = ++letter;
      letter = letter +=2;
      char e = letter;
      System.out.printf("letter: %c a: %c b: %c c: %c : %c%n", letter,a,b,c,e);
      
      
      char copyRight = '\u00A9';
      System.out.printf("Copyright sign: %c %d %X%n", copyRight, (int)copyRight, (int)copyRight);
      
      
      char Yen = '¥'; 
      System.out.printf("Yen: %c %d %X%n", Yen, (int)Yen, (int)Yen);


      
   }
}