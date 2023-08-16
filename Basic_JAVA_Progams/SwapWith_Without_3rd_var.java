package java_programs;

public class SwapWith_Without_3rd_var {

	public static void main(String[] args) {
		
		int a= 10;
		int b = 20;
		int c;
	
		System.out.println("with 3rd Operator");
		c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Without");
		
		a=b+a;//30
		b=a-b;//10
		a=a-b;//20
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
