package cn.nullah.platform.dao;

/* 
 * Copyright@ 2015-2018 www.ctghr.com rights reserved.
 */ 

import java.util.List;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/** 
 * TODO
 * @Project  : mes-persist 
 * @Author   : simon
 * @Date     : 2015-10-29 
 */

public abstract class PersistModel implements java.io.Serializable {
	@Value("${daoServiceName}")
	protected String DAO_SVC_NAME;
    
    private static final long serialVersionUID = 2035013017939483936L;

    IDAOService daoService;//SpringContextUtil.getBean(DAO_SVC_NAME);;
//    IDAOService daoService;
    
    @SuppressWarnings("unchecked")
    public void add() {
    	getDaoService().save(this);
    }
    
    @SuppressWarnings("unchecked")
    public void del() {
    	getDaoService().delete(this);
    }
    
    @SuppressWarnings("unchecked")
    public void upt() {
    	getDaoService().update(this);
    }
    
    @SuppressWarnings("unchecked")
    public List<?> sel() {
//    	getDaoService().setNamespace(this.getClass().getName());
    	return getDaoService().findByExample(this);
    }
    
    @SuppressWarnings("unchecked")
    public Object sel(Long id) {
//    	getDaoService().setNamespace(this.getClass().getName());
    	return getDaoService().findById(id);
    }
    
    private IDAOService getDaoService(){
    	System.out.println("!!!!!!!!"+DAO_SVC_NAME);
    	return  (daoService==null?daoService=(IDAOService)SpringContextUtil.getBean("hibernateDAOService"):daoService);
    }
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
