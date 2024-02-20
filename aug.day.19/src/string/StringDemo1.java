package string;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1 = "Teiba"; // using String literal(inside Intern Pool)
		String s2 = "Suman";
		String s3 = new String("Gyandeep");// using new operator(inside java heap)
		
		
		System.out.println(2+3+s1); //  5Taiba
		
		
		System.out.println(s1+2+3+4);    //Taiba234  
		
		System.out.println(2+3+7+s1+2+3+7); // 12Taiba237
		
		System.out.println(2+3+7+s1+2+3+7+s2); // 12Taiba237Suman
		
		System.out.println((2+3+7+s1)+(2+3+7+s2)); // 12Taiba12Suman
		
		
		System.out.println(s1+s2); //using String literals-- adding two strings(

		
		
		
		
		System.out.println("_____________________");
		//UPPER CASE CONVERSION METHOD
		String a=s1.toUpperCase();
		 System.out.println(a);

		 System.out.println(s1.toUpperCase()); // same work as above mentioned two
	      
		 System.out.println("_____________________");
		//LENGTH METHOD
		 System.out.println(s1.length());//find length of string(counting will start
		
		 System.out.println(s3.length());//find length of string(counting will start from 1) */

		 System.out.println("_____________________");
		
		 
		 //charAt METHOD
		 char ch=s1.charAt(4);// Teiba
		 System.out.println(s1.charAt(1));     //e
		System.out.println(s1.charAt(3));// print last character from Strings1(static)   //b
		
		
		System.out.println("_____________________");
		//LENGTH METHOD
		 int len=s1.length();
		System.out.println(s1.length());
		 System.out.println(s1.charAt(len-3));// print last character from String s1 (dynamic) */

		
		//charAt method
		String str = "Agile and Scrum";
		for (int x = 0; x < str.length(); x++) {
			char cha = str.charAt(x);
			System.out.println("x = " + ch);
		} 
	
		
		//SUBSTRING METHOD
		String str1 = "Agile and scrum ";
		String substr = str1.substring(1, 4);
		 System.out.println("Sub String is===" + substr);   //gil
		
		 System.out.println("_____________________");
			
		//SPLIT METHOD
		
		  String str2 = "java Spring Hibernate JSP"; 
		  String strTokens[]=str2.split(" "); 
		  for(String t:strTokens) 
		  { 
			  System.out.println(t);
		  }
		 
	
		 
		//equals() and == operator
		
		 String s4=new String("abc"); String s5=new String("abc");
		 System.out.println(s4==s5);
		 
		 
		 String s6=new String("abc"); String s7=new String("abc");
		 System.out.println(s6.equals(s7));
		 
		
		//indexOf method
		String str10="java spring hibernate jsp ";
		int len1=str1.indexOf("hibernate");
		System.out.println("index = "+len);  
	}
}