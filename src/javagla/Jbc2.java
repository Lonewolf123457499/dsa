package javagla;
import java.sql.*;
public class Jbc2
{
    public static void main(String[] args) {
        final String url="jdbc:mysql://localhost:3306/vedantdb";
        final String usename="root";
        final  String password="3ac594GLA$";
        try
        {
            // load the driver;
            Class.forName("com.mysql.jdbc.Driver");
            // create a connection
            Connection con= DriverManager.getConnection(url,usename,password);
            // create a statement
            // String query="create table Student2( name varchar(20), sid int,address varchar(20))";
            String query=" select name ,sid, address from Student2 where sid=123";
            Statement stmt= con.createStatement();
            ResultSet i=stmt.executeQuery(query);
            while(i.next()) {
                System.out.println(i.getString(1) + i.getInt(2) + i.getString(3));
            }
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (SQLException r)
        {
            System.out.println(r);
        }

    }
}
