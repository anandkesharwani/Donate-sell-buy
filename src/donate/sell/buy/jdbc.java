import java.sql.*; 
class MysqlCon{  
public static void main(String args[]){  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sellbuy?autoReconnect=true&useSSL=false","root","54321");  
//here sonoo is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select mobile_no from user_history where user_id=27 ");  
while(rs.next())  
System.out.println(rs.getString(7));//rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getInt(3));  
con.close();  
}catch(Exception e){ System.out.println(e);}  
}  
}  
