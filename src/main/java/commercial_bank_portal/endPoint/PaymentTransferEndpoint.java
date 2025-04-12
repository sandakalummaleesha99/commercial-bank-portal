package commercial_bank_portal.endPoint;

import commercial_bank_portal.dto.DocumentRequest;
import commercial_bank_portal.service.PaymentTransferService;
import commercial_bank_portal.util.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@RequiredArgsConstructor
@Endpoint
public class PaymentTransferEndpoint {

    private static final String NAMESPACE_URI = "http://www.commercialbankportal.com/bankTransfer";

    private final PaymentTransferService paymentTransferService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DocumentRequest")
    @ResponsePayload
    public CommonResponse handleTransfer(@RequestPayload DocumentRequest request) throws Exception {
        return paymentTransferService.transferPayments(request);
    }
}
