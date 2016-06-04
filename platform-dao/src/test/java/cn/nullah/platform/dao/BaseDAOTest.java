/**
 * Copyright ©2016 simon's Co.,Ltd.All Rights Reserved
 * cn.nullah.platform.dao.hibernate.impl.HibernateDaoImplTest.java
 * simon 2016年4月30日
 */
package cn.nullah.platform.dao;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * @autor: simon
 * @desc : ...
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring/spring-dao.xml" })
//@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
//@Transactional
@TransactionConfiguration(defaultRollback=false)
public class BaseDAOTest {
}
