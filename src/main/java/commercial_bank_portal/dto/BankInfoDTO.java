package commercial_bank_portal.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "bankName",
        "bankAccount",
        "bankCode",
        "branchCode",
        "salary"
})
public class BankInfoDTO {

    private String bankName;
    private String bankAccount;
    private String bankCode;
    private String branchCode;
    private double salary;
}
