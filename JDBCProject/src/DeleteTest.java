import java.sql.*;
import java.util.Scanner;

public class DeleteTest {
    public static void main(String[] args)  {
        try {
            System.out.println("Loading the driver");
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            System.out.println("Driver loaded..");

            System.out.println("Acquiring the connection to the database....");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","admin");
            System.out.println("Connected to the database : "+conn);

            System.out.println("Creating a prepared statement");
            PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM CHITRA WHERE ROLE=?");
            System.out.println("PreparedStatement created...");

            Scanner scanner1 = new Scanner(System.in);          
            System.out.println("Enter The role: ");
            String  role1 = scanner1.nextLine();

            preparedStatement.setString(1, role1);

            System.out.println("Executing the query...");
            int rowsDeleted = preparedStatement.executeUpdate();
            System.out.println("Query fired..rows DELETED..."+rowsDeleted);
            
            preparedStatement.close();

            conn.close();
        }
        catch(SQLException e) {
            System.out.println("Some problem with SQL : "+e);
        }
        finally {
            System.out.println("Finally block bound to run ragardless of exceptions...");
        }

    }   
}