package string;

public class ComparingString {

	public static void main(String[] args) {
		
		String str1 = "Agile";
		String str2 = "Agile";
		String str3 = new String("Agile");
		String str4 = new String("Agile");
		String str5 = "Agi" + "le";
		String str = "Agi";
		String str6 = str + "le";
		
		//Case1
		if(str1==str2) {
			System.out.println("Case 1 is true");
		}
		else {
			System.out.println("Case 1 is false");
		}
		System.out.println("______________________");
		
		//Case2
		if(str1==str3) {
			System.out.println("Case 2 is true");
		}
		else {
			System.out.println("Case 2 is false");
		}
		System.out.println("______________________");
		
		//Case3
		if(str1!=str6) {
			System.out.println("Case 3 is true");
		}
		else {
			System.out.println("Case 3 is false");
		}
		System.out.println("______________________");
		
		//Case4
		if(str3!=str4) {
			System.out.println("Case 4 is true");
		}
		else {
			System.out.println("Case 4 is false");
		}
		System.out.println("______________________");
		
		//Case5
		if(str1==str5) {
			System.out.println("Case 5 is true");
		}
		else {
			System.out.println("Case 5 is false");
		}
		System.out.println("______________________");
		
		//Case6
		if(str3==str6) {
			System.out.println("Case 6 is true");
		}
		else {
			System.out.println("Case 6 is false");
		}
	}
}
