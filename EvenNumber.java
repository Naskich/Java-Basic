
/*12.	Even Number
Take as an input an even number and print its absolute value.
 If the number is odd, print "Please write an even number."
  and continue reading numbers.
Examples
Input	Output		Input	Output
1
3
6	Please write an even number.
Please write an even number.
The number is: 6		-6	The number is: 6
 * */
import java.util.Scanner;
public class EvenNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = Integer.parseInt(scanner.nextLine());		
		if (number%2==0) {
			if (number<0) {
				number=number*(-1);
				System.out.println("The number is: "+ number);
			} else {
				System.out.println("The number is: "+ number);
			}	
		} else {
			while (number%2!=0) {	
				System.out.println("Please write an even number.");
				number = Integer.parseInt(scanner.nextLine());
				if (number%2==0) {
					if (number<0) {
						number=number*(-1);
						System.out.println("The number is: "+ number);
						break;
					} else {
						System.out.println("The number is: "+ number);
						break;
					}
				}
			}
		}
	}
}
