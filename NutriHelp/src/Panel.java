import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class Panel extends JPanel implements Runnable{
	Image imagen;
	JTextField Campos[];
	JScrollPane scroll[];
	JTextArea Area[];
	JToggleButton jtb[];
	public Panel() {
		this.setLayout(null);
		this.setPreferredSize(new Dimension(1000,3231));
		this.setBackground(Color.red);
		
		Campos = new JTextField[61];
		for(int i=0;i<Campos.length;i=i+1) {
		  Campos[i] = new JTextField();
		  Campos[i].setLayout(null);
		  if((i>=0)&&(i<9)) {
			  Campos[i].setBounds(380,(i*26)+147,203,25);
		  }
		  if((i>=9)&&(i<18)) {
			  Campos[i].setBounds(380+203,((i-9)*26)+147,77,25);
		  }
		  if((i>=18)&&(i<27)) {
			  Campos[i].setBounds(380+203+77,((i-18)*26)+147,77,25);
		  }
		  if((i>=27)&&(i<36)) {
			  Campos[i].setBounds(380+203+77+77,((i-27)*26)+147,77,25);
		  }
		  if((i>=36)&&(i<45)) {
			  Campos[i].setBounds(380+203+77+77+77,((i-36)*26)+147,94,25);
		  }
		  if(i==45) {
			  Campos[i].setBounds(500,510,300,25);
		  }
		  if(i==46) {
			  Campos[i].setBounds(638,547,300,25);
		  }
		  if(i==47) {
			  Campos[i].setBounds(433,866,50,30);
		  }
		  if(i==48) {
			  Campos[i].setBounds(550,866,300,30);
		  }
		  if(i==49) {
			  Campos[i].setBounds(450,1138,350,30);
		  }
		  if(i==50) {
			  Campos[i].setBounds(350,1180,350,25);
		  }
		  if(i==51) {
			  Campos[i].setBounds(110,1395,70,30);
		  }
		  if(i==52) {
			  Campos[i].setBounds(230,1520,300,25);
		  }
		  if(i==53) {
			  Campos[i].setBounds(278,1995,600,30); 
		  }
		  if(i==54) {
			  Campos[i].setBounds(448,3000,250,30);
		  }
		  if(i==55) {
			  Campos[i].setBounds(510+250,3000,200,30);
		  }
		  if(i==56) {
			  Campos[i].setBounds(315,3040,400,25);
		  }

		  if(i==57) {
			  Campos[i].setBounds(370,2930,50,25);
      	  }
      	  if(i==58) {
      		  Campos[i].setBounds(180,2970,50,25);
      	  }
      	  if(i==59) {
      		  Campos[i].setBounds(370,2970,50,25);
      	  }
      	  if(i==60) {
      		  Campos[i].setBounds(530,2970,50,25);
      	  }
		  Campos[i].setVisible(true);
		  this.add(Campos[i]);
		}
        scroll = new JScrollPane[4];
        Area = new JTextArea[4];
        for(int i=0;i<Area.length;i=i+1) {
        	Area[i] = new JTextArea();
        	Area[i].setBackground(Color.white);
        	scroll[i] = new JScrollPane(Area[i],JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        	if(i==0) {
        		scroll[i].setBounds(70,(i*200)+2100,800,137);
        	}
        	if(i==1) {
        		scroll[i].setBounds(70,(i*200)+2110,800,137);
        	}
        	if(i==2) {
        		scroll[i].setBounds(70,(i*200)+2090,800,137);
        	}
        	if(i==3) {
        		scroll[i].setBounds(70,(i*200)+2080,800,137);
        	}
        	scroll[i].setVisible(true);
        	this.add(scroll[i]);
        }
        jtb = new JToggleButton[39];
        for(int i=0;i<jtb.length;i=i+1) {
        	jtb[i] = new JToggleButton("O");
        	jtb[i].setBackground(Color.blue);
        	jtb[i].setForeground(Color.white);
        	if(i==0) {
        		jtb[i].setBounds(365,512,50,25);
        	}
        	if(i==1) {
        		jtb[i].setBounds(400,550,50,25);
        	}
        	if(i==2) {
        		jtb[i].setBounds(340,585,50,25);
        	}
        	if(i==3) {
        		jtb[i].setBounds(187,616,50,25);
        	}
        	if(i==4) {
        		jtb[i].setBounds(185,655,50,25);
        	}
        	if(i==5) {
        		jtb[i].setBounds(180,690,50,25);
        	}
        	if(i==6) {
        		jtb[i].setBounds(189,727,50,25);
        	}
        	if(i==7) {
        		jtb[i].setBounds(230,762,50,25);
        	}
        	if(i==8) {
        		jtb[i].setBounds(180,800,50,25);
        	}
        	if(i==9) {
        		jtb[i].setBounds(440,833,50,25);
        	}
        	if(i==10) {
        		jtb[i].setBounds(250,905,50,25);
        	}
        	if(i==11) {
        		jtb[i].setBounds(215,945,50,25);
        	}
        	if(i==12) {
        		jtb[i].setBounds(215,980,50,25);
        	}
        	if(i==13) {
        		jtb[i].setBounds(215,1020,50,25);
        	}
        	if(i==14) {
        		jtb[i].setBounds(253,1145,50,25);
        	}
        	if(i==15) {
        		jtb[i].setBounds(155,1179,50,25);
        	}
        	if(i==16) {
        		jtb[i].setBounds(243,1217,50,25);
        	}
        	if(i==17) {
        		jtb[i].setBounds(212,1251,50,25);
        	}
        	if(i==18) {
        		jtb[i].setBounds(155,1291,50,25);
        	}
        	if(i==19) {
        		jtb[i].setBounds(155,1321,50,25);
        	}
        	if(i==20) {
        		jtb[i].setBounds(155,1360,50,25);
        	}
        	if(i==21) {
        		jtb[i].setBounds(350,1557,50,25);
        	}
        	if(i==22) {
        		jtb[i].setBounds(305,1589,50,25);
        	}
        	if(i==23) {
        		jtb[i].setBounds(330,1627,50,25);
        	}
        	if(i==24) {
        		jtb[i].setBounds(185,1740,50,25);
        	}
        	if(i==25) {
        		jtb[i].setBounds(188,1780,50,25);
        	}
        	if(i==26) {
        		jtb[i].setBounds(145,1818,50,25);
        	}
        	if(i==27) {
        		jtb[i].setBounds(510,1855,50,25);
        	}
        	if(i==28) {
        		jtb[i].setBounds(185,1890,50,25);
        	}
        	if(i==29) {
        		jtb[i].setBounds(170,1925,50,25);
        	}
        	if(i==30) {
        		jtb[i].setBounds(185,1960,50,25);
        	}
        	if(i==31) {
        		jtb[i].setBounds(165,1997,50,25);
        	}
        	if(i==32) {
        		jtb[i].setBounds(255,2930,50,25);
        	}
        	if(i==33) {
        		jtb[i].setBounds(370,2930,50,25);
        	}
        	if(i==34) {
        		jtb[i].setBounds(180,2970,50,25);
        	}
        	if(i==35) {
        		jtb[i].setBounds(370,2970,50,25);
        	}
        	if(i==36) {
        		jtb[i].setBounds(530,2970,50,25);
        	}
        	if(i==37) {
        		jtb[i].setBounds(320,3005,50,25);
        	}
        	if(i==38) {
        		jtb[i].setBounds(190,3040,50,25);
        	}
        	jtb[i].setVisible(true);
        	this.add(jtb[i]);
        }
    		jtb[33].setVisible(false);
    		jtb[34].setVisible(false);
    		jtb[35].setVisible(false);
    		jtb[36].setVisible(false);
		this.setVisible(true);
		this.updateUI();
		new Thread(this).start();
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		imagen = new ImageIcon("./src/imagenes/ImagenEvaluacionClinica2.png").getImage();
		g.drawImage(imagen,0,0,this.getWidth(),this.getHeight(),this);
	}
	public void run() {
		while(true) {
			try {
				for(int i=0;i<Campos.length;i=i+1) {
					Campos[i].repaint();
				}
				for(int i=0;i<Area.length;i=i+1) {
					Area[i].repaint();
					scroll[i].repaint();
				}
				for(int i=0;i<jtb.length;i=i+1) {
					jtb[i].repaint();
				}
				Thread.sleep(10);
			}catch(Exception ex) {
				
			}
		}
	}
	public JTextField[] getCampos() {
		return Campos;
	}
	public JTextArea[] getArea() {
		return Area;
	}
	public JToggleButton[] getJTB() {
		return jtb;
	}
}
