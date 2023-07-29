package Day11;

import java.util.Scanner;

public class Demo4 {

	public static void main(String[] args) throws AgeException{
		// TODO Auto-generated method stub
		Scanner se=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=se.nextLine();
		System.out.println(name);
		System.out.println("Enter your age");
		int age=se.nextInt();
		if(age>18) {
			System.out.println("Elegible to vote");
		}
		else {
			throw new NullPointerException("Age is not eligible");
		}
		System.out.println("Enter your gender");
		String gender=se.next();
		System.out.println(gender);
	}

}
