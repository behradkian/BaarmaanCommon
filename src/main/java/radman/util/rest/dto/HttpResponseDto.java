package radman.util.rest.dto;

import radman.util.rest.enumeration.HttpStatusCode;

import java.util.Map;

/**
 * @author : Pedram Behradkian
 */
public record HttpResponseDto(
        HttpStatusCode httpStatusCode,
        String body,
        Map<String, Object> headers) {

    public boolean isSuccess() {
        return httpStatusCode.getCode() >= 200 && httpStatusCode.getCode() < 300;
    }
}