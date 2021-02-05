package pkg1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIteration {
	public static void main(String[] args) {
		
	
	ArrayList<String> friendsList= new ArrayList<String>();
	friendsList.add("Sanjeev"); //0
	friendsList.add("Utkarsh"); //1
	friendsList.add("Arjita"); //2
	friendsList.add("Sushanti"); //3
	friendsList.add("Shalu"); //4
	friendsList.add("Pratik"); //5
	friendsList.add("Rishi"); //6
	friendsList.add("varun"); //7
	friendsList.add("Edinburge"); //8
	
	 //Typical for loop
	
	for(int i=0; i<friendsList.size(); i++) {
		
		System.out.println(friendsList.get(i));
	}
	     System.out.println("$$$$$$$$$$");
	     
	     ///Typical for each loop
	     
	     for(String str : friendsList)
	     {
	    	 System.out.println(str);
	     }
	System.out.println("************");
	
	
	  // Lambada expression with stream
	
	friendsList.stream().forEach(element -> System.out.println(element));
	
	System.out.println("%%%%%%%%%%%%%%%%");
	
	// Using iterator
	
	Iterator<String> it=friendsList.iterator();
	while(it.hasNext())
	{
	System.out.println(it.next());
	
	}
	
	}
}
