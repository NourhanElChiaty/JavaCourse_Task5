import java.util.Scanner;

public class Task5_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scan numbers
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int firstNumber = scan.nextInt();
		
		System.out.println("Enter second number");
		int secondNumber = scan.nextInt();
		
		//scan operator
		System.out.println("choose operator: *,/,+,-,%");
		char operator =scan.next().charAt(0);
		
		if(operator=='+')
		{
			int sum = firstNumber+secondNumber;
			System.out.println("the summation = "+sum);
		}
		
		else if(operator=='-')
		{
			int minus = firstNumber-secondNumber;
			System.out.println("the difference = "+minus);
		}
		
		else if(operator=='*') 
		{
			int multiply = firstNumber*secondNumber;
			System.out.println("the multiplication = "+multiply);
		}
		
		else if(operator=='/')
		{
			int divide = firstNumber/secondNumber;
			System.out.println("the division = "+divide);
		}
		
		else if(operator=='%') 
		{
			int modulus = firstNumber%secondNumber;
			System.out.println("the modulus = "+modulus);
		}
		
		scan.close();
				
	}

}
