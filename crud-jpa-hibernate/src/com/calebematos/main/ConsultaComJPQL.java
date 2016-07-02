package com.calebematos.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.calebematos.model.Cliente;

public class ConsultaComJPQL {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();

		List<Cliente> clientes = em.createQuery("from Cliente ", Cliente.class)
									.getResultList();

		for(Cliente cli : clientes){
			System.out.println("Código: "+cli.getCodigo());
			System.out.println("Nome: "+cli.getNome());
			System.out.println("Sexo: "+cli.getSexo());
			System.out.println("------------------------- ");
		}
	}

}
