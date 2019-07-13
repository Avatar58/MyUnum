package week3.Day2;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collection_SetList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> Names = new ArrayList<>();
		Names.add("Lakshmikant");
		Names.add("Aananthi");
		Names.add("Lakshmikant");
		Names.add("Lakshmikant");
		Names.add("Suseela");
		System.out.println("Unique names are :");
		Set<String> NameList = new TreeSet<>(Names);
		//Collections
		
		for(String name :NameList){
			
			System.out.println(name);
		}
		
		/*int size = NameList.size();
		System.out.println(size);
		
		int size1  = Names.size();
		int size2 = NameList.size();
		
		int size3= size1-size2;
		System.out.println(size3);*/
		
		
		/*int count=0;
		
		for(int i=0;i<size;i++) {			
			for(int j=i;j<size;j++) {
				if(Names.get(i).equals(Names.get(j)))			
				count = count+1;
			}
		}
		System.out.println(count);*/
		
		
	}

}

