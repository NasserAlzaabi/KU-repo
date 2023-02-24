package OOP;
import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("First number: ");
		int a = console.nextInt();
		System.out.print("second number: ");
		int b = console.nextInt();
		System.out.print("Operator: ");
		String sign = console.next();
		if(sign.equals("substraction"))
			System.out.print("Result is: "+(a-b));
		else if (sign.equals("addition"+(a+b)));
	  }
}
