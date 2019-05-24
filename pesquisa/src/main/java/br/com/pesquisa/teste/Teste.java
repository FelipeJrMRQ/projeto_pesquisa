package br.com.pesquisa.teste;

import java.util.Observable;
import java.util.Observer;

public class Teste extends Observable {
	private int edicao = 2;

	public void setNovaEdicao(int novaEdicao) {
		this.edicao = novaEdicao;

		setChanged();
		notifyObservers();
	}

	public int getEdicao() {
		return this.edicao;
	}

	public static void main(String[] args) {
		// poderia receber a nova edicao atraves de um recurso externo
		int novaEdicao = 2;
		Teste revistaInformatica = new Teste();
		Assinante1 assinante1 = new Assinante1(revistaInformatica);

		revistaInformatica.setNovaEdicao(novaEdicao);
	}

}

class Assinante1 implements Observer {

	Observable revistaInformatica;

	int edicaoNovaRevista;

	public Assinante1(Observable revistaInformatica) {
		this.revistaInformatica = revistaInformatica;
		revistaInformatica.addObserver(this);
	}

	@Override
	public void update(Observable revistaInfSubject, Object arg1) {
		if (revistaInfSubject instanceof Teste) {
			Teste revistaInformatica = (Teste) revistaInfSubject;
			edicaoNovaRevista = revistaInformatica.getEdicao();
			System.out.println("Atenção, já chegou a mais uma edição da Revista Informatica. " + "Esta é a sua edição número: " + edicaoNovaRevista);
		}
	}
}
