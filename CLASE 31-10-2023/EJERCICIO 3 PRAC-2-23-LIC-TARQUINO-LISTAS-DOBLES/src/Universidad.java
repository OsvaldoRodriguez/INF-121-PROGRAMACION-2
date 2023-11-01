import java.util.Scanner;

public class Universidad {
	private String nombre, ubicacion;
	private LDobleF fac;
	
	Universidad(){
		fac = new LDobleF();
	}
	
	void leer() {
		Scanner in = new Scanner(System.in);
		System.out.println("UNIVERSIDAD\n nombre-ubicacion-lista_doble_fact" );
		nombre = in.next();
		ubicacion = in.next();
		System.out.println("digite la cantidad de facultades");
		
		fac.leer2(in.nextInt());
	}

	void mostrar() {
		System.out.println("UNIVERSIDAD\n nombre= " + nombre + " ubicacion=" + ubicacion);
		fac.mostrar();
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public LDobleF getFac() {
		return fac;
	}

	public void setFac(LDobleF fac) {
		this.fac = fac;
	}
	
	
}
