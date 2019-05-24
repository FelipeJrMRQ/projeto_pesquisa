package br.com.pesquisa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Q27 implements Serializable, EntidadeBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1515963862031685815L;
	public Q27() {

	}

	public Q27(int alternativa) {
		switch (alternativa) {
		case 1:
			alt1 = true;
			alt2 = false;
			alt3 = false;
			alt4 = false;
			alt5 = false;
			alt6 = false;
			alt7 = false;
			break;
		case 2:
			alt1 = false;
			alt2 = true;
			alt3 = false;
			alt4 = false;
			alt5 = false;
			alt6 = false;
			alt7 = false;
			break;
		case 3:
			alt1 = false;
			alt2 = false;
			alt3 = true;
			alt4 = false;
			alt5 = false;
			alt6 = false;
			alt7 = false;
			break;
		case 4:
			alt1 = false;
			alt2 = false;
			alt3 = false;
			alt4 = true;
			alt5 = false;
			alt6 = false;
			alt7 = false;
			break;
		case 5:
			alt1 = false;
			alt2 = false;
			alt3 = false;
			alt4 = false;
			alt5 = true;
			alt6 = false;
			alt7 = false;
			break;
		case 6:
			alt1 = false;
			alt2 = false;
			alt3 = false;
			alt4 = false;
			alt5 = false;
			alt6 = true;
			alt7 = false;
			break;
		case 7:
			alt1 = false;
			alt2 = false;
			alt3 = false;
			alt4 = false;
			alt5 = false;
			alt6 = false;
			alt7 = true;
			break;
		default:
			break;
		}
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String descricao = "Em sua opinião, por que as pessoas deixam de trabalhar na Croma.";
	private boolean alt1;
	private boolean alt2;
	private boolean alt3;
	private boolean alt4;
	private boolean alt5;
	private boolean alt6;
	private boolean alt7;

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

	public boolean isAlt6() {
		return alt6;
	}

	public void setAlt6(boolean alt6) {
		this.alt6 = alt6;
	}

	public boolean isAlt7() {
		return alt7;
	}

	public void setAlt7(boolean alt7) {
		this.alt7 = alt7;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Q27 other = (Q27) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
