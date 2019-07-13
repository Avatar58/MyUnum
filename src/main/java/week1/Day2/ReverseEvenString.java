package week1.Day2;

public class ReverseEvenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="I am a software Tester";
		String reverse=" ";
		String[] split = name.split(" ");
		int size=name.length();
				
		for(int i = 0 ; i<size;i++)
		{
			String word =split[i];
			 
			 for(int j=size-1;j>0;j--) {
				 
				 reverse=reverse+word.charAt(j);
				 
			 }
			/*
			if(i%2==0) 
				{
				reverse = reverse+array[i];
				
				}*/
			
				
			}
		System.out.println(reverse);
			
				
		
		}
		}
		
			
		

	


