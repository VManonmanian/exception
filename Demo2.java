package Day11;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(s);
		int x = 0;
		try {
		 x=Integer.parseInt(s);
		}
		catch(NumberFormatException e) {
			System.out.println("String can not convert into int");
		}
		System.out.println(x);
		
		
	}

}
