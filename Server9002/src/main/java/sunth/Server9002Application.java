package sunth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Sunth Sun
 * 2020/12/24 6:31 下午
 * other
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Server9002Application {
    public static void main(String[] args) {
        SpringApplication.run(Server9002Application.class,args);
    }
}
