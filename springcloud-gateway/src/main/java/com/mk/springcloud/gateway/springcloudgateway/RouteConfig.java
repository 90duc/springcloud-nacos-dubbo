package com.mk.springcloud.gateway.springcloudgateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("micro-service2", r -> r.path("/micro-service2/**")
                        .filters(v->v.stripPrefix(1))
                        .uri("lb://micro-service"))
                .build();
    }
}
