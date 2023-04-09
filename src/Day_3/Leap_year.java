package Day_3;

public class Leap_year {
	int year;
	


public void cal_leap()
{
	for(year=2000; year<=2100;year++) {
		
		if (year%4==0)
		{
			System.out.println("Leap Year is :" +year);
		}
			else
				System.out.println("Leap Year is not : "+year);
	}
}

public static void main(String[] args) {
	 Leap_year l1= new Leap_year();
	 l1.cal_leap();
	 
	 
}
}
