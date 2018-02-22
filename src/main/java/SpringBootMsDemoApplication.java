

	import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

	@RestController
	@EnableAutoConfiguration
	public class SpringBootMsDemoApplication {

	    @RequestMapping(value="/user/{name}", method = RequestMethod.GET)
	    String home(@PathVariable("name") String name) {
	        return "Hello "+name +"!";
	    }

	    public static void main(String[] args) throws Exception {
	        SpringApplication.run(SpringBootMsDemoApplication.class, args);
	    }

	}