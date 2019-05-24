package br.com.pesquisa.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.PieChartModel;

@ManagedBean
@ViewScoped
public class ChartView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1820757529253155623L;

	private PieChartModel q1;
	private PieChartModel q2;
	private PieChartModel q3;
	private BarChartModel q4;
	private PieChartModel q5;
	private PieChartModel q6;

	public ChartView() {

	}

	@PostConstruct
	public void init() {
		createPieModel();
		createPieModelQ2();
		createBarModelQ4();
	}

	private void createPieModel() {
		q1 = new PieChartModel();
		q1.set("Menos de 6 meses", 30);
		q1.set("De 6 meses a 1 ano", 40);
		q1.set("De 1 a 2 anos", 20);
		q1.set("Acima de 2 anos", 10);
		q1.setLegendPosition("e");
		q1.setFill(false);
		q1.setDiameter(100);
		q1.setShowDataLabels(true);
		q1.setShadow(true);

	}

	private void createPieModelQ2() {
		q2 = new PieChartModel();
		q2.set("Até 20 anos", 66);
		q2.set("De 31 a 40 anos", 10);
		q2.set("De 41 a 50 anos", 10);
		q2.set("Acima de 50 anos", 14);
		q2.setLegendPosition("w");
		q2.setDiameter(100);
	}

	private void createPieModelQ3() {
		q1 = new PieChartModel();
		q1.set("Menos de 6 meses", 30);
		q1.set("De 6 meses a 1 ano", 40);
		q1.set("De 1 a 2 anos", 20);
		q1.set("Acima de 2 anos", 10);
		q1.setLegendPosition("e");
		q1.setFill(false);
		q1.setDiameter(100);
		q1.setShowDataLabels(true);
		q1.setShadow(true);
	}
	
	private BarChartModel initBarModelQ4() {
		q4 = new BarChartModel();
		ChartSeries f = new ChartSeries();
		f.setLabel("Feminino");
		f.set("Feminino", 30);
		
		ChartSeries m = new ChartSeries();
		m.setLabel("Masculino");
		m.set("Masculino", 70);
		
		q4.addSeries(m);
		q4.addSeries(f);
		return q4;
	}

	private void createBarModelQ4() {
		q4 = initBarModelQ4();
		q4.setLegendPosition("ne");
	}

	public PieChartModel getQ1() {
		return q1;
	}

	public void setQ1(PieChartModel q1) {
		this.q1 = q1;
	}

	public PieChartModel getQ2() {
		return q2;
	}

	public void setQ2(PieChartModel q2) {
		this.q2 = q2;
	}

	public PieChartModel getQ3() {
		return q3;
	}

	public void setQ3(PieChartModel q3) {
		this.q3 = q3;
	}

	
	public BarChartModel getQ4() {
		return q4;
	}

	public void setQ4(BarChartModel q4) {
		this.q4 = q4;
	}

	public PieChartModel getQ5() {
		return q5;
	}

	public void setQ5(PieChartModel q5) {
		this.q5 = q5;
	}

	public PieChartModel getQ6() {
		return q6;
	}

	public void setQ6(PieChartModel q6) {
		this.q6 = q6;
	}

}
