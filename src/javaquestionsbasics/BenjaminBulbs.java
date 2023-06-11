package javaquestionsbasics;
import java.util.Scanner;

public class BenjaminBulbs {

	public static void main(String[] args) {
		// You have to print perfect squares between range(benjamin bulb)
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for(int i=1; i*i<=n; i++) {
			System.out.println(i*i);
		}
		

	}

}
