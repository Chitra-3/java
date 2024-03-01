import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTest {
    public static void main(String[] args) throws Exception {

        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","admin");
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select *from emp_table");
            while (rs.next()) {
                System.out.println("Employee id: "+rs.getInt(1));
                System.out.println("Employee dept: "+rs.getString(2));
                System.out.println("Employee name: "+rs.getString(3));
            }
            rs.close();
            st.close();
            conn.close();
        }
        catch(SQLException e){
            System.out.println("NO TABLE EXISTS");
        }
        
    }
}

