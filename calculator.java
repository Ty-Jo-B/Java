import java.util.Scanner;

public class calculator 
{
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.print("Enter Calculation: ");
		
		int num1 = userInput.nextInt();
		char operator = userInput.next().charAt(0);
		int num2 = userInput.nextInt();

		if (operator == '+') {
			int addition = num1 + num2;
			System.out.println(addition);
		} else if (operator == '-') {
			int subtraction = num1 - num2;
			System.out.println(subtraction);
		} else if (operator == '*') {
			int multiplication = num1 * num2;
			System.out.println(multiplication);
		} else if (operator == '/') {
			int division = num1 / num2;
			System.out.println(division);
		} else if (operator == '%') {
			int remainder = num1 % num2;
			System.out.println(remainder);
		} else {
			System.out.println("Use (+ - * or /) Next Time.");
		}
	}
}