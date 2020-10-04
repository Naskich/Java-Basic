
/*
 * 2.	Passed
Write a program, which takes as an input a grade and prints "Passed!"
 if the grade is equal or more than 3.00.
Input
The input comes as a single floating-point number.
Output
The output is either "Passed!" if the grade is equal or more than 3.00, 
otherwise you should print nothing.
Examples
Input	Output		Input	Output
5.32	Passed!		2.34	(no output)
*/
import java.util.Scanner;
public class Passed2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double grade = Double.parseDouble(scanner.nextLine());
		if (grade>=3 && grade<7) {
			System.out.print("Passed!");
		} else {
			System.out.print("");
		}
	}
}
