package While;
public class fivevalues {
	public static void main(String[] args) {
		int n =1;
		int count=1;
		while(count<=5) {
		if(n%2==0 && n%3==0 && n%5==0) {
			System.out.println(n);
			count++;
		}
		n++;
		}
	}
}
//Write a program to print the first 5 values which are divisible by 2,3 and 5. 
