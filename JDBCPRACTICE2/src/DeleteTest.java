import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Scanner;

public class DeleteTest {
     public static void main(String[] args) throws Exception {

        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","admin");
            PreparedStatement ps=conn.prepareStatement("DELETE FROM emp_table WHERE emp_name=?");
          
             System.out.println("Enter the element to delete: ");
            Scanner sc1=new Scanner(System.in);
            String element= sc1.nextLine();
            
            ps.setString(1, element);

            int RowsDeleted= ps.executeUpdate();
            System.out.println("Rows deleted: "+RowsDeleted);



           ps.close();
            conn.close();
        }
        catch(SQLException e){
            System.out.println("Deletion can't be done");
        }
        
    }
}
