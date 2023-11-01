import java.util.Scanner;
import java.time.Year;

public class Objective4Lab3 {
	public static void main(String[] args) {
		int birthYear, age;
		
		Year currentYear = Year.now();
		int yearValue = currentYear.getValue();

		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		age = input.nextInt();
		birthYear = yearValue - age;
		System.out.println("You were born in " + birthYear);


	}
}