package com.ishaq.microservice.apigateway;

import java.util.function.Function;

import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {
	
	
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		
		
		
		Function<PredicateSpec, Buildable<Route>> routeFunction
		= p -> p.path("/get")
		.filters(f -> f.addRequestHeader("MyHeader", "My Value")
				.addRequestParameter("Param", "myvalue"))
		.uri("http://httpbin.org:80");
		return builder.routes()
				.route(routeFunction)
				.route(p -> p.path("/currency-exchange-service/**")
						.uri("lb://currency-exchange-service"))
				.route(p -> p.path("/currency-exchange-service/**")
						.filters(f -> f.rewritePath(
								"/currency-exchange-new/(?<segment>.*)",
								"/currency-exchange-service/${segment}"))
						.uri("lb://currency-exchange-service"))
				.build();
		
	}

}
