package school.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateStudent {
     public static void main(String[] args) {
    try{
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_master","root","admin");
        PreparedStatement ps=conn.prepareStatement("UPDATE student set stream=? where rollNo=?");

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the id to update : ");
        int id=sc1.nextInt();
        ps.setInt(2, id);

        
        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter new stream : ");
        String newStream=sc2.nextLine();
        ps.setString(1, newStream);
        
        int RowsUpdated=ps.executeUpdate();
        System.out.println("Rows Updated: "+RowsUpdated);

        ps.close();
        conn.close();


    }catch(SQLException e){
        System.out.println(e);
    }
  }  
}
