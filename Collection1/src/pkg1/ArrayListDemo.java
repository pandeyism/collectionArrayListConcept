package pkg1;

import java.util.ArrayList;

//Dynamic Array
//Default Array
//Default virtual capacity of Array list is 10;It can be increased according to the need of programmer

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		//int i[]= new int[3]; // static array, size is fixed
		// i[0]=100;
		// i[1] =200;
		// i[2]=300;
		//// i[3]=400;
		// System.out.println(i[1]);
		// System.out.println(i[4]); //Array index out of bound expection
		 // System.out.println(i[2]);
		
		  // To solve this issue we need to have dynamic array whose size is not fixed
		
		ArrayList<Object> arr= new ArrayList<Object>();
		  arr.add(100); //0st Position ,ArrayList will store the data in the form of index
		  arr.add(200); //1nd Position
		  arr.add("Sanjeev SDET"); //2rd Position
		  arr.add('a'); //3th Position
		  arr.add(true); //4th position
		  arr.add(12.92F); //5th position
		  
		  System.out.println(arr); 
		  System.out.println(arr.get(2));
		  System.out.println(arr.size());
		  System.out.println("Lowest Index" + 0);
		  System.out.println("Highest Index"+ (arr.size()-1));
		  
		  arr.add(300);
		  arr.add(400);
		  System.out.println(arr.size());
		  
		  ArrayList<Integer> Marks=new ArrayList<Integer>();//Generics Wrapper class(Integer), we cant pass int in rectangle box
		  Marks.add(100);
		  Marks.add(40);
		  System.out.println(Marks.size());
		  System.out.println(Marks);
		  
		  ArrayList<String> studentname= new ArrayList<String>();
		  studentname.add("sanjeev");
		  studentname.add("Tom");
		  System.out.println(studentname);
	}

}
