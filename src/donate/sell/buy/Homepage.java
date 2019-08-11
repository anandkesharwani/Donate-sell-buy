package donate.sell.buy;


 import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;
 import javax.swing.border.Border;
 import java.io.IOException;
 import java.net.*;

class Homepage extends JFrame implements ActionListener 
{  
     public static String user_Name,mobile_no;
    static int flag=0;
    Font f1,f2,f3,f4;
    JPanel heading,login;
    JLabel name1,l1,jl1,jl2;
    //PlaceholderTextField logintf1,searchtf;
    TextField logintf1,searchtf;
    JPasswordField logintf2;
    JButton loginbtn;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    JButton donbtn,selbtn,buybtn,adminbtn;
    Homepage()
    {
        
        //font
    f1=new Font("Serif ",Font.BOLD,50);
    f2=new Font("Serif ",Font.BOLD,60);
    f3=new Font("Blackmoor LET ",Font.BOLD,35);
    f4=new Font("Serif ",Font.BOLD,22);
     
     //header
     heading=new JPanel();
     heading.setBackground(new Color(51,153,225,180));
     heading.setBounds(0,40,1400,80);
     //JLabel name=new JLabel("Welcome to the NIT KURUKSHETRA");
     name1=new JLabel(" SELL BUY Exclusive Portal");
    // name.setForeground(Color.WHITE);
     name1.setForeground(Color.WHITE);
    // name.setFont(f1);
     name1.setFont(f2);
     //name.setBounds(50,20,800,50);
     name1.setBounds(150,90,400,50);
     //heading.add(name);
     heading.add(name1);
 

     //login panel
     login=new JPanel();
     login.setLayout(null);
     login.setBackground(new Color(255,255,255,150));
     login.setBounds(70,145,400,500);
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
     logintf1=new TextField("");
     //logintf1.setPlaceholder("    User ID    ");
     logintf1.setFont(f4);
     logintf1.setBounds(105,150,200,40);   
     logintf2=new JPasswordField();
     logintf2.setFont(f4);
     logintf2.setBounds(105,215,200,40);
     loginbtn=new JButton("Login");
     loginbtn.addActionListener(this);
     loginbtn.setBounds(250,370,120,40);
     loginbtn.setBackground(Color.BLUE);
     loginbtn.setForeground(Color.WHITE);
     loginbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     
     adminbtn=new JButton("Admin Login");
     adminbtn.addActionListener(this);
     adminbtn.setBounds(50,370,120,40);
     adminbtn.setFocusPainted(false);
     adminbtn.setBackground(Color.BLUE);
     adminbtn.setForeground(Color.WHITE);
     adminbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    login.add(adminbtn);
    
     JLabel jl3=new JLabel("<html><u>forgetpassword.??</u></html>");
     JLabel linkforreg=new JLabel("<html><u>not a Member.??</u></html>");
     linkforreg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     linkforreg.addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() > 0) {
             new SignUp();
               
      }
   }
}); 
     
     JLabel linkfordemo=new JLabel("<html><u>Know About Developers.??</u></html>");
     linkfordemo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     linkfordemo.addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() > 0) {
             new Devlopers();
               
      }
   }
}); 
     
     
     jl3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     jl3.addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() > 0) {
             new ForgetPassword();
               
      }
   }
});

     jl3.setForeground(Color.BLUE);
     linkforreg.setForeground(Color.BLUE);
     linkfordemo.setForeground(Color.BLUE);
     jl3.setBounds(50,280,120,20);
     linkforreg.setBounds(250,280,120,20);
     linkfordemo.setBounds(140,450,200,30);
     login.add(jl3);
     login.add(linkforreg);
     login.add(linkfordemo);
     login.add(loginbtn);
     login.add(jl1);
     login.add(jl2);
     login.add(logintf1);
     login.add(logintf2);


     //Search panel
     ImageIcon emg=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\buy.png"); //VANDE MATRAM
     Image eg=emg.getImage();
     JLabel jlemg=new JLabel("",emg,JLabel.CENTER);
     jlemg.setBounds(20,17,400,50);
     //searchtf=new PlaceholderTextField("");
     searchtf=new TextField("");
     //searchtf.setPlaceholder("        Search   ");
     searchtf.setFont(f4);
     JPanel search=new JPanel();
     search.setLayout(null);
     search.setBackground(new Color(255,255,255,150));
     search.setBounds(500,145,810,70);
     //searchtf.setBackground(new Color(204,229,255));
     searchtf.setBounds(45,5,255,40);
     jlemg.add(searchtf);
     search.add(jlemg);
     ImageIcon searchimg=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\searchimg.png");
     JButton searchbtn=new JButton(searchimg);
     searchbtn.setBounds(305,5,45,40);
     jlemg.add(searchbtn);
     Choice choice=new Choice();
     choice.setBounds(500,25,250,25);
     choice.add("NIT Kurukshetra");
     choice.add("Kurukshetra University");
     choice.add("Out Sider");
     choice.setFont(f4);
     search.add(choice);

     //frame
     
     setBounds(0,0,1400,770);
     setLayout(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     // Donation buy sell Buttons
     
     ImageIcon donimg=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\donimg.png");
     ImageIcon selimg=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\sellbutton.png");
     ImageIcon buyimg=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\buybutton.png");
     donbtn=new JButton(donimg);
     selbtn=new JButton(selimg);
     selbtn.addActionListener(this);
     buybtn=new JButton(buyimg);
     buybtn.addActionListener(this);
     donbtn.setBounds(600,235,150,130);
     donbtn.addActionListener(this);
     selbtn.setBounds(820,235,150,130);
     buybtn.setBounds(1040,235,150,130);
     
     ImageIcon imag2=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\bag.png");
     ImageIcon imag3=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\book.png");
     ImageIcon imag4=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\mobile.png");
     ImageIcon imag5=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\bicycle.png");
     //ImageIcon imag6=new ImageIcon("donimg.png");
     //ImageIcon imag7=new ImageIcon("donimg.png");
     ImageIcon imag8=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\laptop.png");
     ImageIcon imag9=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\gadda.png");
     ImageIcon imag10=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\sports.png");
     ImageIcon imag11=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\watch.png");
     //ImageIcon imag12=new ImageIcon("donimg.png");
     //b1=new JButton(imag1);
     b2=new JButton(imag2);
     b3=new JButton(imag3);
     b4=new JButton(imag4);
     b5=new JButton(imag5);
     //b6=new JButton(imag6);
     //b7=new JButton(imag7);
     b8=new JButton(imag8);
     b9=new JButton(imag9);
     b10=new JButton(imag10);
     b11=new JButton(imag11);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     b5.addActionListener(this);
     b8.addActionListener(this);
     b9.addActionListener(this);
     b10.addActionListener(this);
     b11.addActionListener(this);
     //b12=new JButton(imag12);
     //b1.setBounds(500,400,120,120);
     b2.setBounds(640,400,120,120);
     b3.setBounds(780,400,120,120);
     b4.setBounds(920,400,120,120);
     b5.setBounds(1060,400,120,120);
     //b6.setBounds(1200,400,120,120);
     //b7.setBounds(500,540,120,120);
     b8.setBounds(640,540,120,120);
     b9.setBounds(780,540,120,120);
     b10.setBounds(920,540,120,120);
     b11.setBounds(1060,540,120,120);
     //b12.setBounds(1200,540,120,120);
    
     

     
     //background   
     ImageIcon im=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\/uni.png"); //VANDE MATRAM
     Image ig=im.getImage();
     JLabel jl=new JLabel("",im,JLabel.CENTER);
      jl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     jl.addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() > 0) {
             if(flag==1)
             { new UserHomepage();
                setVisible(false);}
             else
                 new Login();
               
      }
   }
}); 
     ImageIcon nit=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\nitlogo.png"); 
     JLabel nit1=new JLabel("",nit,JLabel.CENTER);
     nit1.setBounds(1150,0,200,150);
      jl.setBounds(0,0,200,160);
     ImageIcon bi=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\test.jpg"); //BACKGROUND
      Image img=bi.getImage();
      Image temp=img.getScaledInstance(1400,770,Image.SCALE_SMOOTH);
      bi=new ImageIcon(temp);
     JLabel bg=new JLabel("",bi,JLabel.CENTER);
     bg.add(login);
     bg.add(search);         
     bg.add(donbtn);
     bg.add(selbtn);
     bg.add(buybtn);         
     bg.add(jl);
     bg.add(nit1);
     bg.add(heading);
     bg.setBounds(0,0,1400,770);
     //bg.add(b1);
     bg.add(b2);
     bg.add(b3);
     bg.add(b4);
     bg.add(b5);
     //bg.add(b6);
     //bg.add(b7);
     bg.add(b8);
     bg.add(b9);
     bg.add(b10);
     bg.add(b11);
     //bg.add(b12);
      add(bg);
     setVisible(true);
     
    }
    public void actionPerformed(ActionEvent e)
	{
       if(e.getSource()==loginbtn)
	{
		String log_user=logintf1.getText();
                user_Name=logintf1.getText();
		String log_pass=String.valueOf(logintf2.getPassword());
                mobile_no = LoginFormDB.Compare_roll_no(log_user);
                boolean j= LoginFormDB.Compare(log_user,log_pass);
		if(j==true)
		{
			//JOptionPane.showMessageDialog(Homepage.this,"successfully login");
            logintf1.setText("");
			logintf2.setText("");
             flag=1;
             
             int i=LoginFormDB.Compare_name(Homepage.user_Name);
               if(i>0)
               {
                   
                      new UserHomepage();
                      setVisible(false);
                }
               
             
           
		}
		else
		{
			JOptionPane.showMessageDialog(Homepage.this,"User Id or Password Incorrect");
			logintf1.setText("");
			logintf2.setText("");
		} 
    }
    if(e.getSource()==selbtn)
		{
            if(flag==0)
               new Login();
                 else
            {new SubmitAd();
            setVisible(false);}
            

        }
    else if(e.getSource()==adminbtn)
		{
           
            NewClass obj=new NewClass();
             obj.completed();
        }
    else if(e.getSource()==buybtn)
               {
                   
                   new Buy();
                }
            
    else if(e.getSource() == donbtn)
                {
                new Donate_Panel();
                  //setVisible(false);           
                    
                }
    
    else if(e.getSource() == b2 ||e.getSource() == b3 ||e.getSource() == b4||e.getSource() == b5||e.getSource() == b8||e.getSource() == b9||e.getSource() == b10||e.getSource() == b11 )
                {
                new Buy();
                  //setVisible(false);           
                    
                }
        
    
    
		
	} 
    public static void main(String args[])
    {
        new Homepage();
    }
}