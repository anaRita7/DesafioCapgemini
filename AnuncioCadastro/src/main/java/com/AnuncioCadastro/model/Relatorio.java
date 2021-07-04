package com.AnuncioCadastro.model;

import java.time.temporal.ChronoUnit;

/**
 * Classe Relatório de alcance do anúncio
 * @author anari
 *
 */
public class Relatorio {
	private double TotalInvestido;
	private double VisualizQtdMax;
	private double ClickQtdMax;
	private double CompartQtdMax;
	
	public Relatorio() {}
	
	public void calculosRelatorio (Anuncio anuncio) {
		long numDias = ChronoUnit.DAYS.between(anuncio.getDataInicio(), anuncio.getDataTermino());
		double total = numDias * anuncio.getInvestimentoDia();
		
		setTotalInvestido(total);
		
		Calculadora calculadora = new Calculadora();
		
		calculadora.calculoQtdsMaxs(this.TotalInvestido);
		setVisualizQtdMax(calculadora.getVisualizQtdMax());
		setClickQtdMax(calculadora.getClickQtdMax());
		setCompartQtdMax(calculadora.getCompartQtdMax());
	}
	
	public String getRelatorio(Anuncio anuncio) {
		this.calculosRelatorio(anuncio);
		return "Valor total investido no anuncio: " + getTotalInvestido() + ". A quantidade máxima de visualizações do anuncio: " + String.format("%.0f", getVisualizQtdMax()) + ". A quantidade máxima de cliques do anúncio: " + String.format("%.0f", getClickQtdMax()) + ". A quantidade máxima de compartilhamentos do anúncio: " + String.format("%.0f", getCompartQtdMax()) + ".";
	}

	public double getTotalInvestido() {
		return TotalInvestido;
	}

	public void setTotalInvestido(double totalInvestido) {
		TotalInvestido = totalInvestido;
	}

	public double getVisualizQtdMax() {
		return VisualizQtdMax;
	}

	public void setVisualizQtdMax(double visualizQtdMax) {
		VisualizQtdMax = visualizQtdMax;
	}

	public double getClickQtdMax() {
		return ClickQtdMax;
	}

	public void setClickQtdMax(double clickQtdMax) {
		ClickQtdMax = clickQtdMax;
	}

	public double getCompartQtdMax() {
		return CompartQtdMax;
	}

	public void setCompartQtdMax(double compartQtdMax) {
		CompartQtdMax = compartQtdMax;
	}

}
