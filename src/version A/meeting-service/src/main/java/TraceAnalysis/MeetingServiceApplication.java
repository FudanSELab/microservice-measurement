package TraceAnalysis;

import TraceAnalysis.domain.Meeting;
import TraceAnalysis.repository.MeetingRepository;
import TraceAnalysis.utility.contract.MeetingStatus;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@EnableEurekaClient
public class MeetingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeetingServiceApplication.class, args);
    }

    /**
     * This is a function to create some basic entities when the application starts.
     * Now we are using a In-Memory database, so you need it.
     * You can change it as you like.
     */
    @Bean
    public CommandLineRunner dataLoader(MeetingRepository meetingRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {

            }
        };
    }
}
