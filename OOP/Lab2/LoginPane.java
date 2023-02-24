package OOP.Lab2;
import javax.swing.JOptionPane;

public class LoginPane {
	public static void main(String[] args){
	String ID = JOptionPane.showInputDialog("Enter ID");
	String pass = JOptionPane.showInputDialog("Enter Password");
	if (ID.equals("1111") && pass.equals("student1234"))
		JOptionPane.showMessageDialog(null, "Access Granted");
	else
		JOptionPane.showMessageDialog(null, "Access Denied");
	}
}
