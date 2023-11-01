
public class NodoU {
	private NodoU sig, ant;
	private Universidad u;
	NodoU(){
		sig = ant = null;
	}
	public NodoU getSig() {
		return sig;
	}
	public void setSig(NodoU sig) {
		this.sig = sig;
	}
	public NodoU getAnt() {
		return ant;
	}
	public void setAnt(NodoU ant) {
		this.ant = ant;
	}
	public Universidad getU() {
		return u;
	}
	public void setU(Universidad u) {
		this.u = u;
	}
	
}
