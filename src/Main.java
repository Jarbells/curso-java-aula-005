import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int employeeNumber, workedHours;
		double valuePerHour, salary;
		
		employeeNumber = sc.nextInt();
		workedHours = sc.nextInt();
		valuePerHour = sc.nextDouble();
		
		salary = workedHours * valuePerHour;
		
		System.out.println("NUMBER = " + employeeNumber);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		sc.close();
	}
}
