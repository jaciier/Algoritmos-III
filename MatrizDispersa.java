
public class MatrizDispersa {

	public static void main(String[] args) {
		DispersaLista2 lista = new DispersaLista2(); 
		
		lista.InsertarDato(1, 2, 19);
		lista.InsertarDato(3, 3, 89);
		lista.InsertarDato(4, 2, 23);
		lista.InsertarDato(4, 3, 85);
		lista.InsertarDato(1, 3, 57);
		lista.InsertarDato(3, 1, 66);

		System.out.println();
		System.out.println("Mostrar lista:");
		lista.MostrarLista();

		System.out.println();
		System.out.println("Mostrar matriz:");
		lista.MostrarMatriz();
		
		System.out.println();
		System.out.println("Obtener datos:");
		System.out.println("[4,3] = " + lista.ObtenerDato(4, 3));
		System.out.println("[3,2] = " + lista.ObtenerDato(3, 2));
		System.out.println("[1,2] = " + lista.ObtenerDato(1, 2));
		System.out.println("[3,1] = " + lista.ObtenerDato(3, 1));
		System.out.println("[4,2] = " + lista.ObtenerDato(4, 2));
		
		System.out.println();
		System.out.println("Mostrar diagonal principal:");
		lista.MostrarDiagonalPrincipal();
		
		System.out.println();
		System.out.println();
		System.out.println("Mostrar diagonal secundaria:");
		lista.MostrarDiagonalSecundaria();
		
		System.out.println();
		System.out.println();
		System.out.println("Mostrar promedio:");
		lista.MostrarPromedio();
		
		System.out.println();
		System.out.println();
		System.out.println("Multiplicación por vector:");
		int[] vector = new int[3];
		vector[0] = 4;
		vector[1] = -2;
		vector[2] = 3;
		lista.MostrarMultiplicacion(vector);
	}

}
