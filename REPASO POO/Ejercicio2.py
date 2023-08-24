class FiguraGeometria {
	// atrib
	// metodos
}

class Triangulo : FiguraGeometria {
	// atrib
	// metodos	


	double area(){
		s = (lado_1 + lado_2 + lado_3) / 2;
		producto = s * (s - lado_1) * (s - lado_2) * (s - lado_3);
		resultado = sqrt(producto); 
		return resultado;
	}

	bool isoceles(){
		if(lado_1 == lado_2 || lado_1 == lado_3 || lado_2 == lado_3){
			return true;
		}
		return false;
	}

	bool p(int a, int b, int c){
		if(c * c == a * a + b * b){
			return true;
		}
		return false;
	}

	bool rectangulo(){
		if(
			p(lado_1, lado_2, lado_3) ||
			p(lado_1, lado_3, lado_2) ||
			p(lado_2, lado_1, lado_3) ||
			p(lado_2, lado_3, lado_1) ||
			p(lado_3, lado_1, lado_2) ||
			p(lado_3, lado_2, lado_1) 
		){
			return true;
		}else{
			return false;
		}
	}

	mismo_color(Circulo c){
		if(color == c.getColor()){
			print("tienen mismo color");
		}else{
			print("no tienen el mismo color");
		}
	}
}

class Circulo : FiguraGeometria {
	// atrib
	// metodos


	double area(radio){
		return radio * radio * 3.14;
	}

	void area_mayor(Circulo c){
		double a1 = area(radio);
		double a2 = area(c.radio);

		if(a1 > a2){
			mostrar();
		}else if(a2 > a1){
			c.mostrar();
		}else{
			mostrar();
			c.mostrar();
		}
	}

	void super_area(Triangulo t){
		area_circulo = area(radio);
		area_tri = t.area();

		if(area_circulo > area_tri){
			mostrar();
		}else if(area_tri > area_circulo){
			t.mostrar();
		}else{
			mostrar();
			t.mostrar();
		}

	}
} 



Begin

	t1 = new objeto Triangulo();
	t2 = new objeto Triangulo();
	t3 = new objeto Triangulo();

	t1.leer();
	t2.leer();
	t3.leer();

	t1.mostrar();
	t2.mostrar();
	t3.mostrar();


	c1 = new objeto Circulo();	
	c2 = new objeto Circulo();
	c3 = new objeto Circulo();	

	c1.leer();
	c2.leer();
	c3.leer();

	c1.mostrar();
	c2.mostrar();
	c3.mostrar();

	// B
	print(t1.area());
	print(t2.area());
	
	// C
	print(t1.isoceles());

	// D
	print(t1.rectangulo());

	// E 
	c1.area_mayor(c2);
	c2.area_mayor(c3);

	// F
	c1.super_area(t1);
	c1.super_area(t3);
	c2.super_area(t1);

	// G
	t1.mismo_color(c3);

End


