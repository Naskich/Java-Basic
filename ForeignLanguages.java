
/*6.	Foreign Languages
Write a program, which prints the language, that a given country speaks.
 You can receive only the following combinations: English is spoken in England and USA;
Spanish is spoken in Spain, Argentina and Mexico; for the others, we should print "unknown".
Input
You will receive a single country name on a single line.
Output
Print the language, which the country speaks, or if it is unknown for your program,
 print "unknown".
Examples
Input	Output		Input	Output
USA	English		Germany	unknown
Hint
Think how you can merge multiple cases,
 in order to avoid writing more code than you need to.
 * */
import java.util.Scanner;
public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameCountry = scanner.nextLine();
        if (nameCountry.equals("England") || nameCountry.equals("USA")) {
            System.out.print("English");
        } else if (nameCountry.equals("Spain") || nameCountry.equals("Argentina")|| nameCountry.equals("Mexico")){
            System.out.print("Spanish");
        } else {
            System.out.print("unknown");
        }
    }
}