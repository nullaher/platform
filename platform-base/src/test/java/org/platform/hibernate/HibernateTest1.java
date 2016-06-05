package org.platform.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import cn.nullah.platform.base.pojo.CfgInf;

public class HibernateTest1 {
	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();
		SessionFactory fac = cfg.buildSessionFactory();
		Session session = fac.openSession();
		Transaction tx =session.beginTransaction();
		CfgInf cf=new CfgInf("文本类型");
		session.save(cf);
		tx.commit();
		session.close();
		fac.close();
	}
}
