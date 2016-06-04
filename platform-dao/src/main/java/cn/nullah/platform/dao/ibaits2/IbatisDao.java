/* 
 * Copyright@ 2015-2018 simon.zeng rights reserved.
 */ 
package cn.nullah.platform.dao.ibaits2; 

import java.io.Serializable;

import cn.nullah.platform.dao.IBaseDAO;

/** 
 * @Project  : platform-dao 
 * @Author   : developer
 * @Date     : 2015年12月26日 
 */
public interface IbatisDao<M extends Serializable, PK extends Serializable> extends IBaseDAO<M,PK> {
	
}
