
/*
 * 7.	Theatre Promotions
A theatre is doing a ticket sale, but they need a program to calculate the price of a single ticket. If the given age does not fit one of the categories, you should print "Error!".  You can see the prices in the table below:
Day / Age	0 <= age <= 18	18 < age <= 64	64 < age <= 122
Weekday	12$	18$	12$
Weekend	15$	20$	15$
Holiday	5$	12$	10$
Input
The input comes in two lines. On the first line, you will receive the type of day.
 On the second – the age of the person.
Output
Print the price of the ticket according to the table, or "Error!" 
if the age is not in the table.
Constraints
•	The age will be in the interval [-1000…1000].
•	The type of day will always be valid.
Examples
Input	Output		Input	Output		Input	Output		Input	Output
Weekday
42	18$		Holiday
-12	Error!		Holiday
15	5$		Weekend
122	15$
*/
import java.util.Scanner;
public class TheatrePromotion {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String dayOfWeek = scanner.nextLine();
	        int agePerson = Integer.parseInt(scanner.nextLine());
	        if (agePerson<0 && agePerson>=-1000||
	                agePerson>122 && agePerson<=1000 ||
	                !dayOfWeek.equals("Weekday") &&
	                !dayOfWeek.equals("Weekend") &&
	                !dayOfWeek.equals("Holiday")){
	            System.out.printf("Error!");
	        } else {
	        switch (dayOfWeek) {
	            case "Weekday":
	                if (agePerson >= 0 && agePerson <= 18) {
	                    System.out.printf("12$");
	                }
	                if (agePerson > 18 && agePerson <= 64) {
	                    System.out.printf("18$");
	                }
	                if (agePerson > 64 && agePerson <= 122) {
	                    System.out.printf("12$");
	                }
	                break;
	            case "Weekend":
	                if (agePerson >= 0 && agePerson <= 18) {
	                    System.out.printf("15$");
	                }
	                if (agePerson > 18 && agePerson <= 64) {
	                    System.out.printf("20$");
	                }
	                if (agePerson > 64 && agePerson <= 122) {
	                    System.out.printf("15$");
	                }
	                break;
	            case "Holiday":
	                if (agePerson >= 0 && agePerson <= 18) {
	                    System.out.printf("5$");
	                }
	                if (agePerson > 18 && agePerson <= 64) {
	                    System.out.printf("12$");
	                }
	                if (agePerson > 64 && agePerson <= 122) {
	                    System.out.printf("10$");
	                }
	                break;
	            default:
	                System.out.printf("Error!");
	                break;
	            }
	        }
	    }
	}