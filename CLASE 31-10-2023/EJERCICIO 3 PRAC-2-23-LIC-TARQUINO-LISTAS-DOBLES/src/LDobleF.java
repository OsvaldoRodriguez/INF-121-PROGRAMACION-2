
public class LDobleF {
	private NodoF p;

	public NodoF getP() {
		return p;
	}

	public void setP(NodoF p) {
		this.p = p;
	}
	
	
	boolean esvacia(){
		if(getP() == null)
			return true;
		return false;
	}
	
	int nroNodos(){
		int c = 0;
		NodoF q = getP();
		while(q != null)
		{
			c++;
			q=q.getSig();
		}	
		return c;
	}
	
	void adiprincipio(Facultad m)
	{
		NodoF nue = new NodoF();
		nue.setF(m);
		if(esvacia())
			setP(nue);
		else
		{
			nue.setSig(getP());
			p.setAnt(nue);
			setP(nue);
		}
	}
	
	void adifinal(Facultad m)
	{
		NodoF nue = new NodoF();
		nue.setF(m);
		if(esvacia())
			setP(nue);
		else
		{
			NodoF q=getP();
			while(q.getSig()!=null)
				q=q.getSig();
			
			q.setSig(nue);
			nue.setAnt(q);
		}
	}
	
	
	// simula  una pila dinmaica
	
	
	void leer2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			Facultad d=new Facultad();
			d.leer();
			adifinal(d);
		}
		
	}
	
	void mostrar()
	{
		NodoF q=getP();
		System.out.println ("\nLista Doble");
		while(q!=null)
		{
			q.getF().mostrar();
			q=q.getSig();
		}
	}
}
