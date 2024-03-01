package school.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectAllStudents {
    public static void main(String[] args) throws Exception {
      try{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_master","root","admin");
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select *from Student");
            while (rs.next()) {
                System.out.println("Roll No: "+rs.getInt(1));
                System.out.println("Student Name : "+rs.getString(2));
                System.out.println("Birth Date: "+rs.getDate(3));
                System.out.println("Stream: "+rs.getString(4));
                System.out.println("Marks: "+rs.getFloat(5));
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
