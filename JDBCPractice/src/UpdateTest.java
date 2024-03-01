import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateTest {
    public static void main(String[] args) {
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "admin");
            PreparedStatement preparedStatement=conn.prepareStatement("update  student_table set std_name=? where std_id=?");
        
            Scanner sc1=new Scanner(System.in);
             System.out.println("Enter the id to update : ");
            int newid= sc1.nextInt();
            preparedStatement.setInt(2, newid);
            Scanner sc2=new Scanner(System.in);
            System.out.println("Enter new name: ");
            String newName=sc2.nextLine();
            preparedStatement.setString(1, newName);

           int rowsUpdate=preparedStatement.executeUpdate();
            // System.out.println("rows updated-"+rowsUpdate);
        }catch(SQLException e){
            System.out.println("Update is not possible");
        }
    }
}