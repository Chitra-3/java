import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTest {
    public static void main(String[] args) {
        try{

            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "admin");
            PreparedStatement ps= conn.prepareStatement("INSERT INTO emp_table VALUES(?,?,?)");
            

            

            Scanner sc1=new Scanner(System.in);
            System.out.println("Enter the id: ");
            int empId=sc1.nextInt();
            ps.setInt(1,empId);

            Scanner sc2=new Scanner(System.in);
            System.out.println("Enter the dept: ");
            String empDept=sc2.nextLine();
            ps.setString(2, empDept);

            Scanner sc3=new Scanner(System.in);
            System.out.println("Enter the name: ");
            String empName=sc3.nextLine();
            ps.setString(3, empName);

            
            int RowsAdded=ps.executeUpdate();
            System.out.println("Rows Added : "+RowsAdded);

            ps.close();
            conn.close();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
