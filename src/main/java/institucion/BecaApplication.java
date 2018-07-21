package institucion;

import java.io.IOException;
import java.util.Properties;

import javax.sql.DataSource;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePatternUtils;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import institucion.alumno.domain.repository.AlumnoRepository;




@SpringBootApplication

public class BecaApplication implements CommandLineRunner {
/*
	 @Autowired
	    private ApplicationContext applicationContext;	
	*/
	
	@Autowired
	AlumnoRepository alumnoRepository;
	/*
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(BecaApplication.class, args);
		
	    for (String name: applicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }	    
		//context.getBean(AlumnoRepository.class);		
	}
	
	@Bean
    public CommandLineRunner demoData(AlumnoRepository repo) {
        return args -> { 

            repo.save(new Entity(Alumno.class));
        }
    }
    */

	public static void main(String[] args) {
		SpringApplication.run(BecaApplication.class, args);
		
	    	    
		//context.getBean(AlumnoRepository.class);		
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//alumnosRepository.
		
	}




	

	
}