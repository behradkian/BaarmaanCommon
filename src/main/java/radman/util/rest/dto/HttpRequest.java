package radman.util.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import radman.util.rest.AuthorizationConfiguration;
import radman.util.rest.enumeration.ContentType;
import radman.util.rest.enumeration.HttpMethod;

import java.io.Serializable;
import java.net.URL;
import java.util.Map;

/**
 * @author : Pedram Behradkian
 */
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HttpRequest implements Serializable {
    private URL url;
    private HttpMethod method;
    private Map<String, Object> headers;
    private Map<String, String> queryParams;
    private Object body;
    private ContentType contentType;
    private int timeout;
    private AuthorizationConfiguration authorizationConfiguration;
}