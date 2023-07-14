package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entitie.Pessoa;

public class Program {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(null,"Andrey","andrey@gmail.com");
		Pessoa p2 = new Pessoa(null,"Gabriel","gabriel@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		
		Pessoa p = em.find(Pessoa.class, 3);
		System.out.println(p);
		
		em.remove(p);
		
		em.getTransaction().commit();
		
		System.out.println();
		System.out.println("Sucesso");
		
		em.close();
		emf.close();
	}

}
