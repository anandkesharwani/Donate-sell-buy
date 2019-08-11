package donate.sell.buy;


//import static donate.sell.buy.LoginFormDB.buyimage;
import static donate.sell.buy.LoginFormDB.id;
import static donate.sell.buy.LoginFormDB.imageBytes;
import java.awt.Frame;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;

class SubmitAddDatabase extends Frame 
{
    static byte[] buyimage1,buyimage2,buyimage3,buyimage4;
    static String  buy_title,buy_price,buy_disc,buy_name,buy_roll,buy_mbl;
    static int s=1;
    static int id=0;
     
    int i;
    	
	public static int save(String user_roll,String book_title,String book_catagory,String book_discription,String book_image1,String book_image2,String book_image3,String book_image4,String book_price,String mobile_no,String user_name){   
		int status=0;
		try{
			Connection con=submitAddDB.getConnection();
                        PreparedStatement ps=con.prepareStatement("INSERT INTO book(user_roll,book_title,book_catagory,book_discription,book_image1,book_image2,book_image3,book_image4,book_price,mobile_no,user_name) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,user_roll);
			ps.setString(2,book_title);
                        ps.setString(3,book_catagory);
			ps.setString(4,book_discription);
                        ps.setString(9,book_price);
                        ps.setString(10,mobile_no);
                        ps.setString(11,user_name);
			File f1=new File(book_image1);
                        FileInputStream fis1 =new FileInputStream(f1);
                        ps.setBinaryStream(5,fis1);
                        
                         File f2=new File(book_image2);
                        FileInputStream fis2 =new FileInputStream(f2);
                        ps.setBinaryStream(6,fis2);
                        
                        File f3=new File(book_image3);
                        FileInputStream fis3 =new FileInputStream(f3);
                        ps.setBinaryStream(7,fis3);
                        
                         File f4=new File(book_image4);
                        FileInputStream fis4 =new FileInputStream(f4);
                        ps.setBinaryStream(8,fis4);
                       
                       
                        
			status=ps.executeUpdate();
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
         public static int fetch_image(int user_id)
        {
           
           int st2=0;
            //int user_id=1;
           
             Connection con=loginDB.getConnection();
             //for(int j=1;j<=SubmitAd.imgcount;j++)
            // {
            
            try
            {
            
               //  user_id=s;
             PreparedStatement ps=con.prepareStatement("select book_image1,book_image2,book_image3,book_image4,book_title,book_price,book_discription,user_name,user_roll,mobile_no from book where user_id=? ");
             ps.setInt(1,user_id);
             ResultSet rs=ps.executeQuery();
             if(rs.next()) 
             {
             buyimage1=rs.getBytes("book_image1");
             buyimage2=rs.getBytes("book_image2");
             buyimage3=rs.getBytes("book_image3");
             buyimage4=rs.getBytes("book_image4");
             buy_title=rs.getString("book_title");
             buy_price=rs.getString("book_price");
             buy_disc=rs.getString("book_discription");
             buy_name=rs.getString("user_name");
             buy_roll=rs.getString("user_roll");
             buy_mbl=rs.getString("mobile_no");
             st2++;
             }
                
                 
             }
                        
             
               		   
            
            catch( Exception e)
            {
                     System.out.println(e);
                
            }
            
           
        
       
            return st2;
             
        
        }
         
          public static int fetch_id()
        {
            int z=0;
            
            try
            {
             Connection con=loginDB.getConnection();
             PreparedStatement ps=con.prepareStatement("select user_id from book");
              	   ResultSet rs=ps.executeQuery();
                            
               if(rs.next())
			   {
                               id++;
                               z++;
                          
			   }
               		   
            }
            
            catch(Exception e)
                    {
                      System.out.println(e);
                    }
            return z;
                    
        }
                 
                 
                
         
	
       
}
class submitAddDB {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/donate?autoReconnect=true&useSSL=false","root","54321");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
}

