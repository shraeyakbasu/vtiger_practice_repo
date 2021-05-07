import java.util.ArrayList;

public class duplicatecharacter {

	public static void main(String[] args) 
	{
		ArrayList<Character> al=new ArrayList<Character>();
		String name="shraeyakbasu";		
		char[] name1=name.toCharArray();
		for(int i=0;i<name1.length;i++)
		{
			for(int j=i+1;j<name1.length;j++)
			{
				if(name1[i]==name1[j])
				{
					name1[j]='0';
					al.add(name1[i]);
					
				}
				
			}
				
		}
		
		System.out.println("repeated characters are "+al);
	}

}
