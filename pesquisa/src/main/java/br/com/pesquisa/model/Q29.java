package br.com.pesquisa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Q29 implements Serializable, EntidadeBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2909851755249766614L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String comentario;

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public Long getId() {
		return id;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
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
		Q29 other = (Q29) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
