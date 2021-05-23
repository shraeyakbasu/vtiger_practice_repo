
public class swappingstringpattern1 
{

	public static void main(String[] args) 
	{
      int i=0;
		String name="shraeyak";
		char [] name1=name.toCharArray();
		System.out.println(name1);
		int j=name1.length-1;
		while(i<j)               //first and last element,second and last but one element so on.. swap
		{
			while(j>i)
			{
				char temp=name1[i];
				name1[i]=name1[j];
				name1[j]=temp;
				i++;
				j--;
				
			}
		}
		System.out.println(name1);
	}

}
