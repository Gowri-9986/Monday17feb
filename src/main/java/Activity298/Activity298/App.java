package Activity298.Activity298;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.City;
import com.model.CityBasedService;
import com.model.Subscription;
import com.model.Userservice;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        ApplicationContext ctx=new ClassPathXmlApplicationContext("springbeans.xml");
        
    	

   	Userservice userservice1 =ctx.getBean("service1",Userservice.class);
 Userservice  Userservice2=ctx.getBean("service2",Userservice.class);
 System.out.println(userservice1);
 System.out.println(Userservice2); 
 System.out.println(" #################");
 City city1=ctx.getBean("City1",City.class);
 City city2=ctx.getBean("City2",City.class);
 City city3=ctx.getBean("City3",City.class);
 System.out.println(city1);
 System.out.println(city2);
 System.out.println(city3);
 System.out.println("<------------------->");
 Subscription subcription=ctx.getBean("subcription1",Subscription.class);
 System.out.println(subcription);
 System.out.println("*****************");
 CityBasedService cityservice1=ctx.getBean("cityservice1",CityBasedService.class);
 
 System.out.println(cityservice1);
 
 

 }
}
