
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
public class Evaluacion_Antropometrica extends JFrame implements ActionListener{
   JLabel Regreso;
   String Nombres[]= {"Limpiar","GUARDAR","SIGUIENTE"};
   JButton Botones[];
   JButton Regresar;
   JTextField Campos[];
   public Evaluacion_Antropometrica() {
	   this.setTitle("Evaluaci�n Antropometrica");
	   this.setSize(1200,720);
	   this.setLayout(null);
	   this.setResizable(false);
	   this.setLocationRelativeTo(null);
	   this.setContentPane(new JLabel(new ImageIcon("./src/imagenes/ImagenEvaluaciónAntropometrica.png")));
	   this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	   Detalles();
	   this.setVisible(true);
   }
   private void Detalles() {
	   Regreso = new JLabel();
	   Regreso.setText("< ADULTO");
	   Regreso.setBounds(10,10,200,25);
	   Regreso.setBorder(null);
	   Regreso.setVisible(true);
	   this.getContentPane().add(Regreso);
	   
	   Botones = new JButton[3];
	   for(int i=0;i<Botones.length;i=i+1) {
		   Botones[i] = new JButton();
		   Botones[i].setText(Nombres[i]);
		   Botones[i].setFont(new java.awt.Font("Arial",Font.BOLD,18));
		   if(i==0) {
			   Botones[i].setBackground(Color.green);
			   Botones[i].setForeground(Color.black);
		   } else
           if(i==1) {
        	   Botones[i].setBackground(Color.pink);
    		   Botones[i].setForeground(Color.white);
           } else
		   if(i>1) {
			   Botones[i].setBackground(Color.blue);
			   Botones[i].setForeground(Color.white);
		   }
		   Botones[i].setActionCommand(""+(i+1));
		   Botones[i].addActionListener(this);
		   if(i<1) {
			   Botones[i].setBounds((i*210)+100,600,200,50);
		   } else {
			   Botones[i].setBounds((i*210)+500,600,200,50);
		   }
		   Botones[i].setVisible(true);
		   this.getContentPane().add(Botones[i]);
	   }
	   Regresar = new JButton();
	   Regresar.setText("REGRESAR");
	   Regresar.setBounds(500,600,200,50);
	   Regresar.setFont(new java.awt.Font("Arial",Font.BOLD,18));
	   Regresar.setBackground(Color.blue);
	   Regresar.setForeground(Color.white);
	   Regresar.setActionCommand("Regresar");
	   Regresar.addActionListener(this);
	   this.getContentPane().add(Regresar);
	   
	   Campos = new JTextField[15];
	   for(int i=0;i<Campos.length;i=i+1) {
		   Campos[i]=new JTextField();
		   Campos[i].setBounds(630,(i*27)+169,242,25);
		   Campos[i].setVisible(true);
		   this.getContentPane().add(Campos[i]);
	   }
	   
   }

public void actionPerformed(ActionEvent e) {
    String Oyente = e.getActionCommand();
    int Campos_Correctos=0;
    switch(Oyente) {
      case "1": 
    	  for(int i=0;i<Campos.length;i=i+1) {
    		  Campos[i].setText("");
    	  }
      break;
      case "2": 
    	  try {
    		  
    		  for(int i=0;i<Campos.length;i=i+1) {
        		  if(Campos[i].getText()!=null && Double.parseDouble(Campos[i].getText())>=0.0) {
        			Campos_Correctos++;
        		  }
        	  }
              if(Campos_Correctos==15) {
            	  double Peso_Actual=Double.parseDouble(Campos[0].getText());
            	  double Estatura=Double.parseDouble(Campos[1].getText());
            	  double Tricipital=Double.parseDouble(Campos[2].getText());
            	  double Bicipital=Double.parseDouble(Campos[3].getText());
            	  double Subescapular=Double.parseDouble(Campos[4].getText());
            	  double Suprailiaco=Double.parseDouble(Campos[5].getText());
            	  double Cefalica=Double.parseDouble(Campos[6].getText());
            	  double Toracica=Double.parseDouble(Campos[7].getText());
            	  double Brazo=Double.parseDouble(Campos[8].getText());
            	  double Muneca=Double.parseDouble(Campos[9].getText());
            	  double Cintura=Double.parseDouble(Campos[10].getText());
            	  double Cadera=Double.parseDouble(Campos[11].getText());
            	  double Abdominal=Double.parseDouble(Campos[12].getText());
            	  double Muslo=Double.parseDouble(Campos[13].getText());
            	  double Pantorilla=Double.parseDouble(Campos[14].getText());
            	  JOptionPane.showMessageDialog(null,"datos guardados");
              }
    	  }catch(Exception ex) {
    		  JOptionPane.showMessageDialog(null,"datos incorrectos, no se permiten\n"
    		  		+ "caracteres, ni palabras, ni campos vacios\n solamente se permiten numeros");
    	  }
      break;
      case "3":
          if(Campos_Correctos==15){
            Agregar_Paciente_Adulto v1= new Agregar_Paciente_Adulto();
            v1.setVisible(true);
            this.setVisible(false);
          }
      break;
      case "Regresar":
          Agregar_Paciente_Adulto v2= new Agregar_Paciente_Adulto();
          v2.setVisible(true);
          this.setVisible(false);
      break;
   }
}
}

