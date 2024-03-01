
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        try{
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","admin");
        Statement statement=conn.createStatement();
        ResultSet rs=statement.executeQuery("select * from student_table");
        while(rs.next()){
            System.out.println("Student id : "+rs.getInt(1));
            System.out.println("Student age : "+rs.getInt(2));
            System.out.println("Student dept : "+rs.getString(3));
            System.out.println("Student name : "+rs.getString(4));
            
             
        }
        rs.close();
        statement.close();
        conn.close();
        }catch(SQLException e){
            System.out.println("Not Exists");
        }
    }
}
