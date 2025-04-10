package commercial_bank_portal.util;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class CommonResponse {
    private HttpStatus status;
    private String message;
    private Object data;
}
