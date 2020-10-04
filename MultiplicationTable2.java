
/*11.	Multiplication Table 2.0
Rewrite you program so it can receive the multiplier from the console. 
Print the table from the given multiplier to 10. If the given multiplier
 is more than 10 - print only one row with the integer, the given multiplier
  and the product. See the examples below for more information.
Output
Print every row of the table in the following format:
{theInteger} X {times} = {product}
Constraints
•	The integer will be in the interval [1…100]
Examples
Input	Output		Input	Output		Input	Output
5
1	5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
5 X 4 = 20
5 X 5 = 25
5 X 6 = 30
5 X 7 = 35
5 X 8 = 40
5 X 9 = 45
5 X 10 = 50		2
5	2 X 5 = 10
2 X 6 = 12
2 X 7 = 14
2 X 8 = 16
2 X 9 = 18
2 X 10 = 20		2
14	2 X 14 = 28
 * */
import java.util.Scanner;
public class MultiplicationTable2 {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int numberFirst = Integer.parseInt(scanner.nextLine());
			int numberSecond = Integer.parseInt(scanner.nextLine());
			int sum=0;
			if (numberSecond>10) {
				sum = numberFirst*numberSecond;
				System.out.println(numberFirst+" X "+ numberSecond +" = "+ sum);
			} else {
				for (int i = numberSecond; i <= 10; i++) {
					sum = numberFirst*i;
					System.out.println(numberFirst+" X "+ i +" = "+ sum);
			}
		}			
	}
}
