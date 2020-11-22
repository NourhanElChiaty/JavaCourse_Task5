import java.util.Scanner;

public class Task5_8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String []names;
		 boolean found=false;
		 int i;
		 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("please enter the number of digits");
        int size= scan.nextInt();
        
        names = new String[size];
        
        for(i=0 ;i<size ;i++) 
        {
        	
       	 System.out.println("please enter name");
       	 
       	 String name=scan.next();
       	
       	 names[i]=name;
       	
        }
        
        System.out.println("please enter the number you're searching for");
        String search= scan.next();
       
        for(i=0 ;i<size ;i++) 
        {
        	
       if(names[i].equals(search)) 
       {
    	       	   found = true;
    	   break;
    	   }
        }
        
       if(found)
       {
    	   System.out.println("you've found it at index ["+i+"]");

    	   }
       else 
       {
    	   System.out.println("not found");
       }
       scan.close();
       }
       
       
        
	
	
	
	}
