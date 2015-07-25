package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TestaInsereConta {
public static void main(String[] args) {
	
	EntityManager manager = new JPAUtil().geEntityManager();
	
	
	Conta conta = new Conta();
	conta.setTitular("Jose da silva");
	conta.setTitular("Banco do Brasil");
	conta.setNumero("123456-6");
	conta.setAgencia("0999");
	
	manager.getTransaction().begin();
	manager.persist(conta);
	manager.getTransaction().commit();
	manager.close();
	
	System.out.println("Conta Gravada com sucesso!!!");
	
	
}
}
