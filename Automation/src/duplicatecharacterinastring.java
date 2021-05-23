import java.util.HashSet;
import java.util.TreeSet;

public class duplicatecharacterinastring
{

	public static void main(String[] args) 
	{
		int i;
		int counter=0;
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
			for( i=0;i<name1.length;i++)
			{
				if(character==name1[i])
				{
					counter++;
					
				}
				
			}
			System.out.println(character+" occured "+counter+" number of times ");
			counter=0;
			
			
		}
		

	}

}
