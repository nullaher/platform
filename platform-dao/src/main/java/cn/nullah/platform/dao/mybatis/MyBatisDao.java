/* 
 * Copyright@ 2015-2018 simon.zeng rights reserved.
 */ 
package cn.nullah.platform.dao.mybatis; 

import java.io.Serializable;

import cn.nullah.platform.dao.IBaseDAO;

/** 
 * TODO
 * @Project  : platform-dao 
 * @Author   : developer
 * @Date     : 2016年1月2日 
 */
public interface MyBatisDao <M extends Serializable, PK extends Serializable> extends IBaseDAO<M,PK>{

}
