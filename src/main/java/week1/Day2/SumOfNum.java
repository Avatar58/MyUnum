package week1.Day2;

import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        
       int a,b,sum=0;
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter the number :");
       a = obj.nextInt();
       while(a>0)
       {
    	   b = a % 10;
    	   sum =sum+b;
    	   a=a/10;
       }
       System.out.println(sum);
       obj.close();
       
       
       
		


	

}
}