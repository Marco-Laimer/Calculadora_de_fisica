

import java.util.Scanner;
public class Calculadora {
	
	public void calcular() {
		double raio;
		double forca;
		double massa;
		double gravidade;
		double velocidade;
		double intervaloDeTempo;
		double intervaloDoDeslocamento;
		double posicaoInicial;
		double velocidadeDoDeslocamento;
		double tempoDoDeslocamento;
		
		Scanner teclado = new Scanner(System.in);
		byte opcao;
		
		System.out.println("CALCULADORA DE F�SICA\n"
				+ "[1] - Calcular for�a peso\n"
				+ "[2] - Calcular for�a centr�peta\n"
				+ "[3] - Calcular impulso\n"
				+ "[4] - Calcular velocidade m�dia\n"
				+ "[5] - Calcular movimento uniforme\n"
				+ "Escolha uma das op��es: ");
		opcao = teclado.nextByte();
		
		switch(opcao) {
		case 1:
			System.out.print("Voc� escolheu calcular for�a peso!\n");
			System.out.print("Qual o valor da massa? ");
			massa = teclado.nextDouble();
			System.out.print("Forne�a o valor da gravidade: ");
			gravidade = teclado.nextDouble();
			System.out.print("O resultado � "+calcForcaPeso(massa, gravidade));
			break;
		case 2:
			System.out.print("Voc� escolheu calcular for�a centr�peta!\n");
			System.out.print("Qual o valor da massa? ");
			massa = teclado.nextDouble();
			System.out.print("Forne�a o valor da velocidade: ");
			velocidade = teclado.nextDouble();
			System.out.print("Por fim, o valor do raio: ");
			raio = teclado.nextDouble();
			System.out.print("O resultado � "+calcForcaCentripeta(massa, velocidade, raio));
			break;
		case 3:
			System.out.print("Voc� escolheu calcular impulso!\n");
			System.out.print("Qual o valor da for�a? ");
			forca = teclado.nextDouble();
			System.out.print("Forne�a o valor do intervalo de tempo: ");
			intervaloDeTempo = teclado.nextDouble();
			System.out.print("O resultado � "+calcImpulso(forca, intervaloDeTempo));
			break;
		case 4:
			System.out.print("Voc� escolheu calcular velocidade m�dia!\n");
			System.out.print("Qual o valor do intervalo do deslocamento? ");
			intervaloDoDeslocamento = teclado.nextDouble();
			System.out.print("Forne�a o valor do intervalo de tempo: ");
			intervaloDeTempo = teclado.nextDouble();
			System.out.print("O resultado � "+calcVelocidadeMedia(intervaloDoDeslocamento, intervaloDeTempo));
			break;
		case 5:
			System.out.print("Voc� escolheu calcular movimento uniforme!\n");
			System.out.print("Qual o valor da posi��o inicial? ");
			posicaoInicial = teclado.nextDouble();
			System.out.print("Forne�a o valor da velocidade do deslocamento: ");
			velocidadeDoDeslocamento = teclado.nextDouble();
			System.out.print("Por fim, o valor do tempo do deslocamento: ");
			tempoDoDeslocamento = teclado.nextDouble();
			System.out.print("O resultado � "+calcMovimentoUniforme(posicaoInicial, velocidadeDoDeslocamento, tempoDoDeslocamento));
			break;
		}
	}
	
	public double calcForcaPeso(double massa, double gravidade) {
		return massa*gravidade;
	}
	
	public double calcForcaCentripeta(double massa, double velocidade, double raio) {
		return massa*(velocidade*velocidade) / raio;
	}
	
	public double calcImpulso(double forca, double intervaloDeTempo) {
		return forca*intervaloDeTempo;
	}
	
	public double calcVelocidadeMedia(double intervaloDoDeslocamento, double intervaloDeTempo) {
		return intervaloDoDeslocamento/intervaloDeTempo;
	}
	
	public double calcMovimentoUniforme(double posicaoInicial, double velocidadeDoDeslocamento, double tempoDoDeslocamento) {
		return posicaoInicial + velocidadeDoDeslocamento*tempoDoDeslocamento;
	}
	

	


	
}
