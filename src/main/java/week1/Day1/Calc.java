package week1.Day1;

public class Calc {
	

	public static void main(String[] args) {
		
		Calculator abc = new Calculator();
        int addition = abc.addition(10, 20);
        System.out.println(addition);
        
        int subtract = abc.subtract(20, 10);
        System.out.println(subtract);
        
        int multiply = abc.multiply(10, 20);
        System.out.println(multiply);
        
        int division = abc.division(10, 20);
        System.out.println(division);
	}

}
