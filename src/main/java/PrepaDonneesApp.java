

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prepaDonneesApp.Services.Commun.Commun;

@SpringBootApplication
@EnableScheduling
public class PrepaDonneesApp {
	
    public static void main(String[] args) {
        SpringApplication.run(PrepaDonneesApp.class, args);
    }
    
}

