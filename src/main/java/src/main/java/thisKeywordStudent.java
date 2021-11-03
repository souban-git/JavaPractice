package src.main.java;
class thisKeywordStudent{  
	int rollno;  
	String name,course;  
	float fee;  
	thisKeywordStudent getStudent(){
		return this;
	}
	thisKeywordStudent(int rollno,String name,String course){  
		this.rollno=rollno;  
		this.name=name;  
		this.course=course;  
	}  
	thisKeywordStudent(int rollno,String name,String course,float fee){  
//		this.fee=fee;  
		this(rollno,name,course);//C.T.Error  
	}  
	void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}  
}  
class TestThis8{  
	public static void main(String args[]){  
		thisKeywordStudent s1=new thisKeywordStudent(111,"ankit","java");  
		thisKeywordStudent s2=new thisKeywordStudent(112,"sumit","java",600f);  
		s1.display();  
		s2.display();  
		s2.getStudent().display();
	}
}
