package com.calebematos.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.calebematos.model.Cliente;

public class ConsultadoPrimeiroObjeto {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();

		Cliente cliente = em.find(Cliente.class, 7L);

		if (cliente != null) {
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("Idade: " + cliente.getIdade());
			System.out.println("Prefissão: " + cliente.getProfissao());
			System.out.println("Sexo: " + cliente.getSexo());
		}else{
			System.out.println("Cliente não encontrado");
		}
	}
}
