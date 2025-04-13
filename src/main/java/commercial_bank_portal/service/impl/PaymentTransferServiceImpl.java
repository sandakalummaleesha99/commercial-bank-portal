package commercial_bank_portal.service.impl;

import commercial_bank_portal.service.PaymentTransferService;
import commercial_bank_portal.util.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentTransferServiceImpl implements PaymentTransferService {

    @Override
    public CommonResponse transferPayments() throws Exception {
        System.out.println("Payment is processing...");
        System.out.println("Payment is deposited to the bank account!");
        return new CommonResponse(HttpStatus.OK, "Deposited successfully.", null);
    }
}
