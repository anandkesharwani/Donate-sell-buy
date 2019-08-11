
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


 class Selfie extends JFrame{
    JLabel pic,cross;
    Timer tm;
    JFrame frame;
    
    int x = 0;
    //Images Path In Array
    String[] list = {
                     
                      "W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\10.jpg",
                      "W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\NGO2_1.jpg",
                      "W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\selfie1.jpg",
                      "W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\selfie2.jpg",
                      "W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\selfie3.jpg",
                      "W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\selfie5.jpg",
                      "W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\selfie6.png",
                      "W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\11.jpg"
                    };
    
    public Selfie(){
        super("Java SlideShow");
        pic = new JLabel();
        pic.setBounds(100,85, 1200, 600);

        //Call The Function SetImageSize
        SetImageSize(7);
               //set a timer
        tm = new Timer(1000,new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if(x >= list.length )
                    x = 0; 
            }
        });
        ImageIcon cros=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\cross.png"); 
     Image img=cros.getImage();
      cross=new JLabel("",cros,JLabel.CENTER);
     cross.setBounds(1310,55,32,32);
     cross.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     cross.addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() > 0) {
                 frame.setVisible(false);
                 }
   }
}); 
        tm.start();
    JPanel cg=new JPanel();
     cg.setLayout(null);
     cg.setBackground(new Color(0,0,0,0));
     cg.setBounds(0,0,1400,770);
	cg.add(pic);
       cg.add(cross);
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
    //create a function to resize the image 
    public void SetImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
    }

/*public static void main(String[] args){ 
      
    new Selfie();
}*/
}
