package src.main.java;
class J2thisKeywordStudent{  
	int rollno;  
	String name,course;  
	float fee;  
	J2thisKeywordStudent getStudent(){
		return this;
	}
	J2thisKeywordStudent(int rollno,String name,String course){  
		this.rollno=rollno;  
		this.name=name;  
		this.course=course;  
	}  
	J2thisKeywordStudent(int rollno,String name,String course,float fee){  
//		this.fee=fee;  
		this(rollno,name,course);//C.T.Error  
	}  
	void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}  
}  
class TestThis8{  
	public static void main(String args[]){  
		J2thisKeywordStudent s1=new J2thisKeywordStudent(111,"ankit","java");  
		J2thisKeywordStudent s2=new J2thisKeywordStudent(112,"sumit","java",600f);  
		s1.display();  
		s2.display();  
		s2.getStudent().display();
	}
}
