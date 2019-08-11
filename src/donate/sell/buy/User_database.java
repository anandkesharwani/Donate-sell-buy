/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donate.sell.buy;



import static com.sun.javafx.tk.Toolkit.getToolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Statement;
import javax.swing.*;
 


class LoginFormDB extends Frame {
    
   static String name=null,gen=null,hostel=null,room=null,mobile=null,password=null,rollnum,cpass,uname;
   static int id;
   static byte[] imageBytes;
  // static Image image;
	
	public static int save(String user_name,String roll_no,String gender,String hostal_name,String room_no,String mobile_no,String pass_word,String con_password,String sname){   
		int status=0;
		try{
			Connection con=loginDB.getConnection();
			PreparedStatement ps=con.prepareStatement("INSERT INTO user_history(user_name,roll_no,gender,hostal_name,room_no,mobile_no,pass_word,con_password,image) VALUES(?,?,?,?,?,?,?,?,?)");
			ps.setString(1,user_name);
			ps.setString(2,roll_no);
                        ps.setString(3,gender);
			ps.setString(4,hostal_name);
			ps.setString(5,room_no);
			ps.setString(6,mobile_no);
			ps.setString(7,pass_word);
			ps.setString(8,con_password);
                        File f=new File(sname);
                   // "C://Users//Lenovo//Desktop//image//"
                FileInputStream fis =new FileInputStream(f);
                
                         ps.setBinaryStream(9,fis);
                        
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
	public static int Update_Password(String mobile_no,String pass_word,String con_password){   
		int status=0;
		try{
			Connection con=loginDB.getConnection();
			PreparedStatement ps=con.prepareStatement("UPDATE user_history SET pass_word=?, con_password=? WHERE mobile_no=?");
			ps.setString(1,pass_word);
			ps.setString(2,con_password);
			ps.setString(3,mobile_no);
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
        
        public static int Update_Profile(String user_name,String roll_no,String gender,String hostal_name,String room_no,String mobile_no,String pass_word,String con_password){   
		int status=0;
		try{
			Connection con=loginDB.getConnection();
			PreparedStatement ps=con.prepareStatement("UPDATE user_history SET user_name=?, gender=?, hostal_name=?, room_no=?,mobile_no=?,pass_word=?, con_password=? WHERE roll_no=?");
			ps.setString(1,user_name);
			ps.setString(2,gender);
			ps.setString(3,hostal_name);
			ps.setString(4,room_no);
			ps.setString(5,mobile_no);
			ps.setString(6,pass_word);
			ps.setString(7,con_password);
                        ps.setString(8,roll_no);
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
       public static boolean Compare(String roll_no,String pass_word)
        {
            boolean sts=false;
            try
            {
             Connection con=loginDB.getConnection();
             PreparedStatement ps=con.prepareStatement("select * from user_history where roll_no =? and pass_word=?");
               ps.setString(1,roll_no);
               ps.setString(2,pass_word);
             ResultSet rs = ps.executeQuery();
			   sts=rs.next();
               con.close();
            }
            catch(Exception e)
                    {
                      System.out.println(e);
                    }
            return sts; 
           
        }
		public static String Compare_roll_no(String roll_no)
		{
			String mobno=null;
            try
            {
             Connection con=loginDB.getConnection();
             PreparedStatement ps=con.prepareStatement("select mobile_no from user_history where roll_no =?");
			   ps.setString(1,roll_no);
			   ResultSet rs=ps.executeQuery();
               if(rs.next())
			   {
				   mobno=rs.getString("mobile_no");
			   }
               		   
            }
            catch(Exception e)
                    {
                      System.out.println(e);
					}
           return mobno;
        }
		public static boolean Compare_mobile_no(String mobile_no)
        {
            boolean sts=false;
            try
            {
             Connection con=loginDB.getConnection();
             PreparedStatement ps=con.prepareStatement("select * from user_history where mobile_no =?");
               ps.setString(1,mobile_no);
             ResultSet rs = ps.executeQuery();
			   sts=rs.next();
               con.close();
            }
            catch(Exception e)
                    {
                      System.out.println(e);
                    }
            return sts; 
           
        }
                
                 public static int fetch_data(String roll_no)
        {
            int st1=0;
            try
            {
             Connection con=loginDB.getConnection();
             PreparedStatement ps=con.prepareStatement("select * from user_history where roll_no =?");
              ps.setString(1,roll_no);
             
           		   ResultSet rs=ps.executeQuery();
               if(rs.next())
			   {
                               
                                    id=rs.getInt("user_id");
				   name=rs.getString("user_name");
                                   rollnum=rs.getString("roll_no");
                                   gen=rs.getString("gender");
                                   hostel=rs.getString("hostal_name");
                                   room=rs.getString("room_no");
                                   mobile=rs.getString("mobile_no");
                                   password=rs.getString("pass_word");
                                   cpass=rs.getString("con_password");
                                    imageBytes=rs.getBytes("image");
                                     
                                    st1++;
                                    
			   }
               		   
            }
            
            catch(Exception e)
                    {
                      System.out.println(e);
                    }
            return st1; 
           
        }
                 public static int Compare_name(String roll_no)
		{
			int n=0;
            try
            {
             Connection con=loginDB.getConnection();
             PreparedStatement ps=con.prepareStatement("select user_name from user_history where roll_no =?");
			   ps.setString(1,roll_no);
			   ResultSet rs=ps.executeQuery();
               if(rs.next())
			   {
				   uname=rs.getString("user_name");
                                   n=1;
			   }
               		   
            }
            catch(Exception e)
                    {
                      System.out.println(e);
					}
           return n;
        }
                
               
}
class loginDB {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/donate?autoReconnect=true&useSSL=false","root","54321");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
}

