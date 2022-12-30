package classe;

public class AreaCirc {
	double raio;
	final static double PI= 3.1415;//com a inclusão da palavra 'static' o pi passa estar associado a classe;
	//com inclusão da palavra 'final' a variavel se torna constante;
	AreaCirc(double raioIncial){
		raio = raioIncial;
	}
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {//metodo static
		return PI * Math.pow(raio, 2);		
	}
}
