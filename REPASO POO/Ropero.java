import java.util.Scanner;

public class Ropero extends Mueble {
	private int nro_cajas;
	private double altura;
	private double ancho;
	
	
	public Ropero() {
		super();
		
	}
	
	public Ropero(String material, double peso, String color, int nro_cajas, double altura, double ancho) {
		super(material, peso, color);
		this.nro_cajas = nro_cajas;
		this.altura = altura;
		this.ancho = ancho;
	}
	
	public void leer() {
		super.leer();
		Scanner lector = new  Scanner(System.in);
		System.out.println("ROPERO\n nro_cajas-altura-anchura");
		nro_cajas = lector.nextInt();
		altura = lector.nextDouble();
		ancho = lector.nextDouble();
	}
	
	public void mostrar() {
		super.mostrar();
		System.out.println("ROPERO\n nro_cajas = "  +nro_cajas + " altura = " + altura + " ancho = " + ancho);
	}
	
	// Solucion C
	public void verificar(Sillon s) {
		if(getPeso() == s.getPeso()) {
			System.out.println("si tienen el mismo peso");
		}else {
			System.out.println("no tienen el mismo peso");
		}
	}
	
	public boolean es_primo(int x) {
		if(x == 2)
			return true;
		if(x % 2 == 0 || x < 2)
			return false;
		
		for(int i = 3; i * i <= x; i += 2) {
			if(x % i == 0)
				return false;
		}
		return true;
	}
	
	public void cajas_primo(Ropero r) {
		if( es_primo(nro_cajas)) {
			mostrar();	
		}
		
		if( es_primo(r.nro_cajas)) {
			r.mostrar();	
		}
	}
	

	public int getNro_cajas() {
		return nro_cajas;
	}

	public void setNro_cajas(int nro_cajas) {
		this.nro_cajas = nro_cajas;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	
	
	
	
}
