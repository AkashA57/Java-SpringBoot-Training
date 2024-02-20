package hash;

public class HashDemo3 {
	public static void main(String[] args) {
		String str1="Zaved";
		System.out.println(str1.hashCode());
		
		String str2=new String("Zaved");
		System.out.println(str2.hashCode());
		
		String str3=new String("Zaved");
		System.out.println(str3.hashCode());
		
		System.out.println("Output of Interger .......");
		 Integer i= 86123246; 
		 System.out.println(i.hashCode());
		
		  Integer i1= new Integer(1000); 
		 System.out.println(i1.hashCode());
		 
		 
		

	}
}
