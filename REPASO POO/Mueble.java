import java.util.Scanner;

public class Mueble {
	protected String material;
	protected double peso;
	protected String color;
		
	public Mueble() {
	}

	public Mueble(String material, double peso, String color) {
		this.material = material;
		this.peso = peso;
		this.color = color;
	}
	
	
	public void leer() {
		Scanner lector = new Scanner(System.in);
		System.out.println("MUEBLE\n material-peso-color");
		material = lector.next();
		peso = lector.nextDouble();
		color = lector.next();
	}
	
	public void mostrar() {
		System.out.println("MUEBLE\n material = " + material + " peso = " + peso + " color = " + color);
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
