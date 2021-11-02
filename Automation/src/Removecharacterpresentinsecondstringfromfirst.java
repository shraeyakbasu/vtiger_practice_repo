import java.util.HashSet;

public class Removecharacterpresentinsecondstringfromfirst 
{

	public static void main(String[] args)
	{
		String name="shraeyak";
		String name2="yak";
		char [] cname=name2.toCharArray();
		HashSet<Character> set=new HashSet<>();
		for(int i=0;i<cname.length;i++)
		{
			set.add(cname[i]);
		}
		
		for(Character character:set)
		{
			for(int i=0;i<name.length();i++)
			{
				if(name.charAt(i)==character)
				{
					int index=name.indexOf(character);
					name=name.substring(0, index)+name.substring(index+1);
				}
			}
		}
		
		System.out.println(name);
		}

}
