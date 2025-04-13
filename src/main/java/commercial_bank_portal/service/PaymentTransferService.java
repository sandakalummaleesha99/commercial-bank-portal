package commercial_bank_portal.service;

import commercial_bank_portal.util.CommonResponse;

public interface PaymentTransferService {

    CommonResponse transferPayments() throws Exception;
}
