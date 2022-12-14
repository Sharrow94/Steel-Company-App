package com.steel.company.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {
	
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		System.out.println("Witam w api-gatewey");
		return builder.routes()
				.route(p -> p.path("api-gateway/department-supply/**")
						.uri("lb://department-supply"))
				.route(p -> p.path("department-laser/**")
						.uri("lb://department-laser"))
				.build();
	}

}
