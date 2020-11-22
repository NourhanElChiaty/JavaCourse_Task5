import java.util.Scanner;

public class Task5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scan grade
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your grade");
		
		char grade = scan.next().charAt(0);
		
		//check entered grade
		grade = Character.toUpperCase(grade);
		if(grade=='A') 
		{
			System.out.println("your grade between 85 & 100");
		}
		
		else if(grade=='B')
		{
			System.out.println("your grade between 75 & 85");
		}
		
		else if(grade=='C') 
		{
			System.out.println("your grade between 50 & 65");
		}
		
		else if(grade=='D') 
		{
			System.out.println("your grade between 0 & 50");
		}
		scan.close();
	}

}
