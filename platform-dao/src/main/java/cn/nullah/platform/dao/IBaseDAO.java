package cn.nullah.platform.dao;

import java.util.List;

/**
 * @Project : platform-dao
 * @Author : Administrator
 * @Date : 2015年12月22日
 */
public interface IBaseDAO<T extends java.io.Serializable, PK extends java.io.Serializable> {

	public void save(T model);

	public void delete(T model);

	public void update(T model);

	public T findById(PK id);

	public List<T> findByExample(T example);
	
	public List<T> findByExample(T example,int firstResult,int maxResult);

	// public List<T> get(T condition);

	// public List<T> selRange(T condition , final int sRow , final int eRow);

	// public Integer selCount(T condition);

	// public T getById(PK pk);
	//
	// public T getUnique(T condition);

	// public String execProc(String procName, String procParam);
}
