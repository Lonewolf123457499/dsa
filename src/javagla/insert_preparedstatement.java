package javagla;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insert_preparedstatement
{
    public static void main(String[] args) {
        // load the driver
        final  String url="jdbc:mysql://localhost:3306/vedantdb";
        final String username="root";
        final String password="3ac594GLA$";
        Scanner sc=new Scanner(System.in);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //  create a connection
           Connection con= DriverManager.getConnection(url,username,password);
           String query="insert into emp3(Id ,Name ,Address) values(?,?, ?)";
           PreparedStatement ptmt= con.prepareStatement(query);
               System.out.println("enter the Name ");
               String name = sc.nextLine();
               System.out.println("enter the Address");
               String cor = sc.nextLine();
               System.out.println("enter the id");
               int sid = sc.nextInt();
               ptmt.setInt(1,sid);
               ptmt.setString(2, name);
               ptmt.setString(3, cor);
               ptmt.executeUpdate();
               System.out.println("query is inserted into the table");
          // }
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
