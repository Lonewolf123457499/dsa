package javagla;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_table
{
    public static void main(String[] args)
    {
        final String url="jdbc:mysql://localhost:3306/vedantdb";
        final String username="root";
        final String password="3ac594GLA$";
        try
        {
            // load the driver
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            String query="update GLA set age='32' where empid='GLA234567'";

            Statement stmt =con.createStatement();


            stmt.executeUpdate(query);
            System.out.println(" updated");

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
