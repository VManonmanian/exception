package Day11;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("welcome");
		String name=null;
		try {
		System.out.println(name.toUpperCase());
		}
		catch(ArithmeticException e) {
			System.out.println("Mathamtical isue");
		}
		catch(NullPointerException ne) {
			System.err.println("value not present");
			System.out.println(ne);
			ne.printStackTrace();
		}
		System.out.println("Done");
	}

}
