package supernova_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class WritedataintodatabaseTest 
{
	@Test
	public void writeintodatabse() throws SQLException
	{
		Connection con =null;
		try
		{
		Driver datadriver=new Driver();
		DriverManager.registerDriver(datadriver);
	 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "root");
		Statement statement=con.createStatement();
		int result=statement.executeUpdate("insert into customer values('puranjoy bose','kulabhusan bose','kolkata','kolkata',456987,'india')");
		if(result==1)
		{
				System.out.println("success");
		}
		else
		{
			
			    System.out.println("not success");
			
		}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			con.close();
			System.out.println("connection closed");
		}
		
		
	}


}
