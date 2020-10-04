
/*4.	Back in 30 Minutes
Every time Stamat tries to pay his bills he sees on the cash desk the sign:
 "I will be back in 30 minutes". One day Stamat was sick of waiting and decided
  he needs a program, which prints the time after 30 minutes. That way he won’t
   have to wait on the desk and come at the appropriate time. He gave the assignment
    to you, so you have to do it.
Input
The input will be on two lines. On the first line, 
you will receive the hours and on the second you will receive the minutes.
Output
Print on the console the time after 30 minutes. The result should be in format "hh:mm". 
The hours have one or two numbers and the minutes have always two numbers
 (with leading zero).
 
Constraints
•	The hours will be between 0 and 23.
•	The minutes will be between 0 and 59.
Examples
Input	Output		Input	Output		Input	Output		Input	Output		Input	Output
1
46	2:16		0
01	0:31		23
59	0:29		11
08	11:38		11
32	12:02
Hints
•	Add 30 minutes to the initial minutes, which you receive from the console. 
If the minutes are more than 59 – increase the hours with 1 and decrease the
 minutes with 60. The same way check if the hours are more than 23. When you
  print check for leading zero.

 * */
import java.util.Scanner;
public class BackInMinutes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int hoursTime = Integer.parseInt(scanner.nextLine());
        int hoursPlus=0;
        if (hoursTime>=0 && hoursTime<=23){
            int minutesTime = Integer.parseInt(scanner.nextLine());
            if (minutesTime>=0 && minutesTime<=59){

                if (minutesTime>=30){
                    minutesTime=minutesTime+30;
                    if (minutesTime>59){
                        minutesTime=minutesTime-60;
                        hoursPlus+=1;
                        hoursTime=hoursTime+hoursPlus;
                    }
                    if (hoursTime>23){
                        hoursTime=0;
                    }
                } else {
                    minutesTime=minutesTime+30;
                }
                if (minutesTime>0 && minutesTime<10){
                    System.out.print(hoursTime+":0"+minutesTime);
                } else {
                    System.out.print(hoursTime+":"+minutesTime);
                }
            } else {
                System.out.println("Invalid parameter for hours!\nPlease o to 23!");
            }
        } else {
            System.out.println("Invalid parameter for hours!\nPlease o to 23!");
        }
    }
}