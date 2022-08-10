package com.lti.jdbc;
import java.sql.*;

public class JDBCPractice {
	public static void main(String[] args) {

        Connection con = null;
        Statement statement = null;
        ResultSet rs = null;

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");
//            con = DriverManager.getConnection(url, username, password);
            con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","macbook");

            System.out.println("Connection is successful");
            statement=con.createStatement();
            rs=statement.executeQuery("select * from personal");
            while(rs.next()) {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" ");

            }
        }



        catch(SQLException | ClassNotFoundException e){
            System.out.println(e);

        }

        finally {
            try {
                statement.close();
                rs.close();
                con.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
	}
}
