package EjerciciodeHilo;

public class Hilo implements Runnable {
	
		public static boolean terminado = false;
		public static int Progreso = 0;
		public String NombreHilo;
		
		public Hilo (String nombre)  {
			this.NombreHilo = nombre;
	}
		public void run() {
			terminado = false;
			
			for( int i =1; i<=100; i++) {
				
				System.out.println(i + "%");
				Progreso = i;
				
				try { Thread.sleep(100);
				
				}
				catch (InterruptedException e) {
					System.out.println("CargaCompleta");
					
				}
		}
			terminado = true;
   }
}