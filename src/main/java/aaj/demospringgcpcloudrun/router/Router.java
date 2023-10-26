package aaj.demospringgcpcloudrun.router;

import aaj.demospringgcpcloudrun.handler.Handler;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

@Configuration(proxyBeanMethods = false)
public class Router {
    @Bean
    public RouterFunction<ServerResponse> route(Handler handler) {
        return RouterFunctions.route(GET("/demo-spring-gcp-cloud-run/api/v1/hello"), handler::getResponse)
                ;
    }
}
