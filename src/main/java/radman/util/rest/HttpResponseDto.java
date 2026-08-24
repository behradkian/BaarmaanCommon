package radman.util.rest;

import radman.util.general.enumeration.http.StatusCode;

import java.util.Map;

/**
 * @author : Pedram Behradkian
 */
public record HttpResponseDto(
        StatusCode statusCode,
        String body,
        Map<String, Object> headers) {

    public boolean isSuccess() {
        return statusCode.getCode() >= 200 && statusCode.getCode() < 300;
    }
}