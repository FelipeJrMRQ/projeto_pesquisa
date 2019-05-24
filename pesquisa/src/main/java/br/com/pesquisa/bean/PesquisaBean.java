package br.com.pesquisa.bean;

import java.io.IOException;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class PesquisaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4738079478309248035L;
	
	public PesquisaBean() {
		
	}

		
	public void iniciarPesquisa() {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect("questionario.xhtml");
			System.out.println("Deu certo");
		} catch (IOException e) {
				System.out.println("Erro");
			e.printStackTrace();
		}
	}
}
