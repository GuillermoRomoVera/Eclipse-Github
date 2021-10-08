package EjercicioGit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaSerie extends JFrame {

	private JPanel contentPane;
	private JTextField inpNumero1;
	private JTextField inpNumero2;
	private JTextField textField;
	private JTextField inpIteraciones;
	private JTextArea txtSecuencia;

	           public static void main(String[] args) {	
				VentanaSerie frame = new VentanaSerie();
				frame.setVisible(true);
	           }

	public VentanaSerie() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		inpNumero1 = new JTextField();
		inpNumero1.setBounds(221, 44, 86, 20);
		contentPane.add(inpNumero1);
		inpNumero1.setColumns(10);
		
		JLabel lblNumero1 = new JLabel("Numero Inicial 1");
		lblNumero1.setFont(new Font("Bahnschrift", Font.BOLD, 13));
		lblNumero1.setBounds(91, 45, 105, 20);
		contentPane.add(lblNumero1);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 434, 261);
		contentPane.add(contentPane_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(221, 44, 86, 20);
		contentPane_1.add(textField);
		
		JLabel lblNumero1_1 = new JLabel("Numero Inicial 1");
		lblNumero1_1.setFont(new Font("Bahnschrift", Font.BOLD, 13));
		lblNumero1_1.setBounds(91, 45, 105, 20);
		contentPane_1.add(lblNumero1_1);
		
		JLabel lblNumeroDeIteraciones = new JLabel("Numero de iteraciones");
		lblNumeroDeIteraciones.setFont(new Font("Bahnschrift", Font.BOLD, 13));
		lblNumeroDeIteraciones.setBounds(63, 122, 148, 20);
		contentPane_1.add(lblNumeroDeIteraciones);
		
		inpIteraciones = new JTextField();
		inpIteraciones.setColumns(10);
		inpIteraciones.setBounds(221, 121, 86, 20);
		contentPane_1.add(inpIteraciones);
		
		JLabel lblNumero2 = new JLabel("Numero Inicial 2");
		lblNumero2.setBounds(91, 81, 105, 20);
		contentPane_1.add(lblNumero2);
		lblNumero2.setFont(new Font("Bahnschrift", Font.BOLD, 13));
		
		inpNumero2 = new JTextField();
		inpNumero2.setBounds(221, 80, 86, 20);
		contentPane_1.add(inpNumero2);
		inpNumero2.setColumns(10);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(230, 212, 89, 23);
		contentPane_1.add(btnSalir);
		
		JButton btnGenerar_1 = new JButton("Generar");
		btnGenerar_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String varNumero1 = inpNumero1.getText();
				String varNumero2  = inpNumero2.getText();
				String varItera5  = inpIteraciones.getText();
				String cadena =  "";
				
				int varNumero1I = Integer.parseInt(varNumero1);
				int varNumero2I = Integer.parseInt(varNumero2);
				int varIteraI = Integer.parseInt(varItera5);
				int suma = 0;
				
				cadena = cadena + varNumero1 +"" +  varNumero2;
				for(int x=0 ;  x<= varIteraI ; x++  )
				{
					suma = varNumero1I + varNumero2I;		
					varNumero1I = varNumero2I;
					varNumero2I = suma;
					
					cadena = cadena + " " + suma;
			}
				txtSecuencia.setText(cadena);
			}
				
			
		});
		btnGenerar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGenerar_1.setBounds(88, 212, 89, 23);
		contentPane_1.add(btnGenerar_1);
		
		txtSecuencia = new JTextArea();
		txtSecuencia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		txtSecuencia.setBounds(114, 153, 171, 34);
		contentPane_1.add(txtSecuencia);
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
	}
}
