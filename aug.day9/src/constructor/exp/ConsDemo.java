package constructor.exp;

public class ConsDemo {
	  int modelYear;
	  String modelName;
	  public ConsDemo(int year, String name) {
	    modelYear = year;
	    modelName = name;
	  }
	  public static void main(String[] args) {
	    ConsDemo myCar = new ConsDemo(1969, "Mustang");
	    System.out.println(myCar.modelYear + " " + myCar.modelName);
	  }
	}