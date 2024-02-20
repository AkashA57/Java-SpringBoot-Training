package hash;

public class StringHashcode {

	public static void main(String[] args) {
		
		String str1 = "India";
		String str2 = "India";
		String str3 = new String("India");

		if(str1!=str2) {
			System.out.println("str1!=str2 is different");
		}
		if(str2!=str3) {
			System.out.println("str2!=str3 is different");
		}
		
		System.out.println("str1.hashCode() = " + str1.hashCode());
		System.out.println("str2.hashCode() = " + str2.hashCode());
		System.out.println("str3.hashCode() = " + str3.hashCode());
	}

}
