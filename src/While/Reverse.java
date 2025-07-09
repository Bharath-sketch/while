package While;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n =scr.nextInt();
		int sum =0;
		while(n>0) {
			int a =n%10;
			sum = sum+a;
			n =n/10;
		System.out.print(a);
		}
	}

}
