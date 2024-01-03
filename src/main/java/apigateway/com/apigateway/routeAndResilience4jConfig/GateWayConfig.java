//package apigateway.com.apigateway.routeAndResilience4jConfig;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class GateWayConfig {
//	
//	
// 
//	 
//	
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("user-service", r -> r.path("/user-service/**")
//                        .filters(f -> f.circuitBreaker(c -> c.setName("userServiceCircuitBreaker")
//                                .setFallbackUri("forward:/userFallback")))
//                        .uri("lb://user-service"))
//                .route("department-service", r -> r.path("/department-service/**")
//                        .filters(f -> f.circuitBreaker(c -> c.setName("departmentServiceCircuitBreaker")
//                                .setFallbackUri("forward:/departmentFallback")))
//                        .uri("lb://department-service"))
//                .build();
//    }
//
//}
