package supernova_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ReadingdatafromdatabasewithexceptionTest 
{
	@Test
	public void readfromdatabasewithexception() throws SQLException
	{
		Connection con = null;
		try
		{
		Driver datadriver=new Driver();
		DriverManager.registerDriver(datadriver);
	    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "root");
		Statement statement=con.createStatement();
		ResultSet result=statement.executeQuery("select * from customer");
		while(result.next())
		{
			for(int i=1;i<=result.findColumn("ountry");i++)
			{
				System.out.print(result.getString(i)+" ");
			}
			    System.out.print("\n");
			
		}
		}
		
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		finally
		{
			con.close();
			System.out.println("connections closed");
		}
		
		

}
}
