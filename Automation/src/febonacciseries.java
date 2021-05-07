import java.util.ArrayList;

public class febonacciseries {

	public static void main(String[] args) 
	{
		int num1=0, num2=1;
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(num1);
		al.add(num2);
		for(int i=0;i<10;i++)
		{
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			
			al.add(num3);
			
		}
		
		System.out.println("febonacci series is :"+al);

	}

}
