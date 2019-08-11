package donate.sell.buy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author lenovo
 */
public class Donate_Database {
    
    public static int save(String don_name,String don_address,String time_slot,String don_mob_no){   
		int status=0;
		try{
			Connection con=Donate.getConnection();
			PreparedStatement ps=con.prepareStatement("INSERT INTO donater_detail(don_name, don_address, time_slot, don_mob_no) VALUES(?,?,?,?)");
			ps.setString(1,don_name);
			ps.setString(2,don_address);
                        ps.setString(3,time_slot);
			ps.setString(4,don_mob_no);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
}
    
}
class Donate {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/donate?autoReconnect=true&useSSL=false","root","54321");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
}

