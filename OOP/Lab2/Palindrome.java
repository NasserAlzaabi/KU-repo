package OOP.Lab2;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int x, i;
		String input;

		System.out.print("Please enter any string or quit to exit\n");
		do 
		{
			input = console.nextLine().toLowerCase();
			x = input.length() - 1;
			i = 0;
			if ((input.equals("quit")))
				break;
			while (x > 0)
			{
				if (input.charAt(i) == input.charAt(x))
				{
					x -= 1;
					i += 1;
				}
				else
					break;
			}
			if (x == 0)
				System.out.print(input + " is a palindrome. \n");
			else 
				System.out.print(input + " is not a palindrome. \n");
		} while (true);
		System.out.print("Goodbye");
	}
}
