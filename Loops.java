import java.util.Scanner; 
public class Loops {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner (System.in);
      String input = in.nextLine();
      int i = Integer.parseInt(input);
      int counter = 0;
		int rNum = (int)(Math.random() * 7163);
		while (rNum != i)
      {
      rNum = (int)(Math.random() * 7163);
      counter++;
      
      }
		System.out.println(counter);

	}

}
