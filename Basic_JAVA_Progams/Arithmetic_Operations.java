								/* Arithmetic Operations.....!  */

package java_programs;

import java.util.Scanner;
public class Arithmetic_Operations {

	public static void main(String[] args) {
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Tow Numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Addition of Two Num: "+(a+b));
		
		System.out.println("Addition of Two Num: "+(a-b));
		
		System.out.println("Addition of Two Num: "+(a*b));
		
		System.out.println("Addition of Two Num: "+(a/b));
		
		System.out.println("Addition of Two Num: "+(a%b));
		
	}
}
