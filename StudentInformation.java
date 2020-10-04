
/*
 * 1.Student Information
You will be given 3 lines of input – student name, age and average grade. Your task is to print all the info about the student in the following format: "Name: {student name}, Age: {student age}, Grade: {student grade}".
Examples
Input	Output
John
15
5.40	Name: John, Age: 15, Grade: 5.40
Steve
16
2.50	Name: Steve, Age: 16, Grade: 2.50
Marry
12
6.00	Name: Marry, Age: 12, Grade: 6.00
 * */
import java.util.Scanner;

public class StudentInformation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String namePersent = scanner.nextLine();
		int agePeople = Integer.parseInt(scanner.nextLine());
		double valuable = Double.parseDouble(scanner.nextLine());
 		System.out.printf("Name: %s, Age: %d, Grade: %.2f ",namePersent, agePeople, valuable);
	}

}
