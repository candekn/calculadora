package ar.edu.unlam.pb2;

public class Calculadora {
		//Atributos

		//Metodos
		/*public Double Dividir(Double num1, Double num2) throws
		ArithmeticException {
			if(num2==0) {
				throw new
		ArithmeticException("Division por Cero");			
			}else {
				return num1/num2;
			}
		}*/
	public Double Dividir(Double num1, Double num2) throws Exception {
		if(num2==0) {
			throw new Exception("Division por cero");
		}
		else {
			return num1/num2;
		}
	}
}
