package File_handling;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Serial_data {

	public static void main(String[] args) {
		Employee emp=new Employee(101,"anu");
		Employee emp1=new Employee(102,"Mahe");

		try
		{
			FileWriter fw=new FileWriter("employee.txt");
			BufferedWriter bf=new BufferedWriter(fw);
			bf.write(emp.toString());
			bf.newLine();
			bf.write(emp1.toString());
			bf.newLine();
			bf.close();
			bf.close();
			fw.close();
			System.out.println("done");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		// TODO Auto-generated method stub

	}

}
