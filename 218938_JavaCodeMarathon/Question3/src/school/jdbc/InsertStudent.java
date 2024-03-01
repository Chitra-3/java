package school.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertStudent {
     public static void main(String[] args) {
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_master", "root", "admin");
            PreparedStatement ps= conn.prepareStatement("INSERT INTO Student VALUES(?,?,?,?,?)");
            
            Scanner sc1=new Scanner(System.in);
            System.out.println("Enter the roll no: ");
            int roll=sc1.nextInt();
            ps.setInt(1,roll);

            Scanner sc2=new Scanner(System.in);
            System.out.println("Enter the student name: ");
            String name=sc2.nextLine();
            ps.setString(2, name);

            Scanner sc3=new Scanner(System.in);
            System.out.println("Enter the birth date: ");
            String dob=sc3.nextLine();
            ps.setString(3, dob);


            Scanner sc4=new Scanner(System.in);
            System.out.println("Enter the stream: ");
            String stream=sc4.nextLine();
            ps.setString(4, stream);

            Scanner sc5=new Scanner(System.in);
            System.out.println("Enter the marks: ");
            String marks=sc5.nextLine();
            ps.setString(5, marks);

            
            int RowsAdded=ps.executeUpdate();
            System.out.println("Rows Added : "+RowsAdded);

            ps.close();
            conn.close();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
