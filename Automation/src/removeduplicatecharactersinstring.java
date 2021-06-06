import java.util.LinkedHashSet;

public class removeduplicatecharactersinstring
{

	public static void main(String[] args)
	{
		String name="shraeyakbasumallick";
		String newname="";
		char [] name1=name.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<name1.length;i++)
		{
			set.add(name1[i]);
			
		}
	
		for(Character character:set)
		{
			newname=newname+character;
			//System.out.print(character);
		}
		System.out.print(newname);

	}

}
