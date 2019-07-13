package week1.Day2;

import java.util.Scanner;

public class Fibonicci {
	
	

	public static void main(String[] args) {
		
		int num1=0;
		int num2=1;
		int sum;
		int count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		count=sc.nextInt();
		int i=1;
		for(i=1;i<=count;i++) {
			
			System.out.println(num1+" ");
			sum =num1+num2;
			num1=num2;
			num2=sum;
			//i++;
			
		}
		sc.close();

    
    }

}
