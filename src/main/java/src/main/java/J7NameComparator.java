package src.main.java;

import java.util.*;  
class J7NameComparator implements Comparator<J7Student>{  
	public int compare(J7Student s1,J7Student s2){  
		return s1.name.compareTo(s2.name);  
	}  
}  