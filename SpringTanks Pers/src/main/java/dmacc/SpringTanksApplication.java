package dmacc;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Tank;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.TankRepository;

@SpringBootApplication
public class SpringTanksApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTanksApplication.class, args);
		
		/**
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		Tank c = appContext.getBean("tank", Tank.class);
		System.out.println(c.toString());
		*/
	}
	
	/**
	@Autowired
	TankRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
			
		Tank t = appContext.getBean("tank", Tank.class);
		t.setModelName("Cromwell");
		t.setAmountMade(4016);
		t.setYearIntroduced(1944);
		repo.save(t);
			
		Tank d = new Tank("Panther", 1943, 6000);
			
		repo.save(d);
		
		List<Tank> allTanks = repo.findAll();
		
		for (Tank vehicle: allTanks) {
			System.out.println(vehicle.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}
	*/
}
