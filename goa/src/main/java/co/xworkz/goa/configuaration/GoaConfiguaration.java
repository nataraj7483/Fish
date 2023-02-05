package co.xworkz.goa.configuaration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("co.xworkz.goa")
public class GoaConfiguaration {
	
	public GoaConfiguaration() {
		System.out.println("Running CasinoConfiguaration:"+ getClass().getSimpleName());
	}

}
