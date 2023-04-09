package Day_3;

public class fabonacci {
			 int first_num=0;
			 int second_num=1;
			 int sum;
			 
			
			 public void cal_fabonacci() {
				 for(int i=1;i<10;i++)
				 {
					 sum=first_num+second_num;
					 first_num=second_num;
					 second_num=sum ;
					 
					 System.out.println(+first_num);
				 }

			 }

			 public static void main(String[] args) {
				fabonacci f1 =new fabonacci();
				System.out.println("Fabonacci series 10 is :");
				f1.cal_fabonacci();
			}

}

