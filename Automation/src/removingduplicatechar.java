
public class removingduplicatechar {

	public static void main(String[] args) 
	{
		String name="shraeyakbasumallick";
		char [] name1=name.toCharArray();
        for(int i=0;i<name1.length-1;i++)
        {
        	for(int j=i+1;j<name1.length;j++)
        	{
        		if(name1[i]==name1[j])
        		{
        			name1[j]='_';
        		}
        	}
        }
        System.out.println(name1);
	}

}
