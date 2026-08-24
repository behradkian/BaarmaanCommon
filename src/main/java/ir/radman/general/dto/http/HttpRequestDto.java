package ir.radman.general.dto.http;

import ir.radman.general.enumeration.http.ContentType;
import ir.radman.general.enumeration.http.HttpMethod;
import lombok.Builder;

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
