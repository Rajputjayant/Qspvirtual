package Practise_Package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NonSelectQuery {

	public static void main(String[] args) throws SQLException {
		int result = 0;
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flipkart","root", "root");
		 Statement stat = con.createStatement();
		String query = "insert into product values('fan',1500,'12/jan/2000')";
		result= stat.executeUpdate(query);
		if (result==1) {
			System.out.println("data-updated");
			
		} else {
			
			System.out.println("not-updated");

		}
		con.close();
		
		}

}
