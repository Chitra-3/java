import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Scanner;

public class InsertTest {
    public static void main(String[] args) {
        System.out.println("Hello World");
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","admin");
            PreparedStatement preparedStatement=conn.prepareStatement("INSERT INTO CHITRA VALUES(?,?,?)");
        

        
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter id:");
        int newId=sc1.nextInt();
        preparedStatement.setInt(1,newId);
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter name: ");
        String newName=sc2.nextLine();
        preparedStatement.setString(2,newName);

        Scanner sc3=new Scanner(System.in);
        System.out.println("Enter role: ");
        String newRole=sc3.nextLine();
        preparedStatement.setString(3,newRole);

        

        int RowsAdded= preparedStatement.executeUpdate();
        
        conn.close();
        preparedStatement.close();
    }  
        catch(SQLException e)
        {
            System.out.println("Some error raised");
        }finally
        {
            System.out.println("Finally code executed");
        }


        }




    }

