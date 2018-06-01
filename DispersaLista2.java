
public class DispersaLista2 {
	
	private Nodo punta;
	private int numFilas;
	private int numColumnas;
	
	public DispersaLista2() {
		punta = new Nodo(0, 0, 0);
		numColumnas = 0;
	}
	
	public void InsertarDato(int f, int c, int d) {
		Nodo ant;
		Nodo p = punta.ObtenerLF();
		Nodo nuevoDato = new Nodo(f, c, d);
		
		if (p == punta) { // Si entra la lista está vacía
			nuevoDato.AsignarLF(punta);
			punta.AsignarLF(nuevoDato);
			
			numFilas = f;
			numColumnas = c;
		}
		else {
			ant = punta;
			// Ciclo para avanzar en la fila
			while (p != punta) {
				if (p.ObtenerFila() >= f) {
					break;
				}
				
				ant = p;
				p = p.ObtenerLF();
			}

			// Ciclo para avanzar en la columna
			while (p != punta && p.ObtenerFila() == f) {
				if (p.ObtenerColumna() >= c) {
					break;
				}
			
				ant = p;
				p = p.ObtenerLF();
			}
			
			if (p.ObtenerFila() == f && p.ObtenerColumna() == c) {
				// Cuando el nodo ya existe
				if (d == 0) {
					// Se elimina el nodo existente de la lista
					ant.AsignarLF(p.ObtenerLF());
				}
				else {
					// Se actualiza el valor en el nodo existente
					p.AsignarDato(d);
				}
			}
			else {
				// Cuando el nodo aún no existe
				// En éste punto ya tenemos el último nodo guardado en la variable 'ant'
				nuevoDato.AsignarLF(ant.ObtenerLF());
				ant.AsignarLF(nuevoDato);
				
				if (numFilas < f) {
					numFilas = f;
				}
				if (numColumnas < c) {
					numColumnas = c;
				}
			}
		}
	}
	
	public int ObtenerDato(int f, int c) {
		Nodo ant;
		Nodo p = punta.ObtenerLF();
		
		if (p == punta) { // Si entra la lista está vacía
			return 0;
		}
		else {
			ant = punta;
			// Ciclo para avanzar en la fila
			while (p != punta) {
				if (p.ObtenerFila() >= f) {
					break;
				}
				
				ant = p;
				p = p.ObtenerLF();
			}

			// Ciclo para avanzar en la columna
			while (p != punta && p.ObtenerFila() == f) {
				if (p.ObtenerColumna() >= c) {
					break;
				}
			
				ant = p;
				p = p.ObtenerLF();
			}
			
			if (p.ObtenerFila() == f && p.ObtenerColumna() == c) {
				// Cuando el nodo ya existe
				return p.ObtenerDato();
			}
			else {
				// Cuando el nodo aún no existe
				// En éste punto ya tenemos el último nodo guardado en la variable 'ant'
				return 0;
			}
		}
	}
	
	public void MostrarLista() {
		Nodo p = punta.ObtenerLF();
		
		while (p != punta) {
			System.out.println("[" + p.ObtenerFila() + "," + p.ObtenerColumna() + "] = " + p.ObtenerDato());
			p = p.ObtenerLF();
		}
	}
	
	public void MostrarMatriz() {
		int i;
		int j;
		int d;
		
		for (i = 1; i <= numFilas; i++) {
			for (j = 1; j <= numColumnas; j++) {
				d = ObtenerDato(i, j);
				if (d < 10) {
					System.out.print("00");
				}
				else if (d < 100) {
					System.out.print("0");
				}
				System.out.print(d + " ");
			}
			System.out.println();
		}
	}
	
	public void MostrarDiagonalPrincipal() {
		int i;
		int limite;
		
		if (numFilas > numColumnas) {
			limite = numColumnas;
		}
		else {
			limite = numFilas;
		}
		
		for (i = 1; i <= limite; i++) {
			System.out.print(ObtenerDato(i, i) + " ");
		}
	}
	
	public void MostrarDiagonalSecundaria() {
	}
	
	public void MostrarPromedio() {
		int i;
		int j;
		float total = 0;
		
		for (i = 1; i <= numFilas; i++) {
			for (j = 1; j <= numColumnas; j++) {
				total += ObtenerDato(i, j);
			}
		}
		
		System.out.print(total / (numFilas * numColumnas));
	}
	
	public void MostrarMultiplicacion(int[] vector) {
	}
}
