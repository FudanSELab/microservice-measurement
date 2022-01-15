package TraceAnalysis;

import TraceAnalysis.domain.Article;
import TraceAnalysis.domain.Author;
import TraceAnalysis.domain.Meeting;
import TraceAnalysis.repository.ArticleRepository;
import TraceAnalysis.utility.contract.ArticleStatus;
import TraceAnalysis.utility.contract.MeetingStatus;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
@EnableEurekaClient
public class ArticleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticleServiceApplication.class, args);
    }

    /**
     * This is a function to create some basic entities when the application starts.
     * Now we are using a In-Memory database, so you need it.
     * You can change it as you like.
     */
    @Bean
    public CommandLineRunner dataLoader(ArticleRepository articleRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {



            }
        };
    }
}

