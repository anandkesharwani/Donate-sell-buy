package donate.sell.buy;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.Border;
import java.io.IOException;
import java.net.*;
import javax.swing.border.SoftBevelBorder;


class UserHomepage extends JFrame implements ActionListener
{ 
    
   JButton btn1,btn2,btn3,btn4,btn5;
         static String user_Name1=null;
         JLabel name;

    UserHomepage(){
     //Font
     Font f1=new Font("Serif ",Font.BOLD,22);
     Font f2=new Font("Serif ",Font.BOLD,30);
     //user_Name1=Login.user_Name;


     //header
     JPanel heading;
     heading=new JPanel();
     heading.setBackground(new Color(51,153,225));
     heading.setBounds(0,40,700,80);
     name=new JLabel();
     name.setForeground(Color.WHITE);
     name.setFont(f2);
     name.setBounds(0,0,650,50);
     heading.add(name);
     
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
     jl0.setBounds(50,60,100,40);
     // Buttons
     btn1=new JButton("Profile");
     btn1.addActionListener(this);
     btn2=new JButton("Submit a Ad");
    btn2.addActionListener(this);
     btn5=new JButton("LogOut");
     btn5.addActionListener(this);
     btn4=new JButton("Donate");
     btn4.addActionListener(this);
     btn3=new JButton("Ads & Donates");
     btn1.setBounds(200,150,300,60);
     btn2.setBounds(200,230,300,60);
     btn3.setBounds(200,310,300,60);
     btn4.setBounds(200,390,300,60);
     btn5.setBounds(200,480,300,60);
     btn1.setBackground(new Color(255,255,204));
     btn2.setBackground(new Color(255,255,204));
     btn3.setBackground(new Color(255,255,204));
     btn4.setBackground(new Color(255,255,204));
     btn5.setBackground(new Color(255,255,204));
     btn1.setForeground(new Color(51,153,255));
     btn2.setForeground(new Color(51,153,255));
     btn3.setForeground(new Color(51,153,255));
     btn4.setForeground(new Color(51,153,255));
     btn5.setForeground(new Color(51,153,255));
     btn1.setFont(f1);
     btn2.setFont(f1);
     btn3.setFont(f1);
     btn4.setFont(f1);
     btn5.setFont(f1);
     btn1.setBorderPainted(false);
     btn2.setBorderPainted(false);
     btn3.setBorderPainted(false);
     btn4.setBorderPainted(false);
     btn5.setBorderPainted(false);
     btn1.setFocusPainted(false);
     btn2.setFocusPainted(false);
     btn3.setFocusPainted(false);
     btn4.setFocusPainted(false);
     btn5.setFocusPainted(false);
     btn1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     btn2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     btn3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     btn4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     btn5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    

    


     //frame
     setBounds(0,0,1400,770);
     setLayout(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     //background   
     ImageIcon im=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\uni.png"); //VANDE MATRAM
     Image ig=im.getImage();
     JLabel jl=new JLabel("",im,JLabel.CENTER);
      jl.setBounds(500,0,200,160);
     ImageIcon bi=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\userback.jpg"); //BACKGROUND
      Image img=bi.getImage();
      Image temp=img.getScaledInstance(1400,770,Image.SCALE_SMOOTH);
      bi=new ImageIcon(temp);
     JLabel bg=new JLabel("",bi,JLabel.CENTER);
     //bg.add(login);
     //bg.add(search);         
     bg.add(btn1);
     bg.add(btn2);
     bg.add(btn3);         
     bg.add(btn4);         
     bg.add(btn5);  
     bg.add(jl0);
     bg.add(jl);
     bg.add(heading);
     bg.setBounds(0,0,1400,770);
     
      add(bg);
      name.setText("Welcome "+LoginFormDB.uname);
     setVisible(true);
     
    }
    public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btn2)
		{
            new SubmitAd();
            setVisible(false);
		}
                
                else if(e.getSource() == btn1)
                {
               int i=LoginFormDB.fetch_data(Homepage.user_Name);
               if(i>0)
               {
                   
                    new Profile();
                    setVisible(false);
                }
               else
               {
                 JOptionPane.showMessageDialog(UserHomepage.this,"data not fetched properly");   
               }
                    
             }
              
                else if(e.getSource() == btn4)
                {
                    
                    
               
                   
                    new Donate_Panel();
                    setVisible(false);
               
                
                    
                }
                 else if(e.getSource() == btn5)
                {
                    
                    
               
                   Homepage.flag=0;
                    new Homepage();
                    setVisible(false);
               
                
                    
                }
    
    
}
    
    }

  