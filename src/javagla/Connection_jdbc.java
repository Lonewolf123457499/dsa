package javagla;

import java.sql.Connection;
import java.sql.DriverManager;

import static java.sql.DriverManager.*;

public class Connection_jdbc
{
    public static void main(String[] args)
    {
        final  String url = "jdbc:mysql://localhost:3306/vedantdb";
        final String username="root";
        final String password="3ac594GLA$";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection(url,username,password);
            System.out.println("class found");
        }
        catch(Exception e)
        {
            e.printStackTrace();

        }


    }

}
