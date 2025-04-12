package commercial_bank_portal.service;

import commercial_bank_portal.dto.DocumentRequest;
import commercial_bank_portal.util.CommonResponse;

public interface PaymentTransferService {

    CommonResponse transferPayments(DocumentRequest request ) throws Exception;
}
