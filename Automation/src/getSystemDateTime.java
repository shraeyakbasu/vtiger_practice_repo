import java.text.SimpleDateFormat;
import java.util.Date;

public class getSystemDateTime 
{
	public static String systemdate()
	{
		String dateinput="10/29/2021";
	Date date=new Date(dateinput);
	SimpleDateFormat sdt=new SimpleDateFormat("MMMM/dd/yyyy");
	SimpleDateFormat sdt1=new SimpleDateFormat("E/MMM/dd/yyyy");
	String currentdate=sdt.format(date);
	String newcurrentdate=sdt1.format(date);
	System.out.println(currentdate);
	System.out.println(newcurrentdate);
	
	String[] cdate=currentdate.split("/");
	String[] ncdate=newcurrentdate.split("/");
	String month=cdate[0];
	String day=cdate[1];
	String year=cdate[2];
	
	String newday=ncdate[0];
	String newmonth=ncdate[1];
	String newdate=ncdate[2];
	String newyear=ncdate[3];
	String formateddate=month+" "+year;
	String newformateddate=newday+" "+newmonth+" "+newdate+" "+newyear;
	System.out.println(formateddate);
	System.out.println(newformateddate);
	
	return currentdate;
	}

	public static void main(String[] args)
	{
		System.out.println(systemdate());
	}
}
