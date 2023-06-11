package javaquestionsbasics;
import java.util.*;

public class PrimeFactorization {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n =scn.nextInt();
		
		
		/*
		 * my version
		 * 
		int count = 2;
		while(n !=1) {
			
			if(n%count==0) {
				System.out.println(count);
				n=n/count;
			}else {
				count++;
			}
		}
       */
		
	for (int div = 2; div*div <=n; div++) {
		while(n%div==0) {
			n=n/div;
			System.out.println(div);
					
		}
		
	}
	if(n!=1) {
		System.out.println(n);
	}
		
		
	}

}
