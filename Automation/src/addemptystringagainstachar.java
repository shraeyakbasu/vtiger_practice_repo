
public class addemptystringagainstachar 
{

	public static void main(String[] args) 
	{
		String name="shraeyakbasu";
		String empty="        ";
		char[] cname=name.toCharArray();
		char[] cempty=empty.toCharArray();
		for(int i=0;i<cname.length;i++)
		{
			if(cname[i]=='e'|| cname[i]=='a')
			{
				for(int j=0;j<cempty.length;j++)
				{
					cname[i]=cempty[j];
				}
				
			}
		}
		System.out.println(cname);

	}

}
