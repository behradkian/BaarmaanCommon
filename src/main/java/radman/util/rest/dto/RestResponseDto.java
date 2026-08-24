package radman.util.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import radman.util.convertor.JsonConvertor;
import radman.util.rest.enumeration.HttpStatusCode;

import java.util.Map;

/**
 * Enhanced REST response DTO with additional metadata
 *
 * @author : Pedram Behradkian
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RestResponseDto {
    private HttpStatusCode httpStatusCode;
    private Map<String, String> headers;
    private String body;
    private String contentType;
    private String requestUrl;
    private long responseTime;

    public boolean isSuccess() {
        return httpStatusCode != null && httpStatusCode.isSuccess();
    }

    public boolean hasBody() {
        return body != null && !body.trim().isEmpty();
    }

    public boolean isClientError() {
        return httpStatusCode != null && httpStatusCode.isClientError();
    }

    public boolean isServerError() {
        return httpStatusCode != null && httpStatusCode.isServerError();
    }

    public String getHeader(String name) {
        return headers != null ? headers.get(name) : null;
    }

    public <T> T getBodyAs(Class<T> clazz) {
        if (!hasBody()) {
            return null;
        }
        return JsonConvertor.jsonString2Object(body, clazz);
    }
}