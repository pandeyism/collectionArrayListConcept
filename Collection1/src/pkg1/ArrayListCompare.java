package pkg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {
	
	public static void main(String[] args) {
		
		//1.sort and then equals
		ArrayList<String> L1=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> L2=new ArrayList<String>(Arrays.asList("A","B","C","D"));
		
		Collections.sort(L1);
		Collections.sort(L2);
		
		System.out.println(L1.equals(L2));
		
		//2.Compare two list and find out the additional elements
		
		ArrayList<String> L3=new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> L4=new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		L4.removeAll(L3);
		System.out.println(L4); //E
		
		//3.Find out the common elements
		
		ArrayList<String> firstLanguage=new ArrayList<String>(Arrays.asList("Java","RUBY","C#","Python","Java Script"));
		ArrayList<String> secondLanguage=new ArrayList<String>(Arrays.asList("Java","RUBY","C#","PHP"));
		
		
		firstLanguage.retainAll(secondLanguage);
		System.out.println(firstLanguage);
		
		
		
		
		
	}

}
