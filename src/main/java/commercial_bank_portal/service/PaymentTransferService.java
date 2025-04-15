package commercial_bank_portal.service;

import commercial_bank_portal.wsdl.hris.DocumentRequest;
import commercial_bank_portal.wsdl.hris.DocumentResponse;

public interface PaymentTransferService {

    DocumentResponse transferPayments(DocumentRequest request);
}
