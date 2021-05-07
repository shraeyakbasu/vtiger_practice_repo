package supernova_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class Assignment1Test 
{
	@Test
	public void readfromdatabse() throws SQLException
	{
		int a=0;
		Driver datadriver=new Driver();
		DriverManager.registerDriver(datadriver);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root", "root");
		Statement statement=con.createStatement();
		ResultSet result=statement.executeQuery("select * from customer");
		while(result.next())
		{
			for(int i=1;i<=result.findColumn("country");i++)
			{
				if(result.getString(i).equalsIgnoreCase("shraeyak"))
				{
					a=a+1;
				}
				
			}
			    
		}
		
		if(a>0)
		{
			System.out.println("found");
		}
		
		con.close();
	}

}
