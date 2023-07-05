package javagla;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc1
{
    public static void main(String[] args) {
        // load the driver
        final String url ="jdbc:mysql://local host :3306/vedantdb";
        final String username="root";
        final  String password="3ac594GLA$";
        try {
            Class.forName("com.mysql.jdbc.Driver");

            // create connection
            Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("class found");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        //catch (Exception r) {
           // System.out.println(r);
        //}
    }
}
