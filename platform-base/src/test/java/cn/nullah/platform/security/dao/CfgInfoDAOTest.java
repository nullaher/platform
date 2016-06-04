/**
 * Copyright ©2016 simon All Rights Reserved Copyright ©2016 www.uinpay.cn Technology Co.,Ltd.All
 * Rights Reserved cn.nullah.platform.security.dao.CfgInfoDAOTest.java simon 2016年5月22日
 */
package cn.nullah.platform.security.dao;

import static org.junit.Assert.fail;
import javax.annotation.Resource;
import org.junit.Test;
import org.springframework.transaction.annotation.Transactional;
import cn.nullah.common.util.SetValueUtil;
import cn.nullah.platform.security.pojo.CfgInfo;
import cn.nullah.platform.security.service.CfgInfoService;

/**
 * @autor: simon desc : ...
 */
public class CfgInfoDAOTest extends BaseTest {
	
	@Resource
	CfgInfoDAO cfgInfoDAO;
	
	@Resource
	CfgInfoService cfgInfoService;
	
//	@Test
//	public void testSave(){
//		fail("Not yet implemented");
//	}
	
	@Test
	@Transactional
	public void testSave(){
		CfgInfo transientInstance = new CfgInfo();
		SetValueUtil.setObjectByDfgRule(transientInstance , 1);
		// System.out.println(JSON.toJSONString(cfgInfoDAO.findById(1l)));
		// SetValueUtil.setObjectByDfgRule(transientInstance , 2);
		cfgInfoDAO.save(transientInstance);
		
		CfgInfo cond=new CfgInfo();
		cond.setTypeCfgId(1l);;
		cfgInfoService.sel(cond);
		
//		transientInstance.add();
		
//		CfgInfo transientInstance2 = new CfgInfo();
//		SetValueUtil.setObjectByDfgRule(transientInstance2 , 1);
//		transientInstance2.setTypeCfgId(null);
//		transientInstance2.setCfgName("一二三四五六七八九零一二三四五六七八九零一二三四五六七八九零");
//		cfgInfoDAO.save(transientInstance2);
	}
	
	@Test
	public void testDelete(){
		fail("Not yet implemented");
	}
	
	@Test
	public void testUpdate(){
		fail("Not yet implemented");
	}
	
	@Test
	public void testFindById(){
		fail("Not yet implemented");
	}
	
	@Test
	public void testMerge(){
		fail("Not yet implemented");
	}
	
	@Test
	public void testFindByCriteriaObject(){
		fail("Not yet implemented");
	}
	
	@Test
	public void testFindByCriteriaObjectIntInt(){
		fail("Not yet implemented");
	}
	
	//
	// @Test
	// @Transactional
	// public void testDelete(){
	// cfgInfoDAO.delete(cfgInfoDAO.findById(1l));
	// }
	//
	// @Test
	// @Transactional
	// public void testUpdate(){
	// CfgInfo uptCfg = cfgInfoDAO.findById(1l);
	// // uptCfg.setCfgKey("uptKey");
	// cfgInfoDAO.update(uptCfg);
	// }
	//
	// @Test
	// @Transactional
	// public void testFindById(){
	// CfgInfo transientInstance = cfgInfoDAO.findById(1l);
	// System.out.println(transientInstance);
	// }
	//
	// @Test
	// @Transactional
	// public void testFindByCriteria(){
	// CfgInfo cond=new CfgInfo();
	// cond.setTypeCfgId(1l);
	// List<CfgInfo> list = cfgInfoDAO.findByCriteria(cond);
	// for(CfgInfo cfgInfo : list){
	// System.out.println(JSON.toJSONString(cfgInfo));
	// }
	// }
	//
	// @Test
	// public void testMerge(){
	// fail("Not yet implemented");
	// }
}
