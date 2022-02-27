
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
public class Agregar_Paciente_Adulto extends JFrame implements ActionListener{
   JLabel Regreso;
   String Nombres[]= {"Evaluación antropometrica","Evaluación cliníca","Evaluación química","Cálculo dietético"};
   JButton Botones[];
   JButton Regresar;
   public Agregar_Paciente_Adulto() {
	   this.setTitle("Agregar Paciente Adulto");
	   this.setSize(1200,700);
	   this.setLayout(null);
	   this.setResizable(false);
	   this.setLocationRelativeTo(null);
	   this.setContentPane(new JLabel(new ImageIcon("./src/imagenes/ImagenAgregarPacienteAdulto.png")));
	   this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	   Detalles();
	   this.setVisible(true);
   }
   private void Detalles() {
	   Regreso = new JLabel();
	   Regreso.setText("< AGREGAR PACIENTE (ADULTO)");
	   Regreso.setBounds(10,10,200,25);
	   Regreso.setBorder(null);
	   Regreso.setVisible(true);
	   this.getContentPane().add(Regreso);
	   
	   Botones = new JButton[4];
	   for(int i=0;i<Botones.length;i=i+1) {
		   Botones[i] = new JButton();
		   Botones[i].setText(Nombres[i]);
		   Botones[i].setFont(new java.awt.Font("Arial",Font.BOLD,18));
		   Botones[i].setBackground(Color.pink);
		   Botones[i].setForeground(Color.white);
		   Botones[i].setActionCommand(""+(i+1));
		   Botones[i].addActionListener(this);
		   if(i<2) {
			   Botones[i].setBounds((i*420)+270,350,300,50);
		   } else {
			   Botones[i].setBounds(((i-2)*420)+270,450,300,50);
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
               Evaluacion_Antropometrica v4=new Evaluacion_Antropometrica();
               v4.setVisible(true);
               this.setVisible(false);
	   break;
	   case "2":
               Evaluacion_Clinica v6= new Evaluacion_Clinica();
               v6.setVisible(true);
               this.setVisible(false);
	   break;
	   case "3":
               Evaluacion_Quimica_Adulto v3=new Evaluacion_Quimica_Adulto();
               v3.setVisible(true);
               this.setVisible(false);
	   break;
	   case "4":
               Registro24h v5=new Registro24h();
               v5.setVisible(true);
               this.setVisible(false);
	   break;
	   case "Regresar":
                Datos_Generales v1=new Datos_Generales();
                v1.setVisible(true);
                this.setVisible(false);
	   break;
	}
}
public static void main(String []args){
    Agregar_Paciente_Adulto v1=new Agregar_Paciente_Adulto();
    v1.setVisible(true);
}
}

