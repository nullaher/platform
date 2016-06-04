package cn.nullah.platform.dao.hibernate;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

/**
 * @Project : platform-dao
 * @Author : simon
 * @Date : 2015-10-29
 */
public class BaseHibernateDAO<T extends java.io.Serializable , PK extends java.io.Serializable> extends HibernateDaoSupport implements IBaseHibernateDAO<T , PK> {
	
	final Logger logger = LoggerFactory.getLogger(getClass());
	
	private Class<T> entityClass;
	
	@SuppressWarnings("unchecked")
    public BaseHibernateDAO(){
		try{
			this.entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		}catch(Exception e){
			logger.error("使用BaseHibernateDAO类,没有继承关系");
		}
	}
	
	public void save(T transientInstance){
		getHibernateTemplate().save(transientInstance);
	}
	
	public void delete(T persistentInstance){
		getHibernateTemplate().delete(persistentInstance);
	}
	
	public void update(T persistentInstance){
		getHibernateTemplate().update(persistentInstance);
	}
	
	public T findById(PK id){
		return (T) getHibernateTemplate().get(entityClass , id);
	}
	
	public void merge(T detachedInstance){
		getHibernateTemplate().merge(detachedInstance);
	}
	
	public List<T> findByExample(T exampleEntity){
//		if(null == entityClass) throw new DAOException("请先设置namespace");
		List<T> results = (List<T>) getHibernateTemplate().findByExample(exampleEntity);
//		List<T> results = (List<T>) getSession().createCriteria(entityClass).add(create(criteria)).list();
		logger.info("findByCriteria successful, result size: " + results.size());
		return results;
	}
	
	public List<T> findByExample(T exampleEntity , int firstResult , int maxResult){
//		if(null == entityClass) throw new DAOException("请先设置namespace");
		List<T> results = (List<T>) getHibernateTemplate().findByExample(exampleEntity,firstResult,maxResult);
		logger.debug("findByCriteria successful, result size: " + results.size());
		return results;
	}

	
	public Class<T> getEntityClass(){
		return entityClass;
	}
	
	public void setEntityClass(Class<T> entityClass){
		this.entityClass = entityClass;
	}
	
	@Resource
    public void setHibernateTemp(HibernateTemplate hibernateTemplate){
		setHibernateTemplate(hibernateTemplate);
    }
	
}
