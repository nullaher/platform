/*
 * Copyright@ 2015-2018 simon.zeng rights reserved.
 */
package cn.nullah.platform.dao.support;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import cn.nullah.platform.dao.anno.DataSource;

/**
 * TODO
 * 
 * @Project : platform-dao
 * @Author : developer
 * @Date : 2015年12月27日
 */
public class DataSourceSwitchInterceptor implements MethodInterceptor {
	
	final Logger logger = LoggerFactory.getLogger(DataSourceSwitchInterceptor.class);
	
	public Object invoke(MethodInvocation invocation) throws Throwable{
		DataSource dataSource = invocation.getMethod().getAnnotation(DataSource.class);
		if(null != dataSource){
			logger.debug("捕获注解方法，设置数据源：" + dataSource.value());
			DataSourceHolder.setDataSourceType(dataSource.value());
		}
		return invocation.proceed();
	}
}
