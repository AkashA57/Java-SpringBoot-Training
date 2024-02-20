package iteration;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		// Write a program to print first 10 natural numbers
		int i=1;
		
		while(i<11)
		{
			if (i==4){
				i++;
			continue;
		}
		System.out.println(i+"  hello");
		i++;
		} 
	}

}
