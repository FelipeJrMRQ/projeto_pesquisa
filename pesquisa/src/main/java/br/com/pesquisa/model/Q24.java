package br.com.pesquisa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Q24 implements Serializable, EntidadeBase{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3266137731182599892L;
	
	public Q24() {

	}

	public Q24(int alternativa) {
		switch (alternativa) {
		case 1:
			alt1 = true;
			alt2 = false;
			alt3 = false;
			alt4 = false;
			alt5 = false;
			break;
		case 2:
			alt1 = false;
			alt2 = true;
			alt3 = false;
			alt4 = false;
			alt5 = false;
			break;
		case 3:
			alt1 = false;
			alt2 = false;
			alt3 = true;
			alt4 = false;
			alt5 = false;
			break;
		case 4:
			alt1 = false;
			alt2 = false;
			alt3 = false;
			alt4 = true;
			alt5 = false;
			break;
		case 5:
			alt1 = false;
			alt2 = false;
			alt3 = false;
			alt4 = false;
			alt5 = true;
			break;
		default:
			break;
		}
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String descricao = "Assinale seu grau de satisfação em relação ao convenio farmacia.";
	private boolean alt1;
	private boolean alt2;
	private boolean alt3;
	private boolean alt4;
	private boolean alt5;

	@Override
	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isAlt1() {
		return alt1;
	}

	public void setAlt1(boolean alt1) {
		this.alt1 = alt1;
	}

	public boolean isAlt2() {
		return alt2;
	}

	public void setAlt2(boolean alt2) {
		this.alt2 = alt2;
	}

	public boolean isAlt3() {
		return alt3;
	}

	public void setAlt3(boolean alt3) {
		this.alt3 = alt3;
	}

	public boolean isAlt4() {
		return alt4;
	}

	public void setAlt4(boolean alt4) {
		this.alt4 = alt4;
	}

	public boolean isAlt5() {
		return alt5;
	}

	public void setAlt5(boolean alt5) {
		this.alt5 = alt5;
	}

	public void setId(long id) {
		this.id = id;
	}

}
