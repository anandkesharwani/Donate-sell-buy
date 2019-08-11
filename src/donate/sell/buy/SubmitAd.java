package donate.sell.buy;
import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;
 import javax.swing.border.Border;
 import java.io.IOException;
 import java.net.*;
  import java.io.File;
class SubmitAd extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4; 
    JLabel name,username,jl,adtitle,s1,category,s2,addisc,s3,photo,s4,faster,s9,price,logout;
    JPanel heading,login;
    JTextField tf1,tf9;
    JTextArea tf2;
    static JTextField tf3;
    JButton loginbtn1;
    JButton loginbtn,backbtn;
     String iname1,iname2,iname3,iname4;
     ImageIcon imag1,imag2,imag3,imag4;
     static int imgcount=1;
    SubmitAd()
    {
        
   //font
     Font f1=new Font("Serif ",Font.BOLD,50);
     Font f2=new Font("Serif ",Font.BOLD,60);
     Font f3=new Font("Blackmoor LET ",Font.BOLD,35);
     Font f4=new Font("Serif ",Font.BOLD,22);
    

    
     heading=new JPanel();
     heading.setBackground(new Color(255,225,255,150));
     heading.setBounds(0,10,500,55);
     //name=new JLabel("Welcome");
     //name.setForeground(Color.WHITE);
     username=new JLabel("");
     username.setForeground(Color.WHITE);
     //name.setFont(f4);
     username.setFont(f4);
     //name.setBounds(0,0,150,50);
     username.setBounds(0,0,650,50);
     //heading.add(name);
     heading.add(username);
     ImageIcon im=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\uni.png"); 
     Image ig=im.getImage();
     jl=new JLabel("",im,JLabel.CENTER);
      jl.setBounds(470,0,80,40);
      heading.add(jl);
      
      //login panel
     login=new JPanel();
     login.setLayout(null);
     login.setBackground(new Color(255,255,255,150));
     login.setBounds(300,85,800,600);
     Font fn=new Font("Arial",Font.BOLD,18);
	 Font str=new Font("Arial",Font.BOLD,17);
     adtitle=new JLabel("Ad Title");
	 adtitle.setFont(fn);
	 adtitle.setBounds(50,30,100,30);
	s1=new JLabel("*");
		 s1.setBounds(120,41,40,14);
		 s1.setForeground(Color.RED);
		 s1.setFont(str);
		login.add(s1);
	 tf1=new JTextField();
	 tf1.setBounds(200,32,550,30);
     tf1.setFont(f4);
	 login.add(adtitle);
	 login.add(tf1);

    category=new JLabel(" Category");
	 category.setFont(fn);
	 category.setBounds(45,80,100,30);
	s2=new JLabel("*");
		 s2.setBounds(133,90,10,14);
		 s2.setForeground(Color.RED);
		 s2.setFont(str);
		login.add(s2);
	 login.add(category);
     //PlaceholderTextField tf2=new PlaceholderTextField("");
     tf3=new JTextField("Click For Chosen");
    // tf2.setPlaceholder("Include the brand,model,age ");
	 tf3.setBounds(197,80,250,35);
     tf3.setFont(fn);
	 //loginbtn1.add(tf3);
	 login.add(tf3);
         
         price=new JLabel(" Price ");
	 price.setFont(fn);
	 price.setBounds(470,80,100,30);
	s9=new JLabel("*");
		 s9.setBounds(520,85,10,14);
		 s9.setForeground(Color.RED);
		 s9.setFont(str);
		login.add(s9);
	 login.add(price);
     //PlaceholderTextField tf2=new PlaceholderTextField("");
     tf9=new JTextField();
    // tf2.setPlaceholder("Include the brand,model,age ");
	 tf9.setBounds(540,80,150,35);
     tf9.setFont(fn);
	 //loginbtn1.add(tf3);
	 login.add(tf9);
    
     tf3.addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() > 0) {
            
             new Category();
               
      }
   }
   });
   addisc=new JLabel("Ad Discription");
	 addisc.setFont(fn);
	 addisc.setBounds(50,125,200,30);
	s3=new JLabel("*");
		 s3.setBounds(175,130,10,14);
		 s3.setForeground(Color.RED);
		 s3.setFont(str);
		login.add(s3);
	 login.add(addisc);

     //PlaceholderTextField tf2=new PlaceholderTextField("");
     tf2=new JTextArea("");
    // tf2.setPlaceholder("Include the brand,model,age ");
	 tf2.setBounds(200,125,350,200);
     tf2.setFont(f4);
	 login.add(tf2);

     photo=new JLabel("Ad Photos");
	 photo.setFont(fn);
	 photo.setBounds(50,365,100,30);
	s4=new JLabel("*");
		 s4.setBounds(140,370,10,14);
		 s4.setForeground(Color.RED);
		 s4.setFont(str);
		login.add(s4);
	 login.add(photo);
	faster=new JLabel("Ad with Photos sell faster");
	 faster.setBounds(30,395,200,10);
	 login.add(faster);

     
      imag1=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\addphoto.png");
      imag2=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\addphoto.png");
      imag3=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\addphoto.png");
      imag4=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\addphoto.png");
     b1=new JButton(imag1);
     //b1.addActionListener(this);
     b2=new JButton(imag2);
     //b2.addActionListener(this);
     b3=new JButton(imag3);
     //b3.addActionListener(this);
     b4=new JButton(imag4);
     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     b1.setBounds(200,350,120,120);
     b2.setBounds(330,350,120,120);
     b3.setBounds(460,350,120,120);
     b4.setBounds(590,350,120,120);
     login.add(b1);
     login.add(b2);
     login.add(b3);
     login.add(b4);
     


     loginbtn=new JButton("Submit");
     loginbtn.addActionListener(this);
     loginbtn.setBounds(500,550,120,40);
     loginbtn.setBackground(Color.BLUE);
     loginbtn.setForeground(Color.WHITE);
     login.add(loginbtn);
     backbtn=new JButton("Back");
     backbtn.addActionListener(this);
     backbtn.setBounds(250,550,120,40);
     backbtn.setBackground(Color.BLUE);
     backbtn.setForeground(Color.WHITE);
     login.add(backbtn);
     
     logout=new JLabel("<html><u>LogOut.??</u></html>");
	 logout.setFont(fn);
	 logout.setForeground(Color.BLUE);
	 logout.setBounds(800,20,100,30);
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
     ImageIcon im0=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\/buyandsell1.jpg"); 
     Image ig0=im0.getImage();
     JLabel jl0=new JLabel("",im0,JLabel.CENTER);
      jl0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     jl0.addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() > 0) {
                 new Homepage();
                 setVisible(false);
                 }
   }
}); 
     jl0.setBounds(10,20,100,40);
     //frame
     
     setBounds(0,0,1400,770);
     setLayout(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
    
        //background   
     ImageIcon bi=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\userback.jpg"); //BACKGROUND
      Image img=bi.getImage();
      Image temp=img.getScaledInstance(1400,770,Image.SCALE_SMOOTH);
      bi=new ImageIcon(temp);
     JLabel bg=new JLabel("",bi,JLabel.CENTER);
     //bg.add(login);
     //bg.add(search);    
     bg.add(jl0);     
     bg.add(login   );         
     bg.add(heading);
     bg.add(logout);
     bg.setBounds(0,0,1400,770);
     
      add(bg);
      
       username.setText("Welcome "+LoginFormDB.uname);
     setVisible(true);
     
    }
   public void actionPerformed(ActionEvent e)
	{
           
		if(e.getSource() == b1)
		{
            JFileChooser fc = new JFileChooser();
            int result = fc.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION)
            {
               
                 String inm1 = fc.getSelectedFile().getAbsolutePath();
                  iname1=inm1.replace( '\\', '/');
               imag1=new ImageIcon(iname1);
        b1.setIcon(imag1);
	 b1.setBounds(200,350,120,120);
	
               
                
            }
                }
                
                else if(e.getSource() == b2)
                        {
                        JFileChooser fc = new JFileChooser();
            int result = fc.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION)
            {
              String inm2 = fc.getSelectedFile().getAbsolutePath();
                  iname2=inm2.replace( '\\', '/');
               imag2=new ImageIcon(iname2);
        b2.setIcon(imag2);
	  b2.setBounds(330,350,120,120);
      
            }
                        } 
                else if(e.getSource() == b3)
                        {
                        JFileChooser fc = new JFileChooser();
            int result = fc.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION)
            {
            String inm3 = fc.getSelectedFile().getAbsolutePath();
                  iname3=inm3.replace( '\\', '/');
               imag3=new ImageIcon(iname3);
        b3.setIcon(imag3);
	  b3.setBounds(460,350,120,120);
    
        
            }
                        } 
                else if(e.getSource() == b4)
                        {
                        JFileChooser fc = new JFileChooser();
            int result = fc.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION)
            {
             String inm4 = fc.getSelectedFile().getAbsolutePath();
                  iname4=inm4.replace( '\\', '/');
               imag4=new ImageIcon(iname4);
        b4.setIcon(imag4);
	  b4.setBounds(590,350,120,120);   
            }
                      }         
                else if(e.getSource()==backbtn)
                {
                   new UserHomepage(); 
                   setVisible(false);
                   
                }
                
                          
               else if(e.getSource()==loginbtn)
                {
                    String user_roll=Homepage.user_Name;
                    String mobi_no=Homepage.mobile_no;
                    String name=LoginFormDB.uname;
                    String title=tf1.getText();
                    String catagory=tf3.getText();
                    String discription=tf2.getText();
                     String img1=iname1;
                     String img2=iname2;
                     String img3=iname3;
                     String img4=iname4;
                     String rupiya=tf9.getText();
                    int i=SubmitAddDatabase.save(user_roll,title,catagory,discription,img1,img2,img3,img4,rupiya,mobi_no,name);
                    System.out.println(mobi_no);
                    if(i>0)
                    {
                        JOptionPane.showConfirmDialog(SubmitAd.this,"Successfully Uploaded!!");
                                new UserHomepage();
                                setVisible(false);
                    }
                    else
                        JOptionPane.showConfirmDialog(SubmitAd.this,"Due to Some Reason Record Not Uploaded!!");

                     
                    
                    
                    
                    
                    
                }
  }
   public static void main(String args[])
    {
       new SubmitAd();
    } 
}
