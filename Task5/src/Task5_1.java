import java.util.Scanner;

public class Task5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scan grade
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your grade");
		
		int grade = scan.nextInt();
		
		//validate entered grades
		
		if(grade>=85 && grade<=100)
		{
			System.out.println("A");
		}
		
		else if (grade<85 && grade>=75)
		{
			System.out.println("B");
		}
		
		else if (grade>=50 && grade<=65)
		{
			System.out.println("C");
		}
		
		else if (grade>=0 && grade<50) 
			
		{
			System.out.println("D");
		}
		scan.close();
	}
	

}
