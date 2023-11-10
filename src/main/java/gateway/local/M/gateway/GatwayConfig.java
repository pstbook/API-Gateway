package gateway.local.M.gateway;

import lombok.extern.log4j.Log4j2;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Log4j2
public class GatwayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route( r -> r
                        .path("/ews/api/v1/m/customerPortfolio/**")
                        .uri("http://localhost:8081/"))
                .route( r -> r
                        .path("/ews/rest/**")
                        .uri("http://localhost:8082/"))
                .route( r -> r
                        .path("/ews/api/v1/m/pipeline/**")
                        .uri("http://localhost:8083/"))
                .route( r -> r
                        .path("/ews/api/v1/m/pauseAlert/**")
                        .uri("http://localhost:8084/"))
                .route( r -> r
                        .path("/ews/api/v1/m/report/**")
                        .uri("http://localhost:8085/"))
                .route( r -> r
                        .path("/ews/api/v1/m/potentialNPLs/**")
                        .uri("http://localhost:8086/"))
                .route( r -> r
                        .path("/ews/api/v1/m/spotCheck/**")
                        .uri("http://localhost:8087/"))
                .route( r -> r
                        .path("/ews/api/v1/m/admin/**")
                        .uri("http://localhost:8088/"))
                .route( r -> r
                        .path("/crcm/api/v1/**")
                        .uri("http://localhost:8089/"))
                .build();
    }

}
