/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donate.sell.buy;

import static donate.sell.buy.Homepage.flag;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;
class ForgetPassword extends JFrame implements ActionListener
{
    JPanel login,header,bck,up;
    JLabel l,b1l,b3l,sign,jlll,cross;
    JButton b2;
    JFrame frame;
    //PlaceholderTextField usertf;
    JTextField usertf;
    JPasswordField usertf3;
         int current = 0;
    Font f1=new Font("Serif ",Font.BOLD,24);
     Font f2=new Font("Serif ",Font.BOLD,60);
     Font f3=new Font("Arial ",Font.BOLD,15);
     Font f=new Font("Arial",Font.BOLD,15);
     Font f4=new Font("Serif ",Font.BOLD,22);
  ForgetPassword()
    {
		
        //font
     

     //header
     login=new JPanel();
	 header=new JPanel();
	 bck=new JPanel();
	 up=new JPanel();
	 header.setBackground(new Color(255,255,255));
	 bck.setBackground(new Color(224,224,224));
	 up.setBackground(new Color(225,0,0));
	 header.setBounds(75,100,350,400);
	 up.setBounds(0,0,350,70);
	 bck.setBounds(0,350,350,50);
	 login.setBackground(new Color(53,51,224));
     login.setBounds(450,100,500,570);
	 login.setLayout(null);
	 header.setLayout(null);
	 bck.setLayout(null);
	 up.setLayout(null);
	 login.add(header);
     header.add(bck);
     header.add(up);
	 sign=new JLabel("Forget Your Password ?");
	 sign.setForeground(Color.WHITE);
	 sign.setFont(f1);
	 sign.setBounds(20,10,400,50);
	 up.add(sign);

         ImageIcon cros=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\cross.png"); 
     Image img=cros.getImage();
     cross=new JLabel("",cros,JLabel.CENTER);
     cross.setBounds(960,70,32,32);
     cross.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     cross.addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() > 0) {
                 frame.setVisible(false);
                 }
   }
}); 
     
         
     // Start 	 
        l=new JLabel();
        jlll=new JLabel();
		header.add(l);
		l.add(jlll);
        jlll.setFont(f1);
      //  usertf=new PlaceholderTextField("");
        usertf=new JTextField("");
        header.add(usertf);
        usertf3=new JPasswordField("");
        header.add(usertf3);
        b3l=new JLabel();
        header.add(b3l);
        b2=new JButton("Next");
        b2.addActionListener(this);
        b2.setFocusPainted(false);
        set();
        b1l=new JLabel("<html><u> back to login</u>..?</html>");
        b1l.addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() > 0) {
             new Homepage();
             frame.setVisible(false);
           }
         }
       });
        b1l.setForeground(Color.BLUE); 
        b1l.setBounds(30,17,120,20);
		b1l.setFont(f);
		b2.setFont(f);
		b2.setBounds(200,290,120,35);
		b2.setBackground(new Color(255,0,0));
		b2.setForeground(new Color(255,255,255));
		bck.add(b1l);
		header.add(b2);
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
       
    }
    public void actionPerformed(ActionEvent e)
	{   
    String mob;
		if(e.getSource()==b2)
		{
            if(current==0)
            {
                String come=usertf.getText();
                Homepage.user_Name=usertf.getText();
                mob = LoginFormDB.Compare_roll_no(come);
                if(mob==null)
                {
                JOptionPane.showMessageDialog(ForgetPassword.this,"User Id Not Exist");
                usertf.setText("");
                }
                else
                {
                jlll.setText(mob);
                usertf.setText("");
                current++;
                }
                 set();
            }	
            else if(current==1)
            {
                String come=usertf.getText();
               	boolean j= LoginFormDB.Compare_mobile_no(come);
		        if(j==true)
		         {
                 usertf.setText("");
                 current++;
                 //jlll.setText("");            
		         }
		        else
		         {
		           JOptionPane.showMessageDialog(ForgetPassword.this,"Please Enter Corect Mobile Number");
		           usertf.setText("");
                 
		         } 
                 set();
            }	
			else//(current==3)
			{
				String m_no=jlll.getText();
                String password=String.valueOf(usertf3.getPassword());
			    String cpassword=usertf.getText();
                if(password.equals(cpassword))
			    {
				  int i=LoginFormDB.Update_Password(m_no,password,cpassword);
			      if(i>0)
                  {
                  JOptionPane.showMessageDialog(ForgetPassword.this," Password Changed successfully !!!");
                  dispose();
                  int j=LoginFormDB.Compare_name(Homepage.user_Name);
               if(j>0)
               {
                       flag=1;
                      new UserHomepage();
                }
                 
				  //frame.setVisible(false);
				  }
                  else
			      JOptionPane.showMessageDialog(ForgetPassword.this,"You have entered wrong Password !!");
                }
			   else
			    {
				 usertf3.setText("");
				 usertf.setText("");
                 JOptionPane.showMessageDialog(ForgetPassword.this,"Password not matched!!");
				 dispose();
			     } 
                
			}
		}
    }
    void set()
	{
		if(current==0)
		{
			l.setText("<html><h3>Don't Worry.! Just <u><b>fill your USER ID </u></b>and we'll<br> help you reset your password.</h3></html>");
            l.setBounds(15,110,350,40);
           /// usertf1=new PlaceholderTextField("");
           // usertf.setPlaceholder("     Roll No    ");
            usertf.setFont(f4);
            usertf.setBounds(15,200,300,40);
				
		}
		else if(current==1)
		{
            l.setText("<html><h3>Your Registered Mobile No is :  <br><br> <u>Enter </u>Your <u>Above</u> Registered Mobile No.</h3></html>");
            jlll.setBounds(220,10,100,20);
            l.setBounds(15,70,350,80);
           // usertf.setPlaceholder("     Mobile No    ");
            usertf.setFont(f4);
            usertf.setBounds(15,200,300,40);
			
		}
		else//(current==2)
		{
            l.setText("<html><h3>New Password :</h3></html>");
            l.setBounds(15,80,350,20);
            //usertf3=new PlaceholderTextField("");
           // usertf3.setPlaceholder("    New Password    ");
            usertf3.setFont(f4);
            usertf3.setBounds(15,105,300,40);
            b3l.setText("<html><h3>Confirm Password :</h3></html>");
            b3l.setBounds(15,165,200,20);
           // usertf4=new PlaceholderTextField("");
           // usertf.setPlaceholder("    Confirm Password  ");
            usertf.setFont(f4);
            usertf.setBounds(15,200,300,40);           
			
		}
    }
   /* public static void main(String args[])
    {
        new ForgetPassword();
    }*/
}