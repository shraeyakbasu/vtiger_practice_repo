import java.util.HashSet;

public class freequencyofwordsinstring 
{

	public static void main(String[] args)
	{ 
		int counter=0;
		String str="welcome to india welcome to kolkata ";
		String [] str1=str.split(" ");
		HashSet<String> set=new HashSet<String>();
		for(int i=0;i<str1.length;i++)
		{
			set.add(str1[i]);
		}
		//System.out.println(set);
		for(String string:set)
		{
			
			for(int i=0;i<str1.length;i++)
			{
				if(string.equals(str1[i]))
				{
					counter++;
				}
			}
			System.out.println(string+" occured "+counter+" number of times ");
			counter=0;
		}

	}

}
