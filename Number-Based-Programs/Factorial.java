package java_programs;

import java.util.Scanner;
public class Factorial {
	
	public int fact(int n){
	int fact=1;
	while(n>0) {
		fact=fact*n;
		n--;
	}
	return fact;
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		Factorial f = new Factorial();
		System.out.println(f.fact(n));
	}
}
