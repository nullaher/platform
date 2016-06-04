/*
 * Copyright@ 2015-2018 simon.zeng rights reserved.
 */
package cn.nullah.platform.dao.support;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * TODO
 * @Project : platform-dao
 * @Author : developer
 * @Date : 2015年12月27日
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
	
	static final Logger logger = LoggerFactory.getLogger(DynamicDataSource.class);
	
	@Override
	protected Object determineCurrentLookupKey(){
		logger.debug("使用数据源：" + DataSourceHolder.getDataSourceType());
		return DataSourceHolder.getDataSourceType();
	}
}
