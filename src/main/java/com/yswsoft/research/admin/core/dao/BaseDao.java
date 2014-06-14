package com.yswsoft.research.admin.core.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * 
 * @author Zou Tao
 *
 * Sep 3, 2013
 * @param <T>
 */
public interface BaseDao<T> {

	/*protected SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory);
	public Session getSession() ;*/
	
	public <T> T queryById(Class<T> entityClass, Integer id) ;

	public <T> Serializable save(T t) ;

	public <T> void update(T t) ;
	
	public <T> void delete(T t) ;
	public <T> void delete(Class<T> entityClass, Integer id) ;
	/**
	 * 
	 * @param <T>
	 * @param hql
	 * @param entityClass
	 * @return
	 */
	public <T> List<T> queryForList(String hql) ;
	/**
	 * 
	 * @param <T>
	 * @param hql
	 * @param entityClass
	 * @param param
	 * @return
	 */
	public <T> List<T> queryForList(String hql, Object param) ;

	/**
	 * 
	 * @param <T>
	 * @param hql
	 * @param entityClass
	 * @param params
	 * @return
	 */
	public <T> List<T> queryForList(String hql, Object[] params) ;
	
	/**
	 * 
	 * @param <T>
	 * @param hql
	 * @param entityClass
	 * @param params
	 * @return
	 */
	public T queryForObject(String hql, Object[] params) ;
	
	public <T> List<T> findByPage(String hql,
			int firstResult, int maxResult) ;

	public <T> List<T> findByPage(String hql,
			Object param, int firstResult, int maxResult) ;

	public <T> List<T> findByPage(String hql,
			Object[] params, int firstResult, int maxResult) ;
	
	void setQueryParams(Query query, Object[] params) ;

	
}
