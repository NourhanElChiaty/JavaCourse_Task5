import java.util.Scanner;

public class Task5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []numbers;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("please enter the number of digits");
        int size= scan.nextInt();
        numbers = new int[size];
        
        
        for(int i=0 ;i<size ;i++) 
        {
        	
       	 System.out.println("please enter number");
       	 
       	 int number=scan.nextInt();
       	
       	 numbers[i]=number;
       	
        }
        
        System.out.println("please enter the number you're searching for");
        int search= scan.nextInt();
        
        for(int i=0 ;i<size ;i++) 
        {
        	
        	if(numbers[i]==search) 
        	{
        		
        		System.out.println("you've found it at : "+i);
        		
        	}
        	else 
        	{
        		System.out.println("sorry not found at : "+i);
        		
        	}
        	
        } 
        scan.close();
	}

}
