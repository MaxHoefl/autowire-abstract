package demo.hoeflm.spring.autowireabstract;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutowireAbstractApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AutowireAbstractApplication.class, args);
	}

	private ExecutorService executor = Executors.newFixedThreadPool(3);
	
	@Override
	public void run(String... args) throws Exception {
		Athlete a1 = new Sprinter("adam");
		Athlete a2 = new TennisPlayer("roger");
		executor.execute(a1);
		executor.execute(a2);
	}
}
