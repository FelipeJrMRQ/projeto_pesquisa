package br.com.pesquisa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Q19 implements Serializable, EntidadeBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 20536702035000646L;

	public Q19() {

	}

	public Q19(int alternativa) {
		switch (alternativa) {
		case 1:
			alt1 = true;
			alt2 = false;
			break;
		case 2:
			alt1 = false;
			alt2 = true;
			break;
		default:
			break;
		}
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String descricao = "Eu não trocaria de emprego para ganhar 10% a mais no salário.";
	private boolean alt1;
	private boolean alt2;

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
		Q19 other = (Q19) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
