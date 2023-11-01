import java.util.Scanner;

public class Carrera {
	private String nombre;
	private int cantidadAulas, nroEstudiante;
	
	Carrera(){
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadAulas() {
		return cantidadAulas;
	}

	public void setCantidadAulas(int cantidadAulas) {
		this.cantidadAulas = cantidadAulas;
	}

	public int getNroEstudiante() {
		return nroEstudiante;
	}

	public void setNroEstudiante(int nroEstudiante) {
		this.nroEstudiante = nroEstudiante;
	}
	
	void leer() {
		Scanner in = new Scanner(System.in);
		System.out.println("CARRERA\n nombre-cantAulas-nroEstudiante");
		nombre = in.next();
		cantidadAulas = in.nextInt();
		nroEstudiante = in.nextInt();
	}
	
	void mostrar() {
		System.out.println("CARRERA\n nombre:" + nombre + " cantidadAulas: " + cantidadAulas + " nroEst: " + nroEstudiante);
	}
}
