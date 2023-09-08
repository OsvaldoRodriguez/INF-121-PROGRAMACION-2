
public class Caja {
	private String contenido, color;
	private double area;
	
	Caja(){
		
	}
	
	
	
	public Caja(String contenido, String color, double area) {
		this.contenido = contenido;
		this.color = color;
		this.area = area;
	}



	void mostrar() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Caja [contenido=" + contenido + ", color=" + color + ", area=" + area + "]";
	}

	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	
}
