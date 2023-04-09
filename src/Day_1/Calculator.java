package Day_1;

public class Calculator {
	
	int input1;
	int input2;
	int output;
	
	public int add(int input1 , int input2)
	{
		output=input1+input2;
		return output;
		
	}
	
	public void sub()
	{
		output=input1-input2;
		System.out.println(output);
		
	}
	public void mul()
	{
		output=input1*input2;
		System.out.println(output);
	}
	public void div()
	{
		output=input1/input2;
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		Calculator packetcal = new Calculator();
		int output = packetcal.add(10,5);
		System.out.println(output);
		
		
		
		
				
				
		
		
	}
				
		
		
	}

