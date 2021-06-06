import java.util.ArrayList;

public class findprimenumberwithinagivenrange 
{

	public static void main(String[] args)
	{
		int n=50;
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al2=new ArrayList<Integer>();
		for(int i=3;i<=50;i++)
		{
			al.add(i);
		}
		
		//System.out.print(al);
		for(int i=0;i<al.size();i++)
		{
			int number=al.get(i);
			for(int j=2;j<number;j++)
			{
				if(number%j==0)
				{
					al2.add(number);
					break;
					
				}
			}
			
		}
		System.out.println(" list of non prime numbers "+al2);
		

	}

}
