package donate.sell.buy;

import static donate.sell.buy.LoginFormDB.imageBytes;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.Border;
import java.io.IOException;
import java.net.*;
import javax.swing.border.SoftBevelBorder;


class Profile extends JFrame implements ActionListener
{     
      JPanel login,login3;
      JLabel login2;
      JLabel fname,rollno,gen,hname,rno,mno,pass,editor,logout;
       Font fn=new Font("Arial",Font.BOLD,18);
       JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
       JButton gohome,back,edit;
       Font f3=new Font("Arial ",Font.BOLD,15);
       ImageIcon pimg;
      static String x=null,temp="W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\uni.jpg";
      
    // x=login.user_value;
     

    Profile(){

     login=new JPanel();
     login.setLayout(null);
     login.setBackground(new Color(255,255,255,50));
     login.setBounds(380,65,900,600);
     pimg=new ImageIcon(temp);
     login2=new JLabel("",pimg,JLabel.CENTER);
     login2.setLayout(null);
     login2.setBackground(new Color(253,153,51));
     login2.setBounds(370,100,150,150);
     login3=new JPanel();
     login3.setLayout(null);
     login3.setBackground(new Color(253,153,51));
     login3.setBounds(50,10,700,60);
     login.add(login3);
     logout=new JLabel("<html><u>LogOut.??</u></html>");
	 logout.setFont(fn);
	 logout.setForeground(Color.WHITE);
	 logout.setBounds(770,20,100,30);
     login.add(logout);
     logout.setForeground(new Color(253,153,51));
     logout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     logout.addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() > 0) {
           Homepage.flag=0;
             new Homepage();
              setVisible(false); 
      }
   }
}); 
     editor=new JLabel("<html><h1>Here You Can <u>Edit Your</u> Profile Also Profile Picture</h1></html>");
	 editor.setFont(fn);
	 editor.setForeground(Color.WHITE);
	 editor.setBounds(50,15,600,30);
     login3.add(editor);
     login.add(login2);
     fname=new JLabel(" Name");
	 fname.setFont(fn);
	 fname.setForeground(Color.WHITE);
	 fname.setBounds(45,270,100,30);
     login.add(fname);
      //tf2=new PlaceholderTextField("");
		 tf1=new JTextField("");
		// tf2.setPlaceholder("      	 	        	 Roll No   ");
		 tf1.setFont(f3);
	 tf1.setBounds(150,270,300,30);
     login.add(tf1);
     rollno=new JLabel("Roll No");
	 rollno.setFont(fn);
	 rollno.setForeground(Color.WHITE);
	 rollno.setBounds(470,270,100,30);
     login.add(rollno);
      //tf2=new PlaceholderTextField("");
		 tf2=new JTextField("");
		// tf2.setPlaceholder("      	 	        	 Roll No   ");
		 tf2.setFont(f3);
	 tf2.setBounds(570,270,300,30);
		login.add(tf2);		 
		 gen=new JLabel("Gender");
	 gen.setFont(fn);
     gen.setForeground(Color.WHITE);
	 gen.setBounds(45,320,100,30);
    login.add(gen);
     tf3=new JTextField("");
		// tf2.setPlaceholder("      	 	        	 Roll No   ");
		 tf3.setFont(f3);
	 tf3.setBounds(150,320,300,30);
		login.add(tf3);		
	 hname=new JLabel("Hostel");
	 hname.setFont(fn);
     hname.setForeground(Color.WHITE);
	 hname.setBounds(470,320,100,30);
	 login.add(hname);
      tf4=new JTextField("");
		// tf2.setPlaceholder("      	 	        	 Roll No   ");
		 tf4.setFont(f3);
	 tf4.setBounds(570,320,300,30);
		login.add(tf4);	
      rno=new JLabel("Room No.");
	 rno.setFont(fn);
     rno.setForeground(Color.WHITE);
	 rno.setBounds(45,370,100,30);
      login.add(rno);
		//tf3=new PlaceholderTextField("");
		tf5=new JTextField("");
		 //tf3.setPlaceholder("               Hostel Name   ");
		 tf5.setFont(f3);
	 tf5.setBounds(150,370,300,30);
		 login.add(tf5);
		 mno=new JLabel("Mobile No.");
	 mno.setFont(fn);
	 mno.setBounds(470,370,100,30);
     mno.setForeground(Color.WHITE);
	 login.add(mno);
