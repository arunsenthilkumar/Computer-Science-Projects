//Arun Senthilkumar AP Computer Science
public class Money
{
   public static void main(String[] args)
   {
      //Declaring Variables 
      
      int intNumPennies;
      int intRemainder;
      int intDollars;
      int intQuarters;
      int intDimes;
      int intNickels;
      int intPennies;
      
      intNumPennies = 820;
      
      intDollars = intNumPennies / 100;
      intRemainder = intNumPennies % 100;
         
      intQuarters = intRemainder / 25;
      intRemainder = intRemainder % 25;
      
      intDimes = intRemainder / 10;
      intRemainder = intRemainder % 10;
      
      intNickels = intRemainder / 5;
      intRemainder = intRemainder % 5;
      
      intPennies = intRemainder / 1;
      
      
      System.out.println("You have " + intDollars + " dollars, " + intQuarters + " quarters, " + intDimes + " dimes, " + intNickels + " nickels, and " + intPennies + " pennies");
      
      
    }
}