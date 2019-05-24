package br.com.pesquisa.util;

import org.hibernate.Session;

/*
 * Classe Responsável pela criação de uma unica sessão de conexão com o banco de dados.
 * O objetivo desta classe é otimizar o numero de conexão com o banco de dados;
 */
public abstract class HibernateGetSession {

	
	private static final Session s = HibernateUtil.getFrabricadeSessoes().openSession();
	
	/**
	 * Retorna um objeto do tipo Session do pacote
	 * org.hibernate.Session
	 * 
	 * @return Session
	 */
	public static Session getSession() {
		return s;
	}
	
	public static void closeSession() {
		if(s.isOpen()) {
			s.close();
		}
	}
}
