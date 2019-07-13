package week1.Day2;

public class ReverseString {

	public static void main(String[] args) {
		
		String name ="testleaf";
		String reverse="";
		
		char[] chararray= name.toCharArray();
		
		int length = name.length();
		
		//System.out.println(name.length());
		
		for (int i = length-1; i >= 0; i--) {
			//System.out.println(chararray[i]);
			reverse=reverse+chararray[i];
					
		}
		System.out.println(reverse);
		
		if(name==reverse) {
			
			System.out.println("given name is palindrome");
		}
		else
		{
			System.out.println("Name is not palindrome");
		}
	
	}

}
