package While;
import java.util.Scanner;
public class palindrome {
	public static void main(String args[]) {
	Scanner scr = new Scanner(System.in);
	System.out.println("Enter the number :");
	int n = scr .nextInt();
	int first =n;
	int reverse =0;
	while(n>0) {
		int a = n%10;
		reverse =reverse*10+a;
		n =n/10;
	}
	if(first == reverse) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}

}
}
