package com.pt.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtillity {

		private static SessionFactory factory;
		private static Session ses;
		static {
			Configuration cfg=new Configuration();
			cfg.configure("com/pt/cfgs/hibernate.cfg.xml");
			factory=cfg.buildSessionFactory();
		}
		
		public static Session getInstance() {
			ses=factory.openSession();
			return ses;
		}
		
		public static void closesession() {
			if(ses!=null) {
				ses.close();
			}
		}
		
		public static void  closesessionFactory() {
			if(factory!=null) {
				factory.close();
			}
		}
}
