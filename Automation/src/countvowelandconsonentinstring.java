
public class countvowelandconsonentinstring 
{

	public static void main(String[] args) 
	{
		int vowelcount = 0, consonantcount =0 ;
		String name = "shraeyak";
		char[] name1 = name.toCharArray();
		for(int i=0;i<name1.length;i++)
		{
			if(name1[i]=='a'||name1[i]=='e'||name1[i]=='i'||name1[i]=='o'||name1[i]=='u')
			{
				vowelcount+=1;
			}
			else
				consonantcount+=1;
			
		}
		System.out.println("number of vowel present is"+vowelcount +"number of consonant present is"+consonantcount);

	}

}
