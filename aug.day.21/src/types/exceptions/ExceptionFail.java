package types.exceptions;

public class ExceptionFail {

	public static void main(String[] args) {
		int num1=100;
		int num2=10;
		int num=0;
		try {
			num=num1/num2;//no exception 100/10
			System.out.println("Processing is done");
		}
		catch (Exception e){
				System.out.println(e.getMessage());
			}
		System.out.println("Result num is="+num);
		System.out.println("Welcome"+Thread.currentThread().getName()+"thread");
		}

	}
