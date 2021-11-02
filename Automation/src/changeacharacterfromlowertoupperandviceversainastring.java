
public class changeacharacterfromlowertoupperandviceversainastring 
{

	public static void main(String[] args) 
	{
		String name="ShraEyak BaSu";
		StringBuffer name1=new StringBuffer(name);
		for(int i=0;i<name.length();i++)
		{
			if(Character.isLowerCase(name.charAt(i)))
			{
				name1.setCharAt(i,Character.toUpperCase(name.charAt(i)));
			}
			
			else
			{
				name1.setCharAt(i,Character.toLowerCase(name.charAt(i)));
			}
		}
		
		System.out.println(name1);

	}

}
