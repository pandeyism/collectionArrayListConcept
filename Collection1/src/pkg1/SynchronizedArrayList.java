package pkg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//How to synchronize ArrayList in java?
//ArrayList is not thread safe(not synchronized) 
//There are two methods to make ArrayList synchronized --------
//1)Collections.synchronizedLis() method----------returns synchronizedList
//2) CopyOnWriteArrayList class--- Thread safe variant of Array List

public class SynchronizedArrayList {
	
	public static void main(String[] args) {
		
		//1.Collections.Synchronized method()
		
		List<String> targetList=Collections.synchronizedList(new ArrayList<String>());
		targetList.add("Sanjeev");
		targetList.add("Programmer");
		targetList.add("FullStack-QA");
		targetList.add("OwnMyDreamJob");
		//During add,remove operation ----we dont need explict synchronization
		//to fetch/traverse the value from this List ----we need explict synchronization
		
		synchronized (targetList) {
			Iterator<String> it=targetList.iterator();
			while(it.hasNext()) {
			System.out.println(it.next());
			
			//2.CopyOnWriteArrayList--its a class --Thread safe synchronized already
			
			CopyOnWriteArrayList<String> empList=new CopyOnWriteArrayList<String>();
			empList.add("Sanjeev Kumat");
			empList.add("Rajeev Kumar");
			empList.add("Biswas Kumar");
			
			Iterator<String> itr=empList.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			
			
			
			
			}
		}
		
	}

}
