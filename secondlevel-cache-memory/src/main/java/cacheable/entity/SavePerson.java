package cacheable.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson {

	public static void main(String[] args) {
	
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("gani");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
	                                                       
		                                                                               
	Person person=new Person();
	
	person.setName("Radhe");
	person.setAge(43);
	person.setAddress("Dwaraka");
	
	
	Person person1=new Person();
	
	person1.setName("bablu");
	person1.setAge(30);
	person1.setAddress("jammu");
	
	entityManager.persist(person);
	entityManager.persist(person1);
	
	entityTransaction.commit();

	}

}
