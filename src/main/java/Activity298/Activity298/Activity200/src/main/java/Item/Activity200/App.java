package Item.Activity200;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.model.Item;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       // System.out.println("Hello World!");
    	try
    	{
    		EntityManager em = Persistence.createEntityManagerFactory("UserPU").createEntityManager();
    		Item item=new Item();
    		em.getTransaction().begin();
    		item.setItemid("1");
    		item.setItemname("Phone");
    		item.setBatched(true);
    		item.setDateofmanufacturing(2002/2/23);
    		
    		em.persist(item);
    		em.getTransaction().commit();
    		System.out.println(item);
    		
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }



    }

