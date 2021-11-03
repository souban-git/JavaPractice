package src.main.java;
public class JavaOperators {

	public static void main(String[] args) {
		JavaOperators jo = new JavaOperators();
		jo.displayNum(10, 12);

	}

	
	public void displayNum(int x,int y){
		System.out.println(x++);//10 (11)  
		System.out.println(++x);//12  
		System.out.println(x--);//12 (11)  
		System.out.println(--x);//10 
		System.out.println(x++ + ++x);//10+12=22  
		System.out.println(~x);//-11 (*-1 -1)
		System.out.println(x-y);
		System.out.println(x/y);
		System.out.println(x%y);
		int c=20;
		x=10; y=5;
		System.out.println(x>y||x++<c);//true || true = true  
		System.out.println(x);//10 because second condition is not checked  
		System.out.println(x>y|x++<c);//true | true = true  
		System.out.println(x);//11 because second condition is checked  
	}
}
