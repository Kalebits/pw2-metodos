
public class Atleta {
	public double peso;
	public double altura;
	public double imc;
	
	public void obterimc() {
		imc = peso / (altura * altura);
	}
	
	public String classificar() {
		if(imc < 18.5) {
			return "Abaixo do peso";
		}
		else if(imc < 24.9) {
			return "Peso Normal";
		}
		else if(imc < 29.9) {
			return "Pré-Obesidade";
		}
		else if(imc < 34.9) {
			return "Obesidade Grau I";
		}
		else if(imc < 39.9) {
			return "Obesidade Grau II";
		}
		else {
			return "Obesidade Grau III";
		}
	}
	
	public String obterRisco() {
		if(imc < 18.5) {
			return "Muito alto";
		}
		else if(imc < 24.9) {
			return "Baixo";
		}
		else if(imc < 29.9) {
			return "Médio";
		}
		else if(imc < 34.9) {
			return "Alto";
		}
		else if(imc < 39.9) {
			return "Muito alto";
		}
		else {
			return "Muitíssimo alto";
		}
	}

}
