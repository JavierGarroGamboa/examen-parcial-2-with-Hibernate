package cr;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

/**
 * The main class for Spring boot to run
 */
@SpringBootApplication
public class BackendServiceApplication {

	private static final Logger logger = LogManager.getLogger(cr.BackendServiceApplication.class);

	public static void main(String[] args) {
		logger.info("Inicializando el Backend");
		SpringApplication app = new SpringApplication(cr.BackendServiceApplication.class);
		app.setDefaultProperties(Collections
				.singletonMap("server.port", "8083"));
		app.run(args);

	}

}
