package javaquestionsbasics;
import java.util.*;

public class InverseOfNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		int inv =0;
		int originalPosition=1;
		while(n!=0) {
			int originalDigit=n%10;
			int inversePosition=originalDigit;
			int inverseDigit=originalPosition;
			
			inv = inv +inverseDigit*(int)Math.pow(10, inversePosition-1);
			n=n/10;
			originalPosition++;
			
		}
		System.out.println(inv);
	}

}
