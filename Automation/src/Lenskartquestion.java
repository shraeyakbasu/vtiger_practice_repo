
public class Lenskartquestion 
{

	public static void main(String[] args)
	{
		String name="Wel#Come Lens@kart"; //tra#ksneL emoc@Lew
		String reverse="";
		String finalstring="";
         char []name1=name.toCharArray();
         char firstchar=name1[3];
         char secondchar=name1[13];
         for(int i=0;i<name1.length;i++)
         {
        	 reverse=name1[i]+reverse;
         }
         char [] name2=reverse.toCharArray();
         for(int i=0;i<name2.length;i++)
         {
        	 if(name2[i]=='@')
        	 {
        		 name2[i]=firstchar;
        	 }
         }
         for(int j=5;j<name2.length;j++)
         {
        	 if(name2[j]=='#')
        	 {
        		 name2[j]=secondchar;
        	 }
         }
         
         for(int k=0;k<name2.length;k++)
         {
        	finalstring=finalstring+name2[k]; 
         }
         
         System.out.println(finalstring);
         
         
         
	}

}
