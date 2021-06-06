import java.util.LinkedHashSet;

public class removeduplicatewordsinstring 
{

	public static void main(String[] args) 
	{
		String name="welcome to india welcome to kolkata";
		String newname="";
		String [] name1=name.split(" ");
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<name1.length;i++)
		{
			set.add(name1[i]);
		}
	
		for(String string:set)
		{
			newname=newname+string+" ";
			//System.out.print(character);
		}
		System.out.print(newname);

	}

}
