package Day_3;
import java.util.Scanner;

public class Restaurant {
	int category;
	int option;
	int quantity;
	String value;
	int total;

	
	public void display_category() {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Option:");
	category=sc.nextInt();
	switch(category) {
	
	case 1: 
		System.out.println("***********Category 1 : Veg*************");
		System.out.println("1.Paneer tikka - Rs. 120.00 (per item") ;
		System.out.println("2.Cashew pulao - Rs. 150.00 (per item)"); 
		System.out.println("3.Veg fried rice - Rs. 130.00 (per item) ");
		System.out.println("4.Gobi 65 - Rs. 100.00 (per item)"); 
		System.out.println("5.Veg.thali - Rs. 140.00 (per item)");
		break;
		
	case 2: 
		System.out.println("***********Category 2 : Non-Veg***********");
		System.out.println("1.Chicken briyani - Rs. 200.00 (per item) ") ;
		System.out.println("2.Fish curry -  Rs. 150.00 (per item) "); 
		System.out.println("3.Chicken 65 - Rs. 120.00 (per item)");
		System.out.println("4.Mutton gravy -  Rs. 220.00 (per item) "); 
		System.out.println("5.Chicken fried rice - Rs. 180.00 (per item)");
		break;
		
		default :System.out.println("Invalid Category");
		
	}

	}
	public void select_nonveg()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the option:");
	    option=sc.nextInt();
		switch(option)
		{
		case 1:
			System.out.println("Please enter number of “Chicken briyani” you would like to order");
			quantity=sc.nextInt();
			System.out.println("Would you like to order one more dish ? [Yes] or [No]");
			String value=sc.next();
			if (value=="YES" && value=="yes")
			{
				System.out.println("***********Category 2 : Non-Veg***********");
				System.out.println("1.Chicken briyani - Rs. 200.00 (per item) ") ;
				System.out.println("2.Fish curry -  Rs. 150.00 (per item) "); 
				System.out.println("3.Chicken 65 - Rs. 120.00 (per item)");
				System.out.println("4.Mutton gravy -  Rs. 220.00 (per item) "); 
				System.out.println("5.Chicken fried rice - Rs. 180.00 (per item)");
			}
			else
				total=quantity*200;
			    System.out.println("Total is :"+total);
			    break;
			
		case 2:
			System.out.println("Please enter number of “Fish Curry” you would like to order");
			quantity=sc.nextInt();
			System.out.println("Would you like to order one more dish ? [Yes] or [No]");
			String value1=sc.next();
			
			switch(value1) {
			case "Yes":
			case "yes":
			System.out.println("***********Category 1 : Veg*************");
			System.out.println("1.Paneer tikka - Rs. 120.00 (per item") ;
			System.out.println("2.Cashew pulao - Rs. 150.00 (per item)"); 
			System.out.println("3.Veg fried rice - Rs. 130.00 (per item) ");
			System.out.println("4.Gobi 65 - Rs. 100.00 (per item)"); 
			System.out.println("5.Veg.thali - Rs. 140.00 (per item)");
			break;
			
		//case 'N':
		//case 'n':
				
			}
			
		}
		
		
		
	}
public static void main(String[] args) {
	Restaurant r1=new Restaurant();
	r1.display_category();
	r1.select_nonveg();
	
}
}
