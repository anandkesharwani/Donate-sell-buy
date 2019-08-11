
package donate.sell.buy;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

class Devlopers extends JFrame implements ActionListener
{
    JLabel pic,cross,frame1;
    Timer tm;
    JPanel cg;
    JFrame frame;
      int x = 0;
    //Images Path In Array
    String[] list = {
                     
                      "W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\a1.jpg",
                      "W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\a2.jpg",
                      "W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\a3.jpg",
                      "W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\a4.jpg",
                      "W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\a5.jpg"
                    
                    };
  
    Devlopers()
    {
        
        pic = new JLabel();
        pic.setBounds(173,170, 400, 400);

        //Call The Function SetImageSize
        SetImageSize(4);
               //set a timer
        tm = new Timer(1500,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if(x==4)
                { pic.setBounds(200,85, 1000, 600);
                frame1.setVisible(false);
                cg.add(pic);
                }
                //if(x >= list.length )
                 //   x = 0; 
            }
        });
   
   
    
     ImageIcon cros5=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\frame.png"); 
     Image img5=cros5.getImage();
    frame1=new JLabel("",cros5,JLabel.CENTER);
     frame1.setBounds(330,18,736,736);
     frame1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     
     
     ImageIcon cros51=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\prev.png"); 
     Image img51=cros51.getImage();
    JLabel next=new JLabel("",cros51,JLabel.CENTER);
     next.setBounds(150,300,128,128);
     next.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     
     ImageIcon cros52=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\next.png"); 
     Image img52=cros52.getImage();
    JLabel prev=new JLabel("",cros52,JLabel.CENTER);
     prev.setBounds(1150,300,128,128);
     prev.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));


    
ImageIcon cros=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\cross.png"); 
     Image img=cros.getImage();
     cross=new JLabel("",cros,JLabel.CENTER);
     cross.setBounds(1270,100,32,32);
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
	 tm.start();
     cg=new JPanel();
     cg.setLayout(null);
     cg.setBackground(new Color(0,0,0,0));
     cg.setBounds(0,0,1400,770);
	cg.add(cross);
    cg.add(frame1);
    cg.add(next);
    cg.add(prev);
    frame1.add(pic);
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
     public void SetImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
    }
    public void actionPerformed(ActionEvent e)
	{
		
		 
    }
   public static void main(String args[])
    {
        new Devlopers();
    }
    
}