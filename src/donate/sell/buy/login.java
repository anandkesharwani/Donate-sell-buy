package donate.sell.buy;

import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;
 import javax.swing.border.Border;
 import java.io.IOException;
 import java.net.*;
  
class Login extends JFrame implements ActionListener
{
   
    JPanel login;
    JLabel l1,jl1,jl2,jl3,cross;
    //PlaceholderTextField logintf1;
    JTextField logintf1;
    JPasswordField logintf2;
    JButton loginbtn;
   JFrame frame;
    
    
    Login()
    {
        
   //font
        
     Font f1=new Font("Serif ",Font.BOLD,50);
     Font f2=new Font("Serif ",Font.BOLD,60);
     Font f3=new Font("Blackmoor LET ",Font.BOLD,35);
     Font f4=new Font("Serif ",Font.BOLD,22);


     //login panel
     login=new JPanel();
     login.setLayout(null);
     login.setBackground(new Color(102,178,255));
     login.setBounds(500,135,400,500);
     l1=new JLabel("Login Here..");
     l1.setForeground(Color.BLUE);
     l1.setFont(f3);
     l1.setBounds(50,50,300,50);
     login.add(l1);
     ImageIcon uni=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\uni.png"); 
     Image img1=uni.getImage();
     jl1=new JLabel("",uni,JLabel.CENTER);
     jl1.setBounds(50,150,50,50);
     ImageIcon pi=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\pi.png"); 
     Image img2=uni.getImage();
     jl2=new JLabel("",pi,JLabel.CENTER);
     jl2.setBounds(50,210,50,50);
     //logintf1=new PlaceholderTextField("");
     logintf1=new JTextField("");
     //logintf1.setPlaceholder("    User ID    ");
     logintf1.setFont(f4);
     logintf1.setBounds(105,150,200,40);   
     logintf2=new JPasswordField("");
     //logintf2.setPlaceholder("    Password    ");
     logintf2.setFont(f4);
     logintf2.setBounds(105,215,200,40);
     loginbtn=new JButton("Login");
     
     loginbtn.setBounds(250,370,120,40);
     loginbtn.setBackground(Color.BLUE);
     loginbtn.setForeground(Color.WHITE);
     loginbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     jl3=new JLabel("<html><u>forgetpassword.??</u></html>");
     jl3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     jl3.addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() > 0) {
             new ForgetPassword();
               
      }
   }
});
     ImageIcon cros=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\cross.png"); 
     Image img=cros.getImage();
     cross=new JLabel("",cros,JLabel.CENTER);
     cross.setBounds(910,110,32,32);
     cross.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     cross.addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() > 0) {
                 frame.setVisible(false);
                 }
   }
}); 
     
     JLabel linkforreg=new JLabel("<html><u>not a Member.??</u></html>");
     linkforreg.setForeground(Color.RED);
     linkforreg.setBounds(250,280,120,20);
     login.add(linkforreg);
     linkforreg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     linkforreg.addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() > 0) {
             new SignUp();
               
      }
   }
}); 
    

     jl3.setForeground(Color.RED);
     //linkforreg.setForeground(Color.BLUE);
     jl3.setBounds(50,280,120,20);
     //linkforreg.setBounds(250,280,120,20);
     login.add(jl3);
    // login.add(linkforreg);
     login.add(loginbtn);
     loginbtn.addActionListener(this);
     login.add(jl1);
     login.add(jl2);
     login.add(logintf1);
     login.add(logintf2);


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
            
  
                if(e.getSource()==loginbtn)
                {
		String log_user=logintf1.getText();
                Homepage.user_Name=logintf1.getText();
               // user_value=logintf1.getText();
                String mobile_no = LoginFormDB.Compare_roll_no(log_user);
                Homepage.mobile_no=mobile_no;
                //JOptionPane.showMessageDialog(Login.this,user_Name);
		String log_pass=String.valueOf(logintf2.getPassword());
		boolean j= LoginFormDB.Compare(log_user,log_pass);
		if(j==true)
		{
			//JOptionPane.showMessageDialog(Login.this,"successfully login");
                        //JOptionPane.showMessageDialog(null,"successfully login" );
                        Homepage.flag=1;
                        int i=LoginFormDB.Compare_name(Homepage.user_Name);
               if(i>0)
               {
                   
                      new UserHomepage();
                      frame.setVisible(false);
                }
             
            dispose();
        
           // System.out.println(" hhhhhh");
            
		}
		else
		{
			JOptionPane.showMessageDialog(Login.this,"User Id or Password Incorrect");
			logintf1.setText("");
			logintf2.setText("");
            dispose();
		} 
                
                }
		
	} 
    public static void main(String args[])
    {
        new Login();
        
    }
}