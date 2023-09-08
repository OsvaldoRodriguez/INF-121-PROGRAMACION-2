
public class Pila {
	private int tope, max = 100;
	private Object v[] = new  Object[max + 1];
	
	Pila(int cap) {
		max = cap;
		tope = 0;
	}
	
	int nroElem() {
		return tope;
	}
	
	boolean esVacia() {
		return tope == 0;
	}
	
	boolean esLlena() {
		return tope == max;
	}
	
	void adicionar(Object elemento) {
		if(!esLlena()) {
			tope++;
			v[tope] = elemento;
		}
	}
	
	Object eliminar() {
		Object x = new Object();
		if(!esVacia()) {
			x = v[tope];
			tope--;
		}
		return x;
	}
	
	void mostrar() {
		Pila aux = new Pila(max);
		while(!esVacia()) {
			Object eli = eliminar();
			System.out.println(eli);
			aux.adicionar(eli);
		}
		this.vaciar(aux);
	}
	
	void vaciar(Pila a) {
		while(!a.esVacia())
			this.adicionar(a.eliminar());
	}
}
