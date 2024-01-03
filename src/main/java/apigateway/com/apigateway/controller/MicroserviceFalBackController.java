package apigateway.com.apigateway.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class MicroserviceFalBackController {
	
	@GetMapping("/userFallback")
	public Mono<String> userFalFalBack(){
		
		return Mono.just("User Service is down Please Try again latter...!!");
	}
	
	@GetMapping("/departmentFallback")
	public Mono<String> departmentFalBack(){
		return Mono.just("Department Service is down Please try again latter..!!");
	}
	
	
	
	
//	@GetMapping("/userFallback")
//	public ResponseEntity<String> userFalBackMethod(){
//		return ResponseEntity.ok("User Service is Down Please try again...!!!");
//	}
//	
//	
//	@GetMapping("/departmentFallback")
//	public ResponseEntity<String> departmentFalBackMethod(){
//		
//		return ResponseEntity.ok("Department Service is down Please try again..!!!");
//	}
	
	
	
	

}
