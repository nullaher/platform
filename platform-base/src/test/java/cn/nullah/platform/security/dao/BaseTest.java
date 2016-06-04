/**
 * Copyright ©2016 simon All Rights Reserved Copyright ©2016 www.uinpay.cn Technology Co.,Ltd.All
 * Rights Reserved cn.nullah.platform.security.dao.BaseTest.java simon 2016年5月22日
 */
package cn.nullah.platform.security.dao;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

/**
 * @autor: simon desc : ...
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring-test.xml"})
// @TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
// @Transactional
@TransactionConfiguration(defaultRollback = false)
public class BaseTest {}
