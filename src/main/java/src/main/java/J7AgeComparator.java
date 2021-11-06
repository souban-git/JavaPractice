package src.main.java;

import java.util.Comparator;

public class J7AgeComparator  implements Comparator<J7Student>{

	@Override
	public int compare(J7Student s1,J7Student s2){  
		if(s1.age==s2.age)  
			return 0;  
		else if(s1.age>s2.age)  
			return 1;  
		else  
			return -1;  
	}


}
