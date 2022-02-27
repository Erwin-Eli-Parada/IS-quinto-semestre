
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.Border;
public class Evaluacion_Quimica_Adulto extends JFrame implements ActionListener{

   JLabel Regreso;
   JLabel Subir;
   String Nombres[]= {"Guardar","Siguiente"};
   JButton Botones[];
   JButton SubirArchivo;
   JButton Regresar;
   JFileChooser Cargar,Guardar;
   
   java.util.Date fecha = new Date();
   public Evaluacion_Quimica_Adulto() {
	   this.setTitle("Evaluacion_Quimica_Adulto");
	   this.setSize(1200,720);
	   this.setLayout(null);
	   this.setResizable(false);
	   this.setLocationRelativeTo(null);
	   this.setContentPane(new JLabel(new ImageIcon("./src/imagenes/ImagenEvaluacionQuimicaAdulto.png")));
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
	   
	   Subir = new JLabel();
	   Subir.setText("Subir archivos:");
	   Subir.setFont(new java.awt.Font("Arial",Font.BOLD,20));
	   Subir.setBounds(190,230,200,25);
	   Subir.setBorder(null);
	   Subir.setVisible(true);
	   this.getContentPane().add(Subir);
	   
	   Botones = new JButton[2];
	   for(int i=0;i<Botones.length;i=i+1) {
		   Botones[i] = new JButton();
		   Botones[i].setText(Nombres[i]);
		   Botones[i].setFont(new java.awt.Font("Arial",Font.BOLD,18));
		   Botones[i].setActionCommand(""+(i+1));
		   Botones[i].addActionListener(this);
		   if(i==1) {
			   Botones[i].setBackground(Color.blue);
			   Botones[i].setForeground(Color.white);
		   } else {
			   Botones[i].setBackground(Color.pink);
			   Botones[i].setForeground(Color.white);
		   }
		   if(i<=2) {
			   Botones[i].setBounds((i*310)+500,610,300,50);
		   }
		   Botones[i].setVisible(true);
		   this.getContentPane().add(Botones[i]);
	   }
	   
	   SubirArchivo = new JButton();
	   SubirArchivo.setIcon(new ImageIcon("./src/imagenes/subir.png"));
	   SubirArchivo.setBounds(210,270,845,290);
	   SubirArchivo.setFont(new java.awt.Font("Arial",Font.BOLD,18));
	   SubirArchivo.setBackground(Color.blue);
	   SubirArchivo.setForeground(Color.white);
	   SubirArchivo.setActionCommand("Subir");
	   SubirArchivo.addActionListener(this);
	   this.getContentPane().add(SubirArchivo);
	   
	   Regresar = new JButton();
	   Regresar.setText("REGRESAR");
	   Regresar.setBounds(190,610,300,50);
	   Regresar.setFont(new java.awt.Font("Arial",Font.BOLD,18));
	   Regresar.setBackground(Color.blue);
	   Regresar.setForeground(Color.white);
	   Regresar.setActionCommand("Regresar");
	   Regresar.addActionListener(this);
	   this.getContentPane().add(Regresar);
   }

File file=null;
boolean existe=false;
public void actionPerformed(ActionEvent e) {
    String Oyente = e.getActionCommand();
    boolean guardado=false;
    switch(Oyente) {
      case "1": 
    	  try {
    		  if(existe==true) {
    			  Path origenPath = FileSystems.getDefault().getPath(file.getPath());
                          Path destinoPath = FileSystems.getDefault().getPath(System.getProperty("user.dir")+"\\src\\Archivos\\"+Datos_Generales.getnombre()+fecha.getMonth()+fecha.getDay()+".jpg");
        		  Files.copy(origenPath,destinoPath,StandardCopyOption.REPLACE_EXISTING);
        		  existe=false;
                          guardado=true;
                          
                          //conexion a BD
                          Connection con=null;
                          con = BD.getConection();
                
                          PreparedStatement ps;
                          ResultSet res;
                
                          ps=con.prepareStatement("CALL Insertar_quimica('"+"\\src\\Archivos\\"+Datos_Generales.getnombre()+fecha.getMonth()+fecha.getDay()+"',"+Datos_Generales.getid()+",'"+(fecha.getYear()+1900)+"-"+fecha.getMonth()+"-"+fecha.getDay()+"')");
                          res=ps.executeQuery();
                          
    		  } else {
    			  JOptionPane.showMessageDialog(null,"No selecciono ningun archivo");
    		  }
    	  }catch(Exception ex) {
    		  JOptionPane.showMessageDialog(null,"Hubo un error");
                  System.out.print(ex);
    	  }
      break;
      case "2":
          if(guardado==true){
            Agregar_Paciente_Adulto v2= new Agregar_Paciente_Adulto();
            v2.setVisible(true);
            this.setVisible(false);
          }
      break;
      case "Subir":
    	  try {
    		  Cargar = new JFileChooser();
        	  Cargar.setApproveButtonText("Cargar");
        	  int Opcion2 = Cargar.showOpenDialog(null);
                      
		      file=Cargar.getSelectedFile();
        	  if(Opcion2==JFileChooser.APPROVE_OPTION) {
        		  existe=true;
        	  }
    		  }catch(Exception ex) {
    			  JOptionPane.showMessageDialog(null,"Hubo un error");
    		  }
      break;
      case "Regresar":
          Agregar_Paciente_Adulto v1= new Agregar_Paciente_Adulto();
          v1.setVisible(true);
          this.setVisible(false);
      break;
   }
}
public static void main(String []args){
    Evaluacion_Quimica_Adulto v1= new Evaluacion_Quimica_Adulto();
    v1.setVisible(true);
}
}

