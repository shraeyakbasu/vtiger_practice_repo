import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class Highestoccuringwordinasentence 
{

	public static void main(String[] args)
	{
		int counter=0;
		String sentence="i live in india india is my country i love my country india is the second most populous country of world";
		String [] sentence1=sentence.split(" ");
		HashSet<String> set=new HashSet<>();
		HashMap<String, Integer> map=new HashMap<>();
		for(int i=0;i<sentence1.length;i++)
		{
			set.add(sentence1[i]);
		}
		for(String string:set)
		{
			for(int i=0;i<sentence1.length;i++)
			{
				if(string.equals(sentence1[i]))
				{
					counter++;
				}
			}
		
			map.put(string, counter);
			counter=0;
		}
		
		System.out.println(map);
		String s1="";
		int maxvalue=Collections.max(map.values());
		for(Entry<String, Integer> entry:map.entrySet())
		{
			if(entry.getValue()==maxvalue)
			{
				s1=s1.concat(entry.getKey()+",");
			}
		}
		System.out.println("highest occuring words are ===>"+s1);
		}

}
