package mypham;

import java.sql.Statement; 
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;

public class home {
    private static  String url = "jdbc:mysql://localhost:3306/quanly_mypham?autoReconnect=true&useSSL=false"; // sửa 'ueSSL' thành 'useSSL'
    private static String username = "root";
    private static String password = "1234";
    
    public static  Connection getConnection() throws ClassNotFoundException, SQLException {
        // Nạp driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // Trả về kết nối
        return DriverManager.getConnection(url, username, password);
        
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection con=getConnection();
        if(con!=null){
            //truy van ,update du lieu
            Statement stmt=con.createStatement();
            stmt.
            
        }
        else{
            System.out.println("failed");
            
            
        }
    }
          
}
