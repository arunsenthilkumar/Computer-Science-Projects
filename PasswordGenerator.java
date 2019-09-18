
public class PasswordGenerator {

	public static void main(String[] args) 
	{
		
		
		int r1 = 0;
		String Password = "";
		
		while (Password.length() <= 12) 
    	{
      r1 =(int)(Math.random()* 3);
			if (r1 == 0)
		{
			int r2 = (int)((Math.random() * 9) + 1);
			Password += r2;
		}
		
		
		else if (r1 == 1)
		{
			int r3 = (int)((Math.random() * 7) + 1);
			switch (r3) 
			{
			case 1 : Password += "P";
			break; 
			case 2 : Password += "A";
			break;
			case 3 : Password += "N";
			break;
			case 4 : Password += "T";
			break;
			case 5 : Password += "H";
			break;
			case 6 : Password += "E";
			break;
			case 7 : Password += "R";
			break;
			}
		}
		else
		{
			int r4 = (int)(Math.random() * 2);
			if (r4 == 0)
				Password += "!";
			else 
				Password += "$";
		}		
	}
   if ((Password.indexOf("$") >= 0 || Password.indexOf("!") >= 0)&& (Password.indexOf("P") >= 0 ||
                                                                     Password.indexOf("A") >= 0 ||
                                                                     Password.indexOf("N") >= 0 || 
                                                                     Password.indexOf("T") >= 0 ||
                                                                     Password.indexOf("H") >= 0 ||
                                                                     Password.indexOf("E") >= 0 ||
                                                                     Password.indexOf("R") >= 0))
         && Password.indexOf("1") >= 0 || Password.indexOf("2") >= 0 || Password.indexOf("3") >= 0 || 
                                                                        Password.indexOf("4") >= 0 ||
                                                                        Password.indexOf("5") >= 0 ||
                                                                        Password.indexOf("6") >= 0 ||
                                                                        Password.indexOf("7") >= 0 ||
                                                                        Password.indexOf("8") >= 0 ||
                                                                        Password.indexOf("9") >= 0)) 
	System.out.println(Password);
   else 
   {
   new String[] args = new String[0]
}
	
}
