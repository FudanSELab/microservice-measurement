package adminmeeting;

//import adminmeeting.repository.ArticleRepository;
//import adminmeeting.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
        import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AdminMeetingApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminMeetingApplication.class, args);
    }


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public CommandLineRunner dataLoader() {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                return;
            }


        };
    }
}