import java.util.Scanner;

public class Sums {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.println("Enter 2 numbers to be added together:");
		int num1 = user.nextInt();
		int num2 = user.nextInt();
		user.close();
		
		int result = num1 + num2;
		System.out.println(result); //prints result
		

	}
}
