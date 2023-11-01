import java.util.Scanner;

public class Facultad {
	private String nombre;
	private LDobleC car = new LDobleC();
	
	Facultad(){
		car = new LDobleC();
	}
	
	void leer() {
		Scanner in = new Scanner(System.in);
		System.out.println("FACULTAD\n nombre-listaDobleCarreras");
		nombre = in.next();
		System.out.println("digite la cantidad de carreras");
		car.leer2(in.nextInt());
	}
	
	void mostrar() {
		System.out.println("FACULTAD\n nombre: " + nombre);
		car.mostrar();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LDobleC getCar() {
		return car;
	}
	public void setCar(LDobleC car) {
		this.car = car;
	}
	
	
}
