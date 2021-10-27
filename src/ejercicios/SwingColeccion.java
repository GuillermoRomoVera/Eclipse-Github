package ejercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.awt.event.ActionEvent;

public class SwingColeccion extends JFrame {

	private JPanel contentPane;
	private JTextField txtProblema;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingColeccion frame = new SwingColeccion();
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
	public SwingColeccion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDatos = new JLabel("Ingrese un problema");
		lblDatos.setBounds(37, 51, 111, 20);
		contentPane.add(lblDatos);
		
		JButton btnResolver = new JButton("Resolver");
		btnResolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Stack<String> varPila = new Stack<String>();
				String varExpresion = txtProblema.getText();
				char [] cadenaNumero = varExpresion.toCharArray();
				char [] cadenaSimbolo = varExpresion.toCharArray();
				String Numero = " ";
				int numero1 = 0;
				int numero2 = 0;
				int SumaTotal = 0;
				char varCaracter = ' ';
				int flagError = 0;
				
				for( int x=0; x<varExpresion.length(); x++)
				{				
					varCaracter = varExpresion.charAt(x);
					
					if(varCaracter=='(') 	
					{ 
					varPila.push("abre");
					}
					if(varCaracter==')') 	
					{ 	
					if (varPila.size() == 0) 
					{				
					flagError=1;
					break;
					}
					else{
					varPila.pop();
					}				
					}
				}
				if(varPila.isEmpty() && flagError==0) 
				{
				  for(int j = 0; j < cadenaNumero.length; j++)
				  {
					  for(int n = 0; n < cadenaSimbolo.length; n++)
					  {
					if(Character.isDigit(cadenaNumero[j])) 
					{
						if(cadenaNumero[j] == '0' || cadenaSimbolo[n] == '+')
						 {
							numero1 = 0;
							if(cadenaNumero[j] == '0')
							 {
								numero2 = 0;
							 }
						 }
					 if(cadenaNumero[j] == '1' || cadenaSimbolo[n] == '+')
					 {
						numero1 = 1;
						if(cadenaNumero[j] == '1')
						 {
							numero2 = 1;
						 }
					 }
					 if(cadenaNumero[j] == '2' || cadenaSimbolo[n] == '+')
					 {
						numero1 = 2;
						if(cadenaNumero[j] == '2' )
						 {
							numero2 = 2;
						 }
					 }
					 if(cadenaNumero[j] == '3' && cadenaSimbolo[n] == '+')
					 {
						numero1 = 3;
						if(cadenaNumero[j] == '3' )
						 {
							numero2 = 3;
						 }
					 }
					 if(cadenaNumero[j] == '4' && cadenaSimbolo[n] == '+')
					 {
						numero1 = 4;
						if(cadenaNumero[j] == '4' )
						 {
							numero2 = 4;
						 }
					 }
						if(cadenaNumero[j] == '5' && cadenaSimbolo[n] == '+')
						 {
							numero1 = 5;
							if(cadenaNumero[j] == '5' )
							 {
								numero2 = 5;
							 }
						 }
						if(cadenaNumero[j] == '6' && cadenaSimbolo[n] == '+')
						 {
							numero1 = 6;
							if(cadenaNumero[j] == '6' )
							 {
								numero2 = 6;
							 }
						 }
						if(cadenaNumero[j] == '7' && cadenaSimbolo[n] == '+')
						 {
							numero1 = 7;
							if(cadenaNumero[j] == '7' )
							 {
								numero2 = 7;
							 }
						 }
						if(cadenaNumero[j] == '8' && cadenaSimbolo[n] == '+')
						 {
							numero1 = 8;
							if(cadenaNumero[j] == '8' )
							 {
								numero2 = 8;
							 }
						 }
						if(cadenaNumero[j] == '9' && cadenaSimbolo[n] == '+')
						 {
							numero1 = 9;
							if(cadenaNumero[j] == '9' )
							 {
								numero2 = 9;
							 }
						  }
						 }
				       }
				     }
				  SumaTotal = numero1 + numero2;
				  JOptionPane.showMessageDialog(null, "El resultado es: " + 
				  SumaTotal + "\n" +"La expresion es Correcta");		
				}
				else {
				  JOptionPane.showMessageDialog(null, "La expresion es Incorrecta");
				}

		}
	});
		btnResolver.setBounds(117, 109, 146, 45);
		contentPane.add(btnResolver);
		
		txtProblema = new JTextField();
		txtProblema.setBounds(170, 51, 146, 20);
		contentPane.add(txtProblema);
		txtProblema.setColumns(10);
	}
}
