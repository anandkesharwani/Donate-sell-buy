 package donate.sell.buy;
 import static donate.sell.buy.LoginFormDB.imageBytes;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.Border;
import java.io.IOException;
import java.net.*;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.SoftBevelBorder;
class Buy3 extends JFrame implements ActionListener
{
    String dption1,nem1,rlno1,mbno1,tit1,rs1,dption2,nem2,rlno2,mbno2,tit2,rs2;
      String dption3,nem3,rlno3,mbno3,tit3,rs3,dption4,nem4,rlno4,mbno4,tit4,rs4,dption5,nem5,rlno5,mbno5,tit5,rs5;
       ImageIcon icon11,icon12,icon13,icon14,icon21,icon22,icon23,icon24;
      ImageIcon icon31,icon32,icon33,icon34,icon41,icon42,icon43,icon44,icon51,icon52,icon53,icon54;
 String s1,s2,s3,s4;
 Image bimage1,bimage2,bimage3,bimage4;
      JPanel search,content;
      JLabel jlemg,jlemg1 ,loginsignup;
      JTextField searchtf;
      JButton searchbtn,prevbtn,nextbtn;
      Font f1=new Font("Serif ",Font.BOLD,20);
      Font f4=new Font("Serif ",Font.BOLD,22);
      Font f5=new Font("Serif ",Font.BOLD,14);
   
      String s;
      ImageIcon icon,icon1;
   
   //Animation
      JLabel pic,lab11,lab12,lab13,lab21,lab22,lab23,lab31,lab32,lab33,lab41,lab42,lab43,lab51,lab52,lab53;
      JPanel pan11,pan12,pan13,pan21,pan22,pan23,pan31,pan32,pan33,pan41,pan42,pan43,pan51,pan52,pan53;
      
    Timer tm;
    int x = 0;
    //Images Path In Array
    String[] list = {
                       /*"C:/Users/samsng/Desktop/jv1.png",//0
                      "C:/Users/samsng/Desktop/jv2.jpg",//1
                      "C:/Users/samsng/Desktop/jv3.jpg",//2
                      "C:/Users/samsng/Desktop/jv4.jpg",//3
                      "C:/Users/samsng/Desktop/jv5.png",//4
                      "C:/Users/samsng/Desktop/jv6.jpg",//5
                      "C:/Users/samsng/Desktop/jv7.jpg"//6*/
                      "W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\slide1.jpg",
                      "W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\slide2.jpg",
                      "W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\slide3.jpg",
                      "W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\slide4.jpg",
                      "W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\slide5.jpg",
                      "W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\slide6.jpg",
                      "W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\slide7.jpg"
                      
                    };

  
     Buy3()
   { 

        pic = new JLabel();
        pic.setBounds(0, 60, 1400, 250);
        //Call The Function SetImageSize
        SetImageSize(6);
               //set a timer
        tm = new Timer(1500,new ActionListener() {
          public void actionPerformed(ActionEvent e) {
                SetImageSize(x);
                x += 1;
                if(x >= list.length )
                    x = 0; 
            }
        });
        add(pic);
        tm.start();
       //Search panel
     ImageIcon emg=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\buysearch.png"); 
     Image eg=emg.getImage();
     jlemg=new JLabel("",emg,JLabel.CENTER);
     jlemg.setBounds(400,10,500,40);
     ImageIcon emg1=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\buyandsell.jpg"); 
     Image eg1=emg1.getImage();
     jlemg1=new JLabel("",emg1,JLabel.CENTER);
     jlemg1.setBounds(190,10,200,40);
      jlemg1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     jlemg1.addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() > 0) {
                 new Homepage();
                 setVisible(false);
                 }
   }
}); 
     //searchtf=new PlaceholderTextField("");
     searchtf=new JTextField("");
     //searchtf.setPlaceholder("        Search   ");
     searchtf.setFont(f4);
     search=new JPanel();
     search.setLayout(null);
     search.setBackground(new Color(0,128,255));
     search.setBounds(0,0,1400,60);
     //searchtf.setBackground(new Color(255,255,255));
     searchtf.setBounds(20,2,400,35);
     jlemg.add(searchtf);
     search.add(jlemg);
     search.add(jlemg1);
     ImageIcon searchimg=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\searchimg.png");
     searchbtn=new JButton(searchimg);
     searchbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     searchbtn.setBounds(425,2,45,35);
     jlemg.add(searchbtn);
     loginsignup=new JLabel("<html><u>Login and SignUp </u></html>");
     loginsignup.setFont(f1);
     loginsignup.setForeground(Color.WHITE);
     loginsignup.setBounds(1050,15,220,30);
     search.add(loginsignup);
     loginsignup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     loginsignup.addMouseListener(new MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
      if (e.getClickCount() > 0) {
             new Homepage();
               
      }
   }
}); 


