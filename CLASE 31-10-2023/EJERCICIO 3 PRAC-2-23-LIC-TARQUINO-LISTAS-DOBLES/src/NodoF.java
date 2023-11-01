
public class NodoF {
	private NodoF sig, ant;
	private Facultad f;
	
	NodoF(){
		sig = ant = null;
	}

	public NodoF getSig() {
		return sig;
	}

	public void setSig(NodoF sig) {
		this.sig = sig;
	}

	public NodoF getAnt() {
		return ant;
	}

	public void setAnt(NodoF ant) {
		this.ant = ant;
	}

	public Facultad getF() {
		return f;
	}

	public void setF(Facultad f) {
		this.f = f;
	}
	
}
