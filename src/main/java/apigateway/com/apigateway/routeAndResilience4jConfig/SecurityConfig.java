package apigateway.com.apigateway.routeAndResilience4jConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http
            .authorizeExchange()
                .pathMatchers("/actuator/**").permitAll() // Allow actuator endpoints
                .pathMatchers("/user-service/**").authenticated() // Secure your routes
                .pathMatchers("/department-service/**").authenticated()
                .and()
            .oauth2Login() // Enable OAuth2 login
                .and()
            .oauth2ResourceServer() // Enable OAuth2 resource server
                .jwt(); // Use JWT as the token format

        return http.build();
    }
}
