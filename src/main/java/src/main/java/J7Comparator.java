package src.main.java;

import java.util.ArrayList;
import java.util.Collections;

public class J7Comparator {
	public static void main(String args[]){  
		//Creating a list of students  
		ArrayList<J7Student> al=new ArrayList<J7Student>();  
		al.add(new J7Student(101,"Vijay",23));  
		al.add(new J7Student(106,"Ajay",27));  
		al.add(new J7Student(105,"Jai",21));  

		System.out.println("Sorting by Name");  
		//Using NameComparator to sort the elements  
		Collections.sort(al,new J7NameComparator());  
		//Traversing the elements of list  
		for(J7Student st: al){  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  

		System.out.println("sorting by Age");  
		//Using AgeComparator to sort the elements  
		Collections.sort(al,new J7AgeComparator());  
		//Traversing the list again  
		for(J7Student st: al){  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
	}
}
