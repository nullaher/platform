/**
 * Copyright ©2016 simon All Rights Reserved Copyright ©2016 www.uinpay.cn Technology Co.,Ltd.All
 * Rights Reserved cn.nullah.platform.security.service.CfgInfoService.java simon 2016年5月21日
 */
package cn.nullah.platform.security.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import cn.nullah.platform.dao.IDAOService;
import cn.nullah.platform.security.pojo.CfgInfo;

/**
 * @autor: simon desc : ...
 */
@Service("cfgInfoService")
public class CfgInfoService {
	
	public CfgInfoService(){
//		hibernateDAOService.setNamespace(CfgInfo.class.getName());
	}
	
	@Resource
	IDAOService hibernateDAOService;
	
	@SuppressWarnings("unchecked")
	public List<CfgInfo> sel(CfgInfo cfgInfo){
		return hibernateDAOService.findByExample(cfgInfo);
	}
}
