
/*9.	Sum of Odd Numbers
Write a program that prints the next n odd numbers (starting from 1)
 and on the last row prints the sum of them.
Input
On the first line, you will receive a number – n. 
This number shows how many odd numbers you should print.
Output
Print the next n odd numbers, starting from 1, separated by new lines.
 On the last line, print the sum of these numbers.
Constraints
•	n will be in the interval [1…100]
Examples
Input	Output		Input	Output
5	1
3
5
7
9
Sum: 25		3	1
3
5
Sum: 9
 * */
import java.util.Scanner;
public class SumofOddNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		int a = 0;
		int sum = 0;
		while (a<n) {
			for (int i = 1; i< 100; i+=2) {
				a++;
				if (i%2!=0) {
						System.out.println(i);
						sum +=i; 
						
						if (a==n) {
							break;
					}
				}
			}
			System.out.println("Sum: "+sum);
		} 
	}
}
