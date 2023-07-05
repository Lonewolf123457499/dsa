package javagla;
import java.sql.*;
public class insert_prepared2
{
        static final String DB_URL = "jdbc:mysql://localhost/mayank";
        static final String USER = "root";
        static final String PASS = "admin";
        static final String QUERY = "update student set rollno=13 where Name='Mayank'";
        insert_prepared2() throws ClassNotFoundException
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        void exec()
        {
            // Open a connection
            try(Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
                PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
            ){
                ps.setInt(1,14);
                ps.setString(2, "John");
                ps.setInt(3,26);
                ps.executeUpdate();
                System.out.println("Row Inserted by Using Prepared Statement");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
     class gMain {
        public static void main(String[] args) {
            try {
                insert_prepared2 j=new insert_prepared2();
                j.exec();
            }
            catch (ClassNotFoundException e)
            {
                System.out.println("Class Not Found");}
        }
    }
