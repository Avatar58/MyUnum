package week1.Day1;

public class OddNumber {

	public static void main(String[] args) {
		
		int a;
		int total=0;
		
		for(a=1;a<=10;a++) {
			
		if(a%2!=0) {
			System.out.println(a);
			
			total=total+a;
			}
		}
		System.out.println(total);
}
}
