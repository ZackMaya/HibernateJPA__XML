package mx.edu.uacm.primerproyectohbm.HibernateJPA__XML;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;




public class App 
{
	public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	
    	
    	//JPA proporciona dentro de la clase persistence un metodo createEntityManagerFactory que nos
    	//permite cargar el archivo de configuración 
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJPA__XML");
    	
    	//Creamos un EntityManager
    	//Similar al session de hibernate
    	EntityManager em = emf.createEntityManager();
    	
    	User user = new User();
    	user.setId(11);
    	user.setUserName("zack");
    	user.setUserMessage("esto es JPA este funciona __XML");
    	
    	User user2 = new User();
    	user2.setId(22);
    	user2.setUserName("maya");
    	user2.setUserMessage("esto es JPA este tambien funciona __XML");
    	
    	//Inicio de transaccion a traves de entityManager
    	em.getTransaction().begin();
    	
    	//Nombre del metodo para almacenar se llama persistence
    	em.persist(user);
    	em.persist(user2);
    	
    	em.getTransaction().commit();
    	
    	//Metodos de cierre 
    	em.close();
    	emf.close();
    	
    }
}
