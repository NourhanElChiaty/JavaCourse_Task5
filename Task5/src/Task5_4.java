import java.util.Scanner;

public class Task5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String []names; 
       names = new String[10];
       
       Scanner scan = new Scanner(System.in);
       String name;
       
       for(int i=0 ; i<10 ; i++) 
       {
    	   System.out.println("please enter a name");
    	   name=scan.next();
    	  names[i]= name;
    	  System.out.println("Welcome  "+names[i]);
       }
       scan.close();
	}

}
