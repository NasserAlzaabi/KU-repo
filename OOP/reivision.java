package OOP;
import java.util.ArrayList;
import java.util.Scanner;

public class reivision {
	public static void main(String args[]){
		ArrayList input = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		input.add(num);		
		while (in.hasNext()) {
			input.add(num);
			num = in.nextInt();
		}

		
	}	
}
