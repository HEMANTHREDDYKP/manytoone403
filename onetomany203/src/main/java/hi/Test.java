package hi;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Test {

	public static void main(String[] args) {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("hi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		//to insert
		
//		Mobile m=new Mobile();
//		m.setBrand("mi12pro");
//		m.setCost(30000);
//
//		Sim s1=new Sim();
//		s1.setType("4G");
//		s1.setNetProvider("Airtel");
//		s1.setMobile(m);
//		
//		Sim s2=new Sim();
//		s2.setType("4G");
//		s2.setNetProvider("VI");
//		s2.setMobile(m);
//		
//		et.begin();
//		em.persist(s2);
//		em.persist(s1);
//        em.persist(m);	
//        et.commit();
		
		
		//to get
		
//		et.begin();
//		Sim s=em.find(Sim.class, 1);
//		System.out.println(s);
//		
		
	//get by name
		
//		et.begin();
//		Query q =em.createQuery("select s from Sim s where s.type=?1");
//		q.setParameter(1, "4G");
//		List<Sim> sims=q.getResultList();
//		for (Sim sim : sims) {
//			System.out.println(sim);
//		}
		
		
		
		//update
//		et.begin();
//		Sim s=em.find(Sim.class, 3);
//		s.setNetProvider("aircel");
//		
//		et.commit();
//		
		
		//delete
		
		et.begin();
		Sim s=em.find(Sim.class, 3);
		em.remove(s);
		et.commit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
