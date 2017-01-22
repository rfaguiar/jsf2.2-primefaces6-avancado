package com.rfaguiar.pedidovenda.util.jpa;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped//faz o EntityManagerFactory viver durante a aplicação 
public class EntityManagerProducer {

	private EntityManagerFactory factory;
	
	public EntityManagerProducer() {
		
		this.factory = Persistence.createEntityManagerFactory("PedidoPU");
	}
	
	@Produces//produz EntityManager para @inject
	@RequestScoped//define a vida deste EntityManager durante a requisição
	public EntityManager createEntityManager(){
		return this.factory.createEntityManager();
	}
	
	//fecha o EntityManager ao final da requisição
	public void closeEntityManager(@Disposes EntityManager manager){
		manager.close();
	}
}
