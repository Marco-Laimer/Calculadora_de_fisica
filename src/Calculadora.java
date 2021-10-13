

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
		
		System.out.println("CALCULADORA DE FÍSICA\n"
				+ "[1] - Calcular força peso\n"
				+ "[2] - Calcular força centrípeta\n"
				+ "[3] - Calcular impulso\n"
				+ "[4] - Calcular velocidade média\n"
				+ "[5] - Calcular movimento uniforme\n"
				+ "Escolha uma das opções: ");
		opcao = teclado.nextByte();
		
		switch(opcao) {
		case 1:
			System.out.print("Você escolheu calcular força peso!\n");
			System.out.print("Qual o valor da massa? ");
			massa = teclado.nextDouble();
			System.out.print("Forneça o valor da gravidade: ");
			gravidade = teclado.nextDouble();
			System.out.print("O resultado é "+calcForcaPeso(massa, gravidade));
			break;
		case 2:
			System.out.print("Você escolheu calcular força centrípeta!\n");
			System.out.print("Qual o valor da massa? ");
			massa = teclado.nextDouble();
			System.out.print("Forneça o valor da velocidade: ");
			velocidade = teclado.nextDouble();
			System.out.print("Por fim, o valor do raio: ");
			raio = teclado.nextDouble();
			System.out.print("O resultado é "+calcForcaCentripeta(massa, velocidade, raio));
			break;
		case 3:
			System.out.print("Você escolheu calcular impulso!\n");
			System.out.print("Qual o valor da força? ");
			forca = teclado.nextDouble();
			System.out.print("Forneça o valor do intervalo de tempo: ");
			intervaloDeTempo = teclado.nextDouble();
			System.out.print("O resultado é "+calcImpulso(forca, intervaloDeTempo));
			break;
		case 4:
			System.out.print("Você escolheu calcular velocidade média!\n");
			System.out.print("Qual o valor do intervalo do deslocamento? ");
			intervaloDoDeslocamento = teclado.nextDouble();
			System.out.print("Forneça o valor do intervalo de tempo: ");
			intervaloDeTempo = teclado.nextDouble();
			System.out.print("O resultado é "+calcVelocidadeMedia(intervaloDoDeslocamento, intervaloDeTempo));
			break;
		case 5:
			System.out.print("Você escolheu calcular movimento uniforme!\n");
			System.out.print("Qual o valor da posição inicial? ");
			posicaoInicial = teclado.nextDouble();
			System.out.print("Forneça o valor da velocidade do deslocamento: ");
			velocidadeDoDeslocamento = teclado.nextDouble();
			System.out.print("Por fim, o valor do tempo do deslocamento: ");
			tempoDoDeslocamento = teclado.nextDouble();
			System.out.print("O resultado é "+calcMovimentoUniforme(posicaoInicial, velocidadeDoDeslocamento, tempoDoDeslocamento));
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
