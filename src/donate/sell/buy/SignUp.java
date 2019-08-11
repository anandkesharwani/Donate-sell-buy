package donate.sell.buy;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
class SignUp extends JFrame implements ActionListener//,ItemListener
{
	JLabel sign,log,s1,s2,s3,s4,s5,s6,s7,s8;
	JLabel fname,lname,gen,branch,hname,rno,mno,pass,cpass,cross;
	JTextField tf1,tf2,tf3,tf4,tf5;
	JPasswordField tf6,tf7;	
    JButton submit,button2,pro;
	JRadioButton r1,r2,r3;
	public  String x1=null,sname="";
	final JFrame frame;
	ButtonGroup bg;
        ImageIcon icn;
        int r_mg=0;
        JPanel login;
    SignUp()
    {
		
        
        
        
        //font
     Font f1=new Font("Serif ",Font.BOLD,27);
     Font f2=new Font("Serif ",Font.BOLD,60);
     Font f3=new Font("Arial ",Font.BOLD,15);

     //header
      login=new JPanel();
	 JPanel header=new JPanel();
	 header.setBackground(Color.CYAN);
	 header.setBounds(0,0,550,80);
	 login.setBackground(Color.WHITE);
     login.setBounds(425,62,550,675);
	 login.setLayout(null);
	 header.setLayout(null);
	 login.add(header);
	 sign=new JLabel("SignUp");
	 sign.setForeground(Color.WHITE);
	 sign.setFont(f1);
	 sign.setBounds(240,0,100,50);
	 header.add(sign);
         
ImageIcon cros=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\cross.png"); 
     Image img=cros.getImage();
     cross=new JLabel("",cros,JLabel.CENTER);
     cross.setBounds(985,35,32,32);
     cross.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     cross.addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() > 0) {
                 frame.setVisible(false);
                 }
   }
}); 
	 //log=new JLabel("Already Existing User??");
	 //log.setForeground(Color.WHITE);
	// log.setFont(f1);
	 //log.setBounds(450,195,120,10);
	 //header.getContentPane().add(log,BorderLayout.SOUTH);
	 //header.add(log,BorderLayout.SOUTH);
	
	 //Signup Info
	 Font fn=new Font("Arial",Font.BOLD,18);
	 Font str=new Font("Arial",Font.BOLD,17);
	 fname=new JLabel("User Name");
	 fname.setFont(fn);
	 fname.setBounds(45,100,160,30);
	 s1=new JLabel("*");
		 s1.setBounds(142,110,40,14);
		 s1.setForeground(Color.RED);
		 s1.setFont(str);
		login.add(s1);
	 //tf1=new PlaceholderTextField("");
	 tf1=new JTextField("");
	 //tf1.setPlaceholder("    		  	      User Name   ");
     tf1.setFont(f3);
	 tf1.setBounds(45,132,300,30);
	 login.add(fname);
	 login.add(tf1);
	 
	 lname=new JLabel("Roll No");
	 lname.setFont(fn);
	 lname.setBounds(45,180,160,30);
	 s2=new JLabel("*");
		 s2.setBounds(110,190,40,14);
		 s2.setForeground(Color.RED);
		 s2.setFont(str);
		 //tf2=new PlaceholderTextField("");
		 tf2=new JTextField("");
		// tf2.setPlaceholder("      	 	        	 Roll No   ");
		 tf2.setFont(f3);
	 tf2.setBounds(45,210,300,30);
		 login.add(lname);
		 login.add(s2);
		 login.add(tf2);
		 
		 gen=new JLabel("Gender");
	 gen.setFont(fn);
	 gen.setBounds(45,265,100,30);
	 s3=new JLabel("*");
		 s3.setBounds(112,275,40,14);
		 s3.setForeground(Color.RED);
		 s3.setFont(str);
		 login.add(s3);
	      bg = new ButtonGroup();     
	 r1=new JRadioButton("Male");
	 r1.setActionCommand("Male");
	 r2=new JRadioButton("Female");
	 r2.setActionCommand("Female");
	 r3=new JRadioButton("Other");
	 r3.setActionCommand("Other");
	 r1.setSelected(true);
	 bg.add(r1);
	 bg.add(r2);
	 bg.add(r3);
	 login.add(gen);
	 login.add(r1);
	 login.add(r2);
	 login.add(r3);
	 r1.setFocusPainted(false);
	 r2.setFocusPainted(false);
	 r3.setFocusPainted(false);
	 r1.setFont(fn);
	 r1.setBounds(145,265,90,30);
	 r2.setFont(fn);
	 r2.setBounds(265,265,110,30);
	 r3.setFont(fn);
	 r3.setBounds(400,265,110,30);
	 hname=new JLabel("Hostal Name");
	 hname.setFont(fn);
	 hname.setBounds(45,308,140,30);
	 login.add(hname);
	  s4=new JLabel("*");
	 s4.setBounds(157,318,40,14);
		 s4.setForeground(Color.RED);
		 s4.setFont(str);
		//tf3=new PlaceholderTextField("");
		tf3=new JTextField("");
		 //tf3.setPlaceholder("               Hostel Name   ");
		 tf3.setFont(f3);
	 tf3.setBounds(45,340,470,30);
		 login.add(tf3);
		 login.add(s4);
		 
		rno=new JLabel("Room No.");
	 rno.setFont(fn);
	 rno.setBounds(45,385,140,30);
	 s5=new JLabel("*");
	 s5.setBounds(132,395,40,14);
		 s5.setForeground(Color.RED);
		 s5.setFont(str);
		
	 //tf4=new PlaceholderTextField("");
	 tf4=new JTextField("");
		 //tf4.setPlaceholder("      Room No	    ");
		 tf4.setFont(f3);
	 tf4.setBounds(45,415,150,30);
	 login.add(tf4);
	 login.add(s5);
	 login.add(rno);
	 
	 mno=new JLabel("Mobile No.");
	 mno.setFont(fn);
	 mno.setBounds(280,385,140,30);
	 s6=new JLabel("*");
	 s6.setBounds(372,395,40,14);
		 s6.setForeground(Color.RED);
		 s6.setFont(str);
		  //tf5=new PlaceholderTextField("");
		  tf5=new JTextField("");
		 //tf5.setPlaceholder("          Mobile No  ");
		 tf5.setFont(f3);
	 tf5.setBounds(280,415,237,30);
			login.add(tf5);
		 login.add(mno);
		 login.add(s6);
		 
		pass=new JLabel("Password");
	 pass.setFont(fn);
	 pass.setBounds(45,455,140,30);
	 s7=new JLabel("*");
	 s7.setBounds(134,462,40,14);
		 s7.setForeground(Color.RED);
		 s7.setFont(str);
         tf6=new JPasswordField();
		 //tf6.setPlaceholder("          			Create  Password     ");
		 tf6.setFont(f3);
	 tf6.setBounds(45,486,470,30);
			login.add(tf6);
		 login.add(pass);
		 login.add(s7);
		 
		 cpass=new JLabel("Confirm Password");
	 cpass.setFont(fn);
	 cpass.setBounds(45,527,200,30);
	 s8=new JLabel("*");
	 s8.setBounds(208,534,40,14);
		 s8.setForeground(Color.RED);
		 s8.setFont(str);
		 tf7=new JPasswordField();
		 //tf7.setPlaceholder("      	 			  Confirm Password   ");
		 tf7.setFont(f3);;
	 tf7.setBounds(45,558,470,30);
			login.add(tf7);
		 login.add(cpass);
		 login.add(s8);
		 Font f=new Font("Arial",Font.BOLD,18);
	    submit = new JButton("Register");
		submit.addActionListener(this);
 		submit.setFont(f);
		submit.setBounds(350,608,130,30);
		submit.setBackground(new Color(253,153,51));
		submit.setForeground(new Color(204,255,255));
		login.add(submit);
                
                
            
                
		icn=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\uni.jpg");
	pro=new JButton(icn);
	pro.setBounds(364,105,140,131);
	login.add(pro);

	//link
 pro.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
            JFileChooser fc = new JFileChooser();
            int result = fc.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                String snam =fc.getSelectedFile().getAbsolutePath();
                sname=snam.replace( '\\', '/');
               icn=new ImageIcon(sname);
        pro.setIcon(icn);
	pro.setBounds(364,105,140,131);
	
               
                
                
            }
        }
    });
		 
	
	   
	 //frame
     setBounds(0,0,1400,770);
     setLayout(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     //background
	 
    JPanel cg=new JPanel();
     cg.setLayout(null);
     cg.setBackground(new Color(0,0,0,0));
     cg.setBounds(0,0,1400,770);
	cg.add(cross);
     cg.add(login);
	  frame = new JFrame();
	 frame.setUndecorated(true);
	 frame.add(cg);
        frame.setSize(1400, 770);
        frame.setLocation(0, 0);
        frame.setBackground(new Color(0,0,0,150));

        //frame.getContentPane().add(button, BorderLayout.WEST);
        frame.setVisible(true);
       
     //add(login);
     //setVisible(true); */
    }

	 public void actionPerformed(ActionEvent ae) {
    		       //String a=x1; 
                       
                       if(ae.getSource()==submit)
                       {
				 x1=bg.getSelection().getActionCommand();

             String username=tf1.getText();
    		 String rollno=tf2.getText();
			 String hstname=tf3.getText();
			 String r_no=tf4.getText();
			 String m_no=tf5.getText();
			 String password=String.valueOf(tf6.getPassword());
			 String cpassword=String.valueOf(tf7.getPassword());
                             
			// if(password.equals(cpassword)==cpassword.equals(password))
			 //if(password==cpassword)
                         if(username.isEmpty()!=true || rollno.isEmpty()!=true|| hstname.isEmpty()!=true || r_no.isEmpty()!=true || m_no.isEmpty()!=true || password.isEmpty()!=true || cpassword.isEmpty()!=true)
                         {
                             
                            if(password.equals(cpassword))
                            {
				  int i=LoginFormDB.save(username,rollno,x1,hstname,r_no,m_no,password,cpassword,sname);
			if(i>0)
                        {
                            JOptionPane.showMessageDialog(SignUp.this," Data entered successfully !!!");
                            dispose();
							frame.setVisible(false);
                        
						
                            
                        }
				//LibrarianSuccess.main(new String[]{});
						}
				//frame.dispose();
			else
                              {
			      JOptionPane.showMessageDialog(SignUp.this,"You have entered wrong Password !!");
			       	//            JOptionPane.showMessageDialog(LoginForm.this,"Please Entered Right Password !!");
			                  }
							  

			 }
			 
			 else
			 {
        
                                     if(password.equals(cpassword)==false)
                            {
				 
				 JOptionPane.showMessageDialog(SignUp.this,"Password not matched!!");
				 
                                    dispose();
                            }
                                     else
                                     {
                                         JOptionPane.showMessageDialog(SignUp.this,"Please Enterd Mandatory Field!!"); 
                                          
                                           }
                                     
			 }
                       }
			}
    /*public static void main(String args[])
    {
        new SignUp();
    }*/
}