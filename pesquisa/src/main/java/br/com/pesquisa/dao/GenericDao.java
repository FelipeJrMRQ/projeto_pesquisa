package br.com.pesquisa.dao;
import org.hibernate.Transaction;

import br.com.pesquisa.model.EntidadeBase;
import br.com.pesquisa.util.HibernateGetSession;

public class GenericDao<T extends EntidadeBase> {
	
	private Transaction transaction = null ;
	
	public void salvar(T obj) {
		try {
			transaction = HibernateGetSession.getSession().beginTransaction();
			HibernateGetSession.getSession().merge(obj);
			transaction.commit();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
}
