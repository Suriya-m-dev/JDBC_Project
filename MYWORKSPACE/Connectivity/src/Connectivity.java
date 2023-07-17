/*JDBC implementation steps:
 	1.Connection class - variable
 	   Connection variable=null;
 	2.Driver class - include
 	   Class.forName("com.mysql.cj.jdbc.Driver");
 	3.      


*/
import java.sql.*;
public class Connectivity {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Connection con=null;
		//3.create 
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstdb","root","suriya");
		if(con!=null)
			System.out.println("Connection Successful");
		else
			System.out.println("Failed");

	}

}
