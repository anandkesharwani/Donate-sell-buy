
 package donate.sell.buy;
import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;
 import java.awt.event.MouseEvent.*;
 import javax.swing.border.Border;
 import java.io.IOException;
 import java.net.*;
  
class Element_Deatail extends JFrame 
{
    Image b1,b2,b3,b4;
    String s1,s2,s3,s4;
     // ImageIcon icon1,icon2,icon3,icon4;
    JLabel cross;
    final JFrame frame;
     JLabel photo1,photo2,photo3,photo4;
    JPanel pan1,pan2,pan3,pan4,pan5,pan6,pan7,pan8,pan9,pan10,pan42,pan43,pan51,pan52,pan53;
    JLabel lab1,lab2,mob,rol,name,disc,price,lab3,lab4,lab5,lab6;
    Element_Deatail(ImageIcon i1,ImageIcon i2,ImageIcon i3,ImageIcon i4,String tit,String rs,String discr,String nm,String rln,String mbn )
    {
        
   //font
     Font f1=new Font("Serif ",Font.BOLD,50);
     Font f2=new Font("Serif ",Font.BOLD,60);
     Font f3=new Font("Blackmoor LET ",Font.BOLD,25);
     Font f4=new Font("Serif ",Font.BOLD,22);


     //login panel
     JPanel login=new JPanel();
     login.setLayout(null);
     login.setBackground(new Color(102,178,255));
     login.setBounds(200,160,1000,450);
    JPanel login1=new JPanel();
     login1.setLayout(null);
     login1.setBackground(new Color(255,255,255));
     login1.setBounds(10,10,980,430);
     login.add(login1);
     
 
 //Panels    
     lab1=new JLabel();
     lab1.setLayout(null);
     lab1.setFont(f3);
     lab1.setBounds(15,5,620,35);
     lab1.setText(tit);
     
     price=new JLabel("Price(Rs):");
     price.setLayout(null);
     price.setFont(f4);
     price.setBounds(680,5,110,35);
     lab2=new JLabel();
     lab2.setLayout(null);
     lab2.setFont(f3);
     //lab2.setBackground(new Color(253,153,51));
     lab2.setBounds(790,5,150,35);
     lab2.setText(rs);
     
     photo1=new JLabel();
     photo1.setLayout(null);
     photo1.setBounds(35,55,200,210);
     photo1.setIcon(i1);
     
     photo2=new JLabel();
     photo2.setLayout(null);
     photo2.setBounds(270,55,200,210);
     photo2.setIcon(i2);
     
     photo3=new JLabel();
     photo3.setLayout(null);
     photo3.setBounds(505,55,200,210);
     photo3.setIcon(i3);
     
     photo4=new JLabel();
     photo4.setLayout(null);
     photo4.setBounds(740,55,200,210);
     photo4.setIcon(i4);
     
     disc=new JLabel("Discription:");
     disc.setLayout(null);
     disc.setFont(f4);
     disc.setBounds(10,310,117,35);
     lab3=new JLabel();
     lab3.setLayout(null);
     lab3.setFont(f3);
     //lab3.setBackground(new Color(253,153,51));
     lab3.setBounds(135,280,835,85);
     lab3.setText(discr);
     
     name=new JLabel("Name:");
     name.setLayout(null);
     name.setFont(f4);
     name.setBounds(10,385,80,35);
     lab4=new JLabel();
     lab4.setLayout(null);
     lab4.setFont(f3);
     //lab4.setBackground(new Color(253,153,51));
     lab4.setBounds(85,385,270,35);
     lab4.setText(nm);
     
     rol=new JLabel("Roll No:");
     rol.setLayout(null);
     rol.setFont(f4);
     rol.setBounds(385,385,100,35);
     lab5=new JLabel();
     lab5.setLayout(null);
     lab5.setFont(f3);
     //lab5.setBackground(new Color(253,153,51));
     lab5.setBounds(475,385,160,35);
     lab5.setText(rln);
     
     mob=new JLabel("Mobile No:");
     mob.setLayout(null);
     mob.setFont(f4);
     mob.setBounds(660,385,110,35);
     lab6=new JLabel();
     lab6.setLayout(null);
     lab6.setFont(f3);
     //lab6.setBackground(new Color(253,153,51));
     lab6.setBounds(770,385,200,35);
     lab6.setText(mbn);
     
     login1.add(lab1);
     login1.add(photo1);
     login1.add(photo2);
     login1.add(photo3);
     login1.add(photo4);
     login1.add(lab2);
     login1.add(lab3);
     login1.add(lab4);
     login1.add(lab5);
     login1.add(lab6);
     login1.add(mob);
     login1.add(rol);
     login1.add(name);
     login1.add(disc);
     login1.add(price);
     
     
     ImageIcon uni=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\cross.png"); 
     Image img1=uni.getImage();
     cross=new JLabel("",uni,JLabel.CENTER);
     cross.setBounds(1210,135,32,32);
     cross.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     cross.addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() > 0) {
                 frame.setVisible(false);
                 }
   }
}); 
     
 //frame
     setBounds(0,0,1400,770);
     setLayout(null);
     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     
     
    //background
	 
    JPanel cg=new JPanel();
     cg.setLayout(null);
     cg.setBackground(new Color(0,0,0,0));
     cg.setBounds(0,0,1400,770);
	
     cg.add(login);
     cg.add(cross);
	  frame = new JFrame();
     
	 frame.setUndecorated(true);
	 frame.add(cg);
        frame.setSize(1400,770);
        frame.setLocation(0,0);
        //frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBackground(new Color(0,0,0,150));

        //frame.getContentPane().add(button, BorderLayout.WEST);
        frame.setVisible(true);   
        
          
    }
    
 /*  public static void main(String args[])
    {
        new Element_Deatail();
    }*/
    
}