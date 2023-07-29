package Day11;
import java.util.Scanner;
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner se=new Scanner(System.in);
		String s=se.next();
		try {
		for(int i=0;i<=s.length();i++) {
			System.out.println(s.charAt(i));
		}
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println(s);
	}

}
