
		package com.dxc.jdbc;
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.ResultSet;
		import java.sql.SQLException;
		import java.sql.Statement;
import java.util.Scanner;

		public class ProductsDemo2{
			public static void main(String args[]) {
				// Creating the connection
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "DXC";
				String pass = "DXC";
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter product code:");
				int prodCode=sc.nextInt();
				// Inserting data using SQL query
				// String sql = "insert into student1 values('"+name+"',"+roll+",'"+cls+"')";
				String sql = "select * from products where prod_code="+prodCode;
				Connection con = null;
				try { 
					DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

					// Reference to connection interface
					con = DriverManager.getConnection(url, user, pass);

					Statement st = con.createStatement();
					ResultSet result = st.executeQuery(sql);

					while (result.next()) {
						System.out.println(result.getString("PROD_CODE") + ":" + result.getString("PROD_NAME")+":"+ result.getString("PROD_PRICE")+":"+ result.getString("PROD_CATG"));
					}

				} catch (Exception ex) {
					System.err.println(ex);
				} finally {

					try {
						con.close();
					} catch (SQLException e) {
						System.out.println(e);
					}
				}


			}
	


	}


