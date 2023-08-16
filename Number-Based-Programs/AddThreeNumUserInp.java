									/* Adding 3 Numbers by taking user input.....!  */

package java_programs;

import java.util.Scanner;
public class AddThreeNumUserInp {
	int a;
	int b;
	int c;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		int a = sc.nextInt();
		
		System.out.println("Enter Number 2: ");
		int b = sc.nextInt();
		
		System.out.println("Enter Number 3: ");
		int c = sc.nextInt();
		
		int sum = a + b + c;
		System.out.println("Sum of Three Numbers is: "+sum);
		
	}
}
