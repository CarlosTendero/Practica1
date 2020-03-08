package practica1;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		int opcion = 1;

		
		while(opcion != 0) {
			System.out.println("1:Realizar un nuevo Pedido");
			System.out.println("2:Recuperar Pedido");
			System.out.println("3:Guardar Pedidos");
			System.out.println("0:Salir");
			opcion = System.in.read();
			
			if(opcion == 1) {
				
			}
			
			else if(opcion == 2) {
				
			}
			
			else if(opcion == 3) {
				
			}
			
			else if(opcion == 0) {
				System.out.println("Hasta luego");
			}
			
		}
		
	}

}
