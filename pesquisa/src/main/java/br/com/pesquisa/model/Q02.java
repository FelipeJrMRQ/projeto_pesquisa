package br.com.pesquisa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Q02 implements Serializable, EntidadeBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8945171036180927054L;

	public Q02() {

	}

	public Q02(int alternativa) {
		switch (alternativa) {
		case 1:
			alt1 = true;
			alt2 = false;
			alt3 = false;
			alt4 = false;
			break;
		case 2:
			alt1 = false;
			alt2 = true;
			alt3 = false;
			alt4 = false;
			break;
		case 3:
			alt1 = false;
			alt2 = false;
			alt3 = true;
			alt4 = false;
			break;
		case 4:
			alt1 = false;
			alt2 = false;
			alt3 = false;
			alt4 = true;
			break;
		default:
			break;
		}
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String descricao = "Idade?";
	private boolean alt1;
	private boolean alt2;
	private boolean alt3;
	private boolean alt4;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
		Q02 other = (Q02) obj;
		if (id != other.id)
			return false;
		return true;
	}



}
