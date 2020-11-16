package com.techlab.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlab.entity.Department;
import com.techlab.entity.Employee;

public class DeptTest {

	public static void main(String[] args) throws IllegalStateException, SystemException, SecurityException,
			RollbackException, HeuristicMixedException, HeuristicRollbackException {
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();

		Department d1 = new Department();
		d1.setId(UUID.randomUUID().toString());
		d1.setName("it");
		Department d2 = new Department();
		d2.setId(UUID.randomUUID().toString());
		d2.setName("hr");

		Employee e1 = new Employee();
		e1.setId(UUID.randomUUID().toString());
		e1.setName("prasad");
		e1.setDept(d1);
		Employee e2 = new Employee();
		e2.setId(UUID.randomUUID().toString());
		e2.setName("vinit");
		e2.setDept(d1);
		Employee e3 = new Employee();
		e3.setId(UUID.randomUUID().toString());
		e3.setName("dipesh");
		e3.setDept(d2);
		Employee e4 = new Employee();
		e4.setId(UUID.randomUUID().toString());
		e4.setName("rajat");
		e4.setDept(d2);

		Set<Employee> emps1 = new HashSet();
		emps1.add(e1);
		emps1.add(e2);

		Set<Employee> emps2 = new HashSet();
		emps2.add(e3);
		emps2.add(e4);

		d1.setEmployees(emps1);
		d2.setEmployees(emps2);

		Session session = factory.openSession();
		Transaction transaction = null;
		try {
			transaction = (Transaction) session.beginTransaction();

//			session.save(d1);
//			session.save(d2);

			List<Department> deptList1 = session.createQuery("from Department").list();
			for (Department d : deptList1) {
				System.out.println(d);
			}
			transaction.commit();

		} catch (HibernateException e) {
			transaction.rollback();
			System.out.println(e);
		}

	}

//	private static void read(Session session) {
//		
//	}

}
