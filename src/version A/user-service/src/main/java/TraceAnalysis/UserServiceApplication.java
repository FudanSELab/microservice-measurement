package TraceAnalysis;

import TraceAnalysis.domain.User;
import TraceAnalysis.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCrypt;

@SpringBootApplication
@EnableEurekaClient
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    /**
     * This is a function to create some basic entities when the application starts.
     * Now we are using a In-Memory database, so you need it.
     * You can change it as you like.
     */
    @Bean
    public CommandLineRunner dataLoader(UserRepository userRepository) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                // Create authorities if not exist.

                // Create an admin if not exists.
                if (userRepository.findByUsername("admin") == null) {
                    User admin = new User(
                            "admin",
                            "adminManager",
                            BCrypt.hashpw("123456", BCrypt.gensalt()),
                            "A@trace.analysis.com",
                            "trace analysis University",
                            "City Country"
                    );
                    userRepository.save(admin);
                }

                if (userRepository.findByUsername("C") == null) {
                    User admin = new User(
                            "C",
                            "CManager",
                            BCrypt.hashpw("123456", BCrypt.gensalt()),
                            "C@trace.analysis.com",
                            "trace analysis University",
                            "City Country"
                    );
                    userRepository.save(admin);
                }

                if (userRepository.findByUsername("D") == null) {
                    User admin = new User(
                            "D",
                            "DManager",
                            BCrypt.hashpw("123456", BCrypt.gensalt()),
                            "D@trace.analysis.com",
                            "trace analysis University",
                            "City Country"
                    );
                    userRepository.save(admin);
                }

                if (userRepository.findByUsername("test") == null) {
                    User admin = new User(
                            "test",
                            "testManager",
                            BCrypt.hashpw("123456", BCrypt.gensalt()),
                            "E@trace.analysis.com",
                            "trace analysis University",
                            "City Country"
                    );
                    userRepository.save(admin);
                }

                if (userRepository.findByUsername("test1") == null) {
                    User admin = new User(
                            "test1",
                            "test1Manager",
                            BCrypt.hashpw("123456", BCrypt.gensalt()),
                            "E@trace.analysis.com",
                            "trace analysis University",
                            "City Country"
                    );
                    userRepository.save(admin);
                }
                if (userRepository.findByUsername("test2") == null) {
                    User admin = new User(
                            "test2",
                            "test2Manager",
                            BCrypt.hashpw("123456", BCrypt.gensalt()),
                            "E@trace.analysis.com",
                            "trace analysis University",
                            "City Country"
                    );
                    userRepository.save(admin);
                }
                if (userRepository.findByUsername("test3") == null) {
                    User admin = new User(
                            "test3",
                            "test3Manager",
                            BCrypt.hashpw("123456", BCrypt.gensalt()),
                            "E@trace.analysis.com",
                            "trace analysis University",
                            "City Country"
                    );
                    userRepository.save(admin);
                }

                if (userRepository.findByUsername("akasaka") == null) {
                    User admin = new User(
                            "akasaka",
                            "akasaka",
                            BCrypt.hashpw("123456", BCrypt.gensalt()),
                            "F@trace.analysis.com",
                            "trace analysis University",
                            "City Country"
                    );
                    userRepository.save(admin);
                }
            }


        };
    }
}
