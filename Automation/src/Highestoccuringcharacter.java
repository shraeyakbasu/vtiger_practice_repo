import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class Highestoccuringcharacter
{

	public static void main(String[] args) 
	{
		int counter=0;
		String name="shraeyakbassu";
		char [] name1=name.toCharArray();
		HashSet<Character> set=new HashSet<>();
		HashMap<Character, Integer> map=new HashMap<>();
		for(int i=0;i<name1.length;i++)
		{
			set.add(name1[i]);
		}
		
		for(Character character : set)
		{
			for(int i=0;i<name1.length;i++)
			{
				if(character==name1[i])
				{
					counter++;
					map.put(character, counter);
				}
			}
			counter=0;
		}
		
		System.out.println(map);
		int maxvalue=Collections.max(map.values());
		
		for(Entry<Character, Integer> entry:map.entrySet())
		{
			if(entry.getValue()==maxvalue)
			{
				System.out.println("maximum occuring character is "+entry.getKey());
			}
			
		}
		

	}

}
