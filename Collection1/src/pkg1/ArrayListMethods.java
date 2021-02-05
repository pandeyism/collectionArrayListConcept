package pkg1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {
	
	public static void main(String[] args) {
		
		ArrayList<String> familyNames= new ArrayList<String>();
		familyNames.add("Tinku");
		familyNames.add("Pintu");
		familyNames.add("Babua");
		familyNames.add("Mini Panda");
		familyNames.add("Dodo");
		
		ArrayList<String> typesOfRoses=new ArrayList<String>();
		typesOfRoses.add("Red");
		typesOfRoses.add("Pink");
		typesOfRoses.add("yellow");
		typesOfRoses.add("white");
		typesOfRoses.add("Black");
		
		//familyNames.addAll(typesOfRoses);
		//familyNames.addAll(2,typesOfRoses);
		//ArrayList<String>CloneList=(ArrayList<String>)familyNames.clone();
		
		//System.out.println(familyNames.contains("Pintu"));
		// System.out.println(familyNames.indexOf("Mini Panda")>0);
		
		ArrayList<String>List1=new ArrayList<String>(Arrays.asList("Tom", "Harry", "Lisa","Lucy"));
		System.out.println(List1);
		
		int i=List1.lastIndexOf("Lucy");
		System.out.println(i);
		System.out.println(List1.remove(1));
		System.out.println(List1);
		
		ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10)); //Important
		//remove a number from which is div by2
		numbers.removeIf(num -> num%2 ==1); //==0 will give even number
		System.out.println(numbers);
		
		ArrayList<String> names=new ArrayList<String>(Arrays.asList("sanjeev","sushanti","sanjeev","tom","pandey","python"));
		System.out.println(names);
		
		names.retainAll(Collections.singleton("sanjeev"));
		System.out.println(names);
		ArrayList<Integer> numbers1=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16));
		
		ArrayList<Integer> subList=new ArrayList<Integer>(numbers1.subList(2, 5)); //it will return a set of 
		                                                                            //data between that range
		
		System.out.println(subList);
		
		
		
	}

}
