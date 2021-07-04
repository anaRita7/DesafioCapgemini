package com.AnuncioCadastro.model;

/**
 * Classe calculadora de alcance do anúncio
 * @author anari
 *
 */
public class Calculadora {

	private double CompartQtdMax; 
	private double ClickQtdMax;
	private double VisualizQtdMax;

	public Calculadora() { 
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
	
	public void calculoQtdsMaxs (double investmTot) {
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
	}
}