package src.main.java;

import java.util.Map;
import java.util.TreeMap;

public class J8TreeMap {
	public static void main(String args[]) {  
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		map.put(100,"Amit");    
		map.put(102,"Ravi");    
		map.put(101,"Vijay");    
		map.put(103,"Rahul");   
		System.out.println("Before invoking remove() method");  
		for(Map.Entry m:map.entrySet())  
		{  
			System.out.println(m.getKey()+" "+m.getValue());      
		}  
//		map.remove(102);      
		System.out.println("After invoking remove() method");  
		for(Map.Entry m:map.entrySet())  
		{  
			System.out.println(m.getKey()+" "+m.getValue());      
		}  

		//Maintains descending order  
		System.out.println("descendingMap: "+map.descendingMap());  
		//Returns key-value pairs whose keys are less than or equal to the specified key.  
		System.out.println("headMap: "+map.headMap(102,true));  
		//Returns key-value pairs whose keys are greater than or equal to the specified key.  
		System.out.println("tailMap: "+map.tailMap(102,true));  
		//Returns key-value pairs exists in between the specified key.  
		System.out.println("subMap: "+map.subMap(100, false, 102, true)); 
		
		System.out.println("firstentry: "+map.firstEntry()); 
		System.out.println("lastEntry: "+map.lastEntry()); 
		System.out.println("lowerEntry: "+map.lowerEntry(101)); 
		System.out.println("higherEntry: "+map.higherEntry(103)); //null if last element
		
		
	}  
}  

