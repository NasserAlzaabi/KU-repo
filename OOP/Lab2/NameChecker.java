package OOP.Lab2;


public class NameChecker {
	public static void main(String args[]){
		String name1 = args[0];
		String name2 = args[1];

		char n1 = name1.charAt(0);
		char n2 = name2.charAt(0);
		int length;

		System.out.print("your name is: " + name1 + " " + name2 + "\n");
		length = name1.length() + name2.length();
		System.out.print("Your name contains " + length + " letters\n");
		if (!Character.isUpperCase(n1) || !Character.isUpperCase(n2))
			System.out.print("You should capitilize the first letter of your name");
	}
}
