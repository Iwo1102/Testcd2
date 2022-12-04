package ie.atu.project.CiCd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CiCdApplication {

	public static void main(String[] args) {
		System.out.println("hello world\n");
		SpringApplication.run(CiCdApplication.class, args);
		System.out.println("Test\n");

	}

}
