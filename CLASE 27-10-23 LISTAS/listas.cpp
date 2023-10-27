// a) Mostrar al piloto con nombre X y sus vuelos
// Solucion

void solA(ListaSimpleP p, LSimpleCircularV v, String nombre){
	NodoP r = p.getP();
	while(r <> null){
		Piloto elem <- r.getP();
		if(elem.getNombre() = nombre){
			// aqui esta el piloto
			elem.mostrar();
			print("su vuelos son: ")
			NodoV q = v.getP();
			while(q <> null){
				Vuelo vv = v.getV();
				if(vv.getNombrePiloto() = nombre){
					vv.mostrar();
				}
				q <- q.getSig();
			}
		}
		r <- r.getSig();
	}
}

//B) Llevar al final de la lista todos los vuelos del piloto que realiz´o m´as vuelos.

void solB(ListaSimpleP p, LSimpleCircularV v){
	NodoP r = p.getP();
	int maximo = 0;
	while(r <> null){
		Piloto pi = r.getP();
		// contar cuantos hay
		int contador = 0;
		NodoV q = v.getP();
		while(q <> null){
			Vuelo vuelo = q.getV();
			if(vuelo.getNombrePiloto() = pi.getNombre())
				contador += 1;
			q <- q.getSig();
		}
		if(contador > maximo){
			maximo = contador;
		}
		// aqui ya tengo cuantos vuelos tiene el piloto r-esimo
		r <- r.getSig();
	}
	// ya tengo la cantidad de vuelos maxima por piloto

	r = p.getP();
	while(r <> null){
		Piloto pi = r.getP();
		// contar cuantos hay
		int contador = 0;
		NodoV q = v.getP();
		while(q <> null){
			Vuelo vuelo = q.getV();
			if(vuelo.getNombrePiloto() = pi.getNombre())
				contador += 1;
			q <- q.getSig();
		}
		if(contador = maximo){
			// hay que llevar sus nodos al final en la lista de vuelos
			int numero_elementos = v.nroElem();
			q = v.getP();
			NodoV anterior = q;
			for(i <- 1 to numero_elementos - 1 step inc) {
				if(v.getV().getNombrePiloto() = pi.getNombre()){
					if(q == v.getP()){
						v.setP(q.getSig());
						anterior = q;
						q <- q.getSig();
					}else{
						// necesito saber quien es el ultimo
						NodoV ultimo = v.getP();
						while(ultimo.getSig() <> v.getP())
							ultimo <- ultimo.getSig()

						NodoV siguiente = q.getSig();
						anterior.setSig(siguiente);
						ultimo.setSig(q);
						// antes de cambiar la direccion  de q tengo que avanzar y guardar el ultimo
						q <- siguiente;
						q.setSig(v.getP());
					}	
				}else{
					anterior <- q;
					q <- q.getSig()
				}
				
			}
		}
		r <- r.getSig();
	}
}


// c) Mover a los pilotos que se jubilaran en
// los pr´oximos 10 a˜nos al inicio de la lista.
void solC(ListaSimpleP p){
	NodoP r = p.getP();
	NodoP ant = r;
	while(r <> NULL){
		Piloto pil = r.getP();
		if(pil.getEdad() >= 65){
			if(r <> p.getP()){
				NodoP siguiente = r.getSig();
				anterior.setSig(siguiente);
				q.setSig(p.getP());
				p.setP(q);
				q <- siguiente;
			}
		}else{
			ant <- r;
			r <- r.getSig();
		}
	}
}



Main
{
   ListaSimpleP pil = crea Objeto ListaSimpleP();
   LSimpleCircularV v = crea Objeto LSimpleCircularV(); 

   pil.leer();
   pil.mostrar();
   v.leer();
   v.mostrar();

   // a)
   solA(pil, v, "Alan");

   // b)
   solB(pil, v);
   v.mostrar();
   // c)
   solC(pil);
   pil.mostrar();
}

