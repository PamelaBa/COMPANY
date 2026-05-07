package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emplo = new Employee();
		
		
		System.out.print("Name: ");
		emplo.name = sc.nextLine();
		System.out.print("Gross salary: ");
		emplo.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		emplo.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + emplo);
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emplo.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updare data: " + emplo);
		
		
		
		sc.close();
		
		
		
		

	}

}
