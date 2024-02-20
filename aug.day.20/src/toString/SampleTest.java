package toString;

public class SampleTest {

	 public static void main(String args[]) throws Exception {
	      Class c = Class.forName("DemoTest");
	      Object obj = c.newInstance();
	      Method method = c.getDeclaredMethod("sampleMethod", null);
	      method.setAccessible(true);
	      method.invoke(obj, null);
	   }
	}

