
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ropero r1 = new Ropero();
		Ropero r2 = new Ropero();
		r1.leer();
		r2.leer();
		
		Sillon s1 = new Sillon();
		s1.leer();
		
		
		r1.mostrar();
		r2.mostrar();
		s1.mostrar();
		
		// C
		r1.verificar(s1);
		r2.verificar(s1);
		
		// D
		r1.cajas_primo(r2);
	}

}
