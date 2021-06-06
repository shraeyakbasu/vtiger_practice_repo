
public class additionoffirstthreeleastnum 
{

	public static void main(String[] args) 
	{
		int a[]= {30,40,10,20,50,60,70};
		int add=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>=a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		for(int i=0;i<3;i++)
		{
			
			add=add+a[i];
		}
		
		System.out.println(" addition of first three least number is "+add);


	}


	}


