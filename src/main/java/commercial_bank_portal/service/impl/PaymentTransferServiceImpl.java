package commercial_bank_portal.service.impl;

import commercial_bank_portal.builder.ReferenceNumberBuilder;
import commercial_bank_portal.service.PaymentTransferService;
import commercial_bank_portal.wsdl.hris.DocumentRequest;
import commercial_bank_portal.wsdl.hris.DocumentResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PaymentTransferServiceImpl implements PaymentTransferService {

    private final ReferenceNumberBuilder referenceNumberBuilder;

    @Override
    public DocumentResponse transferPayments(DocumentRequest request) {
        log.info("PaymentTransferServiceImpl.transferPayments() => started.");

        List<DocumentResponse.BankTransferResponse.PaymentRefNumber> refNumberList = new ArrayList<>();
        request.getEmployeeInfo().forEach(e -> {
            DocumentResponse.BankTransferResponse.PaymentRefNumber paymentRefNumber = new DocumentResponse.BankTransferResponse.PaymentRefNumber();
            paymentRefNumber.setKey(e.getEpfNo());
            paymentRefNumber.setValue(referenceNumberBuilder.buildPaymentReferenceNumber(e));
            refNumberList.add(paymentRefNumber);
        });

        DocumentResponse.BankTransferResponse bankTransferResponse = new DocumentResponse.BankTransferResponse();
        bankTransferResponse.setPaymentRefNumber(refNumberList);
        bankTransferResponse.setBulkRefNumber(referenceNumberBuilder.buildBulkReferenceNumber());
        log.info("Payment is deposited to the bank account!");
        return new DocumentResponse(HttpStatus.OK.value(), "Payment is processed", bankTransferResponse);
    }
}
