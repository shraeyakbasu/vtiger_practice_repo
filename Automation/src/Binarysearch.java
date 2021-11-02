
public class Binarysearch 
{
   public static void binarysearchalgo(int num[],int number)
   {
	   int mid,first=0,last;
	   last=num.length-1;
	   mid=(first+last)/2;
	   
	   while(first<=last) {
	   if(number<num[mid])
	   {
		   last=mid-1;
	   }
	   else if (num[mid] == number) 
	   {
		   System.out.println("element found at"+mid);
		   break;
	   }
	   else
	   {
		   first=mid+1;
	   }
	   mid=(first+last)/2;
	   }
	   if(first>last)
	   {
		   System.out.println("element not found");
	   }
	   
   }
	public static void main(String[] args) 
	{
		int num[]= {10,20,30,40,50,60},item=70;
        binarysearchalgo(num, item);
        
	}

}
