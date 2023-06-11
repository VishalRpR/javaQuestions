package javaquestionsbasics;
import java.util.*;
public class RotateNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		
		
		
		int temp=n;
		int count=0;
		while(temp!=0) {
			temp=temp/10;
		    count++;
			}
		
		k=k%count;
		if(k<0) {
			k=k+count;
		}
		
		/*
		 *my version 
		int div=(int)Math.pow(10, k);
		int rot=n%div;
	    int rotremaining=n/div;
	    int newrr = rotremaining+rot*(int)Math.pow(10,count-k);
		System.out.println(newrr);
		
		*/
		
		int div =1;
		int mult=1;
		for (int i = 1; i <=count; i++) {
			if(i<=k){
				div=div*10;
				
			}else {
				
			 mult=mult*10;
			}
			
		}
		
		int q= n/div;
		int r = n%div;
		
		int rot =r*mult+q;
		System.out.println(rot);
		
	
		

	}

}
