package model;

/* 
Desenvolvedora: Ana Rita Diniz da Cruz
Algoritmo e teste unit�rio de uma calculadora de alcance de an�ncio que considera os seguintes eventos para as suas previs�es:

1. a cada 100 pessoas que visualizam o an�ncio 12 clicam nele.
2. a cada 20 pessoas que clicam no an�ncio 3 compartilham nas redes sociais.
3. cada compartilhamento nas redes sociais gera 40 novas visualiza��es.
4. 30 pessoas visualizam o an�ncio original (n�o compartilhado) a cada R$ 1,00 investido.
5. o mesmo an�ncio � compartilhado no m�ximo 4 vezes em sequ�ncia
(1� pessoa -> compartilha -> 2� pessoa -> compartilha - > 3� pessoa -> compartilha -> 4� pessoa)


Foi criada uma class calculadora que tem compartilhamentos, cliques e visualiza��es como atributos.
O m�todo que retorna o n�mero total de visualiza��es a partir do investimento total � calculaVisualizMax 

 * */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class calculadora {

	private double CompartQtdMax; // Atributos da calculadora
	private double ClickQtdMax;
	private double VisualizQtdMax;
	
	public calculadora() { // Construtor de calculadora
		this.CompartQtdMax = 0;
		this.ClickQtdMax = 0;
		this.VisualizQtdMax = 0;
	}

	public double getCompartQtdMax() { // Fun��es get e set para cada atributo
		return CompartQtdMax;
	}

	public void setCompartQtdMax(double compartQtdMax) {
		this.CompartQtdMax = compartQtdMax;
	}

	public double getClickQtdMax() {
		return ClickQtdMax;
	}

	public void setClickQtdMax(double clickQtdMax) {
		this.ClickQtdMax = clickQtdMax;
	}

	public double getVisualizQtdMax() {
		return VisualizQtdMax;
	}

	public void setVisualizQtdMax(double visualizQtdMax) {
		this.VisualizQtdMax = visualizQtdMax;
	}
	
	public double calculaVisualizMax (double investmTot) { 

// M�todo que obedece l�gica solicitada para o c�lculo do n�mero m�ximo de visualiza��es a partir do investimento total 
		
		setVisualizQtdMax(30*investmTot);
		double Views = getVisualizQtdMax(), Clicks = 0, Shares = 0; // Auxiliares
		
		for (int i = 0; i < 3; i++) {
			Clicks = (12.0/100.0)*Views;
			Shares = (3.0/20.0)*Clicks;
			Views = 40.0*Shares;
		
			setClickQtdMax(getClickQtdMax()+Clicks); // Soma acumulada
			setCompartQtdMax(getCompartQtdMax()+Shares);
			setVisualizQtdMax(getVisualizQtdMax()+Views);
		}
		return getVisualizQtdMax(); // Retorno do n�mero m�ximo de visualiza��es
	}
	
	@Test
	void test() { // Cinco testes unit�rios 
		calculadora testeCalculator = new calculadora(); // Cria��o de objeto para teste do m�todo
		
		double Valor = testeCalculator.calculaVisualizMax(1.0);
		assertEquals("78,35", String.format("%.2f", Valor));
		
		Valor = testeCalculator.calculaVisualizMax(400.5);
		assertEquals("31378,95", String.format("%.2f", Valor));
		
		Valor = testeCalculator.calculaVisualizMax(112);
		assertEquals("8775,14", String.format("%.2f", Valor));
		
		Valor = testeCalculator.calculaVisualizMax(25);
		assertEquals("1958,74", String.format("%.2f", Valor));
		
		Valor = testeCalculator.calculaVisualizMax(86.75);
		assertEquals("6796,81", String.format("%.2f", Valor));
	}

}
