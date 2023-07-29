package Day11;

import java.util.Scanner;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner se=new Scanner(System.in);
		System.out.println("Welcom");
		System.out.println("Enter user Name");
		String userName=se.next();
		System.out.println("Enter password");
		String password=se.next();
		try {if(userName.equals("mano")&&password.equals("sri")) {
			System.out.println("You are login");
		}
		else {
			throw new NullPointerException("Enter credential is worng");
		}
		}
		catch(Exception e) {
			System.out.println("you can not login");
		}
		
		System.out.println("thank you");
	}

}