//panel
     content=new JPanel();
     content.setLayout(null);
     content.setBackground(new Color(255,255,255));
     content.setBounds(15,325,1325,300);

     lab11=new JLabel();
     lab11.setLayout(null);
     lab11.setBackground(new Color(255,255,255));
     lab11.setBounds(45,20,200,210);
     lab12=new JLabel();
     //lab12.setLayout(null);
     lab12.setFont(f5);
     lab12.setBackground(new Color(255,255,255));
     lab12.setBounds(20,240,250,35);
     lab13=new JLabel();
     //lab13.setLayout(null);
     lab13.setFont(f5);
     lab13.setBackground(new Color(255,255,255));
     lab13.setBounds(20,265,250,30);

     lab21=new JLabel();
     lab21.setLayout(null);
     lab21.setBackground(new Color(255,255,255));
     lab21.setBounds(305,20,200,210);
     lab22=new JLabel();
     lab22.setLayout(null);
     lab22.setFont(f5);
     lab22.setBackground(new Color(255,255,255));
     lab22.setBounds(280,240,250,35);
     lab23=new JLabel();
     lab23.setLayout(null);
     lab23.setFont(f5);
     lab23.setBackground(new Color(255,255,255));
     lab23.setBounds(280,265,250,30);

     lab31=new JLabel();
     lab31.setLayout(null);
     lab31.setBackground(new Color(255,255,255));
     lab31.setBounds(565,20,200,210);
     lab32=new JLabel();
     lab32.setLayout(null);
     lab32.setFont(f5);
     lab32.setBackground(new Color(255,255,255));
     lab32.setBounds(540,240,250,35);
     lab33=new JLabel();
     lab33.setLayout(null);
     lab33.setFont(f5);
     lab33.setBackground(new Color(255,255,255));
     lab33.setBounds(540,265,250,30);

     lab41=new JLabel();
     lab41.setLayout(null);
     lab41.setBackground(new Color(255,255,255));
     lab41.setBounds(825,20,200,210);
     lab42=new JLabel();
     lab42.setLayout(null);
     lab42.setFont(f5);
     lab42.setBackground(new Color(255,255,255));
     lab42.setBounds(800,240,250,35);
     lab43=new JLabel();
     lab43.setFont(f5);
     lab43.setLayout(null);
     lab43.setBackground(new Color(255,255,255));
     lab43.setBounds(800,265,250,30);

     lab51=new JLabel();
     lab51.setLayout(null);
     lab51.setBackground(new Color(255,255,255));
     lab51.setBounds(1085,20,200,210);
     lab52=new JLabel();
     lab52.setLayout(null);
     lab52.setFont(f5);
     lab52.setBackground(new Color(255,255,255));
     lab52.setBounds(1060,240,250,35);
     lab53=new JLabel();
     lab53.setLayout(null);
     lab53.setFont(f5);
     lab53.setBackground(new Color(255,255,255));
     lab53.setBounds(1060,265,250,30);

     content.add(lab11);
     content.add(lab12);
     content.add(lab13);
     content.add(lab21);
     content.add(lab22);
     content.add(lab23);
     content.add(lab31);
     content.add(lab32);
     content.add(lab33);
     content.add(lab41);
     content.add(lab42);
     content.add(lab43); 
     content.add(lab51); 
     content.add(lab52); 
     content.add(lab53); 

     

 //Buttons
     prevbtn=new JButton("Previous");
     prevbtn.addActionListener(this);
     prevbtn.setBounds(550,650,120,40);
     prevbtn.setBackground(Color.BLUE);
     prevbtn.setForeground(Color.WHITE);
     prevbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
     nextbtn=new JButton("Next");
     nextbtn.addActionListener(this);
     nextbtn.setBounds(690,650,120,40);
     nextbtn.setBackground(Color.BLUE);
     nextbtn.setForeground(Color.WHITE);
     nextbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
  
           //frame
     setBounds(0,0,1400,770);
     setLayout(new BorderLayout());
     setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


     //background   
     ImageIcon bi=new ImageIcon("W:\\New Folder\\donate.sell.buy\\src\\donate\\sell\\buy\\buyback.jpg"); //BACKGROUND
      Image img=bi.getImage();
      Image temp=img.getScaledInstance(1400,770,Image.SCALE_SMOOTH);
      bi=new ImageIcon(temp);
     JLabel bg=new JLabel("",bi,JLabel.CENTER);
     bg.setBounds(0,0,1400,770);
     bg.add(search);
     bg.add(content);
     bg.add(prevbtn);
     bg.add(nextbtn);
      add(bg);
      
      for(int i=16;i<21;i++)
      {
      int p=SubmitAddDatabase.fetch_image(i);
       
      if(p>0 && i==16)
      {
          bimage1=getToolkit().createImage(SubmitAddDatabase.buyimage1);
          s1=bimage1.toString();
          icon11=new ImageIcon(bimage1);
          lab11.setIcon(icon11);
          bimage2=getToolkit().createImage(SubmitAddDatabase.buyimage2);
          s2=bimage2.toString();
          icon12=new ImageIcon(bimage2);
          bimage3=getToolkit().createImage(SubmitAddDatabase.buyimage3);
           s3=bimage3.toString();
          icon13=new ImageIcon(bimage3);
          bimage4=getToolkit().createImage(SubmitAddDatabase.buyimage4);
          s4=bimage4.toString();
          icon14=new ImageIcon(bimage4);
          tit1=SubmitAddDatabase.buy_title;
          lab12.setText(SubmitAddDatabase.buy_title);
          lab13.setText("Rs."+SubmitAddDatabase.buy_price);
          rs1=SubmitAddDatabase.buy_price;
          dption1=SubmitAddDatabase.buy_disc;
          nem1=SubmitAddDatabase.buy_name;
          rlno1=SubmitAddDatabase.buy_roll;
          mbno1=SubmitAddDatabase.buy_mbl;
          lab11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
          lab11.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
          if (e.getClickCount() > 0) {
                  
                   new Element_Deatail(icon11,icon12,icon13,icon14,tit1,rs1,dption1,nem1,rlno1,mbno1);
                 }
            }
}); 
      }
      else if(p>0 && i==17)
      {
           bimage1=getToolkit().createImage(SubmitAddDatabase.buyimage1);
          s1=bimage1.toString();
          icon21=new ImageIcon(bimage1);
          lab21.setIcon(icon21);
          bimage2=getToolkit().createImage(SubmitAddDatabase.buyimage2);
          s2=bimage2.toString();
          icon22=new ImageIcon(bimage2);
          bimage3=getToolkit().createImage(SubmitAddDatabase.buyimage3);
           s3=bimage3.toString();
          icon23=new ImageIcon(bimage3);
          bimage4=getToolkit().createImage(SubmitAddDatabase.buyimage4);
          s4=bimage4.toString();
          icon24=new ImageIcon(bimage4);
          tit2=SubmitAddDatabase.buy_title;
          lab22.setText(SubmitAddDatabase.buy_title);
          lab23.setText("Rs."+SubmitAddDatabase.buy_price);
          rs2=SubmitAddDatabase.buy_price;
          dption2=SubmitAddDatabase.buy_disc;
          nem2=SubmitAddDatabase.buy_name;
          rlno2=SubmitAddDatabase.buy_roll;
          mbno2=SubmitAddDatabase.buy_mbl;
          lab21.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
          lab21.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
          if (e.getClickCount() > 0) {
                  
                   new Element_Deatail(icon21,icon22,icon23,icon24,tit2,rs2,dption2,nem2,rlno2,mbno2);
                 }
            }
}); 
      }
       
    else if(p>0 && i==18)
      { bimage1=getToolkit().createImage(SubmitAddDatabase.buyimage1);
          s1=bimage1.toString();
          icon31=new ImageIcon(bimage1);
          lab31.setIcon(icon31);
          bimage2=getToolkit().createImage(SubmitAddDatabase.buyimage2);
          s2=bimage2.toString();
          icon32=new ImageIcon(bimage2);
          bimage3=getToolkit().createImage(SubmitAddDatabase.buyimage3);
           s3=bimage3.toString();
          icon33=new ImageIcon(bimage3);
          bimage4=getToolkit().createImage(SubmitAddDatabase.buyimage4);
          s4=bimage4.toString();
          icon34=new ImageIcon(bimage4);
          tit3=SubmitAddDatabase.buy_title;
          lab32.setText(SubmitAddDatabase.buy_title);
          lab33.setText("Rs."+SubmitAddDatabase.buy_price);
          rs3=SubmitAddDatabase.buy_price;
          dption3=SubmitAddDatabase.buy_disc;
          nem3=SubmitAddDatabase.buy_name;
          rlno3=SubmitAddDatabase.buy_roll;
          mbno3=SubmitAddDatabase.buy_mbl;
          lab31.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
          lab31.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
          if (e.getClickCount() > 0) {
                  
                   new Element_Deatail(icon31,icon32,icon33,icon34,tit3,rs3,dption3,nem3,rlno3,mbno3);
                 }
            }
}); 
      }
    
      else if(p>0 && i==19)
      {
          bimage1=getToolkit().createImage(SubmitAddDatabase.buyimage1);
          s1=bimage1.toString();
          icon41=new ImageIcon(bimage1);
          lab41.setIcon(icon41);
          bimage2=getToolkit().createImage(SubmitAddDatabase.buyimage2);
          s2=bimage2.toString();
          icon42=new ImageIcon(bimage2);
          bimage3=getToolkit().createImage(SubmitAddDatabase.buyimage3);
           s3=bimage3.toString();
          icon43=new ImageIcon(bimage3);
          bimage4=getToolkit().createImage(SubmitAddDatabase.buyimage4);
          s4=bimage4.toString();
          icon44=new ImageIcon(bimage4);
          lab42.setText(SubmitAddDatabase.buy_title);
          lab43.setText("Rs."+SubmitAddDatabase.buy_price);
          tit4=SubmitAddDatabase.buy_title;
          rs4=SubmitAddDatabase.buy_price;
          dption4=SubmitAddDatabase.buy_disc;
          nem4=SubmitAddDatabase.buy_name;
          rlno4=SubmitAddDatabase.buy_roll;
          mbno4=SubmitAddDatabase.buy_mbl;
          lab41.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
          lab41.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
          if (e.getClickCount() > 0) {
                  
                   new Element_Deatail(icon41,icon42,icon43,icon44,tit4,rs4,dption4,nem4,rlno4,mbno4);
                 }
            }
}); 
      }
      else if(p>0 && i==20)
      {
          bimage1=getToolkit().createImage(SubmitAddDatabase.buyimage1);
          s1=bimage1.toString();
          icon51=new ImageIcon(bimage1);
          lab51.setIcon(icon51);
          bimage2=getToolkit().createImage(SubmitAddDatabase.buyimage2);
          s2=bimage2.toString();
          icon52=new ImageIcon(bimage2);
          bimage3=getToolkit().createImage(SubmitAddDatabase.buyimage3);
           s3=bimage3.toString();
          icon53=new ImageIcon(bimage3);
          bimage4=getToolkit().createImage(SubmitAddDatabase.buyimage4);
          s4=bimage4.toString();
          icon54=new ImageIcon(bimage4);
          tit5=SubmitAddDatabase.buy_title;
          lab52.setText(SubmitAddDatabase.buy_title);
          lab53.setText("Rs."+SubmitAddDatabase.buy_price);
          rs5=SubmitAddDatabase.buy_price;
          dption5=SubmitAddDatabase.buy_disc;
          nem5=SubmitAddDatabase.buy_name;
          rlno5=SubmitAddDatabase.buy_roll;
          mbno5=SubmitAddDatabase.buy_mbl;
          lab51.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
          lab51.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
          if (e.getClickCount() > 0) {
                  
                   new Element_Deatail(icon51,icon52,icon53,icon54,tit5,rs5,dption5,nem5,rlno5,mbno5);
                 }
            }
}); 
      } 
     else
      {
          nextbtn.setVisible(false);
          break;
      }
      }
     setVisible(true);
   }
   //create a function to resize the image 
    public void SetImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
    }
    public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == nextbtn)
		{
            
            new Buy4();
            setVisible(false);
		}
		if(e.getSource() == prevbtn)
		{
            
            new Buy2();
            setVisible(false);
		}
	} 

   public static void main(String args[])
   {
       new Buy3();
   }
}  
