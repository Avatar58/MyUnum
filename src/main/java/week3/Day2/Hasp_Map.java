package week3.Day2;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Hasp_Map {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String Name ="cognizant Technology solutions Ltd india";
		
		char[] array = Name.toCharArray();
		
		Map<Character,Integer> HM= new HashMap<>();
		
		for (int i=0; i<array.length;i++) 
		{
			if (HM.containsKey(array[i])) 
			{
				HM.put(array[i],HM.get(array[i])+1);//(c,c+1)///need to ask clarifications
			}
			else {
				HM.put(array[i], 1);//(c,c+1)///need to ask clarifications
			}
		}
		for (Entry <Character, Integer> eachEntry: HM.entrySet()) {
			System.out.println("Key : " +eachEntry.getKey()+ " Value : "+eachEntry.getValue());
		}
		
	
	}
	
}