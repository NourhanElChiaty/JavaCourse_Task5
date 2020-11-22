import java.util.Scanner;

public class Task5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int []numbers;
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the number of digits");
        int size= scan.nextInt();
        numbers = new int[size];
        
        int sum = 0;
        int average;
        for(int i=0 ;i<size ;i++) {
        	 System.out.println("please enter number");
        	int number=scan.nextInt();
        	
        	numbers[i]=number;
        	
        	sum+=numbers[i];
        	
        	
        }
        average = sum/size;
        System.out.println("the Total is:  "+sum);
        
        System.out.println("the Average is:  "+average);
        
        scan.close();
	}
	
	

}
