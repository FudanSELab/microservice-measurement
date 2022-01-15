package TraceAnalysis;

import TraceAnalysis.domain.Article;
import TraceAnalysis.domain.Author;
import TraceAnalysis.domain.PCMemberRelation;
import TraceAnalysis.repository.PCMemberRelationRepository;
import TraceAnalysis.utility.contract.ArticleStatus;
import TraceAnalysis.utility.contract.PCmemberRelationStatus;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class PcMemberRelationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PcMemberRelationServiceApplication.class, args);
    }

    /**
     * This is a function to create some basic entities when the application starts.
     * Now we are using a In-Memory database, so you need it.
     * You can change it as you like.
     */
    @Bean
    public CommandLineRunner dataLoader(PCMemberRelationRepository pcMemberRelationRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {


            }
        };
    }
}
