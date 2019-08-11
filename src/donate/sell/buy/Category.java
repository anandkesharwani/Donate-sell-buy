 package donate.sell.buy;
import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;
 import java.awt.event.MouseEvent.*;
 import javax.swing.border.Border;
 import java.io.IOException;
 import java.net.*;
  
class Category extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    final JFrame frame;
    JLabel cross;
    Category()
    {
        
   //font
     Font f1=new Font("Serif ",Font.BOLD,50);
     Font f2=new Font("Serif ",Font.BOLD,60);
     Font f3=new Font("Blackmoor LET ",Font.BOLD,35);
     Font f4=new Font("Serif ",Font.BOLD,22);


     //login panel
     JPanel login=new JPanel();
     login.setLayout(null);
     login.setBackground(new Color(102,178,255));
     login.setBounds(350,210,700,350);
    JPanel login1=new JPanel();
     login1.setLayout(null);
     login1.setBackground(new Color(255,255,255));
     login1.setBounds(10,10,680,330);
     login.add(login1);
     JLabel l1=new JLabel("Select Category");
     l1.setForeground(new Color(102,178,255));
     l1.setFont(f4);
     l1.setBounds(20,20,200,25);
     login1.add(l1);
ImageIcon cros=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\cross.png"); 
     Image img=cros.getImage();
     cross=new JLabel("",cros,JLabel.CENTER);
     cross.setBounds(1060,180,32,32);
     cross.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     cross.addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() > 0) {
                 frame.setVisible(false);
                 }
   }
}); 
     
    //Icon
     
     //ImageIcon imag1=new ImageIcon("cross.png");
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
    // b1.addActionListener(this);
     b2=new JButton(imag2);
     b2.addActionListener(this);
     b3=new JButton(imag3);
     b3.addActionListener(this);
     b4=new JButton(imag4);
     b4.addActionListener(this);
     b5=new JButton(imag5);
     b5.addActionListener(this);
     //b6=new JButton(imag6);
     //b7=new JButton(imag7);
     b8=new JButton(imag8);
     b8.addActionListener(this);
     b9=new JButton(imag9);
     b9.addActionListener(this);
     b10=new JButton(imag10);
     b10.addActionListener(this);
     b11=new JButton(imag11);
     b11.addActionListener(this);
     //b12=new JButton(imag12);
     //b1.setBounds(645,10,25,25);
     b2.setBounds(50,60,120,120);
     b3.setBounds(200,60,120,120);
     b4.setBounds(350,60,120,120);
     b5.setBounds(500,60,120,120);
     //b6.setBounds(1200,400,120,120);
     //b7.setBounds(500,540,120,120);
     b8.setBounds(50,190,120,120);
     b9.setBounds(200,190,120,120);
     b10.setBounds(350,190,120,120);
     b11.setBounds(500,190,120,120);
     //b12.setBounds(1200,540,120,120);
     //login1.add(b1);
     login1.add(b2);
     login1.add(b3);
     login1.add(b4);
     login1.add(b5);
     //bg.add(b6);
     //bg.add(b7);
     login1.add(b8);
     login1.add(b9);
     login1.add(b10);
     login1.add(b11);
     //bg.add(b12);
     //b1.setBorderPainted(false);
     b2.setBorderPainted(false);
     b3.setBorderPainted(false);
     b4.setBorderPainted(false);
     b5.setBorderPainted(false);
     b8.setBorderPainted(false);
     b9.setBorderPainted(false);
     b10.setBorderPainted(false);
     b11.setBorderPainted(false);
     b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     b4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     b5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     b8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     b9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     b10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     b11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     
 //frame
     setBounds(0,0,1400,770);
     setLayout(null);
     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
     
     
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
        frame.setLocation(0,0);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBackground(new Color(0,0,0,150));

        //frame.getContentPane().add(button, BorderLayout.WEST);
        frame.setVisible(true);   
        
          
    }
    public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == b2)
		{
            SubmitAd.tf3.setText("BAG");
            frame.setVisible(false);
		}
		if(e.getSource() == b3)
		{
            SubmitAd.tf3.setText("BOOK");
            frame.setVisible(false);
		}
		if(e.getSource() == b4)
		{
            SubmitAd.tf3.setText("MOBILE");
            frame.setVisible(false);
		}
		if(e.getSource() == b5)
		{
            SubmitAd.tf3.setText("CYCLE");
            frame.setVisible(false);
		}
		if(e.getSource() == b8)
		{
            SubmitAd.tf3.setText("LAPTOP");
            frame.setVisible(false);
		}
		if(e.getSource() == b9)
		{
            SubmitAd.tf3.setText("MATTRESS");
            frame.setVisible(false);
		}
		if(e.getSource() == b10)
		{
            SubmitAd.tf3.setText("SPORT");
            frame.setVisible(false);
		}
		if(e.getSource() == b11)
		{
           SubmitAd.tf3.setText("WATCH");
            frame.setVisible(false);
		}
		 
    }
   public static void main(String args[])
    {
        new Category();
    }
    
}