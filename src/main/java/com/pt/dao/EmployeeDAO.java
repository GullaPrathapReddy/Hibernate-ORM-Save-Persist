package com.pt.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pt.domain.Employee;
import com.pt.utility.HibernateUtillity;

public class EmployeeDAO {
	Transaction tx = null;
	private Session ses;
	boolean flag = false;
	int no;
	public int save(Employee emp) {
		ses = HibernateUtillity.getInstance();
		try {
			tx = ses.beginTransaction();
			 no = (int) ses.save(emp);
			flag = true;
		} catch (HibernateException he) {
			he.printStackTrace();
			flag = false;
		} catch (Exception e) {
			e.printStackTrace();
			flag = false;
		} finally {
			if (flag) {
				tx.commit();
			}else {
				tx.rollback();
			}
		}

		return no;

	}

}
