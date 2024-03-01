import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTest {
  public static void main(String[] args) {
    try{
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","admin");
        PreparedStatement ps=conn.prepareStatement("UPDATE emp_table set emp_dept=? where emp_id=?");

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the id to update : ");
        int emp_id=sc1.nextInt();
        ps.setInt(2, emp_id);

        
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter new dept : ");
        String emp_dept=sc2.nextLine();
        ps.setString(1, emp_dept);
        
        int RowsUpdated=ps.executeUpdate();
        System.out.println("Rows Updated: "+RowsUpdated);

        ps.close();
        conn.close();


    }catch(SQLException e){
        System.out.println(e);
    }
  }  
}
