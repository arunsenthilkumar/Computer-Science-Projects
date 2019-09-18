public class Sept18th
{
   public static void main(String[] args)
   {
     /*
      double Average = 59.4;
      if (Average > 59.4)System.out.println("you pass");
      else if (Average == 0) System.out.println("You havent submitted your work");
      else System.out.println("Try Harder");
     
     
     double dblAverage;
     dblAverage = 92;
     if (dblAverage > 59.4) System.out.println("That is a D");
     else if (dblAverage > 69.4) System.out.println("That is a C");
     else if (dblAverage > 79.4) System.out.println("That is a B");
     else System.out.println("That is a A");
     */
     
     String strPerson1 = "scissors";
     String strPerson2 = "scissors";
     
     if (strPerson1.equals("rock") && strPerson2.equals("paper"))
      System.out.println("Perosn One Wins");
     else if (strPerson1.equals("paper") && strPerson2.equals("rock"))
      System.out.println("Person Two Wins");
     else if (strPerson1.equals("scissors") && strPerson2.equals("paper"))
      System.out.println("Person One Wins");
     else if (strPerson1.equals("rock") && strPerson2.equals("scissors"))
      System.out.println("Person One Wins");
     else if (strPerson2.equals("paper") && strPerson1.equals("scissors"))
      System.out.println("Person Two Wins");
     else if (strPerson2.equals("scissors") && strPerson1.equals("paper"))
      System.out.println("Person Two Wins");
     else if (strPerson2.equals("scissors") && strPerson1.equals("rock"))
      System.out.println("Person Two Wins");
     else if (strPerson2.equals("rock") && strPerson1.equals("scissors"))
      System.out.println("Person Two Wins");      
     else System.out.println("Draw");
     
     
    }
     
}    