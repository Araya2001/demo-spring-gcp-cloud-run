package aaj.demospringgcpcloudrun.handler;

import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public interface Handler {
    Mono<ServerResponse> getResponse(ServerRequest serverRequest);
}
