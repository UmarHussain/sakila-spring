package isep.web.sakila.webapi;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SakilaBusinessWebapiApplication {

	private static final Log log = LogFactory.getLog(SakilaBusinessWebapiApplication.class);
	
	public static void main(String[] args) {
		
		log.debug(String.format("*************************************"));
		log.debug(String.format(" Starting Embeded Tomcat"));
		log.debug(String.format("*************************************"));
		
		SpringApplication.run(SakilaBusinessWebapiApplication.class, args);
		log.debug(String.format("**************************************"));
	}
}
