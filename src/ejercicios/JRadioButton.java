package ejercicios;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JRadioButton extends JFrame {

	private JRadioButton rdnBtnPre2R3;
	private JRadioButton rdnBtnPre3R2;
	private JRadioButton rdnBtnPre4R3;
	private JRadioButton rdnBtnPre5R1;
	private JButton btnAnterior;
	private JLabel lblPregunta1;
	private javax.swing.JRadioButton rdnBtnPre1R1;
	private javax.swing.JRadioButton rdnBtnPre1R3;
	private javax.swing.JRadioButton rdnBtnPre1R2_1;
	private javax.swing.JRadioButton rdnBtnPre2R1;
	private javax.swing.JRadioButton rdnBtnPre2R2;
	private JLabel lblPregunta2;
	private javax.swing.JRadioButton rdnBtnPre3R1;
	private javax.swing.JRadioButton rdnBtnPre3R3;
	private javax.swing.JRadioButton rdnBtnPre4R1;
	private javax.swing.JRadioButton rdnBtnPre4R2;
	private JLabel lblPregunta4;
	private JLabel lblPregunta3;
	private JLabel lblPregunta5;
	private javax.swing.JRadioButton rdnBtnPre5R1_1;
	private javax.swing.JRadioButton rdnBtnPre5R2;
	private javax.swing.JRadioButton rdnBtnPre5R3;
	private JPanel TestPanel;
	private javax.swing.JRadioButton rdnBtnPre2R3_1;
	private javax.swing.JRadioButton rdnBtnPre3R2_1;
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioButton frame = new JRadioButton();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();					
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public JRadioButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1021, 596);
		
		TestPanel = new JPanel();
		TestPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(TestPanel);
		
		JButton btnSiguiente = new JButton("Siguiente Pregunta >");
		btnSiguiente.setBounds(650, 388, 140, 42);
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int RespuestaCorrecta = 0;
				int Contador = 0;
				for( int i=0; i <=5; i++  )
				{
					Contador = Contador++;
					if(Contador == i)
					{
						if(rdnBtnPre1R2_1.isSelected())
						{
							lblPregunta1.setVisible(false);
							rdnBtnPre1R1.setVisible(false);
							rdnBtnPre1R2_1.setVisible(false);
							rdnBtnPre1R3.setVisible(false);
							lblPregunta2.setVisible(true);
							rdnBtnPre2R1.setVisible(true);
							rdnBtnPre2R2.setVisible(true);
							rdnBtnPre2R3_1.setVisible(true);
							lblPregunta3.setVisible(false);
							rdnBtnPre3R1.setVisible(false);
							rdnBtnPre3R2.setVisible(false);
							rdnBtnPre3R3.setVisible(false);
							lblPregunta4.setVisible(false);
							rdnBtnPre4R1.setVisible(false);
							rdnBtnPre4R2.setVisible(false);
							rdnBtnPre4R3.setVisible(false);
							lblPregunta5.setVisible(false);
							rdnBtnPre5R1.setVisible(false);
							rdnBtnPre5R2.setVisible(false);
							rdnBtnPre5R3.setVisible(false);
							btnAnterior.setEnabled(false);
							RespuestaCorrecta = RespuestaCorrecta + 1;
						}
						else
						{
						RespuestaCorrecta = RespuestaCorrecta + 0;
						lblPregunta1.setVisible(false);
						rdnBtnPre1R1.setVisible(false);
						rdnBtnPre1R2_1.setVisible(false);
						rdnBtnPre1R3.setVisible(false);
						lblPregunta2.setVisible(false);
						lblPregunta2.setVisible(true);
						rdnBtnPre2R1.setVisible(true);
						rdnBtnPre2R2.setVisible(true);
						rdnBtnPre2R3_1.setVisible(true);
						lblPregunta3.setVisible(false);
						rdnBtnPre3R1.setVisible(false);
						rdnBtnPre3R2.setVisible(false);
						rdnBtnPre3R3.setVisible(false);
						lblPregunta4.setVisible(false);
						rdnBtnPre4R1.setVisible(false);
						rdnBtnPre4R2.setVisible(false);
						rdnBtnPre4R3.setVisible(false);
						btnAnterior.setEnabled(false);
						}
						if(Contador == i)
						{
							if(rdnBtnPre2R3_1.isSelected())
							{
								RespuestaCorrecta = RespuestaCorrecta + 1;
								lblPregunta1.setVisible(false);
								rdnBtnPre1R1.setVisible(false);
								rdnBtnPre1R2_1.setVisible(false);
								rdnBtnPre1R3.setVisible(false);
								lblPregunta2.setVisible(false);
								rdnBtnPre2R1.setVisible(false);
								rdnBtnPre2R2.setVisible(false);
								rdnBtnPre2R3.setVisible(false);
								lblPregunta3.setVisible(false);
								rdnBtnPre3R1.setVisible(false);
								rdnBtnPre3R2.setVisible(false);
								rdnBtnPre3R3.setVisible(false);
								lblPregunta4.setVisible(false);
								rdnBtnPre4R1.setVisible(false);
								rdnBtnPre4R2.setVisible(false);
								rdnBtnPre4R3.setVisible(false);
								btnAnterior.setEnabled(false);
							}
							else
							{
								RespuestaCorrecta = RespuestaCorrecta + 0;
								lblPregunta1.setVisible(false);
								rdnBtnPre1R1.setVisible(false);
								rdnBtnPre1R2_1.setVisible(false);
								rdnBtnPre1R3.setVisible(false);
								lblPregunta2.setVisible(false);
								rdnBtnPre2R1.setVisible(false);
								rdnBtnPre2R2.setVisible(false);
								rdnBtnPre2R3.setVisible(false);
								lblPregunta3.setVisible(false);
								rdnBtnPre3R1.setVisible(false);
								rdnBtnPre3R2.setVisible(false);
								rdnBtnPre3R3.setVisible(false);
								lblPregunta4.setVisible(false);
								rdnBtnPre4R1.setVisible(false);
								rdnBtnPre4R2.setVisible(false);
								rdnBtnPre4R3.setVisible(false);
								btnAnterior.setEnabled(false);
							}										
						if(i == 3)
						{
							if(rdnBtnPre3R2.isSelected())
							{
								RespuestaCorrecta = RespuestaCorrecta + 1;
								lblPregunta1.setVisible(false);
								rdnBtnPre1R1.setVisible(false);
								rdnBtnPre1R2_1.setVisible(false);
								rdnBtnPre1R3.setVisible(false);
								lblPregunta2.setVisible(false);
								rdnBtnPre2R1.setVisible(false);
								rdnBtnPre2R2.setVisible(false);
								rdnBtnPre2R3.setVisible(false);
								lblPregunta3.setVisible(false);
								rdnBtnPre3R1.setVisible(false);
								rdnBtnPre3R2.setVisible(false);
								rdnBtnPre3R3.setVisible(false);
								lblPregunta4.setVisible(false);
								rdnBtnPre4R1.setVisible(false);
								rdnBtnPre4R2.setVisible(false);
								rdnBtnPre4R3.setVisible(false);
								btnAnterior.setEnabled(false);
							}
							else
							{
								RespuestaCorrecta = RespuestaCorrecta + 0;
								lblPregunta1.setVisible(false);
								rdnBtnPre1R1.setVisible(false);
								rdnBtnPre1R2_1.setVisible(false);
								rdnBtnPre1R3.setVisible(false);
								lblPregunta2.setVisible(false);
								rdnBtnPre2R1.setVisible(false);
								rdnBtnPre2R2.setVisible(false);
								rdnBtnPre2R3.setVisible(false);
								lblPregunta3.setVisible(false);
								rdnBtnPre3R1.setVisible(false);
								rdnBtnPre3R2.setVisible(false);
								rdnBtnPre3R3.setVisible(false);
								lblPregunta4.setVisible(false);
								rdnBtnPre4R1.setVisible(false);
								rdnBtnPre4R2.setVisible(false);
								rdnBtnPre4R3.setVisible(false);
								btnAnterior.setEnabled(false);
						}
						if(Contador == i)
						{
							if(rdnBtnPre4R3.isSelected())
							{
								RespuestaCorrecta = RespuestaCorrecta + 1;
								lblPregunta1.setVisible(false);
								rdnBtnPre1R1.setVisible(false);
								rdnBtnPre1R2_1.setVisible(false);
								rdnBtnPre1R3.setVisible(false);
								lblPregunta2.setVisible(false);
								rdnBtnPre2R1.setVisible(false);
								rdnBtnPre2R2.setVisible(false);
								rdnBtnPre2R3.setVisible(false);
								lblPregunta3.setVisible(false);
								rdnBtnPre3R1.setVisible(false);
								rdnBtnPre3R2.setVisible(false);
								rdnBtnPre3R3.setVisible(false);
								lblPregunta4.setVisible(false);
								rdnBtnPre4R1.setVisible(false);
								rdnBtnPre4R2.setVisible(false);
								rdnBtnPre4R3.setVisible(false);
								btnAnterior.setEnabled(false);
							}
							else
							{
								RespuestaCorrecta = RespuestaCorrecta + 0;
								lblPregunta1.setVisible(false);
								rdnBtnPre1R1.setVisible(false);
								rdnBtnPre1R2_1.setVisible(false);
								rdnBtnPre1R3.setVisible(false);
								lblPregunta2.setVisible(false);
								rdnBtnPre2R1.setVisible(false);
								rdnBtnPre2R2.setVisible(false);
								rdnBtnPre2R3.setVisible(false);
								lblPregunta3.setVisible(false);
								rdnBtnPre3R1.setVisible(false);
								rdnBtnPre3R2.setVisible(false);
								rdnBtnPre3R3.setVisible(false);
								lblPregunta4.setVisible(false);
								rdnBtnPre4R1.setVisible(false);
								rdnBtnPre4R2.setVisible(false);
								rdnBtnPre4R3.setVisible(false);
								btnAnterior.setEnabled(false);
						}
						if(Contador == i)
						{
							if(rdnBtnPre5R1.isSelected())
							{
								RespuestaCorrecta = RespuestaCorrecta + 1;
								lblPregunta1.setVisible(false);
								rdnBtnPre1R1.setVisible(false);
								rdnBtnPre1R2_1.setVisible(false);
								rdnBtnPre1R3.setVisible(false);
								lblPregunta2.setVisible(false);
								rdnBtnPre2R1.setVisible(false);
								rdnBtnPre2R2.setVisible(false);
								rdnBtnPre2R3.setVisible(false);
								lblPregunta3.setVisible(false);
								rdnBtnPre3R1.setVisible(false);
								rdnBtnPre3R2.setVisible(false);
								rdnBtnPre3R3.setVisible(false);
								lblPregunta4.setVisible(false);
								rdnBtnPre4R1.setVisible(false);
								rdnBtnPre4R2.setVisible(false);
								rdnBtnPre4R3.setVisible(false);
								btnAnterior.setEnabled(false);
							}
							else
							{
								RespuestaCorrecta = RespuestaCorrecta + 0;
								lblPregunta1.setVisible(false);
								rdnBtnPre1R1.setVisible(false);
								rdnBtnPre1R2_1.setVisible(false);
								rdnBtnPre1R3.setVisible(false);
								lblPregunta2.setVisible(false);
								rdnBtnPre2R1.setVisible(false);
								rdnBtnPre2R2.setVisible(false);
								rdnBtnPre2R3.setVisible(false);
								lblPregunta3.setVisible(false);
								rdnBtnPre3R1.setVisible(false);
								rdnBtnPre3R2.setVisible(false);
								rdnBtnPre3R3.setVisible(false);
								lblPregunta4.setVisible(false);
								rdnBtnPre4R1.setVisible(false);
								rdnBtnPre4R2.setVisible(false);
								rdnBtnPre4R3.setVisible(false);
								btnAnterior.setEnabled(false);
							 }
						   }
					     }
					   }
					 }
				}
				}
			}
		
		});
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
			}
			
		});
		TestPanel.setLayout(null);
		TestPanel.add(btnSiguiente);
		
		JButton btnAnterior = new JButton("< Pregunta Anterior");
		btnAnterior.setBounds(650, 452, 139, 42);
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		TestPanel.add(btnAnterior);
		
		JButton btnEvaluar = new JButton("Evaluar");
		btnEvaluar.setEnabled(false);
		btnEvaluar.setBounds(816, 395, 116, 42);
		btnEvaluar.addActionListener(new ActionListener() {
			private int RespuestaCorrecta;

			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Total de aciertos: " + RespuestaCorrecta);
				
			}
		});
		TestPanel.add(btnEvaluar);
		btnEvaluar.setEnabled(false);
		
		ButtonGroup rdnRespuesta = new ButtonGroup();
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnSalir.setBounds(816, 452, 121, 42);
		TestPanel.add(btnSalir);
		ButtonGroup RadioBtn1 = new ButtonGroup();
		
		lblPregunta5 = new JLabel("5.- \u00BFEn qu\u00E9 consiste el proceso de programaci\u00F3n?");
		lblPregunta5.setBounds(32, 366, 420, 19);
		TestPanel.add(lblPregunta5);
		lblPregunta5.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		lblPregunta5.setVisible(false);
		
		rdnBtnPre5R1_1 = new javax.swing.JRadioButton("Escritura, compilaci\u00F3n y verificaci\u00F3n del c\u00F3digo fuente de un programa");
		rdnBtnPre5R1_1.setBounds(39, 406, 491, 23);
		TestPanel.add(rdnBtnPre5R1_1);
		rdnBtnPre5R1_1.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		rdnBtnPre5R1_1.setVisible(false);
		
		rdnBtnPre5R2 = new javax.swing.JRadioButton(" Compilaci\u00F3n del c\u00F3digo fuente de un programa");
		rdnBtnPre5R2.setBounds(39, 432, 368, 23);
		TestPanel.add(rdnBtnPre5R2);
		rdnBtnPre5R2.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		rdnBtnPre5R2.setVisible(false);
		
		rdnBtnPre5R3 = new javax.swing.JRadioButton("Compilaci\u00F3n y verificaci\u00F3n del c\u00F3digo Bytecode \r\nde un programa");
		rdnBtnPre5R3.setBounds(39, 458, 458, 36);
		TestPanel.add(rdnBtnPre5R3);
		rdnBtnPre5R3.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		rdnBtnPre5R3.setVisible(false);
		
		rdnBtnPre3R3 = new javax.swing.JRadioButton("Statci / Final / Abstract");
		rdnBtnPre3R3.setBounds(39, 272, 186, 23);
		TestPanel.add(rdnBtnPre3R3);
		rdnBtnPre3R3.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		rdnBtnPre3R3.setVisible(false);
		
		rdnBtnPre3R2_1 = new javax.swing.JRadioButton("De Instancia / Estatica / Local");
		rdnBtnPre3R2_1.setBounds(39, 246, 250, 23);
		TestPanel.add(rdnBtnPre3R2_1);
		rdnBtnPre3R2_1.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		rdnBtnPre3R2_1.setVisible(false);
		
		rdnBtnPre3R1 = new javax.swing.JRadioButton("Global / Local / Estatica");
		rdnBtnPre3R1.setBounds(39, 220, 199, 23);
		TestPanel.add(rdnBtnPre3R1);
		rdnBtnPre3R1.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		rdnBtnPre3R1.setVisible(false);
		
		lblPregunta3 = new JLabel("3.- Tipos de variable en Java:");
		lblPregunta3.setBounds(39, 180, 217, 19);
		TestPanel.add(lblPregunta3);
		lblPregunta3.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		lblPregunta3.setVisible(false);
		
				
				lblPregunta1 = new JLabel("1.- El ultimo mes del a\u00F1o es:");
				lblPregunta1.setBounds(32, 18, 186, 19);
				TestPanel.add(lblPregunta1);
				lblPregunta1.setFont(new Font("Bahnschrift", Font.BOLD, 15));
				
				rdnBtnPre1R1 = new javax.swing.JRadioButton("Enero");
				rdnBtnPre1R1.setBounds(32, 58, 109, 23);
				TestPanel.add(rdnBtnPre1R1);
				rdnBtnPre1R1.setFont(new Font("Bahnschrift", Font.BOLD, 15));
				rdnRespuesta.add(rdnBtnPre1R1);		
				RadioBtn1.add(rdnBtnPre1R1);
				
				
				rdnBtnPre1R2_1 = new javax.swing.JRadioButton("Diciembre");
				rdnBtnPre1R2_1.setBounds(32, 84, 109, 23);
				TestPanel.add(rdnBtnPre1R2_1);
				rdnBtnPre1R2_1.setFont(new Font("Bahnschrift", Font.BOLD, 15));
				rdnRespuesta.add(rdnBtnPre1R2_1);
				RadioBtn1.add(rdnBtnPre1R2_1);
				
				rdnBtnPre1R3 = new javax.swing.JRadioButton("Agosto");
				rdnBtnPre1R3.setBounds(32, 110, 109, 23);
				TestPanel.add(rdnBtnPre1R3);
				rdnBtnPre1R3.setFont(new Font("Bahnschrift", Font.BOLD, 15));
				RadioBtn1.add(rdnBtnPre1R3);
				
				lblPregunta2 = new JLabel("2.- \u00BFQue numero completa esta serie: 6, 25, 44, 63, 83...");
				lblPregunta2.setBounds(315, 18, 392, 19);
				TestPanel.add(lblPregunta2);
				lblPregunta2.setFont(new Font("Bahnschrift", Font.BOLD, 15));
				lblPregunta2.setVisible(false);
				
				rdnBtnPre2R1 = new javax.swing.JRadioButton("6");
				rdnBtnPre2R1.setBounds(335, 58, 109, 23);
				TestPanel.add(rdnBtnPre2R1);
				rdnBtnPre2R1.setFont(new Font("Bahnschrift", Font.BOLD, 15));
				rdnBtnPre2R1.setVisible(false);
				
				rdnBtnPre2R2 = new javax.swing.JRadioButton("29");
				rdnBtnPre2R2.setBounds(335, 84, 109, 23);
				TestPanel.add(rdnBtnPre2R2);
				rdnBtnPre2R2.setFont(new Font("Bahnschrift", Font.BOLD, 15));
				rdnBtnPre2R2.setVisible(false);
				
				rdnBtnPre2R3_1 = new javax.swing.JRadioButton("19");
				rdnBtnPre2R3_1.setBounds(335, 110, 109, 23);
				TestPanel.add(rdnBtnPre2R3_1);
				rdnBtnPre2R3_1.setFont(new Font("Bahnschrift", Font.BOLD, 15));
				rdnBtnPre2R3_1.setVisible(false);
				
				lblPregunta4 = new JLabel("4.- Para ejecutar aplicaciones en Java, se necesita instalar...");
				lblPregunta4.setBounds(405, 180, 420, 19);
				TestPanel.add(lblPregunta4);
				lblPregunta4.setFont(new Font("Bahnschrift", Font.BOLD, 15));
				lblPregunta4.setVisible(false);
				
				rdnBtnPre4R1 = new javax.swing.JRadioButton("JVM (Java Virtual Machine)");
				rdnBtnPre4R1.setBounds(412, 220, 232, 23);
				TestPanel.add(rdnBtnPre4R1);
				rdnBtnPre4R1.setFont(new Font("Bahnschrift", Font.BOLD, 15));
				rdnBtnPre4R1.setVisible(false);
				
				rdnBtnPre4R2 = new javax.swing.JRadioButton("JRE (Java Runtime Environment)");
				rdnBtnPre4R2.setBounds(412, 246, 250, 23);
				TestPanel.add(rdnBtnPre4R2);
				rdnBtnPre4R2.setFont(new Font("Bahnschrift", Font.BOLD, 15));
				rdnBtnPre4R2.setVisible(false);
				
				javax.swing.JRadioButton rdnBtnPre4R3_1 = new javax.swing.JRadioButton("JDK (Java Development Kit)");
				rdnBtnPre4R3_1.setBounds(412, 272, 258, 23);
				TestPanel.add(rdnBtnPre4R3_1);
				rdnBtnPre4R3_1.setFont(new Font("Bahnschrift", Font.BOLD, 15));
				rdnBtnPre4R3_1.setVisible(false);
	}
	protected boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
	}
}
