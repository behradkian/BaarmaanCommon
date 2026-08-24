package radman.util.rest.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

/**
 * @author : Pedram Behradkian
 */
@Getter
@AllArgsConstructor
public enum HttpMethod implements Serializable {
    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    PATCH("PATCH"),
    OPTIONS("OPTIONS"),
    DELETE("DELETE");

    private final String value;
}