import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LDobleU uni = new LDobleU();
		Scanner in = new Scanner(System.in);
		System.out.println("cantidad de Unive");
		uni.leer2(in.nextInt());
		uni.mostrar();
		
		// a) mostrar a loas universidad con ubicacion Y
		// solA(uni, in.next());
		
		// b) verificar si la universidad x tiene alguna factultad con nombre y
		// solB(uni, "umsa", "fcpn");
		
//		De la universidad con nombre X, mostrar cuantas carreras tiene.
		//solC(uni, in.next());
		
//		Se quiere eliminar a la carrera con nombre Y de la facultad X de la Universidad Z.
		solD(uni, "inf", "fcpn", "umsa");
		
	}
	
	public static void solD(LDobleU uni, String car, String fac, String univ) {
		NodoU q= uni.getP();
		int total = 0;
		while(q != null){
			System.out.println("universidades");
			Universidad u = q.getU();
			// aqui va el codigo
			if(u.getNombre().equals(univ)) {
				// revisando facultades
				NodoF r = u.getFac().getP();
				while(r != null) {
					System.out.println("FACULTADES");
					Facultad f = r.getF();
					if(f.getNombre().equals(fac)) {
						System.out.println("entra a facultad");
						NodoC s = f.getCar().getP();
						while(s != null) {
							Carrera c = s.getC();
							if(c.getNombre().equals(car)) {
								// aqui debo eliminar

								System.out.println("econtrado");
								if(s == f.getCar().getP()) {
									s = s.getSig();
									f.getCar().setP(s);
									if(s.getAnt() != null)
										s.setAnt(null);
									if(s.getAnt() != null && s.getAnt().getSig() != null)
										s.getAnt().setSig(null);
								}else {
									NodoC siguiente = s.getSig();
									NodoC anterior = s.getAnt();
									if(anterior != null)
										anterior.setSig(siguiente);
									if(siguiente != null)
										siguiente.setAnt(anterior);
									if(s != null) {
										s.setSig(null);
										s.setAnt(null);
										
									}
									s = siguiente;
								}
							}else
								s = s.getSig();
						}
					}

					r = r.getSig();
				}
			}
			
			q = q.getSig();
		}
		
		System.out.println("resultado");
		uni.mostrar();
	}
	public static void solC(LDobleU uni, String nombreUniv) {
		NodoU q= uni.getP();
		int total = 0;
		while(q != null){
			Universidad u = q.getU();
			// aqui va el codigo
			if(u.getNombre().equals(nombreUniv)) {
				// revisando facultades
				NodoF r = u.getFac().getP();
				while(r != null) {
					Facultad f = r.getF();
					// contando cuantas carreras tiene una facultad
					NodoC s = f.getCar().getP();
					int total_carreras = 0;
					//int total_carreras = f.getCar().nroElementos();
					while(s != null) {
						total_carreras += 1;
						s = s.getSig();
					}
					total += total_carreras;
					r = r.getSig();
				}
			}
			
			q = q.getSig();
		}
		System.out.println("la universidad " + nombreUniv + " tiene " + total + " carreras");
	}
	
	public static void solB(LDobleU uni, String univ, String fac){
		NodoU q = uni.getP();
		boolean esta = false;
		while( q != null){
			Universidad u = q.getU();
			// aqui va el codigo
			if(u.getNombre().equals(univ)) {
				// hay que revisar sus falcultades 
				NodoF r = u.getFac().getP();
				while(r != null){
					Facultad f = r.getF();
					if(f.getNombre().equals(fac)){
						esta = true;
					}
					r = r.getSig();
				}
			}
			q = q.getSig();
		}
		if(esta){
			System.out.println("si existe");
		}else{
			System.out.println("no existe");
		}
	}
	
	public static void solA(LDobleU uni, String ubicacion) {
		
		NodoU q = uni.getP();
		while(q != null) {
			Universidad u = q.getU();
			// aqui va el codigo
			if(u.getUbicacion().equals(ubicacion)) {
				u.mostrar();
			}
			q = q.getSig();
		}
	}

}
