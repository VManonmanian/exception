package Day11;

public class Demo {
	public static void main(String[] args) {
		System.out.println("welcome");
		int a=5,b=2,c=0;
		System.out.println(a+b+c);
		try {
		System.out.println(a/c);
		
		}
		
		catch(ArithmeticException e) {
			System.out.println("you can not divide a number by zero");
		}
		finally{
			System.out.println(a/b);
			System.out.println("thank you");
		}
		
	}

}
