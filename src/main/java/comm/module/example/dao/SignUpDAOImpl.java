package comm.module.example.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import comm.module.example.entity.SignUpEntity;


@Repository
public class SignUpDAOImpl implements SignUpDAO {
	
	@Autowired
	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	public SignUpDAOImpl() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	

	public Serializable save(SignUpEntity entity) {
		System.out.println("save method started");
		Session session = null;
		try {

			System.out.println("session created");
			session = factory.openSession();
			System.out.println("Transaction begun");
			session.beginTransaction();
			System.out.println("Entity saving...");
			session.save(entity);
			System.out.println("Commiting....");
			session.getTransaction().commit();
			System.out.println("Data saved");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("INFO:" + e.getMessage());
		}

		return entity;
	}


}
