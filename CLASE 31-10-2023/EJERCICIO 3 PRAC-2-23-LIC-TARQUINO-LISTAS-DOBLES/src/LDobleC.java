
public class LDobleC {
	private NodoC p;

	public NodoC getP() {
		return p;
	}

	public void setP(NodoC p) {
		this.p = p;
	}
	
	
	boolean esvacia(){
		if(getP() == null)
			return true;
		return false;
	}
	
	int nroElementos(){
		int c = 0;
		NodoC q = getP();
		while(q != null)
		{
			c++;
			q=q.getSig();
		}	
		return c;
	}
	
	void adiprincipio(Carrera m)
	{
		NodoC nue = new NodoC();
		nue.setC(m);
		if(esvacia())
			setP(nue);
		else
		{
			nue.setSig(getP());
			p.setAnt(nue);
			setP(nue);
		}
	}
	
	void adifinal(Carrera m)
	{
		NodoC nue = new NodoC();
		nue.setC(m);
		if(esvacia())
			setP(nue);
		else
		{
			NodoC q=getP();
			while(q.getSig()!=null)
				q=q.getSig();
			
			q.setSig(nue);
			nue.setAnt(q);
		}
	}
	
	
	// simula  una pila dinmaica
	void leer1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			Carrera d = new Carrera();
			d.leer();
			adiprincipio(d);
		}
		
	}
	
	void leer2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			Carrera d=new Carrera();
			d.leer();
			adifinal(d);
		}
		
	}
	
	void mostrar()
	{
		NodoC q=getP();
		System.out.println ("\nLista Doble");
		while(q!=null)
		{
			q.getC().mostrar();
			q=q.getSig();
		}
	}
}
