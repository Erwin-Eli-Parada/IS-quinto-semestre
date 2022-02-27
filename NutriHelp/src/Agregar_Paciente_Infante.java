
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
public class Agregar_Paciente_Infante extends JFrame implements ActionListener{
   JLabel Regreso;
   String Nombres[]= {"Evaluación química","Ingreso de datos"};
   JButton Botones[];
   JButton Regresar;
   public Agregar_Paciente_Infante() {
	   this.setTitle("Agregar Paciente Infante");
	   this.setSize(1200,700);
	   this.setLayout(null);
	   this.setResizable(false);
	   this.setLocationRelativeTo(null);
	   this.setContentPane(new JLabel(new ImageIcon("./src/imagenes/ImagenAgregarPacienteInfante.png")));
	   this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	   Detalles();
	   this.setVisible(true);
   }
   private void Detalles() {
	   Regreso = new JLabel();
	   Regreso.setText("< AGREGAR PACIENTE (INFANTE)");
	   Regreso.setBounds(10,10,200,25);
	   Regreso.setBorder(null);
	   Regreso.setVisible(true);
	   this.getContentPane().add(Regreso);
	   
	   Botones = new JButton[2];
	   for(int i=0;i<Botones.length;i=i+1) {
		   Botones[i] = new JButton();
		   Botones[i].setText(Nombres[i]);
		   Botones[i].setFont(new java.awt.Font("Arial",Font.BOLD,18));
		   Botones[i].setBackground(Color.pink);
		   Botones[i].setForeground(Color.white);
		   Botones[i].setActionCommand(""+(i+1));
		   Botones[i].addActionListener(this);
		   if(i<=2) {
			   Botones[i].setBounds((i*420)+270,400,300,50);
		   }
		   Botones[i].setVisible(true);
		   this.getContentPane().add(Botones[i]);
	   }
	   Regresar = new JButton();
	   Regresar.setText("REGRESAR");
	   Regresar.setBounds(800,550,300,50);
	   Regresar.setFont(new java.awt.Font("Arial",Font.BOLD,18));
	   Regresar.setBackground(Color.white);
	   Regresar.setForeground(Color.black);
	   Regresar.setActionCommand("Regresar");
	   Regresar.addActionListener(this);
	   this.getContentPane().add(Regresar);
   }

public void actionPerformed(ActionEvent e) {
	String Oyente = e.getActionCommand();
   switch(Oyente) {
      case "1":
        Evaluacion_Quimica_Adulto v3=new Evaluacion_Quimica_Adulto();
        v3.setVisible(true);
        this.setVisible(false);
      break;
      case "2":
        Calculo_dietetico v2=new Calculo_dietetico();
        v2.setVisible(true);
        this.setVisible(false);
      break;
      case "Regresar":
        Datos_Generales v1=new Datos_Generales();
        v1.setVisible(true);
        this.setVisible(false);
      break;
   }
}
}

