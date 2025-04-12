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

    @XmlElement(name = "BankName")
    private String bankName;

    @XmlElement(name = "BankAccount")
    private String bankAccount;

    @XmlElement(name = "BankCode")
    private String bankCode;

    @XmlElement(name = "BranchCode")
    private String branchCode;

    @XmlElement(name = "Salary")
    private double salary;
}
