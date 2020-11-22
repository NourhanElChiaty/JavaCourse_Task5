import java.util.Scanner;

public class Task5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scan grade
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int number = scan.nextInt();
		
		//multiplication table
		for(int i =1 ; i<=12 ;i++) {
			
			int result = number*i;
			System.out.println(number+" "+"multiply"+" "+ i +" equals: \n" +result);
		}
		scan.close();
	}

}
