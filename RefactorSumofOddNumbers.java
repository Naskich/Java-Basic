
import java.util.Scanner;
public class RefactorSumofOddNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int sum = 0;
		int count=0;
		for (int i = 1; i <= 10; i+=2) {
			count++;
			System.out.println(i);
			sum+=i;
			if (n==count) {				
				break;	 
			} 
		}
		System.out.printf("Sum: %d%n", sum);
	}
}
