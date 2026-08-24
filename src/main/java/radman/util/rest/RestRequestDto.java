package radman.util.rest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import radman.util.general.enumeration.http.AuthorizationType;
import radman.util.general.enumeration.http.ContentType;
import radman.util.general.enumeration.http.HttpMethod;
import radman.util.general.enumeration.http.SecurityProtocol;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Enhanced REST request DTO with additional features
 *
 * @author : Pedram Behradkian
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RestRequestDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String url;
    private HttpMethod method;

    @Builder.Default
    private ContentType contentType = ContentType.JSON;

    @Builder.Default
    private AuthorizationType authorizationType = AuthorizationType.NO_AUTH;

    private String authorizationValue;
    private SecurityProtocol protocol;
    private Map<String, String> headers;
    private Map<String, String> queryParams;
    private Object body;
    private String certificatePath;
    private String certificatePassword;

    @Builder.Default
    private int connectionTimeout = 0;

    @Builder.Default
    private int readTimeout = 0;

    @Builder.Default
    private boolean followRedirects = true;

    @Builder.Default
    private boolean enableLogging = true;

    @Builder.Default
    private int maxRedirects = 5;

    public RestRequestDtoBuilder toBuilder() {
        return RestRequestDto.builder()
                .url(this.url)
                .method(this.method)
                .contentType(this.contentType)
                .authorizationType(this.authorizationType)
                .authorizationValue(this.authorizationValue)
                .protocol(this.protocol)
                .headers(this.headers != null ? new HashMap<>(this.headers) : null)
                .queryParams(this.queryParams != null ? new HashMap<>(this.queryParams) : null)
                .body(this.body)
                .certificatePath(this.certificatePath)
                .certificatePassword(this.certificatePassword)
                .connectionTimeout(this.connectionTimeout)
                .readTimeout(this.readTimeout)
                .followRedirects(this.followRedirects)
                .enableLogging(this.enableLogging)
                .maxRedirects(this.maxRedirects);
    }
}