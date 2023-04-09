package Day_1;

public class Student {
	int eng_marks;
	int maths_marks;
	int sci_marks;
	int history_marks;
	int total;
	float avg;
	
	public int total_marks()
	{
		total=eng_marks+maths_marks+sci_marks+history_marks;
		System.out.println("Addition of marks : "+total);
		
		return total;
		
	}
	
	public float avg_marks() {
		avg=total/4;
		System.out.println("Avaerage marks : "+avg);
		System.out.println();
	return avg;
	
	}



public static void main(String args[])
{
	Student s1=new Student();
	Student s2=new Student();
	Student s3=new Student();
	Student s4=new Student();
	
	System.out.println("***********First Student's Marks**************");
	s1.eng_marks=65;
	s1.maths_marks=75;
	s1.sci_marks=80;
	s1.history_marks=65;
	s1.total_marks();
	s1.avg_marks();
	
	System.out.println("***********Second Student's Marks**************");
	s2.eng_marks=85;
	s2.maths_marks=95;
	s2.sci_marks=60;
	s2.history_marks=65;
	s2.total_marks();
	s2.avg_marks();
	
	System.out.println("***********Third Student's Marks**************");
	s3.eng_marks=45;
	s3.maths_marks=55;
	s3.sci_marks=67;
	s3.history_marks=65;
	s3.total_marks();
	s3.avg_marks();
	
	System.out.println("***********Forth Student's Marks**************");
	s4.eng_marks=75;
	s4.maths_marks=42;
	s4.sci_marks=58;
	s4.history_marks=65;
	s4.total_marks();
	s4.avg_marks();
}}
