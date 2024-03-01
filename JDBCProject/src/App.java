
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    
    try{
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","admin");
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("SELECT *FROM CHITRA");

        while(rs.next())
        
        {
            System.out.println("id: "+rs.getInt(1));
            System.out.println("name: "+rs.getString(2));
            System.out.println("role: "+rs.getString(3));
        }
        rs.close();
        conn.close();
        st.close();
    }  
        catch(SQLException e)
        {
            System.out.println("Some error raised");
        }finally
        {
            System.out.println("Finally code executed");
        }


    }  
    
    }

