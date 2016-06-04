/**
 * Copyright ©2016 simon's Co.,Ltd.All Rights Reserved cn.nullah.platform.dao.IdGenarator.java simon
 * 2016年4月22日
 */
package cn.nullah.platform.dao;

import cn.nullah.common.util.DateUtil;



/**
 * @autor: simon
 * @desc : id生成器
 */
public class IDGenarator {
	
	public static Long getId(){
		return byTime();
	};
	
	private static Long byTime(){
//		return null;
		return Long.valueOf(DateUtil.getCurrentTime());
	};
	
	public static void main(String[] args) {
		System.out.println(byTime());
	}
}
