import java.util.HashSet;

public class onlyduplicatewordsinstring 
{

	public static void main(String[] args)
	{
		int counter=0;
		int n=2;
		String str="welcome to india welcome to kolkata ";
		String [] str1=str.split(" ");
		HashSet<String> set=new HashSet<String>();
		for(int i=0;i<str1.length;i++)
		{
			set.add(str1[i]);
		}
		for(String string:set)
		{
			
			for(int i=0;i<str1.length;i++)
			{
				if(string.equals(str1[i]))
				{
					counter++;
				}
			}
			if(counter==n)
			System.out.println(string+" occured "+counter+" number of times ");
			counter=0;
		}

	}

}
