
public class TestaAtleta {
public static void main(String[] args) {

	Atleta at1 = new Atleta();
	
	at1.altura = 1.74;
	at1.peso = 68;
	
	
	at1.obterimc();
	
	System.out.println("IMC = " + at1.imc + "\nClassificação: " + at1.classificar() + "\nObter Risco: " + at1.obterRisco());
	
}
}
