package aaj.demospringgcpcloudrun.handler;

import aaj.demospringgcpcloudrun.dto.ResponseDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class HandlerImpl implements Handler {
    @Override
    public Mono<ServerResponse> getResponse(ServerRequest serverRequest) {
        // Comentario Nueva Version
        return ServerResponse.ok().body(ResponseDTO.builder().property("Hello World").build(), ResponseDTO.class);
    }
}
