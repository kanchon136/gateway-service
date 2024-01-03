//package apigateway.com.apigateway.routeAndResilience4jConfig;
//
//import java.time.Duration;
//
//import org.springframework.cloud.circuitbreaker.resilience4j.ReactiveResilience4JCircuitBreakerFactory;
//import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JConfigBuilder;
//import org.springframework.cloud.client.circuitbreaker.Customizer;
//import org.springframework.context.annotation.Configuration;
//
//import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
//
// 
//@Configuration
//public class Resilience4jConfig {
//
// public Customizer<ReactiveResilience4JCircuitBreakerFactory> defaultCustomizer() {
//     return factory -> factory.configureDefault(id -> new Resilience4JConfigBuilder(id)
//             .circuitBreakerConfig(CircuitBreakerConfig.custom()
//                     .slidingWindowSize(5)
//                     .permittedNumberOfCallsInHalfOpenState(3)
//                     .minimumNumberOfCalls(5)
//                     .waitDurationInOpenState(Duration.ofSeconds(10))
//                     .failureRateThreshold(50)
//                     .build())
//             .build());
// }
//}
//
