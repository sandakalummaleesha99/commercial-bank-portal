package commercial_bank_portal.builder;

import commercial_bank_portal.wsdl.hris.EmployeeInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Slf4j
@Component
public class ReferenceNumberBuilder {

    public String buildPaymentReferenceNumber(EmployeeInfo employeeInfo) {
        log.info("ReferenceNumberBuilder.buildReferenceNumber() => started.");

        LocalDateTime now = LocalDateTime.now();

        // Convert LocalDateTime to a unique number (epoch seconds)
        long uniqueNumber = now.toEpochSecond(ZoneOffset.UTC);

        // Optionally, include nanoseconds for more uniqueness
        long nanoPart = now.getNano();
        String uniqueNumberWithNano = uniqueNumber + String.valueOf(nanoPart) + employeeInfo.getNic();

        log.info("Reference number generated: {}", uniqueNumberWithNano);
        return uniqueNumberWithNano;
    }

    public String buildBulkReferenceNumber() {
        log.info("ReferenceNumberBuilder.buildBulkReferenceNumber() => started.");

        LocalDateTime now = LocalDateTime.now();

        // Convert LocalDateTime to a unique number (epoch seconds)
        long uniqueNumber = now.toEpochSecond(ZoneOffset.UTC);

        // Optionally, include nanoseconds for more uniqueness
        long nanoPart = now.getNano();
        String uniqueNumberWithNano = "CPU-" + uniqueNumber + String.valueOf(nanoPart);

        log.info("Bulk reference number generated: {}", uniqueNumberWithNano);
        return uniqueNumberWithNano;
    }
}
