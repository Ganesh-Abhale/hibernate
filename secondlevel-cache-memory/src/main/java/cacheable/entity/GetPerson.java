package cacheable.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetPerson {

	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gani");
		
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.find(Person.class, 1);
		entityManager.find(Person.class, 1);
		
		

		EntityManager entityManager2=entityManagerFactory.createEntityManager();
		entityManager2.find(Person.class, 1);
		entityManager2.find(Person.class, 1);
		

		
		EntityManager entityManager3=entityManagerFactory.createEntityManager();
		entityManager3.find(Person.class, 1);
		entityManager3.find(Person.class, 1);
		
		
		
	}

}
