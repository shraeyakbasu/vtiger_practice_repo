import java.util.ArrayList;

public class freequencyofduplicacy {

	public static void main(String[] args)
	{
		int i;
		String name="shraeyakbasu";	
		int counter=1;
		char[] name1=name.toCharArray();
		for( i=0;i<name1.length;i++)
		{
			for(int j=i+1;j<name1.length;j++)
			{
				if(name1[i]==name1[j])
				{
					
					counter=counter+1;
				}
				
			}
			
		
		}

		System.out.println("character"+ name1[i]+"occured"+ counter+"number of times");	
	}

}
