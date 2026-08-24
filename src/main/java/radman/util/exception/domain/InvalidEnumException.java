package radman.util.exception.domain;

import radman.util.exception.base.RadmanRuntimeException;
import radman.util.rest.enumeration.HttpStatusCode;

public class InvalidEnumException extends RadmanRuntimeException {

    public InvalidEnumException(String message) {
        super(message);
    }

    public InvalidEnumException(String enumName, Object invalidValue) {
        super(
                HttpStatusCode.BAD_REQUEST,
                "INVALID_ENUM_VALUE",
                paramsOf("enum", enumName, "invalidValue", invalidValue),
                String.format("Invalid value '%s' for enum '%s'", invalidValue, enumName),
                null
        );
    }

}
