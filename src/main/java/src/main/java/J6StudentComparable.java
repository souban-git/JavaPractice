package src.main.java;

	public class J6StudentComparable implements Comparable<J6StudentComparable>{  
		int rollno;  
		String name;  
		int age;  
		J6StudentComparable(int rollno,String name,int age){  
			this.rollno=rollno;  
			this.name=name;  
			this.age=age;  
		}

		@Override
		public int compareTo(J6StudentComparable st) {
			if(age==st.age)  
				return 0;  
			else if(age>st.age)  
				return 1;  
			else  
				return -1;  
		}  
	}  
