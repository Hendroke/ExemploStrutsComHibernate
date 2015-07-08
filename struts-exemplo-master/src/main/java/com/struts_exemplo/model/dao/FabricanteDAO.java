package com.struts_exemplo.model.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.struts_exemplo.model.pojo.Fabricante;

public class FabricanteDAO{

	public void salvar( Fabricante fabricante ) {
		Transaction tx = getSession().beginTransaction();
		try {

			getSession().save( fabricante );
			tx.commit();

		} catch ( Exception e ) {
			tx.rollback();
		} finally {
			getSession().close();
		}

	}

	public void alterar( Fabricante fabricante ) {
		Transaction tx = getSession().beginTransaction();
		try {

			getSession().update( fabricante );
			tx.commit();

		} catch ( Exception e ) {
			tx.rollback();
		} finally {
			getSession().close();
		}

	}

	public void excluir( Fabricante fabricante ) {
		Transaction tx = getSession().beginTransaction();
		try {

			getSession().delete( fabricante );
			tx.commit();

		} catch ( Exception e ) {
			tx.rollback();
		} finally {
			getSession().close();
		}

	}
	
	public void excluir( Integer id ) {
		Transaction tx = getSession().beginTransaction();
		try {
			
			StringBuilder sb = new StringBuilder();
			sb.append("From Fabricante f Where f.id = ? ");
			Query query = getSession().createQuery(sb.toString());
			query.setInteger(0, id);
			
			Fabricante fab = (Fabricante) query.uniqueResult();
			getSession().delete(fab);
			
			tx.commit();

		} catch ( Exception e ) {
			tx.rollback();
		} finally {
			getSession().close();
		}

	}
	
	public void editar( Integer id ) {
		Transaction tx = getSession().beginTransaction();
		try {
			
			StringBuilder sb = new StringBuilder();
			sb.append("From Fabricante f Where f.id = ? ");
			Query query = getSession().createQuery(sb.toString());
			query.setInteger(0, id);
			
			Fabricante fab = (Fabricante) query.uniqueResult();
			getSession().update(fab);
			
			tx.commit();

		} catch ( Exception e ) {
			tx.rollback();
		} finally {
			getSession().close();
		}

	}
	
	public Fabricante buscarById( Integer id ) {
		Transaction tx = getSession().beginTransaction();
		Fabricante fab = null;
		try {
			
			StringBuilder sb = new StringBuilder();
			sb.append("From Fabricante f Where f.id = ? ");
			Query query = getSession().createQuery(sb.toString());
			query.setInteger(0, id);
			
			fab = (Fabricante) query.uniqueResult();
			
		} catch ( Exception e ) {
			tx.rollback();
		} finally {
			getSession().close();
		}
		
		return fab;

	}

	@SuppressWarnings( "unchecked" )
	public List< Fabricante > buscar() {
		Criteria criteria = getSession().createCriteria( Fabricante.class );
		return criteria.list();
	}
	
	private Session getSession() {
		return SessionProvider.getSession();
	}

}
