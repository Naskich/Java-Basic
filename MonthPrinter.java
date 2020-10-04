/*5.	Month Printer
Write a program, which takes an integer from the console and
 prints the corresponding month.
If the number is more than 12 or less than 1 print "Error!".
Input
You will receive a single integer on a single line.
Output
If the number is within the boundaries print the corresponding month,
otherwise print "Error!".
Examples
Input	Output		Input	Output
2	February		13	Error!
 * */
import java.util.Scanner;
public class MonthPrinter {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthYear = Integer.parseInt(scanner.nextLine());
        switch (monthYear){
            case 1:
                System.out.print("January");
                break;
            case 2:
                System.out.print("February");
                break;
            case 3:
                System.out.print("March");
                break;
            case 4:
                System.out.print("April");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("June");
                break;
            case 7:
                System.out.print("July");
                break;
            case 8:
                System.out.print("August");
                break;
            case 9:
                System.out.print("September");
                break;
            case 10:
                System.out.print("October");
                break;
            case 11:
                System.out.print("November");
                break;
            case 12:
                System.out.print("December");
                break;
            default:
                System.out.print("Error!");
                break;
        }
    }
}
