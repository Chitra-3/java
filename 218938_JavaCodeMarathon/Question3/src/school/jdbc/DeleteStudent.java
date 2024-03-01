package school.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteStudent {
    public static void main(String[] args) {
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp_master","root","admin");
            PreparedStatement ps=conn.prepareStatement("DELETE FROM student WHERE rollNo=?");

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the id to delete: ");
            int del_id=sc.nextInt();
            ps.setInt(1, del_id);

            int RowsDeleted=ps.executeUpdate();
            System.out.println("Rows deleted: "+RowsDeleted);
            ps.close();
            conn.close();
        }catch(SQLException e){
            System.out.println(e);
        }
    }

}
