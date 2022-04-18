package dadosFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Funcionario_ {
	public static void main(String arg[]) {
		
		Scanner leitor = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		System.out.println("How many employees will be registared? ");
		int N = leitor.nextInt();
		Employee emp = new Employee();
		for (int i = 0; i < N; i++) {
			System.out.println("Employeer #" + (i + 1) + ":");
			System.out.print("ID:  ");
			Integer id = leitor.nextInt();
			System.out.println("Name:  ");
			leitor.nextLine();
			String name = leitor.nextLine();
			System.out.println("Salary: ");
			
			double salary = leitor.nextDouble();
			 Employee emp1 = new Employee(id, name, salary);
			
			list.add(emp1);
		}
		System.out.println("Enter the employee id that  will have salary increase");
		int idsalary = leitor.nextInt();
        Integer pos = position(list, idsalary);
        
		if (pos == null) {
			System.out.println("This ID does not exist");
			System.out.println();
		} 
		else {
			System.out.println("Enter the percentage:");
			double percent = leitor.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of Employees:");
		System.out.println();
		for (Employee empregado : list) {
			System.out.println(empregado);
		}
	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getid() == id) {
				return i;
			}
		}
		return null;

	}
}