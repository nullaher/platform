/* 
 * Copyright@ 2015-2018 simon.zeng rights reserved.
 */ 
package cn.nullah.platform.dao; 

/** 
 * TODO
 * @Project  : platform-dao 
 * @Author   : developer
 * @Date     : 2015年12月26日 
 */
@SuppressWarnings("serial")
public class DAOException extends RuntimeException {
	public DAOException(Exception t) {
		super(t);
	}

	public DAOException(String msg) {
		super(msg);
	}

	public DAOException() {

	}
}
