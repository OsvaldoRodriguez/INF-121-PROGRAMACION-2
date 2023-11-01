
public class NodoC {
	private NodoC sig, ant;
	private Carrera c;
	
	NodoC(){
		sig = ant = null;
	}
	
	public NodoC getSig() {
		return sig;
	}
	public void setSig(NodoC sig) {
		this.sig = sig;
	}
	public NodoC getAnt() {
		return ant;
	}
	public void setAnt(NodoC ant) {
		this.ant = ant;
	}
	public Carrera getC() {
		return c;
	}
	public void setC(Carrera c) {
		this.c = c;
	}
	
}