//tf4=new PlaceholderTextField("");
	 tf6=new JTextField("");
		 //tf4.setPlaceholder("      Room No	    ");
		 tf6.setFont(f3);
	 tf6.setBounds(570,370,300,30);
	 login.add(tf6);
	   pass=new JLabel("Password");
	 pass.setFont(fn);
	 pass.setBounds(45,420,100,30); 
     pass.setForeground(Color.WHITE);
	 login.add(pass);
		  //tf5=new PlaceholderTextField("");
		  tf7=new JTextField("");
		 //tf5.setPlaceholder("          Mobile No  ");
		 tf7.setFont(f3);
	 tf7.setBounds(150,420,300,30);
			login.add(tf7);
		
		 Font f=new Font("Arial",Font.BOLD,18);
	    gohome = new JButton("Go Home");
		gohome.addActionListener(this);
		gohome.setFont(f);
		gohome.setBounds(350,550,150,30);
        gohome.setFocusPainted(false);
		gohome.setBackground(new Color(253,153,51));
		gohome.setForeground(new Color(204,255,255));
		login.add(gohome);
	    back = new JButton("Back");
		back.addActionListener(this);
		back.setFont(f);
        back.setFocusPainted(false);
		back.setBounds(100,550,150,30);
		back.setBackground(new Color(253,153,51));
		back.setForeground(new Color(204,255,255));
		login.add(back);
	    edit = new JButton("Edit");
		edit.addActionListener(this);
		edit.setFont(f);
        edit.setFocusPainted(false);
		edit.setBounds(600,550,150,30);
		edit.setBackground(new Color(253,153,51));
		edit.setForeground(new Color(204,255,255));
		login.add(edit);
		//ImageIcon icn=new ImageIcon("uni.jpg");
	
     //frame
     setBounds(0,0,1400,770);
     setLayout(null);
     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

     //background   
     ImageIcon bi=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\profileback.jpg"); //BACKGROUND
      Image img=bi.getImage();
      Image temp=img.getScaledInstance(1400,770,Image.SCALE_SMOOTH);
      bi=new ImageIcon(temp);
     JLabel bg=new JLabel("",bi,JLabel.CENTER);
     bg.setBounds(0,0,1400,770);
     bg.add(login);
      add(bg);
      Image image;
      tf1.setText(LoginFormDB.name);
      tf2.setText(LoginFormDB.rollnum);
      tf3.setText(LoginFormDB.gen);
      tf4.setText(LoginFormDB.hostel);
      tf5.setText(LoginFormDB.room);
      tf6.setText(LoginFormDB.mobile);
      tf7.setText(LoginFormDB.password);
    image=getToolkit().createImage(imageBytes);
       ImageIcon icon=new ImageIcon(image);
       login2.setIcon(icon);
                   
      
                    
      
      
      
      
      
      
      
      
     setVisible(true);
     
     
     
     
    }
    public void actionPerformed(ActionEvent e)
	{
       if(e.getSource()==gohome)
	   {  
        new Homepage();
        setVisible(false);
       }
       if(e.getSource()==back)
	   {  
        new UserHomepage();
        setVisible(false);
       }
       if(e.getSource()==edit)
	   {  
        
                           String username=tf1.getText();
    		           String rollno=Homepage.user_Name;
                           String gender=tf3.getText();
			   String hstname=tf4.getText();
			   String r_no=tf5.getText();
			   String m_no=tf6.getText();
			   String password=tf7.getText();
			   String cpassword=tf7.getText();
         int i=LoginFormDB.Update_Profile(username,rollno,gender,hstname,r_no,m_no,password,cpassword);
         if(i>0)
                        {
                            JOptionPane.showMessageDialog(Profile.this," Data Updated successfully !!!");
                            //dispose();
                           // setVisible(false);
			  //new UserHomepage();
                      
                        }
	
                             
       }
    }
   /* public static void main(String args[])
    {
        new Profile();
    } */
}
  