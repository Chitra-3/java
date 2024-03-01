import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTest {
     public static void main(String[] args) throws Exception {

        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","admin");
           PreparedStatement ps= conn.prepareStatement("INSERT INTO emp_table VALUES(?,?,?)");

            Scanner sc1= new Scanner(System.in);
            System.out.println("Enter the new id : ");
            int newId= sc1.nextInt();

            Scanner sc2= new Scanner(System.in);
            System.out.println("Enter the new dept : ");
            String newDept= sc2.nextLine();

            Scanner sc3= new Scanner(System.in);
            System.out.println("Enter the new name : ");
            String newName= sc3.nextLine();

            ps.setInt(1, newId);
            ps.setString(2, newDept);
            ps.setString(3, newName);
           

            int RowsAdded= ps.executeUpdate();
            System.out.println("Rows Added: "+RowsAdded);

            ps.close();
            conn.close();
        }
        catch(SQLException e){
            System.out.println("Creation can't be done");
        }
        
    }
}
