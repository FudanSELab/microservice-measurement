package pcmember;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class PcmemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(PcmemberApplication.class, args);
    }

//    @Bean //依赖注入=多个文件共享一个对象
//    public RestTemplate restTemplate(RestTemplateBuilder builder) {
//        return builder.build(); //build之后直接Autowired，就不用new构造了
//    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}

