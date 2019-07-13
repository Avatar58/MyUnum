package week1.Day2;

public class ReplaceALL {

	public static void main(String[] args) {
		
		String name ="$$ welcome to Automation testing day 2 $$";
		System.out.println("Replace other than alphates :" +name.replaceAll("[^A-Za-z]+", " "));
		System.out.println("Replace other than numbers  :" +name.replaceAll("[^0-9]+", " "));
		System.out.println("Replace other than special characters :" +name.replaceAll("[A-Za-z0-9]+", " "));
		
		

	}

}
