import java.util.HashSet;

public class onlyduplicatecharacterinstring
{

	public static void main(String[] args) 
	{
		int i;
		int n=3;
		String name="shraeyakbasu";
		char [] name1=name.toCharArray();
		HashSet<Character> nameset=new HashSet<Character>();
		for( i=0;i<name1.length;i++)
		{
			nameset.add(name1[i]);
		}
		System.out.println(name);
		for( Character character:nameset)
		{
			int counter=0;
			for( i=0;i<name1.length;i++)
			{
				if(character==name1[i])
				{
					counter++;
					
				}
				
			}
			if(counter>=n)
			System.out.println(character+" occured "+counter+" number of times ");
			
			}
		}

}
