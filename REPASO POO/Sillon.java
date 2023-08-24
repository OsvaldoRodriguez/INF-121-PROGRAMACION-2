import java.util.Scanner;

public class Sillon extends Mueble{
	private int capacidad;

	public Sillon() {
		super();
	}
	
	public Sillon(String material, double peso, String color, int capacidad) {
		super(material, peso, color);
		this.capacidad = capacidad;
	}

	public void leer() {
		Scanner lector = new Scanner(System.in);
		super.leer();
		System.out.println("SILLON\n capacidad");
		capacidad = lector.nextInt();
	}
	
	
	public void mostrar() {
		super.mostrar();
		System.out.println("SILLON\n capacidad = " + capacidad);
	}
	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	
	
	
}
