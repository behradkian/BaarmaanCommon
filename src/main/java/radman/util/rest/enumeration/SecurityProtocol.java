package radman.util.rest.enumeration;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

/**
 * @author : Pedram Behradkian
 */
@Getter
@AllArgsConstructor
public enum SecurityProtocol implements Serializable {
    HTTP("http://"),
    HTTPS("https://");

    private final String prefix;
}