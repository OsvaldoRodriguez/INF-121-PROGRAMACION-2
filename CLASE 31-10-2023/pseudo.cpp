void solA(LDobleU uni, String ubicacion) {
	NodoU q <- uni.getP();
	while(q <> null) {
		Universidad u <- q.getU();
		// aqui va el codigo
		if(u.getUbicacion() = ubicacion) {
			u.mostrar();
		}
		q <- q.getSig();
	}
}

void solB(LDobleU uni, String uni, String fac){
	NodoU q <- uni.getP();
	bool esta = false;
	while( q <> null){
		Universidad u <- q.getU();
		// aqui va el codigo
		if(u.getNombre() = uni) {
			// hay que revisar sus falcultades
			NodoF r <- u.getFac().getP();
			while(r <> null){
				Facultad f <- r.getF();
				if(f.getNombre() = fac){
					esta = true;
				}
				r <- r.getSig();
			}
		}
		q <- q.getSig();
	}
	if(esta){
		print("si existe");
	}else{
		print("no existe");
	}
}



void solC(LDobleU uni, String nombreUniv) {
		NodoU q <- uni.getP();
		int total = 0;
		while(q <> null){
			Universidad u = q.getU();
			// aqui va el codigo
			if(u.getNombre() = nombreUniv) {
				// revisando facultades
				NodoF r <- u.getFac().getP();
				while(r <> null) {
					Facultad f <- r.getF();
					// contando cuantas carreras tiene una facultad
					NodoC s <- f.getCar().getP();
					int total_carreras = 0;
					//int total_carreras = f.getCar().nroElementos();
					while(s <> null) {
						total_carreras += 1;
						s = s.getSig();
					}
					total += total_carreras;
					r <- r.getSig();
				}
			}
			
			q <- q.getSig();
		}
		print("la universidad ", nombreUniv , " tiene " , total , " carreras");
	}



Main 
{
   LDobleU uni = crea objeto LDobleU();
   print("cantidad de Unive");
   int nro_elem;
   read(nro_elem);
   uni.leer2(nro_elem);
   uni.mostrar();
   
   // a) mostrar a loas universidad con ubicacion Y
   solA(uni, "lapaz");
   // b) verificar si la universidad x tiene alguna factultad con nombre y
   solB(uni, "umsa", "fcpn");

   // c) De la universidad con nombre X, mostrar cuantas carreras tiene.
      
   String nombre;
   read(nombre);
   solC(uni, nombre);

   
}
