
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.*;
import java.awt.GridLayout;
public class Evaluacion_Clinica extends JFrame implements ActionListener{
   JLabel Regreso;
   String Nombres[]= {"Limpiar","GUARDAR","SIGUIENTE"};
   JButton Botones[];
   JButton Regresar;
   JTextField Campos[];
   JScrollPane Barra;
   Panel panel;
   public Evaluacion_Clinica() {
	   this.setTitle("Evaluación Clínica");
	   this.setSize(1200,720);
	   this.setLayout(null);
	   this.setResizable(false);
	   this.setLocationRelativeTo(null);
	   this.setContentPane(new JLabel(new ImageIcon("./src/imagenes/ImagenEvaluacionClinica1.png")));
	   this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	   Detalles();
	   this.setVisible(true);
   }
   private void Detalles() {
	
	   panel = new Panel();
	   Barra = new JScrollPane(panel,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	   Barra.setBounds(100,200,1000,400);
	   Barra.setVisible(true);
	   this.getContentPane().add(Barra);
	   
	   for(int i=0;i<panel.getJTB().length;i=i+1) {
		   panel.getJTB()[i].addActionListener(this);
		   panel.getJTB()[i].setActionCommand("JTB"+(i+1));
	   }
	   
	   // Botones Principales
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

	   Regreso = new JLabel();
	   Regreso.setText("< ADULTO");
	   Regreso.setBounds(10,10,200,25);
	   Regreso.setBorder(null);
	   Regreso.setVisible(true);
	   this.getContentPane().add(Regreso);
	   
   }
   
   
  public void actionPerformed(ActionEvent e) {
    String Oyente = e.getActionCommand();
    int Validez_Campos=0;
    switch(Oyente) {
      case "1": 
    	  for(int i=0;i<panel.getCampos().length;i=i+1) {
    		  panel.getCampos()[i].setText("");
    	  }
    	  for(int i=0;i<panel.getArea().length;i=i+1) {
    		  panel.getArea()[i].setText("");
    	  }
    	  for(int i=0;i<panel.getJTB().length;i=i+1) {
    		  panel.getJTB()[i].setSelected(false);
    	  }
      break;
      case "2": 
    		  try {
    			  int Errores=0;
    			  // Comprobacion de jtextfield validos
    			  
    			  for(int i=0;i<panel.getCampos().length;i=i+1) {
    				  if(panel.getCampos()[i].getText().length()!=0) {
    					  Validez_Campos++;
    				  }
    			  }
    			  if(Validez_Campos==61) { // 57 
    			  } else {
    				  Errores++;
    			  }
    		      // Comprobacion de jtextarea validos
    			  int Validez_Areas=0;
    			  for(int i=0;i<panel.getArea().length;i=i+1) {
    				  if(panel.getArea()[i].getText().length()!=0) {
    					  Validez_Areas++;
    				  }
    			  }
    			  if(Validez_Areas==4) {
    			  } else {
    				  Errores++;
    			  }
    			  if(Errores==0) {
    				  
    				  String Datos_Botones[] = new String[panel.getJTB().length];
    				  for(int i=0;i<panel.getJTB().length;i=i+1) {
    	    		    if(panel.getJTB()[i].isSelected()) {
    	    			   Datos_Botones[i]="on";
    	    		    } else {
    	    		 	   Datos_Botones[i]="off";
    	    		    }  
    			      }
    				  
    				  // Datos que se deben de pasar a la base
    				  
    				  // Antescedentes heredo-familiares
    				  
    						  String diabetes = ""+panel.getCampos()[0].getText()+panel.getCampos()[9].getText()+panel.getCampos()[18].getText()+panel.getCampos()[27].getText()+panel.getCampos()[36].getText();
    						  String hipertension_arterial = ""+panel.getCampos()[1].getText()+panel.getCampos()[10].getText()+panel.getCampos()[19].getText()+panel.getCampos()[28].getText()+panel.getCampos()[37].getText();
    						  String obesidad = ""+panel.getCampos()[2].getText()+panel.getCampos()[11].getText()+panel.getCampos()[20].getText()+panel.getCampos()[29].getText()+panel.getCampos()[38].getText();
    						  String cardiopatia = ""+panel.getCampos()[3].getText()+panel.getCampos()[12].getText()+panel.getCampos()[21].getText()+panel.getCampos()[30].getText()+panel.getCampos()[39].getText();
    						  String enfermedad_renal = ""+panel.getCampos()[4].getText()+panel.getCampos()[13].getText()+panel.getCampos()[22].getText()+panel.getCampos()[31].getText()+panel.getCampos()[40].getText();
    						  String enfermedad_epatica = ""+panel.getCampos()[5].getText()+panel.getCampos()[14].getText()+panel.getCampos()[23].getText()+panel.getCampos()[32].getText()+panel.getCampos()[41].getText();
    						  String hipo_hipertiroidismo = ""+panel.getCampos()[6].getText()+panel.getCampos()[15].getText()+panel.getCampos()[24].getText()+panel.getCampos()[33].getText()+panel.getCampos()[42].getText();
    						  String cancer = ""+panel.getCampos()[7].getText()+panel.getCampos()[16].getText()+panel.getCampos()[25].getText()+panel.getCampos()[34].getText()+panel.getCampos()[43].getText();
    						  String otros = ""+panel.getCampos()[8].getText()+panel.getCampos()[17].getText()+panel.getCampos()[26].getText()+panel.getCampos()[35].getText()+panel.getCampos()[44].getText();
    				  
    				  // Sistema Digestivo
    				  
    						  String problem_masticar = ""+Datos_Botones[0]+panel.getCampos()[45].getText();
    						  String ausencia_pzdental = ""+Datos_Botones[1]+panel.getCampos()[46].getText();
    						  String dificult_deglutir = ""+Datos_Botones[2];
    						  String reflujo = ""+Datos_Botones[3];
    						  String pirosis = ""+Datos_Botones[4];
    						  String colitis = ""+Datos_Botones[5];
    						  String gastritis = ""+Datos_Botones[6];
    						  String meteorismo = ""+Datos_Botones[7];
    						  String diarrea = ""+Datos_Botones[8];
    						  String dolor_ardor_despComer = ""+Datos_Botones[9];
    						  String num_evacDiaYcolor = ""+panel.getCampos()[47].getText()+panel.getCampos()[48].getText();
    						  String estrenimiento = ""+Datos_Botones[10];
    						  String laxantes = ""+Datos_Botones[11];
    						  String diureticos = ""+Datos_Botones[12];
    						  String antiacidos = ""+Datos_Botones[13];    			
    				  
    				  // Aparato Cardiovascular
    				  
    						  String entumecimiento = ""+Datos_Botones[14]+panel.getCampos()[49].getText();
    						  String edema = ""+Datos_Botones[15]+panel.getCampos()[50].getText();
    						  String venas_varicosas = ""+Datos_Botones[16];
    						  String taquicardias = ""+Datos_Botones[17];
    						  String disnea = ""+Datos_Botones[18];
    						  String mareos = ""+Datos_Botones[19];
    						  String vertigo = ""+Datos_Botones[20];
    						  String ta_semana = ""+panel.getCampos()[51].getText();
    		
    				  
    				  // Sistema Renal
    				  
    						  String color_orina = ""+panel.getCampos()[52].getText();
    						  String dolor_ardor_miccion = ""+Datos_Botones[21];
    						  String dolor_areaRenal = ""+Datos_Botones[22];
    						  String infecciones_recurrentes = ""+Datos_Botones[23];
  
    				  
    				  // Sistema Nervioso
    				  
    						  String ansiedad = ""+Datos_Botones[24];
    						  String depresion = ""+Datos_Botones[25];
    						  String estres = ""+Datos_Botones[26];
    						  String problem_ingestaAlimentos = ""+Datos_Botones[27];
    						  String anorexia = ""+Datos_Botones[28];
    						  String mialgias = ""+Datos_Botones[29];
    						  String artralgias = ""+Datos_Botones[30];
    						  String cirugias = ""+Datos_Botones[31]+panel.getCampos()[53].getText();
    						  String hospitalizaciones_prev = ""+panel.getArea()[0].getText();
    						  String alergias_medicamentos = ""+panel.getArea()[1].getText();
    						  String padecimiento_actual = ""+panel.getArea()[2].getText();
    						  String prescripcion_medica = ""+panel.getArea()[3].getText();
    				  
    				  // Aspectos ginecologicos
    				  
    						  String embarazo_actual = ""+Datos_Botones[32];
    						  int sdg = Integer.parseInt(""+panel.getCampos()[57].getText());
    						  int cesareas = Integer.parseInt(""+panel.getCampos()[58].getText());
    						  int abortos = Integer.parseInt(""+panel.getCampos()[59].getText());
    						  int partos = Integer.parseInt(""+panel.getCampos()[60].getText());
    						  String anticonceptivos_orales = ""+Datos_Botones[37]+panel.getCampos()[54].getText()+panel.getCampos()[55].getText();
    						  String climaterio = ""+Datos_Botones[38];
    						  String climaterio_fecha = ""+panel.getCampos()[56].getText();
    				  
    			  } else {
    				  JOptionPane.showMessageDialog(null,"Campos Vacios");
    			  }
    		  }catch(Exception ex) {
    			  JOptionPane.showMessageDialog(null,"Error al guardar,Existen Campos invalidos");
    		  }
      break;
      case "3":
          if(Validez_Campos==61){
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
}}
