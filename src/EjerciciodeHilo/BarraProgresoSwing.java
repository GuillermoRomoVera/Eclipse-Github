package EjerciciodeHilo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BarraProgresoSwing extends JFrame {

	private JPanel contentPane;
	private JButton btnEjecutar;
	private JButton btnSalir;
	private JProgressBar JBarraProgreso;
	private JLabel lblPorcentaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BarraProgresoSwing frame = new BarraProgresoSwing();
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
	public BarraProgresoSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JProgressBar JBarraProgreso = new JProgressBar();
		JBarraProgreso.setStringPainted(true);
		JBarraProgreso.setForeground(new Color(0, 255, 0));
		JBarraProgreso.setBounds(92, 79, 214, 39);
		contentPane.add(JBarraProgreso);
		
		JButton btnEjecutar = new JButton("Ejecutar");
		btnEjecutar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Hilo ObjetoHilo1 = new Hilo("miHilo");
				Thread ThrdHilo1 = new Thread(ObjetoHilo1);
				
				ProgresoHilo ObjetoHilo2 = new ProgresoHilo(JBarraProgreso);
				Thread ThrdHilo2 = new Thread(ObjetoHilo2);
				
				ThrdHilo1.start();
				ThrdHilo2.start();
				
			}
		});
		btnEjecutar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEjecutar.setBounds(55, 165, 100, 39);
		contentPane.add(btnEjecutar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnSalir.setBounds(226, 165, 100, 39);
		contentPane.add(btnSalir);
		
		JLabel lblNewLabel = new JLabel("Barra de Progreso :");
		lblNewLabel.setFont(new Font("Bahnschrift", Font.PLAIN, 15));
		lblNewLabel.setBounds(119, 44, 145, 24);
		contentPane.add(lblNewLabel);
	}
}
