package week1.Day2;

public class CheckChar {

	public static void main(String[] args) {
		
		String name ="cognizant";
		int count=0;
		char[] chararray= name.toCharArray();
		System.out.println(chararray);
		int lenght=name.length();
		for(int i=0;i<lenght;i++) 
		{
			if(chararray[i]=='a')
			{
				count = count+1;
			   }
		
		}
		System.out.println(count);
		
	
	}

	}
