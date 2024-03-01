import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteTest {
    public static void main(String[] args) {
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "admin");
            PreparedStatement preparedStatement=conn.prepareStatement("delete from student_table where std_id=?");
        
            Scanner sc1=new Scanner(System.in);
             System.out.println("Enter the id to delete : ");
            int newid= sc1.nextInt();
            preparedStatement.setInt(1, newid);

            int RowsDeleted=preparedStatement.executeUpdate();
            System.out.println("rows added"+RowsDeleted);
            preparedStatement.close();
            conn.close();
        }catch(SQLException e){
            System.out.println("Deletion can't be done");
        }
    }
}
