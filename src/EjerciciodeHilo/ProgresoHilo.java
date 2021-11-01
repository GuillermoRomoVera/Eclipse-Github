package EjerciciodeHilo;

import javax.swing.JProgressBar;

public class ProgresoHilo implements Runnable {
	
	private JProgressBar BarraDeProgreso;
	
	public ProgresoHilo ( JProgressBar barraVentana ) { 
		this.BarraDeProgreso = barraVentana;
	}
	
	public void run() {
		
		while( !Hilo.terminado) {
			
			BarraDeProgreso.setValue(Hilo.Progreso);

			BarraDeProgreso.repaint();
			
			
			if(Hilo.terminado) {
				BarraDeProgreso.setValue(100);
				System.out.println("Carga Completada");
				break;
			}
		}
	}
}

