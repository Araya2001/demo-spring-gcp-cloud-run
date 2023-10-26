package aaj.demospringgcpcloudrun.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Builder;

@Builder
@JsonSerialize
public record ResponseDTO(
        @JsonProperty("property") String property
) {
}
