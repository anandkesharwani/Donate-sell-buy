/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donate.sell.buy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author lenovo
 */
public class Member_Database {
    public static int save(String Mem_name,String Mem_address,String Mem_Occupation,String Mem_mob_no){   
		int status=0;
		try{
			Connection con=Member_Con.getConnection();
			PreparedStatement ps=con.prepareStatement("INSERT INTO member(Mem_name, Mem_address, Mem_Occupation, Mem_mob_no) VALUES(?,?,?,?)");
			ps.setString(1,Mem_name);
			ps.setString(2,Mem_address);
                        ps.setString(3,Mem_Occupation);
			ps.setString(4,Mem_mob_no);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
}
    
}
class Member_Con {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/donate?autoReconnect=true&useSSL=false","root","54321");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
}

