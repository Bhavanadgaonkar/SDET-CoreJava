package Day_3;
import java.util.Scanner;



public class Week {
          static int day;
	    
	     
	     public void display_days()
	     {
		
	      
	   switch(day) 
	{
		case 1:
		{
			System.out.println("First Day of Week is Monday");
			break;
		}
		case 2:
		{
			System.out.println("Second Day of Week is Tuesday");
			break;
		}
		case 3:
		{
			System.out.println("Third Day of Week is Wednesday");
			break;
		}
		case 4:
		{
			System.out.println("Forth Day of Week is Thursday");
			break;
		}
		case 5:
		{
			System.out.println("Fifth Day of Week is Friday");
			break;
		}
		case 6:
		{
			System.out.println("Sixth Day of Week is Saturday");
			break;
		}
		case 7:
		{
			System.out.println("Seventh Day of Week is Sunday");
			break;
		}
		default :
	
			System.out.println("Invalid Day");
		
     }	
}
public static void main(String[] args) {
	
		System.out.println("Enter the value of day:");
		Scanner sc = new Scanner(System.in);
		day=sc.nextInt();
		   Week w1=new Week();
		   w1.display_days();
}
}
		   
	   
	   
		
	
