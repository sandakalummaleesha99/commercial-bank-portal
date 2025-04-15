package commercial_bank_portal.endPoint;

import commercial_bank_portal.service.PaymentTransferService;
import commercial_bank_portal.wsdl.hris.DocumentRequest;
import commercial_bank_portal.wsdl.hris.DocumentResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Slf4j
@RequiredArgsConstructor
@Endpoint
public class PaymentTransferEndpoint {

    private static final String NAMESPACE_URI = "http://www.commercialbankportal.com/bankTransfer";

    private final PaymentTransferService paymentTransferService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DocumentRequest")
    @ResponsePayload
    public DocumentResponse transferPayments(@RequestPayload DocumentRequest request) {
        return paymentTransferService.transferPayments(request);
    }
}
