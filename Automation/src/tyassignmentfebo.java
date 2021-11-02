import java.util.ArrayList;

public class tyassignmentfebo 
{

	public static void main(String[] args)
	{
		int a=0;
		int b=1;
		int result=0;
		ArrayList<Integer> al=new ArrayList<>();
		al.add(a);
		al.add(b);
		for(int i=0;i<10;i++)
		{
			result=a+b;
			al.add(result);
			a=b;
			b=result;
			
		}
		System.out.println("febonacci series is "+al);

	}

}
