package hash;

public class HashDemo2 {
	public static void main(String[] args) {
		String str1="Zaved";
		System.out.println(str1.hashCode());
		
		String str2=new String("Zaved");
		System.out.println(str2.hashCode());
		
		String str3=new String("Zaved");
		System.out.println(str3.hashCode());
		
		System.out.println("****************************");
		Integer i=86123246;
		System.out.println(i.hashCode());//86123246
		Integer i2=new Integer(86123246);
		System.out.println(i2.hashCode());//86123246
	}

}
