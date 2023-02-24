package OOP.Lab4;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args)
	{
		EmployeeInfo emp1 = new EmployeeInfo();
		EmployeeInfo emp2 = new EmployeeInfo();
		EmployeeInfo emp3 = new EmployeeInfo();
		EmployeeInfo emp4 = new EmployeeInfo();
		Scanner console = new Scanner(System.in);

		emp1.constructor(111, "Ahmad", "Full", 35, 40);
		emp2.constructor(222, "Khalid", "Part", 30, 32);
		emp3.constructor();
		emp3.setID(333); emp3.setName("Sara"); emp3.setType("Full"); emp3.setRate(35); emp3.setHours(45);
		emp4.constructor(444,"Amal", "Full"); 
		System.out.print("Enter employee rate: ");
		emp4.setRate(console.nextInt());
		System.out.print("Enter worked hours: ");
		emp4.setHours(console.nextInt());

		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		emp1.calc_Salary(); emp2.calc_Salary(); emp3.calc_Salary(); emp4.calc_Salary();
		emp1.Display(); emp2.Display(); emp3.Display(); emp4.Display();
	}
}

class EmployeeInfo
{
	private int ID, rate, salary, workedHours;
	private String name, empType;

	public void constructor(){ }

	public void constructor(int id, String n, String type,int r, int hours){
		ID = id;
		workedHours = hours;
		name = n;
		rate = r;
		empType = type;
	}

	public void constructor(int id, String n, String type){
		ID = id;
		name = n;
		empType = type;
	}

	public void calc_Salary(){
		if (empType.equals("Part"))
			salary = rate * workedHours;
		else if (empType.equals("Full") && workedHours >= 40)
			salary = 500 + (workedHours - 40) * rate;
		else if (empType.equals("Full") && workedHours < 40)
		{
			System.out.println(name + ", you worked less than 40 hours");
			salary = 500;
		}
	}

	public void Display(){
		System.out.println(ID + "\t" + name + "\t" + empType + "\t" + workedHours + "\t" + rate + "\t" + salary);
	}

	public String toString(){
		return("Employee Info [ID=" + ID + ", Name=" + name + ", emp_type=" + empType + ", worked_hours=" + workedHours + ", rate=" + rate + "]");
	}

	public void setID(int id){
		ID = id;
	}

	public int getID(){
		return(ID);
	}

	public void setName(String n){
		name = n;
	}

	public String getName(){
		return(name);
	}
	
	public void setHours(int h){
		workedHours = h;
	}

	public int getHours(){
		return(workedHours);
	}

	public void setRate(int r){
		rate = r;
	}

	public int getRate(){
		return(rate);
	}

	public void setType(String t){
		empType = t;
	}

	public String getType(){
		return(empType);
	}

	public int getSalary(){
		return(salary);
	}
}


