package OOP.Lab3;
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

public class Lab3 {
	public static void main(String[] args) throws FileNotFoundException{
		String name, id, gender, prog; int credit, hours;
		int UGcred = 132;
		int Gcred = 36;
		Scanner fin = new Scanner(new FileReader("lab3.txt"));
		PrintWriter fout1 = new PrintWriter("student.txt");
		PrintWriter hoursLeft = new PrintWriter("studentLeftHour.txt");
		PrintWriter mout = new PrintWriter("maleStudent.txt");
		PrintWriter search = new PrintWriter("search.txt");
		String ch[] = {"Graduate", "Undergraduate"};

		String input = (String)JOptionPane.showInputDialog(null, "Select a student program","Search Box",JOptionPane.QUESTION_MESSAGE,null,ch,ch[0]);
		while (fin.hasNext())
		{
			id = fin.next();
			name = fin.next();
			gender = fin.next();
			prog = fin.next();
			credit = fin.nextInt();
			if (prog.equals("undergrad"))
				hours = UGcred - credit;
			else 
				hours = Gcred - credit;
			fout1.println(id + " " + name + " " + gender + " " + prog +  " " + credit);
			hoursLeft.println(id + " " + name + " " + gender + " " + prog +  " " + credit + " " + hours);
			if (gender.equals("male"))
				mout.println(id + " " + name + " " + gender + " " + prog +  " " + credit);
			if (input.equals("Graduate"))
			{
				if(prog.equals("grad"))
					search.println(id + " " + name + " " + gender + " " + prog +  " " + credit);
			}
			else if (input.equals("Undergraduate"))
			{
				if (prog.equals("undergrad"))
					search.println(id + " " + name + " " + gender + " " + prog +  " " + credit);
			}
		}
		fout1.close();
		hoursLeft.close();
		mout.close();
		search.close();
	}
}
