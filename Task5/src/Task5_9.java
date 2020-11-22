import java.util.Scanner;

public class Task5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int []pyramids;
        Scanner scan = new Scanner(System.in);
       
        
        System.out.println("please enter rows");
        int row= scan.nextInt();
        
        pyramids = new int[row];
        
        
        for(int i=0 ;i<row;i++) 
        {
        	for(int j=0 ;j<=i;j++)
        	{
        		
        	System.out.print("*");
        }
        	System.out.println("");
	}
        scan.close();

	}
}
