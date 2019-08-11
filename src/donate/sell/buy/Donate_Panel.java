
package donate.sell.buy;


 import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;
 import javax.swing.border.Border;
 import java.io.IOException;
 import java.net.*;

class Donate_Panel extends JFrame implements ActionListener 
{  
    static int flag=0;
    Font f1,f2,f3,f4, f5;
    JPanel heading,login;
    JLabel name1,l1, l2,l3, l4, l5, jl1,jl2;
    JTextField name_tf,address_tf, time_slot_tf, mob_no_tf;
    //JPasswordField logintf2;
    JButton loginbtn;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    JButton donbtn,selbtn,buybtn;
    Donate_Panel()
    {
        
        //font
    f1=new Font("Serif ",Font.BOLD,50);
    f2=new Font("Serif ",Font.BOLD,48);
    f3=new Font("Blackmoor LET ",Font.BOLD,35);
    f4=new Font("Serif ",Font.BOLD,22);
    f5=new Font("Serif ",Font.BOLD,20);
     //header
     heading=new JPanel();
     heading.setBackground(new Color(51,153,225,180));
     heading.setBounds(0,40,1400,80);
     //JLabel name=new JLabel("Welcome to the DONATE Panel");
     name1=new JLabel(" DONATE - MAKE A DIFFERENCE");
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
     login.setBounds(950,145,400,500);
     
     l1=new JLabel("Fill the details..");
     l1.setForeground(Color.BLUE);
     l1.setFont(f3);
     l1.setBounds(50,50,300,50);
     login.add(l1);
     /*
     ImageIcon uni=new ImageIcon("uni.png"); 
     Image img1=uni.getImage();
     jl1=new JLabel("",uni,JLabel.CENTER);
     jl1.setBounds(50,150,50,50);
     
     ImageIcon pi=new ImageIcon("pi.png"); 
     Image img2=uni.getImage();
     jl2=new JLabel("",pi,JLabel.CENTER);
     jl2.setBounds(50,210,50,50);
     */
     l2=new JLabel("Name");
     l2.setForeground(Color.BLUE);
     l2.setFont(f5);
     l2.setBounds(30,140,100,50);
     login.add(l2);
     
     name_tf=new JTextField("");
     name_tf.setFont(f4);
     name_tf.setBounds(130,150,200,40);
     login.add(name_tf);
     
     
     l3=new JLabel("Address");
     l3.setForeground(Color.BLUE);
     l3.setFont(f5);
     l3.setBounds(30,205,100,50);
     login.add(l3);
     
     address_tf=new JTextField("");
     address_tf.setFont(f4);
     address_tf.setBounds(130,215,200,40);
     login.add(address_tf);
     
     
     l4=new JLabel("Time Slot");
     l4.setForeground(Color.BLUE);
     l4.setFont(f5);
     l4.setBounds(30,270,100,50);
     login.add(l4);
     
     time_slot_tf=new JTextField("");
     time_slot_tf.setFont(f4);
     time_slot_tf.setBounds(130,280,200,40);
     login.add(time_slot_tf);
     
     
     l5=new JLabel("Mob. No.");
     l5.setForeground(Color.BLUE);
     l5.setFont(f5);
     l5.setBounds(30,335,100,50);
     login.add(l5);
     
     mob_no_tf=new JTextField("");
     mob_no_tf.setFont(f4);
     mob_no_tf.setBounds(130,345,200,40);
     login.add(mob_no_tf);
     
     loginbtn=new JButton("SUBMIT");
     loginbtn.addActionListener(this);
     loginbtn.setBounds(250,435,120,40);
     loginbtn.setBackground(Color.BLUE);
     loginbtn.setForeground(Color.WHITE);
     loginbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     
     //LINK 1
     JLabel link_selfie=new JLabel("<html><u>Watch the selfie of poor <br>when we donated your items</u></html>");
     link_selfie.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     link_selfie.addMouseListener(new MouseAdapter() 
     {
     public void mouseClicked(MouseEvent e) 
     {
      if (e.getClickCount() > 0) 
      {
          new Selfie();
               
      }
   }
   });
   
     link_selfie.setForeground(Color.BLUE);
     link_selfie.setBounds(20,445,170,40);
   
     
     //LINK 2
     JLabel linkforreg=new JLabel("<html><u>Click here to BECOME A MEMBER<br>of our Association</u></html>");
     linkforreg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     linkforreg.addMouseListener(new MouseAdapter() 
     {
     public void mouseClicked(MouseEvent e) 
     {
      if (e.getClickCount() > 0) 
      {
           Member.main(new String[]{});
               
      }
   }
   });
   
     linkforreg.setForeground(Color.BLUE);
     linkforreg.setBounds(20,400,190,40);
   
     
     
     
     login.add(linkforreg);
     login.add(link_selfie);
     login.add(loginbtn);
     
     setSize(1400,770);
     setLayout(null);
     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     
     
     
    
      ImageIcon im=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\/buyandsell.jpg"); //VANDE MATRAM
     Image ig=im.getImage();
     JLabel jl=new JLabel("",im,JLabel.CENTER);
      jl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     jl.addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() > 0) {
                 new Homepage();
                 setVisible(false);
                 }
   }
}); 
     
      ImageIcon im1=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\/uni.png"); //VANDE MATRAM
     Image ig1=im1.getImage();
     JLabel jlu=new JLabel("",im1,JLabel.CENTER);
      jlu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     jlu.addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() > 0) {
               if(Homepage.flag==1)
               { new UserHomepage();
                setVisible(false);
                 }
               else 
                 new Login(); 
      }
   }
}); 
     jl.setBounds(50,60,200,40);
     jlu.setBounds(1200,50,60,60);
     ImageIcon bi=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\bg3.jpg"); //BACKGROUND
      Image img=bi.getImage();
      Image temp=img.getScaledInstance(1400,770,Image.SCALE_SMOOTH);
      bi=new ImageIcon(temp);
     JLabel bg=new JLabel("",bi,JLabel.CENTER);
     bg.add(login);
     bg.add(jl);
     bg.add(jlu);
     bg.add(heading);
     bg.setBounds(0,0,1400,770);
      add(bg);
     setVisible(true);
     
    }
    public void actionPerformed(ActionEvent e)
	{
      if(e.getSource()==loginbtn)
	{
            
            String name=name_tf.getText();
            String add=address_tf.getText();
            String TS=time_slot_tf.getText();
            String mob=mob_no_tf.getText();
        if(name.isEmpty()!=true && add.isEmpty()!=true && TS.isEmpty()!=true && mob.isEmpty()!=true)
        {
         int i=Donate_Database.save(name,add,TS,mob);
			if(i>0)
                        {
                            JOptionPane.showMessageDialog(Donate_Panel.this," Data entered successfully !!!");
                            name_tf.setText("");
                            address_tf.setText("");
                            time_slot_tf.setText("");
                            mob_no_tf.setText("");
                            
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(Donate_Panel.this," Data entered Unsuccessfully !!!");
                        }
        }
        else
                                     {
                        JOptionPane.showMessageDialog(Donate_Panel.this,"Please Enterd Mandatory Field!!"); 
                                          
                                           }
        
                
            
            
            
            
        }
	
	} 
    public static void main(String args[])
    {
        new Donate_Panel();
    }
}