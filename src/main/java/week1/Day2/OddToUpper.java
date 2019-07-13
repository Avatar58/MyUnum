package week1.Day2;

public class OddToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "changeme";
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			
			if(i%2!=0) {
				
				System.out.println(Character.toUpperCase(ch));
			}
			else
			{
				System.out.println(Character.toLowerCase(ch));
			}
		}

	}

}
