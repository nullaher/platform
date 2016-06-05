package org.platform.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import cn.nullah.platform.base.pojo.CfgInf;

public class HibernateTestMain {
	public static void main(String[] args) {

		Configuration configiguration = new Configuration().configure();

		SessionFactory fac = configiguration
				.buildSessionFactory(new StandardServiceRegistryBuilder()
						.applySettings(configiguration.getProperties()).build());

//		Configuration configiguration = new Configuration().configure();
//		SessionFactory fac = configiguration.buildSessionFactory();

		Session session = fac.openSession();
		Transaction tx = session.beginTransaction();
		CfgInf cf = new CfgInf("文本类型");
		session.persist(cf);
		tx.commit();
		session.close();
		fac.close();
	}
}
