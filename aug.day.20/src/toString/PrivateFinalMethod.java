package toString;

public class PrivateFinalMethod {
	   private void print() {
	      System.out.println("in parent print");
	   }
	   public static void main(String[] args) {

	      PrivateFinalMethod obj = new PrivateFinalMethodChild();
	      obj.print();
	      PrivateFinalMethodChild obj1 = new PrivateFinalMethodChild();
	      obj1.print();
	   }
	}
	class PrivateFinalMethodChild extends PrivateFinalMethod {
	   public void print(){
	      System.out.println("in child print method");
	   }
	}
