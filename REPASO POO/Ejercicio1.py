
class Mueble {
	
	// atributos
	protected 
		string material;
		double peso;
		string color;

	// metodos
	public

	Mueble(){

		material = "madera";
		peso = 79.3;
		color = "verde";
	} 

	Mueble(string MATERIAL, double PESO, string COLOR){
		material = MATERIAL;
		peso = PESO;
		color = COLOR;
	}

	leer(){
		read(material, peso, color);
	}

	mostrar(){
		print(material, peso, color);
	}
	// gets y sets
}


class Ropero : Mueble  {
	
	private 
		int nro_cajas;
		double altura;
		double ancho;

	public 

	Ropero(){
		super();
		nro_cajas = 6;
		altura = 34.2;
		ancho = 342.34;
	}

	Ropero(string MATERIAL, double PESO, string COLOR, int NRO_CAJAS, double ALTURA, double ANCHO){
		super(MATERIAL, PESO, COLOR);
		nro_cajas = NRO_CAJAS;
		altura = ALTURA;
		ancho = ANCHO;
	}

	leer(){
		super.leer(); // es el metodo del padre
		read(nro_cajas, altura, ancho);
	}

	mostrar(){
		super.mostrar(); // metodo del padre
		print(nro_cajas, altura, ancho);
	}

	// gets y sets

	// solucion C

	bool verificar(Sillon s){
		if(peso == s.getPeso()){   
			print("si son iguales");
		}else{
			print("no son iguales");
		}
	}

	bool es_primo(int x){
		if(x == 2)
			return true;
		if(x % 2 == 0 or x < 2)
			return false;

		for(int i = 3; i * i <= x; i += 2){
			if(x % i == 0)
				return false;
		}
		return true;
	}

	// solucion D
	cajas_primo(Ropero r){
		if( es_primo(nro_cajas) ){
			mostrar();
		}

		if( es_primo(r.nro_cajas)){
			r.mostrar();
		}
	}
	
}


class Sillon : Mueble {
	private 
		int capacidad;

	public 

	Sillon(){
		super();
		capacidad = 34;
	}

	leer(){
		super.leer();
		read(capacidad);
	}

	mostrar(){
		super.mostrar();
		print(capacidad);
	}

	// gets y sets
}


Begin

	r1 = new objeto Ropero("Madera", 343.23, "Cafe", 8, 100, 50);
	r2 = new objeto Ropero();
	r2.leer();

	s1 = new objecto Sillon();
	s1.leer();

	// B
	r1.mostrar();
	r2.mostrar();
	s1.mostrar();

	// C
	r1.verificar(s1);
	r2.verificar(s1);

	// D
	r1.verificar(r2);

End








