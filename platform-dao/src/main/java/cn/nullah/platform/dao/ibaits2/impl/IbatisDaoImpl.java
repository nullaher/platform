/* 
 * Copyright@ 2015-2018 simon.zeng rights reserved.
 */
package cn.nullah.platform.dao.ibaits2.impl;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.orm.ibatis.SqlMapClientCallback;
//import org.springframework.orm.ibatis.SqlMapClientTemplate;
//import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import cn.nullah.platform.dao.DAOException;
import cn.nullah.platform.dao.ibaits2.IbatisDao;

import com.ibatis.sqlmap.client.SqlMapExecutor;
import com.ibatis.sqlmap.engine.impl.SqlMapClientImpl;
import com.ibatis.sqlmap.engine.mapping.sql.Sql;
import com.ibatis.sqlmap.engine.mapping.statement.MappedStatement;
import com.ibatis.sqlmap.engine.scope.StatementScope;

/**
 * @Project : platform-dao
 * @Author : developer
 * @Date : 2015年12月26日
 */
@SuppressWarnings("deprecation")
public abstract class IbatisDaoImpl{
//<M extends Serializable, PK extends Serializable>
//		extends SqlMapClientDaoSupport implements IbatisDao<M, PK> {
	static final Logger logger=LoggerFactory.getLogger(IbatisDaoImpl.class);
	
//	private String namespace;
//	
//    @SuppressWarnings("unchecked")
//	public IbatisDaoImpl(){
//    	Type tagType = getClass().getGenericSuperclass();
//    	if(tagType instanceof ParameterizedType){
//    		setNamespace(((Class<M>) ((ParameterizedType)tagType ).getActualTypeArguments()[0]).getName());
//    	}
//    }
//    
//    protected String getStmtId(String tagId){
//    	if(StringUtils.isEmpty(tagId))throw new DaoException("sqlmapId can't be null");
//    	return getNamespace().concat(".").concat(tagId);
////    	return entityClass==null?tagId:(new StringBuffer(entityClass.getName()).append(".").append(tagId)).toString();
//    }
//    
//	
//	@SuppressWarnings("unchecked")
//	@Override
//	public PK add(M model) {
//		return (PK)getSqlMapClientTemplate().insert(getStmtId("insertSelective"), model);
//	}
//
//	@Override
//	public void add(final List<M> addList) {
//		if(addList.size()>100)throw new DaoException("最大不能超过100条");
//		try {
//			new SqlMapClientCallback<M>() {
//				public M doInSqlMapClient(SqlMapExecutor executor) throws SQLException {
//					executor.startBatch();
//					for (M o : addList) {
//						executor.insert(getStmtId("insertSelective"), o); // statement在*MapSql.xml一条语句的id
//					}
//					executor.executeBatch();
//					return null;
//				}
//			}.doInSqlMapClient(getSqlMapClient());
//		} catch (SQLException e) {
//			e.printStackTrace();
//			new DaoException("批量插入出错");
//		}
//	}
//
//	@Override
//	public void del(M model) {
//		getSqlMapClientTemplate().delete(getStmtId("delete"), model);
//	}
//
//	@Override
//	public void delById(PK id) {
//		getSqlMapClientTemplate().delete(getStmtId("delete"), id);
//	}
//
//	@Override
//	public void upt(M uptModel, M uptCond) {
//		getSqlMapClientTemplate().update(getStmtId("updateByPrimaryKeySelective"), uptModel);
//	}
//
//	@Override
//	public void uptById(M model) {
//		getSqlMapClientTemplate().update(getStmtId("updateByPrimaryKeySelective"), model);
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<M> sel(M condition) {
//		return (List<M>) getSqlMapClientTemplate().queryForList(getStmtId("select"), condition);
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<M> selRange(M condition, final int sRow, final int eRow) {
//		 List<M> list = (List<M>) queryWithSqlHandler("", condition, new SqlHandler() {
//             public String handle(String sql, Object[] params) throws SQLException {
////            	StringBuffer pageSql = new StringBuffer("select * from (select row_.*, rownum row_num_ from (");
////             	pageSql.append(sql).append(") row_ where rownum<=");
////             	pageSql.append(eRow);
////             	pageSql.append(") where row_num_ > ");
////             	pageSql.append(sRow);
////             	return pageSql.toString();
//                return sql+" limit "+sRow+","+eRow;
//             }
// 		});
//		return list;
//	}
//
//	@Override
//	public Integer selCount(M condition) {
//		return Integer.valueOf(getSqlMapClientTemplate().queryForObject("",condition).toString());
//	}
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public M getById(PK pk) {
//		return (M) getSqlMapClientTemplate().queryForObject("select",pk);
//	}
//	
//	@SuppressWarnings("unchecked")
//	@Override
//	public M getUnique(M condition) {
//		return (M) getSqlMapClientTemplate().queryForObject("select",condition);
//	}
//
//	@Override
//	public String execProc(String procName,String procParam){
//		Map<String, String> map=new HashMap<String, String>();
//		map.put("tagId", procParam);
//		map.put("prcTag", "1");
//		map.put("prcName", procName);
//		getSqlMapClientTemplate().update("cn.nullah.platform.dao.ibaits2.common.execImpPrc", map);
//		if(null!=map.get("prcTag")){
//			return map.get("prcTag").toString();
//		}else
//			return "1";
//	}
//	
//	@Resource
//	public void setSqlMapClientTemp(SqlMapClientTemplate sqlMapClientTemplate){
//		setSqlMapClientTemplate(sqlMapClientTemplate);
//	}
//	
//	protected List<?> queryWithSqlHandler(final String statementId, final Object param, final SqlHandler sqlHandler) {
//	    final SqlMapClientImpl smc = (SqlMapClientImpl) getSqlMapClient();
//	    if (sqlHandler != null) {
//	        final MappedStatement mappedStatement = smc.getMappedStatement(statementId);
//	        final Sql dySql = mappedStatement.getSql();
//	        if (Proxy.isProxyClass(dySql.getClass())) {
//	        	logger.debug("该Sql对象已经是代理对象，设置新的sql处理器。");
//	            ((SqlProxyHandler) Proxy.getInvocationHandler(dySql)).setSqlHandler(sqlHandler);
//	        } else {
//	        	logger.debug("创建Sql的代理对象！");
//	            final SqlProxyHandler sqlProxyHandler = new SqlProxyHandler(dySql, sqlHandler);
//	            final Class<?> sqlClass = dySql.getClass();
//	            final Sql proxy = (Sql) Proxy.newProxyInstance(sqlClass.getClassLoader(), sqlClass.getInterfaces(), sqlProxyHandler);
//	            mappedStatement.setSql(proxy);
//	        }
//	    }
//	    try {
//	        return smc.queryForList(statementId, param);
//	    } catch (SQLException ex) {
//	        throw new RuntimeException("查询失败", ex);
//	    }
//	}
//	
//	public interface SqlHandler {
//		String handle(String sql, Object[] params) throws Throwable;
//	}
//	
//	protected static final class SqlProxyHandler implements InvocationHandler {
//	    private final Sql sql;
//	    private final ThreadLocal<SqlHandler> sqlHandler = new ThreadLocal<SqlHandler>();
//	    public SqlProxyHandler(Sql sql, SqlHandler handler) {
//	        this.sql = sql;
//	        setSqlHandler(handler);
//	    }
//	    public Sql getSql() {
//	        return sql;
//	    }
//	    public void setSqlHandler(SqlHandler handler) {
//	        this.sqlHandler.set(handler);
//	    }
//	    public SqlHandler getSqlHandler() {
//	        return sqlHandler.get();
//	    }
//	    @Override
//	    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//	        Object result = method.invoke(getSql(), args);
//	        if ("getSql".equals(method.getName()) && getSqlHandler() != null) {
//	        	logger.debug("原SQL： " + result);
//	            final StatementScope statementScope = (StatementScope) args[0];
//	            final Object[] params = statementScope.getParameterMap().getParameterObjectValues(statementScope, args[1]);
//	            result = getSqlHandler().handle((String) result, params);
//	            logger.debug("处理后： " + result);
//	            setSqlHandler(null);//执行完成后清除线程局部变量，下次调用需要设置新值，否则不拦截getSql方法
//	        }
//	        return result;
//	    }
//	}
//
//	public void setNamespace(String namespace) {
//		this.namespace = namespace;
//	}
//
//	public String getNamespace() {
//		return namespace;
//	}
	
}
