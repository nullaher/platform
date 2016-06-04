/**
 * Copyright ©2016 simon's Co.,Ltd.All Rights Reserved
 * cn.nullah.platform.web.controller.CfgInfoController.java simon 2016年4月22日
 */
package cn.nullah.platform.web.controller;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import test.CfgInfo;
import cn.nullah.platform.security.service.CfgInfoService;

/**
 * @autor: simon
 * @desc : ...
 */
@RequestMapping("cfg")
@Controller
public class CfgInfoController {
	@Resource
	private CfgInfoService cfgInfoService;
	
//	@Value("#{prop['jdbc.url']}")
	private String url;
	
	// @Value("#{prop[typeAliasesPackage]}")
	private String ta;
	
	@RequestMapping("2list")
	public String toList(){
		System.out.println(url);
		System.out.println(ta);
		return "sys/cfgInfoList";
	}
	
	
	@RequestMapping("list")
	@ResponseBody
	public List getAll(){
//		CfgInfo cfgInf = new CfgInfo();

		cn.nullah.platform.security.pojo.CfgInfo cfgInf=new cn.nullah.platform.security.pojo.CfgInfo();
		cfgInf.setTypeCfgId(1l);
		return cfgInfoService.sel(cfgInf);
//		Object a = cfgInf.sel(2l);
//		return cfgInf.sel();
		// return cfgInfoService.getAll(0);
	}
	
	@ResponseBody
	@RequestMapping(value = "add" , method = RequestMethod.POST)
	public void add(@RequestBody CfgInfo info){
//		info.add();
	}
	
	@RequestMapping("upt")
	public void upt(){
		// cfgInfoService.getAll(0);
	}
}
