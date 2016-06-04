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
@SuppressWarnings("serial")
public class DataSourceSwithException extends RuntimeException {
	
	final Logger logger = LoggerFactory.getLogger(DataSourceSwithException.class);
	
	public DataSourceSwithException(Exception t){
		super(t);
	}
	
	public DataSourceSwithException(String msg){
		super(msg);
		logger.error(msg);
	}
	
	public DataSourceSwithException(){
	}
}
