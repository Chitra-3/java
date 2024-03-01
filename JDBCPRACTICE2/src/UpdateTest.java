import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTest {
     public static void main(String[] args) throws Exception {

        try{
            System.out.println("update operation example");
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            System.out.println("driver loaded successfully");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","admin");
            System.out.println("connection established successfully");
            PreparedStatement ps =conn.prepareStatement("UPDATE emp_table set emp_name=? where emp_id=?");
            System.out.println("statement is created successfully");

            Scanner sc1=new Scanner(System.in);
            System.out.println("Enter the element id to update:");
            int id = sc1.nextInt();
            ps.setInt(2,id);
            
            Scanner sc2=new Scanner(System.in);
            System.out.println("Enter the new name: ");
            String newName=sc2.nextLine();
            ps.setString(1, newName);

            int RowsUpdated= ps.executeUpdate();
            System.out.println("Rows added: "+RowsUpdated);
            ps.close();           
            conn.close();
        }
        catch(SQLException e){
            System.out.println("Updation can't be done"+e);
        }
    }
    }

