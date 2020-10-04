
/*8.	Divisible by 3
Write a program, which prints all the numbers from 1 to 100,
 which are divisible by 3. You have to use a single for loop.
  The program should not receive input.
 * */
public class Divisibleby3 {
	public static void main(String[] args) {
		for (int i = 1; i <=100; i++) {
			if (i%3==0) {
				System.out.println(i);
			}
		}
	}
}
