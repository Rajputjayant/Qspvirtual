package Practise_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ReadDataFromDatabases {

	public static void main(String[] args) throws SQLException {
		
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart", "root", "root");
		Statement stat = con.createStatement();
		String query = "Select * from product";
		ResultSet result = stat.executeQuery(query);
		while (result.next()) {
			
		 System.out.println(result.getString(1)+""+ result.getString(2));
		}
		con.close();
	}

}
