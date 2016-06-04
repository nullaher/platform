package cn.nullah.platform.security.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import cn.nullah.platform.dao.hibernate.BaseHibernateDAO;
import cn.nullah.platform.security.pojo.CfgInfo;

@Repository("cfgInfoDAO")
public class CfgInfoDAO extends BaseHibernateDAO<CfgInfo, Long> {
	
//	@Value("${abc}")
	@Value("${daoServiceName}")
//	@Value("${prop[abc]}")
	protected String DAO_SVC_NAME;
	
	public CfgInfoDAO(){
		
	}

	@Override
    public void save(CfgInfo transientInstance){
	    super.save(transientInstance);
	    System.out.println("!!!!!!!!!!!!!:"+DAO_SVC_NAME);
    }
	
	
}