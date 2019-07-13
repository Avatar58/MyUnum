package week3.Day2;

import java.util.ArrayList;
import java.util.List;

public class Collections {

	public static void main(String[] args) {
				
		List<String> names = new ArrayList<>();
		names.add("srinivasan");
		names.add("senthilkumar");
		names.add("senthamarai");
		names.add("Lakshmikanth");
		names.add("suseela");
		for (String name : names) 
		{
			if(name.startsWith("s") || name.endsWith("h"))
			{
				System.out.println(name);
		    }
			
		}
	}

}
