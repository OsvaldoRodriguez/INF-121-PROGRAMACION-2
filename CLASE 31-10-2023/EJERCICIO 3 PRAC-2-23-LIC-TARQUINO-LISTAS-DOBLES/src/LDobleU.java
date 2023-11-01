
public class LDobleU {
	private NodoU p;

	public NodoU getP() {
		return p;
	}

	public void setP(NodoU p) {
		this.p = p;
	}
	
	
	boolean esvacia(){
		if(getP() == null)
			return true;
		return false;
	}
	
	int nroNodos(){
		int c = 0;
		NodoU q = getP();
		while(q != null)
		{
			c++;
			q=q.getSig();
		}	
		return c;
	}
	
	
	
	void adifinal(Universidad m)
	{
		NodoU nue = new NodoU();
		nue.setU(m);
		if(esvacia())
			setP(nue);
		else
		{
			NodoU q=getP();
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
			Universidad d=new Universidad();
			d.leer();
			adifinal(d);
		}
		
	}
	
	void mostrar()
	{
		NodoU q=getP();
		System.out.println ("\nLista Doble");
		while(q!=null)
		{
			q.getU().mostrar();
			q=q.getSig();
		}
	}
}
