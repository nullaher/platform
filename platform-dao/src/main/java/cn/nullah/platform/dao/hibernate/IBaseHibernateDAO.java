package cn.nullah.platform.dao.hibernate;

import java.io.Serializable;
import org.hibernate.Session;
import cn.nullah.platform.dao.IBaseDAO;

/**
 * TODO
 * 
 * @Project : mes-persist
 * @Author : simon
 * @Date : 2015-10-29
 */
public interface IBaseHibernateDAO<T extends Serializable , PK extends Serializable> extends IBaseDAO<T , PK> {
	
//	public Session getSession();
	
	public void merge(T t);
}
