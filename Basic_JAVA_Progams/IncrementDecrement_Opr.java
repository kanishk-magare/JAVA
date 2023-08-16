					/* Increment/Decrement Operator */


package java_programs;

public class IncrementDecrement_Opr {

	
	public static void main(String[] args) {
		int a=10,b=10;
		
		System.out.println(a);
		System.out.println("Pre/post Increment...");
		System.out.println(a++);//10
		System.out.println(a);//11
		System.out.println(++a);//12
		
		System.out.println(b);
		System.out.println("Pre/post Decrement...");
		System.out.println(b--);//10
		System.out.println(b);//9
		System.out.println(--b);//8
	}
}
