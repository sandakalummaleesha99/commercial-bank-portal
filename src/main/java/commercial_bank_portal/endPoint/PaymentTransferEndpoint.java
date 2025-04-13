package commercial_bank_portal.endPoint;

import commercial_bank_portal.generated.jaxb.com.commercialbankportal.banktransfer.BankRequest;
import commercial_bank_portal.service.PaymentTransferService;
import lombok.RequiredArgsConstructor;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

@RequiredArgsConstructor
@Endpoint
public class PaymentTransferEndpoint {

    private static final String NAMESPACE_URI = "http://www.commercialbankportal.com/bankTransfer";

    private final PaymentTransferService paymentTransferService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "BankRequest")
    public void handleTransfer(@RequestPayload BankRequest request) throws Exception {
        System.out.println("gfdgfdgfd");
    }
}
