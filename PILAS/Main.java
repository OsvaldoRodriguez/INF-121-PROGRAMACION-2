
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practica p1 = new Practica(100, "Alan Brito", 1);
		Practica p2 = new Practica(10, "Zoila Vaca", 3);
		Practica p3 = new Practica(0, "Armando Paredes", 4);
		Practica p4 = new Practica(70, "Aquiles Bailo", 1);
		Practica p5 = new Practica(10, "Aquiles Bailo", 2);
		Practica p6 = new Practica(20, "Aquiles Bailo", 3);
		Practica p7 = new Practica(30, "Aquiles Bailo", 4);
		
		
		Pila p = new Pila(10);
		p.adicionar(p1);
		p.adicionar(p2);
		p.adicionar(p3);
		p.adicionar(p4);
		p.adicionar(p5);
		p.adicionar(p6);
		p.adicionar(p7);
		
		p.mostrar();
		System.out.println("SOLUCION A");
		solA(p, 51);
		

		System.out.println("SOLUCION B");
		if(solB(p, "Alan Brito"))
			System.out.println("presento practicas");
		else
			System.out.println("no presento practicas");
		
		
		System.out.println("SOLUCION C");
		System.out.println(solC(p, 1));
		System.out.println(solC(p, 2));
		System.out.println(solC(p, 3));
		System.out.println(solC(p, 4));
		
		
		System.out.println("EJERCICIO 2");
		Caja c1 = new Caja("tasas", "verde", 10);
		Caja c2 = new Caja("vasos", "azul", 1);
		Caja c3 = new Caja("libros", "lila", 1212323);
		Caja c8 = new Caja("libros", "negro", 1);
		Caja c4 = new Caja("libros", "lila", 123);
		Caja c5 = new Caja("libros", "verde", 0);
		Caja c6 = new Caja("libros", "negro", 343412);
		Caja c7 = new Caja("ropa", "azul", 1);
		
		Pila pilita = new Pila(50);
		pilita.adicionar(c1);
		pilita.adicionar(c2);
		pilita.adicionar(c3);
		pilita.adicionar(c4);
		pilita.adicionar(c5);
		pilita.adicionar(c6);
		pilita.adicionar(c7);
		pilita.adicionar(c8);
		pilita.mostrar();
		
		System.out.println("SOLUCION EJ 2 A");
		System.out.println(equilibrado(pilita));

		System.out.println("SOLUCION EJ 2 B");
		ordenar(pilita);
		pilita.mostrar();
		System.out.println(equilibrado(pilita));
		System.out.println("SOLUCION EJ 2 C");
		agrupar(pilita);
		
		
	}
	// EJERCICIO II
	
	public static void agrupar(Pila a) {
		Pila aux = new Pila(a.nroElem());
		Pila r = new Pila(a.nroElem());
		
		while(!a.esVacia()) {
			Caja primero = (Caja) a.eliminar();
			r.adicionar(primero);
			while(!a.esVacia()) {
				Caja eli = (Caja) a.eliminar();
				if(eli.getColor().equals(primero.getColor()))
					r.adicionar(eli);
				else
					aux.adicionar(eli);
			}
			
			a.vaciar(aux);
		}
		a.vaciar(r);
		
		a.mostrar();
	}
	
	public static void ordenar(Pila a) {
		
		Pila aux = new Pila(a.nroElem());
		Pila r = new Pila(a.nroElem());
		
		while(!a.esVacia()) {
			double min = 1000000000;
			while(!a.esVacia()) {
				Caja eli = (Caja) a.eliminar();
				if(eli.getArea() < min)
					min = eli.getArea();
				aux.adicionar(eli);
			}
			while(!aux.esVacia()) {
				Caja eli = (Caja) aux.eliminar();
				if(eli.getArea() == min)
					r.adicionar(eli);
				else
					a.adicionar(eli);
			}
		}
		a.vaciar(r);
	}
	
	public static boolean equilibrado(Pila a) {
		boolean flag = true;
		Pila aux = new Pila(a.nroElem());
		double area_ficticia = 0;
		while(! a.esVacia()) {
			Caja eli = (Caja)a.eliminar();
			flag &= (area_ficticia <= eli.getArea());
			area_ficticia = eli.getArea();
			aux.adicionar(eli);
		}
		a.vaciar(aux);
		return flag;
	}
	
	// EJERCICIO 1
	
	public static double solC(Pila a, int k) {
		double promedio = 0;
		Pila aux = new Pila(a.nroElem());
		int contador = 0;
		while(! a.esVacia()) {
			Practica eli = (Practica)a.eliminar();
			if(eli.getNro_practica() == k)
				contador += 1;
			
			aux.adicionar(eli);
		}

		a.vaciar(aux);
		promedio = (double)contador / (double)a.nroElem();
		promedio *= 100;
		return promedio;
	}
	
	public static boolean solB(Pila a, String nombre) {
		boolean respuesta = false;
		Pila aux = new Pila(a.nroElem());
		while(! a.esVacia()) {
			Practica eli = (Practica)a.eliminar();
			if(eli.getNombre().equals(nombre))
				respuesta = true;
			
			aux.adicionar(eli);
		}
		a.vaciar(aux);
		return respuesta;
	}
	
	public static void solA(Pila a, int nota) {
		Pila aux = new Pila(a.nroElem());
		while(!a.esVacia()) {
			Practica eli = (Practica)a.eliminar();
			if(eli.getNota() >= nota) {
				eli.mostrar();
			}
			aux.adicionar(eli);
		}
		a.vaciar(aux);
	}

}
