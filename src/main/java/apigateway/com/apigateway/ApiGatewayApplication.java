package apigateway.com.apigateway;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "apigateway.com.apigateway.routeAndResilience4jConfig")
@EnableEurekaClient
public class ApiGatewayApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ApiGatewayApplication.class, args);
		SpringApplication application = new SpringApplication(ApiGatewayApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
		System.out.println("================gateway-service running==================");
		
	}

}
