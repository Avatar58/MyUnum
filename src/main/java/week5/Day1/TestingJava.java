package week5.Day1;

public class TestingJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
            int count = 12, num1 = 0, num2 = 1;
	        System.out.print("Fibonacci Series of "+count+" numbers:");

	        for (int i = 0; i <= count; ++i)
	        {
	        	System.out.print(num1+" ");
	            int sumOfPrevTwo = num1 + num2;
	            num1 = num2;
	            num2 = sumOfPrevTwo;
	            
	        }
	    }

	}


