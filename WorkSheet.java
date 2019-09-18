//Arun Senthilkumar AP Computer Science Period: 4
public class WorkSheet {

	public static void main(String[] args) {
		
		String str1 = "dog";
		String str2 = "cat";
		String str3 = new String("horse");
		String str4 = "horse";
		String str5 = str3;
		String str6 = "dog";
		String str7 = null;
		String str8 = "";
		System.out.println(str5 == str3);
		System.out.println(str1 == str6);
      
		System.out.println(str1.compareTo(str3));
      System.out.println(str1.compareTo(str4));
		System.out.println(str1.compareTo(str5));
     
      System.out.println(str2.compareTo(str1));
      System.out.println(str2.compareTo(str3));
      System.out.println(str2.compareTo(str4));
      System.out.println(str2.compareTo(str5));
      System.out.println(str2.compareTo(str6));
     
      System.out.println(str6.compareTo(str3));
      System.out.println(str6.compareTo(str4));
      System.out.println(str6.compareTo(str5));
      
      System.out.println(str8.compareTo(str1));
      System.out.println(str8.compareTo(str2));
      System.out.println(str8.compareTo(str3));
      System.out.println(str8.compareTo(str4));
      System.out.println(str8.compareTo(str5));
      System.out.println(str8.compareTo(str6));
      
      System.out.println(str1.equals(str6));
		System.out.println(str1.equals(str1));
	
		System.out.println(str2.equals(str2));
		
		System.out.println(str3.equals(str3));
		System.out.println(str3.equals(str4));
		System.out.println(str3.equals(str5));
		
		System.out.println(str4.equals(str3));
		System.out.println(str4.equals(str4));
		System.out.println(str4.equals(str5));
		
		System.out.println(str5.equals(str3));
		System.out.println(str5.equals(str4));
		System.out.println(str5.equals(str5));
		
		System.out.println(str6.equals(str1));
		System.out.println(str6.equals(str6));
			
		System.out.println(str8.equals(str8));
      
      
      
	}

}
