import java.sql.*;
public class ConnectionManager {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
// TODO Auto-generated method stub
final String driver="com.mysql.cj.jdbc.Driver";
final String url="jdbc:mysql://127.0.0.3306/test";
final String username="root";
final String password="";
Class.forName(driver);
Connection connection=null;
connection =DriverManager.getConnection(url,username,password);
if(connection!=null)
{
System.out.println("The Connection has established successfully");
}
else
System.out.println("The Connection has not established successfully");
}

}
