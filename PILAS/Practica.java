import java.util.Scanner;

public class Practica {
	private String nombre;
	private int nro_practica, nota;
	public Practica() {
	}
	
	
	
	public Practica(int nota, String nombre, int nro_practica) {
		this.nota = nota;
		this.nombre = nombre;
		this.nro_practica = nro_practica;
	}



	void leer() {
		System.out.println("PRACTICA\n nota-nombre-nro");
		Scanner in = new Scanner(System.in);
		nota = in.nextInt();
		nombre = in.next();
		nro_practica = in.nextInt();
	}
	
	
	void mostrar() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Practica [nota=" + nota + ", nombre=" + nombre + ", nro_practica=" + nro_practica + "]";
	}

	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNro_practica() {
		return nro_practica;
	}
	public void setNro_practica(int nro_practica) {
		this.nro_practica = nro_practica;
	}
	
	
	
	
	
}
