package javaquestionsbasics;
import java.util.*;

public class GCDandLCM {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		
		int on1 =num1;
		int on2 = num2;
		
		while(num1%num2!=0) {
			int rem = num1%num2;
			num1=num2;
			num2=rem;
		}
		int gcd= num2;
		int lcm=(on1*on2)/gcd;
		System.out.println(gcd);
		System.out.println(lcm);
		
	}

}
