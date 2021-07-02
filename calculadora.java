package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
/**
 * Classe que calcula o número máximo de visualizações
 * @author anari
 *
 */
public class calculadora {

	private double CompartQtdMax; 
	private double ClickQtdMax;
	private double VisualizQtdMax;
	/**
	 * Construtor da classe
	 */
	public calculadora() { 
		this.CompartQtdMax = 0;
		this.ClickQtdMax = 0;
		this.VisualizQtdMax = 0;
	}

	public double getCompartQtdMax() { // Funções get e set para cada atributo
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
	
	/**
	 * Implementação da projeção aproximada da quantidade máxima de pessoas
	 * que visualizarão o anúncio. 
	 * @param investmTot Valor total investido para promoção do anúncio
	 * @return Quantidade máxima estimada de visualizações do anúncio
	 */
	
	public double calculaVisualizMax (double investmTot) { 
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
		return getVisualizQtdMax(); // Retorno do número máximo de visualizações
	}
	
	@Test
	void test() { // Cinco testes unitários 
		calculadora testeCalculator = new calculadora(); // Criação de objeto para teste do método
		
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
