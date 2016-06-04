/*
 * Copyright@ 2015-2018 simon.zeng rights reserved.
 */
package cn.nullah.platform.dao.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO
 * @Project : platform-dao
 * @Author : developer
 * @Date : 2015年12月27日
 */
public class DataSourceHolder {
	
	@SuppressWarnings("rawtypes")
	private static final ThreadLocal dataSources = new ThreadLocal();
	
	static final Logger logger = LoggerFactory.getLogger(DataSourceHolder.class);
	
	@SuppressWarnings("unchecked")
	public static void setDataSourceType(String dataSourceType){
		dataSources.set(dataSourceType);
	}
	
	public static String getDataSourceType(){
		return (String) dataSources.get();
	}
	
	public static void clearDataSourceType(){
		dataSources.remove();
	}
}
