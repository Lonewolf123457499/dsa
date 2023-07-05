package javagla;
import java.sql.*;
public class Create_table {
    public static void main(String[] args)
    {
        // load the driver
        final String url="jdbc:mysql://localhost:3306/vedantdb";
        final  String username="root";
        final String password="3ac594GLA$";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            // make connection
           Connection con= DriverManager.getConnection(url,username,password);
           // query to create table in jdbc
           //String query=" create table emp3 (Id int(20),Name char(20), Address varchar(200))";
            String query ="insert into emp2 values( 2,'vedant', 'agra')";
           Statement stmt= con.createStatement();
           stmt.executeUpdate(query);
            System.out.println("table is being created");
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(SQLException r)
        {
            System.out.println(r);
        }


    }
}
