import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertTest {
    public static void main(String[] args) {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "admin");
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO student_table VALUES(?,?,?,?)");

            System.out.println("Enter the id: ");
            Scanner sc1 = new Scanner(System.in);
            int newid = sc1.nextInt();

            System.out.println("Enter the age: ");
            Scanner sc2 = new Scanner(System.in);
            int newage = sc2.nextInt();

            System.out.println("Enter the dept: ");
            Scanner sc3 = new Scanner(System.in);
            String newdept = sc3.nextLine();

            System.out.println("Enter the name: ");
            Scanner sc4 = new Scanner(System.in);
            String newname = sc4.nextLine();

            preparedStatement.setInt(1, newid);
            preparedStatement.setInt(2, newage);
            preparedStatement.setString(3, newdept);
            preparedStatement.setString(4, newname);

            int RowsAdded = preparedStatement.executeUpdate();
            System.out.println("rows added" + RowsAdded);
            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Insertion can't be done");
        }
    }
}
