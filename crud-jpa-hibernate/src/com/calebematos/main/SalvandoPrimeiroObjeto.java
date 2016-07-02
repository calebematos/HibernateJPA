package com.calebematos.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.calebematos.model.Cliente;

public class SalvandoPrimeiroObjeto {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		
		EntityManager em = emf.createEntityManager();// entitymanager tudo começa por aqui ele q salva o objeto no db 
		
		Cliente cliente = new Cliente();
		cliente.setNome("Pedro Bial");
		cliente.setIdade(40);
		cliente.setProfissao("jornalista");
		cliente.setSexo("M");
		
		em.getTransaction().begin();		
		em.persist(cliente);
		em.getTransaction().commit();
	
		System.out.println("Cliente salvo com susseço");
//		em.close();
		
	}

}
