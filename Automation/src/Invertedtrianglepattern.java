
public class Invertedtrianglepattern 
{

	public static void main(String[] args) 
	{
		int i,j,n=5;
		for(i=0;i<n;i++)
		{
		for(j=i;j>0;j--)
		{
		System.out.print(" ");
		}
		for(j=n;j>i;j--)
		{
		System.out.print("* ");
		}
		System.out.print('\n');
		}
		}
		

	}


