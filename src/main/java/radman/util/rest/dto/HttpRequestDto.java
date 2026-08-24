package radman.util.rest.dto;

import lombok.Builder;
import radman.util.rest.enumeration.ContentType;
import radman.util.rest.enumeration.HttpMethod;

import java.util.Map;

/**
 * @author : Pedram Behradkian
 */
@Builder
public record HttpRequestDto(
        String url,
        HttpMethod method,
        ContentType contentType,
        Map<String, Object> headers,
        String body,
        Map<String, String> formParams,
        int timeoutSeconds,
        boolean trustAllSsl
) {

    public boolean isFormRequest() {
        return formParams != null && !formParams.isEmpty();
    }

    public boolean isJsonRequest() {
        return contentType == ContentType.JSON;
    }
}
