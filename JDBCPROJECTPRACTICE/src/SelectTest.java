import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        try{
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","admin");
        Statement statement=conn.createStatement();
        ResultSet rs=statement.executeQuery("SELECT *FROM emp_table");
        while(rs.next()){
            System.out.println("Employee id : " + rs.getInt(1));
            System.out.println("Employee dept : " +rs.getString(2));
            System.out.println("Employee name : " +rs.getString(3));

        }
        rs.close();
        statement.close();
        conn.close();
    }catch(SQLException e){
        System.out.println("Creation can't be done");
    }
    }
}
