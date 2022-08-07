package hacors.kuiff;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hakao
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableDubbo
public class Api {
    public static void main(String[] args) {
        SpringApplication.run(Api.class, args);
    }
}
